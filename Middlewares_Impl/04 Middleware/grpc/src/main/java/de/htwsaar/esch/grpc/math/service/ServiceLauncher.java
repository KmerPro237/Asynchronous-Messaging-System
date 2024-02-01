package de.htwsaar.esch.grpc.math.service;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

/**
 * The ServiceLauncher class is responsible for launching the gRPC Math service server.
 * It configures and starts the gRPC server on a specified port, adding the MathServiceImpl as a service.
 */
public class ServiceLauncher {

    /**
     * The main method to launch the gRPC Math service server.
     *
     * @param args The command-line arguments (not used in this application).
     */
    public static void main(String[] args) {
        try {
            /* *
             * Do not forget to install maven. The grpc stub classes are generated when you run the protoc compiler
             * and it finds a service declaration in your proto file.
             * Do not forget the client must use the same port in order to connect to this server.
             * */

            // Create a gRPC server with the MathServiceImpl and start it on port 8999
            Server server = ServerBuilder.forPort(8999).addService(new MathServiceImpl()).build();
            
            // Start the server
            server.start();
            System.out.println("Server started at " + server.getPort());

            // Block the main thread until the server is terminated
            server.awaitTermination();
        } catch (IOException e) {
            // Handle IOException, which may occur during server start
            System.out.println("Error: " + e);
        } catch (InterruptedException e) {
            // Handle InterruptedException, which may occur during server termination
            System.out.println("Error: " + e);
        }
    }
}
