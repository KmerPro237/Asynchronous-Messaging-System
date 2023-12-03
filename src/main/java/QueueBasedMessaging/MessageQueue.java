package QueueBasedMessaging;

import java.util.Observable;

public class MessageQueue extends Observable {

    public void sendMessage(String topic, String message) {
        setChanged();
        notifyObservers(new Message(topic, message));
    }
}

