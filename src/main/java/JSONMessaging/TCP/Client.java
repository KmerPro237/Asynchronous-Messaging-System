package JSONMessaging.TCP;

import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 12345); // Verbindung zum Server auf localhost, Port 12345

            String directoryPath = ".\\src\\main\\java\\JSONMessaging\\TCP\\InputFiles";

            // Liste der Dateien im Verzeichnis
            File directory = new File(directoryPath);
            File[] files = directory.listFiles();

            if (files != null) {
                for (File file : files) {
                    if (file.isFile()) {
                        // Datei lesen
                        String jsonContent = readJsonFile(String.valueOf(file));

                        // Datei an den Server senden
                        sendJsonFile(socket, file.getName(), jsonContent);

                        // Warten auf Bestätigung oder Antwort vom Server
                        BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                        String response = reader.readLine();
                        System.out.println("Antwort vom Server für " + file.getName() + ": " + response);
                    }
                }
            }

            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
            /*System.out.println(System.getProperty("user.dir"));
            // JSON-Dateipfad auf dem Client
            String jsonFilePath = ".\\src\\main\\java\\JSONMessaging\\TCP\\FirstMessage.json";

            // JSON-Datei lesen
            String jsonContent = readJsonFile(jsonFilePath);

            // Hier wird die JSON-Datei an den Server gesendet
            sendJsonFile(socket, "Message.json", jsonContent);

            // Warten auf Bestätigung oder Antwort vom Server
            BufferedReader reader = new BufferedReader(new java.io.InputStreamReader(socket.getInputStream()));
            String response = reader.readLine();
            System.out.println("Antwort vom Server: " + response);

            socket.close();*/
    }

    private static String readJsonFile(String filePath) {
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return content.toString();
    }

    private static void sendJsonFile(Socket socket, String fileName, String jsonContent) throws IOException {
        PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);
        writer.println(fileName); // Dateinamen senden
        writer.println(jsonContent); // JSON-Inhalt senden

        // Hier wird die Bestätigungsnachricht vom Server erwartet
        BufferedReader reader = new BufferedReader(new java.io.InputStreamReader(socket.getInputStream()));
        String confirmation = reader.readLine();
        System.out.println("Bestaetigung vom Server: " + confirmation);
    }
}

