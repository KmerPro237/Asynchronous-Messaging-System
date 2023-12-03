package QueueBasedMessaging.BeansQueue;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class Consumer implements PropertyChangeListener, Runnable {
    private String subscribedTopic;
    private MessageQueue messageQueue;

    public Consumer(String subscribedTopic, MessageQueue messageQueue) {
        this.subscribedTopic = subscribedTopic;
        this.messageQueue = messageQueue;
        messageQueue.addPropertyChangeListener(this);
    }

    @Override
    public void run() {
        while (true) {
            // Consumer continues to run and handle incoming messages
        }
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        if ("message".equals(evt.getPropertyName())) {
            Message message = (Message) evt.getNewValue();
            if (message.getTopic().equals(subscribedTopic)) {
                System.out.println("Consumer for topic '" + subscribedTopic +
                        "' received message: " + message.getContent());
            }
        }
    }
}

