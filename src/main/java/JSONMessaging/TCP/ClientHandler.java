package JSONMessaging.TCP;

import java.io.*;
import java.net.Socket;
import org.json.JSONObject;

public class ClientHandler implements Runnable {
    private final Socket clientSocket;

    public ClientHandler(Socket clientSocket) {
        this.clientSocket = clientSocket;
    }

    @Override
    public void run() {
        try {
            // Hier wird die Behandlung der Verbindung implementiert
            BufferedReader reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

            // Dateinamen und JSON-Inhalt empfangen
            String fileName = reader.readLine();
            String jsonContent = reader.readLine();

            // Hier können Sie den erhaltenen JSON-Inhalt weiter verarbeiten
            System.out.println("Dateiname: " + fileName);
            System.out.println("JSON-Inhalt: " + jsonContent);

            // JSON-Verarbeitung
            try {
                JSONObject jsonObject = new JSONObject(jsonContent);

                // Beispiel: Thema (topic) aus dem JSON-Inhalt extrahieren
                String topic = jsonObject.optString("topic", "Allgemein");

                // Hier können Sie das Thema weiter verarbeiten
                System.out.println("Thema: " + topic);

                // Beispiel: Bestätigung an den Client senden
                PrintWriter writer = new PrintWriter(clientSocket.getOutputStream(), true);
                writer.println("Thema empfangen: " + topic);

                // Bestätigungsnachricht vom Client empfangen
                String clientConfirmation = reader.readLine();
                System.out.println("Bestätigung vom Client: " + clientConfirmation);

            } catch (Exception e) {
                System.err.println("Fehler beim Parsen der JSON-Datei: " + e.getMessage());
            }

            clientSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

