package QueueBasedMessaging.BeansQueue;

public class TestField {
    public static void main(String[] args) {
        MessageQueue messageQueue = new MessageQueue();
        messageQueue.start(); // Start the message handling thread

        // Create consumers subscribing to specific topics
        Consumer consumer1 = new Consumer("topic1", messageQueue);
        Consumer consumer2 = new Consumer("topic2", messageQueue);

        // Create producers
        Thread producerThread1 = new Thread(new Producer(messageQueue));
        Thread producerThread2 = new Thread(new Producer(messageQueue));

        // Start consumers and producers
        Thread consumerThread1 = new Thread(consumer1);
        Thread consumerThread2 = new Thread(consumer2);

        producerThread1.start();
        producerThread2.start();
        consumerThread1.start();
        consumerThread2.start();
    }
}
