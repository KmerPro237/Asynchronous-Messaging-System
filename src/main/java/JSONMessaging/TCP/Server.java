package JSONMessaging.TCP;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import org.json.JSONObject;

public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(12345); // Portnummer 12345

            while (true) {
                System.out.println("Warten auf Verbindung...");
                Socket clientSocket = serverSocket.accept();
                System.out.println("Verbindung hergestellt!");

                // Hier wird die Behandlung der Verbindung gestartet
                new Thread(new ClientHandler(clientSocket)).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

