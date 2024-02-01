package de.htwsaar.esch.grpc.math.client;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import de.htwsaar.esch.grpc.math.proto.MathServiceGrpc;
import de.htwsaar.esch.grpc.math.proto.Math;

import java.util.Scanner;

/**
 * The Main class represents the main entry point for the gRPC Math client.
 * It establishes a connection to the gRPC server, takes user input for numbers,
 * and performs various math operations by calling the gRPC Math service.
 */
public class Main {

    /**
     * The main method of the application.
     * It establishes a connection to the gRPC server, takes user input, and performs math operations.
     *
     * @param args The command-line arguments (not used in this application).
     */
    public static void main(String[] args) {
        // Establish a connection to the server using the class ManagedChannelBuilder and the function usePlaintext().
        // usePlainText() should only be used for testing or for APIs where the use of such API or the data
        // exchanged is not sensitive.
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8999).usePlaintext().build();

        // Create a blocking stub for the MathService gRPC service.
        MathServiceGrpc.MathServiceBlockingStub mathServiceStub = MathServiceGrpc.newBlockingStub(channel);

        // Asynchronous instance of the above declaration.
        // MathServiceGrpc.MathServiceBlockingStub mathServiceStub = MathServiceGrpc.newStub(channel);

        // User input for numbers
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Build a MathRequest with the user-provided numbers
        Math.MathRequest request = Math.MathRequest.newBuilder()
                .setNum1(num1)
                .setNum2(num2)
                .build();

        // Perform addition operation and display the result
        Math.MathResponse responseAdd = mathServiceStub.add(request);
        System.out.println("Result of addition: " + responseAdd.getResult());

        // Perform subtraction operation and display the result
        Math.MathResponse responseSubtract = mathServiceStub.subtract(request);
        System.out.println("Result of subtraction: " + responseSubtract.getResult());

        // Perform multiplication operation and display the result
        Math.MathResponse responseMultiply = mathServiceStub.multiply(request);
        System.out.println("Result of multiplication: " + responseMultiply.getResult());

        try {
            // Perform division operation and display the result (handle division by zero exception)
            Math.MathResponse responseDivide = mathServiceStub.divide(request);
            System.out.println("Result of division: " + responseDivide.getResult());
        } catch (Exception e) {
            // Handle division by zero exception
            System.err.println("Error in division: " + e.getMessage());
        }

        // Shutdown the channel when finished
        channel.shutdown();
    }
}
