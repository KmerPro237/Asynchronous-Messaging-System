package de.htwsaar.esch.grpc.math.proto;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 * The math service service definition. 
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: math.proto")
public final class MathServiceGrpc {

  private MathServiceGrpc() {}

  public static final String SERVICE_NAME = "MathService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<de.htwsaar.esch.grpc.math.proto.Math.MathRequest,
      de.htwsaar.esch.grpc.math.proto.Math.MathResponse> getAddMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Add",
      requestType = de.htwsaar.esch.grpc.math.proto.Math.MathRequest.class,
      responseType = de.htwsaar.esch.grpc.math.proto.Math.MathResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<de.htwsaar.esch.grpc.math.proto.Math.MathRequest,
      de.htwsaar.esch.grpc.math.proto.Math.MathResponse> getAddMethod() {
    io.grpc.MethodDescriptor<de.htwsaar.esch.grpc.math.proto.Math.MathRequest, de.htwsaar.esch.grpc.math.proto.Math.MathResponse> getAddMethod;
    if ((getAddMethod = MathServiceGrpc.getAddMethod) == null) {
      synchronized (MathServiceGrpc.class) {
        if ((getAddMethod = MathServiceGrpc.getAddMethod) == null) {
          MathServiceGrpc.getAddMethod = getAddMethod = 
              io.grpc.MethodDescriptor.<de.htwsaar.esch.grpc.math.proto.Math.MathRequest, de.htwsaar.esch.grpc.math.proto.Math.MathResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "MathService", "Add"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  de.htwsaar.esch.grpc.math.proto.Math.MathRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  de.htwsaar.esch.grpc.math.proto.Math.MathResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new MathServiceMethodDescriptorSupplier("Add"))
                  .build();
          }
        }
     }
     return getAddMethod;
  }

  private static volatile io.grpc.MethodDescriptor<de.htwsaar.esch.grpc.math.proto.Math.MathRequest,
      de.htwsaar.esch.grpc.math.proto.Math.MathResponse> getSubtractMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Subtract",
      requestType = de.htwsaar.esch.grpc.math.proto.Math.MathRequest.class,
      responseType = de.htwsaar.esch.grpc.math.proto.Math.MathResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<de.htwsaar.esch.grpc.math.proto.Math.MathRequest,
      de.htwsaar.esch.grpc.math.proto.Math.MathResponse> getSubtractMethod() {
    io.grpc.MethodDescriptor<de.htwsaar.esch.grpc.math.proto.Math.MathRequest, de.htwsaar.esch.grpc.math.proto.Math.MathResponse> getSubtractMethod;
    if ((getSubtractMethod = MathServiceGrpc.getSubtractMethod) == null) {
      synchronized (MathServiceGrpc.class) {
        if ((getSubtractMethod = MathServiceGrpc.getSubtractMethod) == null) {
          MathServiceGrpc.getSubtractMethod = getSubtractMethod = 
              io.grpc.MethodDescriptor.<de.htwsaar.esch.grpc.math.proto.Math.MathRequest, de.htwsaar.esch.grpc.math.proto.Math.MathResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "MathService", "Subtract"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  de.htwsaar.esch.grpc.math.proto.Math.MathRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  de.htwsaar.esch.grpc.math.proto.Math.MathResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new MathServiceMethodDescriptorSupplier("Subtract"))
                  .build();
          }
        }
     }
     return getSubtractMethod;
  }

  private static volatile io.grpc.MethodDescriptor<de.htwsaar.esch.grpc.math.proto.Math.MathRequest,
      de.htwsaar.esch.grpc.math.proto.Math.MathResponse> getMultiplyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Multiply",
      requestType = de.htwsaar.esch.grpc.math.proto.Math.MathRequest.class,
      responseType = de.htwsaar.esch.grpc.math.proto.Math.MathResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<de.htwsaar.esch.grpc.math.proto.Math.MathRequest,
      de.htwsaar.esch.grpc.math.proto.Math.MathResponse> getMultiplyMethod() {
    io.grpc.MethodDescriptor<de.htwsaar.esch.grpc.math.proto.Math.MathRequest, de.htwsaar.esch.grpc.math.proto.Math.MathResponse> getMultiplyMethod;
    if ((getMultiplyMethod = MathServiceGrpc.getMultiplyMethod) == null) {
      synchronized (MathServiceGrpc.class) {
        if ((getMultiplyMethod = MathServiceGrpc.getMultiplyMethod) == null) {
          MathServiceGrpc.getMultiplyMethod = getMultiplyMethod = 
              io.grpc.MethodDescriptor.<de.htwsaar.esch.grpc.math.proto.Math.MathRequest, de.htwsaar.esch.grpc.math.proto.Math.MathResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "MathService", "Multiply"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  de.htwsaar.esch.grpc.math.proto.Math.MathRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  de.htwsaar.esch.grpc.math.proto.Math.MathResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new MathServiceMethodDescriptorSupplier("Multiply"))
                  .build();
          }
        }
     }
     return getMultiplyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<de.htwsaar.esch.grpc.math.proto.Math.MathRequest,
      de.htwsaar.esch.grpc.math.proto.Math.MathResponse> getDivideMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Divide",
      requestType = de.htwsaar.esch.grpc.math.proto.Math.MathRequest.class,
      responseType = de.htwsaar.esch.grpc.math.proto.Math.MathResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<de.htwsaar.esch.grpc.math.proto.Math.MathRequest,
      de.htwsaar.esch.grpc.math.proto.Math.MathResponse> getDivideMethod() {
    io.grpc.MethodDescriptor<de.htwsaar.esch.grpc.math.proto.Math.MathRequest, de.htwsaar.esch.grpc.math.proto.Math.MathResponse> getDivideMethod;
    if ((getDivideMethod = MathServiceGrpc.getDivideMethod) == null) {
      synchronized (MathServiceGrpc.class) {
        if ((getDivideMethod = MathServiceGrpc.getDivideMethod) == null) {
          MathServiceGrpc.getDivideMethod = getDivideMethod = 
              io.grpc.MethodDescriptor.<de.htwsaar.esch.grpc.math.proto.Math.MathRequest, de.htwsaar.esch.grpc.math.proto.Math.MathResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "MathService", "Divide"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  de.htwsaar.esch.grpc.math.proto.Math.MathRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  de.htwsaar.esch.grpc.math.proto.Math.MathResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new MathServiceMethodDescriptorSupplier("Divide"))
                  .build();
          }
        }
     }
     return getDivideMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MathServiceStub newStub(io.grpc.Channel channel) {
    return new MathServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MathServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new MathServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MathServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new MathServiceFutureStub(channel);
  }

  /**
   * <pre>
   * The math service service definition. 
   * </pre>
   */
  public static abstract class MathServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void add(de.htwsaar.esch.grpc.math.proto.Math.MathRequest request,
        io.grpc.stub.StreamObserver<de.htwsaar.esch.grpc.math.proto.Math.MathResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAddMethod(), responseObserver);
    }

    /**
     */
    public void subtract(de.htwsaar.esch.grpc.math.proto.Math.MathRequest request,
        io.grpc.stub.StreamObserver<de.htwsaar.esch.grpc.math.proto.Math.MathResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSubtractMethod(), responseObserver);
    }

    /**
     */
    public void multiply(de.htwsaar.esch.grpc.math.proto.Math.MathRequest request,
        io.grpc.stub.StreamObserver<de.htwsaar.esch.grpc.math.proto.Math.MathResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getMultiplyMethod(), responseObserver);
    }

    /**
     */
    public void divide(de.htwsaar.esch.grpc.math.proto.Math.MathRequest request,
        io.grpc.stub.StreamObserver<de.htwsaar.esch.grpc.math.proto.Math.MathResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDivideMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAddMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                de.htwsaar.esch.grpc.math.proto.Math.MathRequest,
                de.htwsaar.esch.grpc.math.proto.Math.MathResponse>(
                  this, METHODID_ADD)))
          .addMethod(
            getSubtractMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                de.htwsaar.esch.grpc.math.proto.Math.MathRequest,
                de.htwsaar.esch.grpc.math.proto.Math.MathResponse>(
                  this, METHODID_SUBTRACT)))
          .addMethod(
            getMultiplyMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                de.htwsaar.esch.grpc.math.proto.Math.MathRequest,
                de.htwsaar.esch.grpc.math.proto.Math.MathResponse>(
                  this, METHODID_MULTIPLY)))
          .addMethod(
            getDivideMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                de.htwsaar.esch.grpc.math.proto.Math.MathRequest,
                de.htwsaar.esch.grpc.math.proto.Math.MathResponse>(
                  this, METHODID_DIVIDE)))
          .build();
    }
  }

  /**
   * <pre>
   * The math service service definition. 
   * </pre>
   */
  public static final class MathServiceStub extends io.grpc.stub.AbstractStub<MathServiceStub> {
    private MathServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MathServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MathServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MathServiceStub(channel, callOptions);
    }

    /**
     */
    public void add(de.htwsaar.esch.grpc.math.proto.Math.MathRequest request,
        io.grpc.stub.StreamObserver<de.htwsaar.esch.grpc.math.proto.Math.MathResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void subtract(de.htwsaar.esch.grpc.math.proto.Math.MathRequest request,
        io.grpc.stub.StreamObserver<de.htwsaar.esch.grpc.math.proto.Math.MathResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSubtractMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void multiply(de.htwsaar.esch.grpc.math.proto.Math.MathRequest request,
        io.grpc.stub.StreamObserver<de.htwsaar.esch.grpc.math.proto.Math.MathResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMultiplyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void divide(de.htwsaar.esch.grpc.math.proto.Math.MathRequest request,
        io.grpc.stub.StreamObserver<de.htwsaar.esch.grpc.math.proto.Math.MathResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDivideMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * The math service service definition. 
   * </pre>
   */
  public static final class MathServiceBlockingStub extends io.grpc.stub.AbstractStub<MathServiceBlockingStub> {
    private MathServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MathServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MathServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MathServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public de.htwsaar.esch.grpc.math.proto.Math.MathResponse add(de.htwsaar.esch.grpc.math.proto.Math.MathRequest request) {
      return blockingUnaryCall(
          getChannel(), getAddMethod(), getCallOptions(), request);
    }

    /**
     */
    public de.htwsaar.esch.grpc.math.proto.Math.MathResponse subtract(de.htwsaar.esch.grpc.math.proto.Math.MathRequest request) {
      return blockingUnaryCall(
          getChannel(), getSubtractMethod(), getCallOptions(), request);
    }

    /**
     */
    public de.htwsaar.esch.grpc.math.proto.Math.MathResponse multiply(de.htwsaar.esch.grpc.math.proto.Math.MathRequest request) {
      return blockingUnaryCall(
          getChannel(), getMultiplyMethod(), getCallOptions(), request);
    }

    /**
     */
    public de.htwsaar.esch.grpc.math.proto.Math.MathResponse divide(de.htwsaar.esch.grpc.math.proto.Math.MathRequest request) {
      return blockingUnaryCall(
          getChannel(), getDivideMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The math service service definition. 
   * </pre>
   */
  public static final class MathServiceFutureStub extends io.grpc.stub.AbstractStub<MathServiceFutureStub> {
    private MathServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MathServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MathServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MathServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<de.htwsaar.esch.grpc.math.proto.Math.MathResponse> add(
        de.htwsaar.esch.grpc.math.proto.Math.MathRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAddMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<de.htwsaar.esch.grpc.math.proto.Math.MathResponse> subtract(
        de.htwsaar.esch.grpc.math.proto.Math.MathRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSubtractMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<de.htwsaar.esch.grpc.math.proto.Math.MathResponse> multiply(
        de.htwsaar.esch.grpc.math.proto.Math.MathRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getMultiplyMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<de.htwsaar.esch.grpc.math.proto.Math.MathResponse> divide(
        de.htwsaar.esch.grpc.math.proto.Math.MathRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDivideMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ADD = 0;
  private static final int METHODID_SUBTRACT = 1;
  private static final int METHODID_MULTIPLY = 2;
  private static final int METHODID_DIVIDE = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final MathServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(MathServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ADD:
          serviceImpl.add((de.htwsaar.esch.grpc.math.proto.Math.MathRequest) request,
              (io.grpc.stub.StreamObserver<de.htwsaar.esch.grpc.math.proto.Math.MathResponse>) responseObserver);
          break;
        case METHODID_SUBTRACT:
          serviceImpl.subtract((de.htwsaar.esch.grpc.math.proto.Math.MathRequest) request,
              (io.grpc.stub.StreamObserver<de.htwsaar.esch.grpc.math.proto.Math.MathResponse>) responseObserver);
          break;
        case METHODID_MULTIPLY:
          serviceImpl.multiply((de.htwsaar.esch.grpc.math.proto.Math.MathRequest) request,
              (io.grpc.stub.StreamObserver<de.htwsaar.esch.grpc.math.proto.Math.MathResponse>) responseObserver);
          break;
        case METHODID_DIVIDE:
          serviceImpl.divide((de.htwsaar.esch.grpc.math.proto.Math.MathRequest) request,
              (io.grpc.stub.StreamObserver<de.htwsaar.esch.grpc.math.proto.Math.MathResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class MathServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MathServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return de.htwsaar.esch.grpc.math.proto.Math.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("MathService");
    }
  }

  private static final class MathServiceFileDescriptorSupplier
      extends MathServiceBaseDescriptorSupplier {
    MathServiceFileDescriptorSupplier() {}
  }

  private static final class MathServiceMethodDescriptorSupplier
      extends MathServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    MathServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (MathServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MathServiceFileDescriptorSupplier())
              .addMethod(getAddMethod())
              .addMethod(getSubtractMethod())
              .addMethod(getMultiplyMethod())
              .addMethod(getDivideMethod())
              .build();
        }
      }
    }
    return result;
  }
}
