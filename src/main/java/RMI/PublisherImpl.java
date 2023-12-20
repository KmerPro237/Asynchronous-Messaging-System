package RMI;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class PublisherImpl extends UnicastRemoteObject implements Publisher {

    protected PublisherImpl() throws RemoteException {
        super();
    }

    @Override
    public void publish(Message message) throws RemoteException {
        // Logic to publish the message to the broker
        Broker broker = lookupBroker();
        broker.publish(message);
    }

    private Broker lookupBroker() {
        try {
            return (Broker) Naming.lookup("rmi://localhost/Broker");
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) {
        try {
            Publisher publisher = new PublisherImpl();
            Naming.rebind("rmi://localhost/Publisher", publisher);
            System.out.println("Publisher ready.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

