package QueueBasedMessaging;

import java.util.Observable;
import java.util.Observer;

public class Consumer implements Observer {
    private String topic;

    public Consumer(String topic, MessageQueue messageQueue) {
        this.topic = topic;
        messageQueue.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (arg instanceof Message) {
            Message message = (Message) arg;
            if (message.getTopic().equals(topic)) {
                System.out.println("Consumer for topic '" + topic + "' received message: " + message.getContent());
            }
        }
    }
}

