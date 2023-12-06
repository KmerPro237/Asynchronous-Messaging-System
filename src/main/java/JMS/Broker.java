package JMS;

import javax.jms.*;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class Broker {

    private final ConnectionFactory connectionFactory;
    private final Topic topic;

    private final Map<String, MessageConsumer> topicSubscribers = new HashMap<>();

    public Broker(ConnectionFactory connectionFactory, Topic topic) {
        this.connectionFactory = connectionFactory;
        this.topic = topic;
    }

    public void start() {
        try (Connection connection = connectionFactory.createConnection()) {
            connection.start();

            try (Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE)) {
                MessageProducer producer = session.createProducer(topic);

                // Create subscribers for different topics
                createSubscriber(session, "topic1");
                createSubscriber(session, "topic2");

                // Publish messages for different topics
                publishMessage(session, producer, "topic1", "message for topic1");
                publishMessage(session, producer, "topic2", "message for topic2");

                // Sleep to allow subscribers to receive messages
                Thread.sleep(5000);
            }
        } catch (JMSException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void createSubscriber(Session session, String topicName) throws JMSException {
        MessageConsumer subscriber = session.createConsumer(topic, "topic = '" + topicName + "'");
        topicSubscribers.put(topicName, subscriber);

        // Set a message listener for each subscriber
        subscriber.setMessageListener(message -> {
            if (message instanceof TextMessage) {
                try {
                    String text = ((TextMessage) message).getText();
                    System.out.println("Received message for topic '" + topicName + "': " + text);
                } catch (JMSException e) {
                    e.printStackTrace();
                }
            }
        });

        System.out.println("Created subscriber for topic '" + topicName + "'");
    }

    private void publishMessage(Session session, MessageProducer producer, String topicName, String messageText)
            throws JMSException {
        TextMessage message = session.createTextMessage(messageText);
        message.setStringProperty("topic", topicName);
        producer.send(message);

        System.out.println("Published message for topic '" + topicName + "': " + messageText);
    }

    public static void main(String[] args) throws NamingException {
        ConnectionFactory connectionFactory = createConnectionFactory();
        Topic topic = createTopic();

        Broker broker = new Broker(connectionFactory, topic);
        broker.start();
    }

    private static ConnectionFactory createConnectionFactory() throws NamingException {
        Properties env = new Properties();
        env.put(Context.INITIAL_CONTEXT_FACTORY, "org.apache.activemq.jndi.ActiveMQInitialContextFactory");
        env.put(Context.PROVIDER_URL, "tcp://localhost:61616");

        InitialContext context = new InitialContext(env);
        return (ConnectionFactory) context.lookup("ConnectionFactory");
    }

    private static Topic createTopic() throws NamingException {
        Properties env = new Properties();
        env.put(Context.INITIAL_CONTEXT_FACTORY, "org.apache.activemq.jndi.ActiveMQInitialContextFactory");
        env.put(Context.PROVIDER_URL, "tcp://localhost:61616");

        InitialContext context = new InitialContext(env);
        return (Topic) context.lookup("dynamicTopics/MyTopic");
    }
}
