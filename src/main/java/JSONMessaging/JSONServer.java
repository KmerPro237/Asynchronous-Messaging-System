package JSONMessaging;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class JSONServer {
        public static void main(String[] args) {
            try {
                ServerSocket serverSocket = new ServerSocket(5555); // ServerSocket auf Port 5555 erstellen

                System.out.println("Server wartet auf Verbindung...");

                Socket socket = serverSocket.accept(); // Auf Verbindung warten

                System.out.println("Verbindung hergestellt!");

                // Daten empfangen
                BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                String jsonText = reader.readLine();
                System.out.println("Empfangene JSON-Daten: " + jsonText);

                socket.close();
                serverSocket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

}
