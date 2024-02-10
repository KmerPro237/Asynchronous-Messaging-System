package RMI;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class SubscriberImpl extends UnicastRemoteObject {

    protected SubscriberImpl() throws RemoteException {
        super();
    }

    public void notify(Message message) throws RemoteException {
        // Logic to process the received message
        System.out.println("Received message: " + message.getContent() + " for topic: " + message.getTopic());
    }

    public static void main(String[] args) {
        try {
            SubscriberImpl subscriber = new SubscriberImpl();
            Naming.rebind("rmi://localhost/Subscriber", subscriber);
            System.out.println("Subscriber ready.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
