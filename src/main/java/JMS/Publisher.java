package JMS;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.jms.*;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import java.io.File;
import java.io.IOException;
import java.util.Properties;

public class Publisher {

    private final ConnectionFactory connectionFactory;
    private final Topic topic;

    public Publisher(ConnectionFactory connectionFactory, Topic topic) {
        this.connectionFactory = connectionFactory;
        this.topic = topic;
    }

    public void publishMessage(String topicName, File jsonFile) {
        try (Connection connection = connectionFactory.createConnection()) {
            connection.start();

            try (Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE)) {
                MessageProducer producer = session.createProducer(topic);

                // Read JSON content from the file
                ObjectMapper objectMapper = new ObjectMapper();
                JsonNode jsonNode = objectMapper.readTree(jsonFile);

                // Convert JSON to TextMessage and set the topic property
                TextMessage message = session.createTextMessage(jsonNode.toString());
                message.setStringProperty("topic", topicName);

                // Publish the message
                producer.send(message);

                System.out.println("Published message to topic '" + topicName + "'");
            }
        } catch (JMSException | IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws NamingException {
        ConnectionFactory connectionFactory = createConnectionFactory();
        Topic topic = createTopic();

        Publisher publisher = new Publisher(connectionFactory, topic);

        // Publish messages for different topics from JSON files
        publisher.publishMessage("topic1", new File("message1.json"));
        publisher.publishMessage("topic2", new File("message2.json"));
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

