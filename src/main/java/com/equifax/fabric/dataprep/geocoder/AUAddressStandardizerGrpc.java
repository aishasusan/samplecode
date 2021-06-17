package com.equifax.fabric.dataprep.geocoder;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * The AU service and client stub for using the geocoder 
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.36.0)",
    comments = "Source: AddressStandardizer.proto")
public final class AUAddressStandardizerGrpc {

  private AUAddressStandardizerGrpc() {}

  public static final String SERVICE_NAME = "AUAddressStandardizer";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.equifax.fabric.dataprep.geocoder.Request,
      com.equifax.fabric.dataprep.geocoder.AUResponse> getGetAddressMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAddress",
      requestType = com.equifax.fabric.dataprep.geocoder.Request.class,
      responseType = com.equifax.fabric.dataprep.geocoder.AUResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.equifax.fabric.dataprep.geocoder.Request,
      com.equifax.fabric.dataprep.geocoder.AUResponse> getGetAddressMethod() {
    io.grpc.MethodDescriptor<com.equifax.fabric.dataprep.geocoder.Request, com.equifax.fabric.dataprep.geocoder.AUResponse> getGetAddressMethod;
    if ((getGetAddressMethod = AUAddressStandardizerGrpc.getGetAddressMethod) == null) {
      synchronized (AUAddressStandardizerGrpc.class) {
        if ((getGetAddressMethod = AUAddressStandardizerGrpc.getGetAddressMethod) == null) {
          AUAddressStandardizerGrpc.getGetAddressMethod = getGetAddressMethod =
              io.grpc.MethodDescriptor.<com.equifax.fabric.dataprep.geocoder.Request, com.equifax.fabric.dataprep.geocoder.AUResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getAddress"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.equifax.fabric.dataprep.geocoder.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.equifax.fabric.dataprep.geocoder.AUResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AUAddressStandardizerMethodDescriptorSupplier("getAddress"))
              .build();
        }
      }
    }
    return getGetAddressMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AUAddressStandardizerStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AUAddressStandardizerStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AUAddressStandardizerStub>() {
        @java.lang.Override
        public AUAddressStandardizerStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AUAddressStandardizerStub(channel, callOptions);
        }
      };
    return AUAddressStandardizerStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AUAddressStandardizerBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AUAddressStandardizerBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AUAddressStandardizerBlockingStub>() {
        @java.lang.Override
        public AUAddressStandardizerBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AUAddressStandardizerBlockingStub(channel, callOptions);
        }
      };
    return AUAddressStandardizerBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AUAddressStandardizerFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AUAddressStandardizerFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AUAddressStandardizerFutureStub>() {
        @java.lang.Override
        public AUAddressStandardizerFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AUAddressStandardizerFutureStub(channel, callOptions);
        }
      };
    return AUAddressStandardizerFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * The AU service and client stub for using the geocoder 
   * </pre>
   */
  public static abstract class AUAddressStandardizerImplBase implements io.grpc.BindableService {

    /**
     */
    public void getAddress(com.equifax.fabric.dataprep.geocoder.Request request,
        io.grpc.stub.StreamObserver<com.equifax.fabric.dataprep.geocoder.AUResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAddressMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetAddressMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.equifax.fabric.dataprep.geocoder.Request,
                com.equifax.fabric.dataprep.geocoder.AUResponse>(
                  this, METHODID_GET_ADDRESS)))
          .build();
    }
  }

  /**
   * <pre>
   * The AU service and client stub for using the geocoder 
   * </pre>
   */
  public static final class AUAddressStandardizerStub extends io.grpc.stub.AbstractAsyncStub<AUAddressStandardizerStub> {
    private AUAddressStandardizerStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AUAddressStandardizerStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AUAddressStandardizerStub(channel, callOptions);
    }

    /**
     */
    public void getAddress(com.equifax.fabric.dataprep.geocoder.Request request,
        io.grpc.stub.StreamObserver<com.equifax.fabric.dataprep.geocoder.AUResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAddressMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * The AU service and client stub for using the geocoder 
   * </pre>
   */
  public static final class AUAddressStandardizerBlockingStub extends io.grpc.stub.AbstractBlockingStub<AUAddressStandardizerBlockingStub> {
    private AUAddressStandardizerBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AUAddressStandardizerBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AUAddressStandardizerBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.equifax.fabric.dataprep.geocoder.AUResponse getAddress(com.equifax.fabric.dataprep.geocoder.Request request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAddressMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The AU service and client stub for using the geocoder 
   * </pre>
   */
  public static final class AUAddressStandardizerFutureStub extends io.grpc.stub.AbstractFutureStub<AUAddressStandardizerFutureStub> {
    private AUAddressStandardizerFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AUAddressStandardizerFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AUAddressStandardizerFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.equifax.fabric.dataprep.geocoder.AUResponse> getAddress(
        com.equifax.fabric.dataprep.geocoder.Request request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAddressMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_ADDRESS = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AUAddressStandardizerImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AUAddressStandardizerImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_ADDRESS:
          serviceImpl.getAddress((com.equifax.fabric.dataprep.geocoder.Request) request,
              (io.grpc.stub.StreamObserver<com.equifax.fabric.dataprep.geocoder.AUResponse>) responseObserver);
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

  private static abstract class AUAddressStandardizerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AUAddressStandardizerBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.equifax.fabric.dataprep.geocoder.AddressStandardizer.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AUAddressStandardizer");
    }
  }

  private static final class AUAddressStandardizerFileDescriptorSupplier
      extends AUAddressStandardizerBaseDescriptorSupplier {
    AUAddressStandardizerFileDescriptorSupplier() {}
  }

  private static final class AUAddressStandardizerMethodDescriptorSupplier
      extends AUAddressStandardizerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AUAddressStandardizerMethodDescriptorSupplier(String methodName) {
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
      synchronized (AUAddressStandardizerGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AUAddressStandardizerFileDescriptorSupplier())
              .addMethod(getGetAddressMethod())
              .build();
        }
      }
    }
    return result;
  }
}
