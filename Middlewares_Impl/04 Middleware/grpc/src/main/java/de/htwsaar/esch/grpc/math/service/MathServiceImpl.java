package de.htwsaar.esch.grpc.math.service;

import io.grpc.Status;
import io.grpc.stub.StreamObserver;
import de.htwsaar.esch.grpc.math.proto.Math;
import de.htwsaar.esch.grpc.math.proto.MathServiceGrpc;

/**
 * The MathServiceImpl class implements the gRPC Math service.
 * It provides methods for basic math operations such as addition, subtraction, multiplication, and division.
 */
public class MathServiceImpl extends MathServiceGrpc.MathServiceImplBase {

    /**
     * Handles the gRPC request for addition.
     *
     * @param request           The MathRequest containing the numbers for addition.
     * @param responseObserver The StreamObserver for sending the response.
     */
    @Override
    public void add(Math.MathRequest request, StreamObserver<Math.MathResponse> responseObserver) {
        System.out.println("Add request received with arguments: " + request.getNum1() + " and " + request.getNum2());
        int result = request.getNum1() + request.getNum2();
        Math.MathResponse response = Math.MathResponse.newBuilder().setResult(result).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    /**
     * Handles the gRPC request for subtraction.
     *
     * @param request           The MathRequest containing the numbers for subtraction.
     * @param responseObserver The StreamObserver for sending the response.
     */
    @Override
    public void subtract(Math.MathRequest request, StreamObserver<Math.MathResponse> responseObserver) {
        System.out.println("Subtraction request received with arguments: " + request.getNum1() + " and " + request.getNum2());
        int result = request.getNum1() - request.getNum2();
        Math.MathResponse response = Math.MathResponse.newBuilder().setResult(result).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    /**
     * Handles the gRPC request for multiplication.
     *
     * @param request           The MathRequest containing the numbers for multiplication.
     * @param responseObserver The StreamObserver for sending the response.
     */
    @Override
    public void multiply(Math.MathRequest request, StreamObserver<Math.MathResponse> responseObserver) {
        System.out.println("Multiply request received with arguments: " + request.getNum1() + " and " + request.getNum2());
        int result = request.getNum1() * request.getNum2();
        Math.MathResponse response = Math.MathResponse.newBuilder().setResult(result).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    /**
     * Handles the gRPC request for division.
     * Checks for division by zero and sends an error status if necessary.
     *
     * @param request           The MathRequest containing the numbers for division.
     * @param responseObserver The StreamObserver for sending the response.
     */
    @Override
    public void divide(Math.MathRequest request, StreamObserver<Math.MathResponse> responseObserver) {
        System.out.println("Divide request received with arguments: " + request.getNum1() + " and " + request.getNum2());
        int result = 0;
        if (request.getNum2() == 0) {
            responseObserver.onError(Status.INVALID_ARGUMENT
                    .withDescription("Division by zero is not allowed.")
                    .asRuntimeException());
        } else {
            result = request.getNum1() / request.getNum2();
        }
        Math.MathResponse response = Math.MathResponse.newBuilder().setResult(result).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
