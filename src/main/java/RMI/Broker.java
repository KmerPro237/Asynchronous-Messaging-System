package RMI;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Broker extends Remote {
    void publish(Message message) throws RemoteException;
    void subscribe(SubscriberImpl subscriber, String topic) throws RemoteException;
}
