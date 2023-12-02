import java.net.Socket;

public class TestConnection {

        public static void main(String[] args) {
            String serverHost = "localhost";
            int serverPort = 5057;

            try {
                Socket socket = new Socket(serverHost, serverPort);
                System.out.println("Connection successful!");
                socket.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

}
