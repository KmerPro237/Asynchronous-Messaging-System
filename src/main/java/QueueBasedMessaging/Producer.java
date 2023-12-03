package QueueBasedMessaging;

public class Producer {
    private MessageQueue messageQueue;

    public Producer(MessageQueue messageQueue) {
        this.messageQueue = messageQueue;
    }

    public void produceMessage(String topic, String messageContent) {
        messageQueue.sendMessage(topic, messageContent);
    }
}

