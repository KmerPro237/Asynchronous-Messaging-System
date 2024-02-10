/*
package gRPC;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

import java.util.concurrent.CountDownLatch;

public class MessageBrokerClient {
    private final ManagedChannel channel;
    private final MessageBrokerGrpc.MessageBrokerStub stub;

    public MessageBrokerClient(String host, int port) {
        this.channel = ManagedChannelBuilder.forAddress(host, port)
                .usePlaintext()
                .build();
        this.stub = MessageBrokerGrpc.newStub(channel);
    }

    public void publishMessage(String topic, String content) {
        MessageBrokerProto.Message request = MessageBrokerProto.Message.newBuilder()
                .setTopic(topic)
                .setContent(content)
                .build();
        stub.publishMessage(request, new StreamObserver<MessageBrokerProto.Empty>() {
            @Override
            public void onNext(MessageBrokerProto.Empty value) {
                // Response received from the server
            }

            @Override
            public void onError(Throwable t) {
                // Handle error
            }

            @Override
            public void onCompleted() {
                // Server completed the request
            }
        });
    }

    public void subscribe(String... topics) throws InterruptedException {
        MessageBrokerProto.Subscription request = MessageBrokerProto.Subscription.newBuilder()
                .addAllTopics(List.of(topics))
                .build();

        CountDownLatch latch = new CountDownLatch(1);

        StreamObserver<MessageBrokerProto.Message> responseObserver = new StreamObserver<MessageBrokerProto.Message>() {
            @Override
            public void onNext(MessageBrokerProto.Message value) {
                // Handle received message
                System.out.println("Received message: " + value.getContent());
            }

            @Override
            public void onError(Throwable t) {
                // Handle error
                latch.countDown();
            }

            @Override
            public void onCompleted() {
                // Server completed the stream
                latch.countDown();
            }
        };

        stub.subscribe(request, responseObserver);

        latch.await(); // Keep the program alive until the subscription is complete
    }

    public static void main(String[] args) throws InterruptedException {
        MessageBrokerClient client = new MessageBrokerClient("localhost", 50051);

        // Publish some messages
        client.publishMessage("news", "Breaking news: Something happened!");
        client.publishMessage("politics", "Political update: New laws passed.");
        client.publishMessage("finance", "Market report: Stocks on the rise.");

        // Subscribe to topics
        client.subscribe("news", "politics");
    }
}

*/
