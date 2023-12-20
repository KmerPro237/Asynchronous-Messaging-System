package RMI;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Message extends Remote {
    String getTopic() throws RemoteException;
    String getContent() throws RemoteException;
}

