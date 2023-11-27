import org.json.JSONObject;
import org.json.JSONTokener;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class JsonFileServer {

    public static void main(String[] args) {
        final int port = 8888;

        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("Server listening on port " + port);

            while (true) {
                try (Socket clientSocket = serverSocket.accept();
                     InputStream inputStream = clientSocket.getInputStream();
                     ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
                     OutputStream outputStream = clientSocket.getOutputStream();
                     ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream)) {

                    // Receive JSON file from the client
                    JSONObject receivedJson = (JSONObject) objectInputStream.readObject();
                    processJsonFile(receivedJson, "server_received.json");

                    // Create a response JSON object
                    JSONObject responseJson = new JSONObject();
                    responseJson.put("response", "Server received the JSON file");

                    // Send the response JSON file back to the client
                    objectOutputStream.writeObject(responseJson);
                    objectOutputStream.flush();

                } catch (IOException | ClassNotFoundException e) {
                    e.printStackTrace();
                }
            }
        } catch (IOException e) {
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
