package RMI;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.HashMap;
import java.util.Map;

public class BrokerImpl extends UnicastRemoteObject implements Broker {

    private Map<String, SubscriberImpl> subscribers = new HashMap<>();

    protected BrokerImpl() throws RemoteException {
        super();
    }

    @Override
    public void publish(Message message) throws RemoteException {
        // Forward the message to relevant subscribers
        String topic = message.getTopic();
        subscribers.entrySet().stream()
                .filter(entry -> topic.equals(entry.getKey()))
                .map(Map.Entry::getValue)
                .forEach(subscriber -> {
                    try {
                        subscriber.notify(message);
                    } catch (RemoteException e) {
                        e.printStackTrace();
                    }
                });
    }

    @Override
    public void subscribe(SubscriberImpl subscriber, String topic) throws RemoteException {
        // Subscribe the client to a topic
        subscribers.put(topic, subscriber);
    }


    public static void main(String[] args) {
        try {
            Broker broker = new BrokerImpl();
            Naming.rebind("rmi://localhost/Broker", broker);
            System.out.println("Broker ready.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

