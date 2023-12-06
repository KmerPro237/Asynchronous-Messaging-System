package JMS;

import javax.jms.*;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import java.util.Properties;

public class Subscriber {

    private final ConnectionFactory connectionFactory;
    private final Topic topic;
    private final String subscriberName;

    public Subscriber(ConnectionFactory connectionFactory, Topic topic, String subscriberName) {
        this.connectionFactory = connectionFactory;
        this.topic = topic;
        this.subscriberName = subscriberName;
    }

    public void subscribe() {
        try (Connection connection = connectionFactory.createConnection()) {
            connection.setClientID(subscriberName); // Set a unique client ID for durable subscriptions
            connection.start();

            try (Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE)) {
                MessageConsumer consumer = session.createConsumer(topic);

                // Set a message listener to process incoming messages
                consumer.setMessageListener(message -> {
                    if (message instanceof TextMessage) {
                        try {
                            String topicName = message.getStringProperty("topic");
                            String text = ((TextMessage) message).getText();
                            System.out.println(subscriberName + " received message from topic '" + topicName + "': " + text);
                        } catch (JMSException e) {
                            e.printStackTrace();
                        }
                    }
                });

                System.out.println(subscriberName + " subscribed to messages on topic '" + topic.getTopicName() + "'");

                // Sleep to keep the program running
                Thread.sleep(Long.MAX_VALUE);
            }
        } catch (JMSException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws NamingException {
        ConnectionFactory connectionFactory = createConnectionFactory();
        Topic topic = createTopic();

        Subscriber subscriber1 = new Subscriber(connectionFactory, topic, "Subscriber1");
        Subscriber subscriber2 = new Subscriber(connectionFactory, topic, "Subscriber2");

        // Subscribe to messages for the specified topic
        subscriber1.subscribe();
        subscriber2.subscribe();
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


