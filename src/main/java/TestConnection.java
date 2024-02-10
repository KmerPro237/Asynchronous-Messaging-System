import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.net.Socket;

public class TestConnection {

    private static final Logger logger = LogManager.getLogger(TestConnection.class);

    public static void processData(){
        logger.trace("FROM CLIENT TRACE METHOD:");
        logger.debug("FROM CLIENT DEBUG METHOD:");
        logger.info("FROM CLIENT INFO METHOD:");
        logger.warn("FROM CLIENT WARN METHOD:");
        logger.error("FROM CLIENT ERROR METHOD:");
        logger.fatal("FROM CLIENT FATAL METHOD:");
    }

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
