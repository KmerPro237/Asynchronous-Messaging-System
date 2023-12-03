package QueueBasedMessaging.BeansQueue;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class MessageQueue {
    private BlockingQueue<Message> messageQueue = new LinkedBlockingQueue<>();
    private PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.removePropertyChangeListener(listener);
    }

    public void sendMessage(String topic, String message) {
        Message newMessage = new Message(topic, message);
        messageQueue.add(newMessage);
        propertyChangeSupport.firePropertyChange("message", null, newMessage);
    }

    public void start() {
        // Start a background thread to handle messages
        Thread messageHandlerThread = new Thread(() -> {
            while (true) {
                try {
                    Message message = messageQueue.take();
                    propertyChangeSupport.firePropertyChange("message", null, message);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        });

        messageHandlerThread.setDaemon(true);
        messageHandlerThread.start();
    }
}

