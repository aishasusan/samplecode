package com.equifax.fabric.dataprep.geocoder;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * The NZ service and client stub for using the geocoder 
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.36.0)",
    comments = "Source: AddressStandardizer.proto")
public final class TransTasmanAddressStandardizerGrpc {

  private TransTasmanAddressStandardizerGrpc() {}

  public static final String SERVICE_NAME = "TransTasmanAddressStandardizer";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.equifax.fabric.dataprep.geocoder.Request,
      com.equifax.fabric.dataprep.geocoder.TransTasmanResponse> getGetTransTasmanAddressMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getTransTasmanAddress",
      requestType = com.equifax.fabric.dataprep.geocoder.Request.class,
      responseType = com.equifax.fabric.dataprep.geocoder.TransTasmanResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.equifax.fabric.dataprep.geocoder.Request,
      com.equifax.fabric.dataprep.geocoder.TransTasmanResponse> getGetTransTasmanAddressMethod() {
    io.grpc.MethodDescriptor<com.equifax.fabric.dataprep.geocoder.Request, com.equifax.fabric.dataprep.geocoder.TransTasmanResponse> getGetTransTasmanAddressMethod;
    if ((getGetTransTasmanAddressMethod = TransTasmanAddressStandardizerGrpc.getGetTransTasmanAddressMethod) == null) {
      synchronized (TransTasmanAddressStandardizerGrpc.class) {
        if ((getGetTransTasmanAddressMethod = TransTasmanAddressStandardizerGrpc.getGetTransTasmanAddressMethod) == null) {
          TransTasmanAddressStandardizerGrpc.getGetTransTasmanAddressMethod = getGetTransTasmanAddressMethod =
              io.grpc.MethodDescriptor.<com.equifax.fabric.dataprep.geocoder.Request, com.equifax.fabric.dataprep.geocoder.TransTasmanResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getTransTasmanAddress"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.equifax.fabric.dataprep.geocoder.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.equifax.fabric.dataprep.geocoder.TransTasmanResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TransTasmanAddressStandardizerMethodDescriptorSupplier("getTransTasmanAddress"))
              .build();
        }
      }
    }
    return getGetTransTasmanAddressMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TransTasmanAddressStandardizerStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TransTasmanAddressStandardizerStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TransTasmanAddressStandardizerStub>() {
        @java.lang.Override
        public TransTasmanAddressStandardizerStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TransTasmanAddressStandardizerStub(channel, callOptions);
        }
      };
    return TransTasmanAddressStandardizerStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TransTasmanAddressStandardizerBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TransTasmanAddressStandardizerBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TransTasmanAddressStandardizerBlockingStub>() {
        @java.lang.Override
        public TransTasmanAddressStandardizerBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TransTasmanAddressStandardizerBlockingStub(channel, callOptions);
        }
      };
    return TransTasmanAddressStandardizerBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TransTasmanAddressStandardizerFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TransTasmanAddressStandardizerFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TransTasmanAddressStandardizerFutureStub>() {
        @java.lang.Override
        public TransTasmanAddressStandardizerFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TransTasmanAddressStandardizerFutureStub(channel, callOptions);
        }
      };
    return TransTasmanAddressStandardizerFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * The NZ service and client stub for using the geocoder 
   * </pre>
   */
  public static abstract class TransTasmanAddressStandardizerImplBase implements io.grpc.BindableService {

    /**
     */
    public void getTransTasmanAddress(com.equifax.fabric.dataprep.geocoder.Request request,
        io.grpc.stub.StreamObserver<com.equifax.fabric.dataprep.geocoder.TransTasmanResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetTransTasmanAddressMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetTransTasmanAddressMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.equifax.fabric.dataprep.geocoder.Request,
                com.equifax.fabric.dataprep.geocoder.TransTasmanResponse>(
                  this, METHODID_GET_TRANS_TASMAN_ADDRESS)))
          .build();
    }
  }

  /**
   * <pre>
   * The NZ service and client stub for using the geocoder 
   * </pre>
   */
  public static final class TransTasmanAddressStandardizerStub extends io.grpc.stub.AbstractAsyncStub<TransTasmanAddressStandardizerStub> {
    private TransTasmanAddressStandardizerStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TransTasmanAddressStandardizerStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TransTasmanAddressStandardizerStub(channel, callOptions);
    }

    /**
     */
    public void getTransTasmanAddress(com.equifax.fabric.dataprep.geocoder.Request request,
        io.grpc.stub.StreamObserver<com.equifax.fabric.dataprep.geocoder.TransTasmanResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetTransTasmanAddressMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * The NZ service and client stub for using the geocoder 
   * </pre>
   */
  public static final class TransTasmanAddressStandardizerBlockingStub extends io.grpc.stub.AbstractBlockingStub<TransTasmanAddressStandardizerBlockingStub> {
    private TransTasmanAddressStandardizerBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TransTasmanAddressStandardizerBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TransTasmanAddressStandardizerBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.equifax.fabric.dataprep.geocoder.TransTasmanResponse getTransTasmanAddress(com.equifax.fabric.dataprep.geocoder.Request request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetTransTasmanAddressMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The NZ service and client stub for using the geocoder 
   * </pre>
   */
  public static final class TransTasmanAddressStandardizerFutureStub extends io.grpc.stub.AbstractFutureStub<TransTasmanAddressStandardizerFutureStub> {
    private TransTasmanAddressStandardizerFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TransTasmanAddressStandardizerFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TransTasmanAddressStandardizerFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.equifax.fabric.dataprep.geocoder.TransTasmanResponse> getTransTasmanAddress(
        com.equifax.fabric.dataprep.geocoder.Request request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetTransTasmanAddressMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_TRANS_TASMAN_ADDRESS = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final TransTasmanAddressStandardizerImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(TransTasmanAddressStandardizerImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_TRANS_TASMAN_ADDRESS:
          serviceImpl.getTransTasmanAddress((com.equifax.fabric.dataprep.geocoder.Request) request,
              (io.grpc.stub.StreamObserver<com.equifax.fabric.dataprep.geocoder.TransTasmanResponse>) responseObserver);
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

  private static abstract class TransTasmanAddressStandardizerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TransTasmanAddressStandardizerBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.equifax.fabric.dataprep.geocoder.AddressStandardizer.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TransTasmanAddressStandardizer");
    }
  }

  private static final class TransTasmanAddressStandardizerFileDescriptorSupplier
      extends TransTasmanAddressStandardizerBaseDescriptorSupplier {
    TransTasmanAddressStandardizerFileDescriptorSupplier() {}
  }

  private static final class TransTasmanAddressStandardizerMethodDescriptorSupplier
      extends TransTasmanAddressStandardizerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    TransTasmanAddressStandardizerMethodDescriptorSupplier(String methodName) {
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
      synchronized (TransTasmanAddressStandardizerGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TransTasmanAddressStandardizerFileDescriptorSupplier())
              .addMethod(getGetTransTasmanAddressMethod())
              .build();
        }
      }
    }
    return result;
  }
}
