package QueueBasedMessaging;

public class TestField {
    public static void main(String[] args) {
        MessageQueue messageQueue = new MessageQueue();

        // Create consumers subscribing to specific topics
        Consumer consumer1 = new Consumer("topic1", messageQueue);
        Consumer consumer2 = new Consumer("topic2", messageQueue);
        Consumer consumer3 = new Consumer("topic3", messageQueue);


        // Create a producer and send messages
        Producer producer = new Producer(messageQueue);
        producer.produceMessage("topicx", "Hello from topic1!");
        producer.produceMessage("topic2", "Greetings from topic2!");
        producer.produceMessage("topic3", "This message won't be received by any consumer");
    }
}
