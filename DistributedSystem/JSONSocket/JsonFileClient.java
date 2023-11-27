import org.json.JSONObject;
import org.json.JSONTokener;

import java.io.*;
import java.net.Socket;

public class JsonFileClient {

    public static void main(String[] args) {
        final String serverAddress = "localhost";
        final int serverPort = 8888;

        try (Socket socket = new Socket(serverAddress, serverPort);
             OutputStream outputStream = socket.getOutputStream();
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
             InputStream inputStream = socket.getInputStream();
             ObjectInputStream objectInputStream = new ObjectInputStream(inputStream)) {

            // Create a JSON object to send
            JSONObject jsonToSend = new JSONObject();
            jsonToSend.put("message", "Hello, Server!");
            jsonToSend.put("user", "Client");

            // Save the JSON object to a file
            String jsonFileName = "client_sent.json";
            try (FileWriter fileWriter = new FileWriter(jsonFileName)) {
                jsonToSend.write(fileWriter);
            }

            // Send the JSON file to the server
            objectOutputStream.writeObject(jsonToSend);
            objectOutputStream.flush();

            System.out.println("JSON file sent to server: " + jsonFileName);

            // Receive response JSON file from the server
            JSONObject responseJson = (JSONObject) objectInputStream.readObject();
            processJsonFile(responseJson, "client_received.json");

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void processJsonFile(JSONObject json, String filename) {
        // Your logic to process the received JSON file goes here
        System.out.println("Received JSON: " + json.toString());

        // Save the JSON file to disk
        try (FileWriter fileWriter = new FileWriter(filename)) {
            json.write(fileWriter);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
