package QueueBasedMessaging.BeansQueue;

import java.util.concurrent.ThreadLocalRandom;

public class Producer implements Runnable {
    private MessageQueue messageQueue;
    private String[] topics = {"topic1", "topic2", "topic3"};

    public Producer(MessageQueue messageQueue) {
        this.messageQueue = messageQueue;
    }

    @Override
    public void run() {
        while (true) {
            String topic = getRandomTopic();
            String messageContent = "Message from " + Thread.currentThread().getName();

            messageQueue.sendMessage(topic, messageContent);

            try {
                Thread.sleep(ThreadLocalRandom.current().nextInt(1000, 3000)); // Simulate random delay
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    private String getRandomTopic() {
        return topics[ThreadLocalRandom.current().nextInt(topics.length)];
    }
}

