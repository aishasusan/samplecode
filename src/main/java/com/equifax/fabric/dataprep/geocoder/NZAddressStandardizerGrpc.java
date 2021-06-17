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
public final class NZAddressStandardizerGrpc {

  private NZAddressStandardizerGrpc() {}

  public static final String SERVICE_NAME = "NZAddressStandardizer";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.equifax.fabric.dataprep.geocoder.Request,
      com.equifax.fabric.dataprep.geocoder.NZResponse> getGetAddressMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAddress",
      requestType = com.equifax.fabric.dataprep.geocoder.Request.class,
      responseType = com.equifax.fabric.dataprep.geocoder.NZResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.equifax.fabric.dataprep.geocoder.Request,
      com.equifax.fabric.dataprep.geocoder.NZResponse> getGetAddressMethod() {
    io.grpc.MethodDescriptor<com.equifax.fabric.dataprep.geocoder.Request, com.equifax.fabric.dataprep.geocoder.NZResponse> getGetAddressMethod;
    if ((getGetAddressMethod = NZAddressStandardizerGrpc.getGetAddressMethod) == null) {
      synchronized (NZAddressStandardizerGrpc.class) {
        if ((getGetAddressMethod = NZAddressStandardizerGrpc.getGetAddressMethod) == null) {
          NZAddressStandardizerGrpc.getGetAddressMethod = getGetAddressMethod =
              io.grpc.MethodDescriptor.<com.equifax.fabric.dataprep.geocoder.Request, com.equifax.fabric.dataprep.geocoder.NZResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getAddress"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.equifax.fabric.dataprep.geocoder.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.equifax.fabric.dataprep.geocoder.NZResponse.getDefaultInstance()))
              .setSchemaDescriptor(new NZAddressStandardizerMethodDescriptorSupplier("getAddress"))
              .build();
        }
      }
    }
    return getGetAddressMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static NZAddressStandardizerStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<NZAddressStandardizerStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<NZAddressStandardizerStub>() {
        @java.lang.Override
        public NZAddressStandardizerStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new NZAddressStandardizerStub(channel, callOptions);
        }
      };
    return NZAddressStandardizerStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static NZAddressStandardizerBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<NZAddressStandardizerBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<NZAddressStandardizerBlockingStub>() {
        @java.lang.Override
        public NZAddressStandardizerBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new NZAddressStandardizerBlockingStub(channel, callOptions);
        }
      };
    return NZAddressStandardizerBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static NZAddressStandardizerFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<NZAddressStandardizerFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<NZAddressStandardizerFutureStub>() {
        @java.lang.Override
        public NZAddressStandardizerFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new NZAddressStandardizerFutureStub(channel, callOptions);
        }
      };
    return NZAddressStandardizerFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * The NZ service and client stub for using the geocoder 
   * </pre>
   */
  public static abstract class NZAddressStandardizerImplBase implements io.grpc.BindableService {

    /**
     */
    public void getAddress(com.equifax.fabric.dataprep.geocoder.Request request,
        io.grpc.stub.StreamObserver<com.equifax.fabric.dataprep.geocoder.NZResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAddressMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetAddressMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.equifax.fabric.dataprep.geocoder.Request,
                com.equifax.fabric.dataprep.geocoder.NZResponse>(
                  this, METHODID_GET_ADDRESS)))
          .build();
    }
  }

  /**
   * <pre>
   * The NZ service and client stub for using the geocoder 
   * </pre>
   */
  public static final class NZAddressStandardizerStub extends io.grpc.stub.AbstractAsyncStub<NZAddressStandardizerStub> {
    private NZAddressStandardizerStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NZAddressStandardizerStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new NZAddressStandardizerStub(channel, callOptions);
    }

    /**
     */
    public void getAddress(com.equifax.fabric.dataprep.geocoder.Request request,
        io.grpc.stub.StreamObserver<com.equifax.fabric.dataprep.geocoder.NZResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAddressMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * The NZ service and client stub for using the geocoder 
   * </pre>
   */
  public static final class NZAddressStandardizerBlockingStub extends io.grpc.stub.AbstractBlockingStub<NZAddressStandardizerBlockingStub> {
    private NZAddressStandardizerBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NZAddressStandardizerBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new NZAddressStandardizerBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.equifax.fabric.dataprep.geocoder.NZResponse getAddress(com.equifax.fabric.dataprep.geocoder.Request request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAddressMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The NZ service and client stub for using the geocoder 
   * </pre>
   */
  public static final class NZAddressStandardizerFutureStub extends io.grpc.stub.AbstractFutureStub<NZAddressStandardizerFutureStub> {
    private NZAddressStandardizerFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NZAddressStandardizerFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new NZAddressStandardizerFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.equifax.fabric.dataprep.geocoder.NZResponse> getAddress(
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
    private final NZAddressStandardizerImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(NZAddressStandardizerImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_ADDRESS:
          serviceImpl.getAddress((com.equifax.fabric.dataprep.geocoder.Request) request,
              (io.grpc.stub.StreamObserver<com.equifax.fabric.dataprep.geocoder.NZResponse>) responseObserver);
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

  private static abstract class NZAddressStandardizerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    NZAddressStandardizerBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.equifax.fabric.dataprep.geocoder.AddressStandardizer.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("NZAddressStandardizer");
    }
  }

  private static final class NZAddressStandardizerFileDescriptorSupplier
      extends NZAddressStandardizerBaseDescriptorSupplier {
    NZAddressStandardizerFileDescriptorSupplier() {}
  }

  private static final class NZAddressStandardizerMethodDescriptorSupplier
      extends NZAddressStandardizerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    NZAddressStandardizerMethodDescriptorSupplier(String methodName) {
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
      synchronized (NZAddressStandardizerGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new NZAddressStandardizerFileDescriptorSupplier())
              .addMethod(getGetAddressMethod())
              .build();
        }
      }
    }
    return result;
  }
}
