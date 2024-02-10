/*
package gRPC;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MessageBrokerServer {
    private final int port;
    private final Server server;

    private final Map<String, Set<StreamObserver<MessageBrokerProto.Message>>> subscriptions = new HashMap<>();

    public MessageBrokerServer(int port) {
        this.port = port;
        this.server = ServerBuilder.forPort(port)
                .addService(new MessageBrokerImpl())
                .build();
    }

    public void start() throws IOException {
        server.start();
        System.out.println("Server started, listening on " + port);
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.err.println("Shutting down gRPC server since JVM is shutting down");
            MessageBrokerServer.this.stop();
            System.err.println("Server shut down");
        }));
    }

    public void stop() {
        if (server != null) {
            server.shutdown();
        }
    }

    public void blockUntilShutdown() throws InterruptedException {
        if (server != null) {
            server.awaitTermination();
        }
    }

    private class MessageBrokerImpl extends MessageBrokerGrpc.MessageBrokerImplBase {
        @Override
        public void publishMessage(MessageBrokerProto.Message request, StreamObserver<Empty> responseObserver) {
            String topic = request.getTopic();
            Set<StreamObserver<MessageBrokerProto.Message>> subscribers = subscriptions.getOrDefault(topic, new HashSet<>());
            for (StreamObserver<MessageBrokerProto.Message> subscriber : subscribers) {
                subscriber.onNext(request);
            }
            responseObserver.onNext(Empty.getDefaultInstance());
            responseObserver.onCompleted();
        }

        @Override
        public void subscribe(MessageBrokerProto.Subscription request, StreamObserver<MessageBrokerProto.Message> responseObserver) {
            Set<StreamObserver<MessageBrokerProto.Message>> subscribers = new HashSet<>();
            for (String topic : request.getTopicsList()) {
                subscriptions.computeIfAbsent(topic, k -> new HashSet<>()).add(responseObserver);
                subscribers.addAll(subscriptions.get(topic));
            }
            for (StreamObserver<MessageBrokerProto.Message> subscriber : subscribers) {
                subscriber.onNext(MessageBrokerProto.Message.newBuilder()
                        .setTopic("System")
                        .setContent("New subscriber joined: " + responseObserver)
                        .build());
            }
        }
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        MessageBrokerServer server = new MessageBrokerServer(50051);
        server.start();
        server.blockUntilShutdown();
    }
}

*/
