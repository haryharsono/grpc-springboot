package com.haryharsono.common;

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
 * 定义通用的 Grpc 服务
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.33.1)",
    comments = "Source: service.proto")
public final class CommonServiceGrpc {

  private CommonServiceGrpc() {}

  public static final String SERVICE_NAME = "CommonService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.haryharsono.common.GrpcServiceData.RequestPayload,
      com.haryharsono.common.GrpcServiceData.ResponseData> getNattebonjaMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "nattebonja",
      requestType = com.haryharsono.common.GrpcServiceData.RequestPayload.class,
      responseType = com.haryharsono.common.GrpcServiceData.ResponseData.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.haryharsono.common.GrpcServiceData.RequestPayload,
      com.haryharsono.common.GrpcServiceData.ResponseData> getNattebonjaMethod() {
    io.grpc.MethodDescriptor<com.haryharsono.common.GrpcServiceData.RequestPayload, com.haryharsono.common.GrpcServiceData.ResponseData> getNattebonjaMethod;
    if ((getNattebonjaMethod = CommonServiceGrpc.getNattebonjaMethod) == null) {
      synchronized (CommonServiceGrpc.class) {
        if ((getNattebonjaMethod = CommonServiceGrpc.getNattebonjaMethod) == null) {
          CommonServiceGrpc.getNattebonjaMethod = getNattebonjaMethod =
              io.grpc.MethodDescriptor.<com.haryharsono.common.GrpcServiceData.RequestPayload, com.haryharsono.common.GrpcServiceData.ResponseData>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "nattebonja"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.haryharsono.common.GrpcServiceData.RequestPayload.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.haryharsono.common.GrpcServiceData.ResponseData.getDefaultInstance()))
              .setSchemaDescriptor(new CommonServiceMethodDescriptorSupplier("nattebonja"))
              .build();
        }
      }
    }
    return getNattebonjaMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CommonServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CommonServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CommonServiceStub>() {
        @java.lang.Override
        public CommonServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CommonServiceStub(channel, callOptions);
        }
      };
    return CommonServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CommonServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CommonServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CommonServiceBlockingStub>() {
        @java.lang.Override
        public CommonServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CommonServiceBlockingStub(channel, callOptions);
        }
      };
    return CommonServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CommonServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CommonServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CommonServiceFutureStub>() {
        @java.lang.Override
        public CommonServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CommonServiceFutureStub(channel, callOptions);
        }
      };
    return CommonServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * 定义通用的 Grpc 服务
   * </pre>
   */
  public static abstract class CommonServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * 处理请求
     * </pre>
     */
    public void nattebonja(com.haryharsono.common.GrpcServiceData.RequestPayload request,
        io.grpc.stub.StreamObserver<com.haryharsono.common.GrpcServiceData.ResponseData> responseObserver) {
      asyncUnimplementedUnaryCall(getNattebonjaMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getNattebonjaMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.haryharsono.common.GrpcServiceData.RequestPayload,
                com.haryharsono.common.GrpcServiceData.ResponseData>(
                  this, METHODID_NATTEBONJA)))
          .build();
    }
  }

  /**
   * <pre>
   * 定义通用的 Grpc 服务
   * </pre>
   */
  public static final class CommonServiceStub extends io.grpc.stub.AbstractAsyncStub<CommonServiceStub> {
    private CommonServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CommonServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CommonServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * 处理请求
     * </pre>
     */
    public void nattebonja(com.haryharsono.common.GrpcServiceData.RequestPayload request,
        io.grpc.stub.StreamObserver<com.haryharsono.common.GrpcServiceData.ResponseData> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getNattebonjaMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * 定义通用的 Grpc 服务
   * </pre>
   */
  public static final class CommonServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<CommonServiceBlockingStub> {
    private CommonServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CommonServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CommonServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * 处理请求
     * </pre>
     */
    public com.haryharsono.common.GrpcServiceData.ResponseData nattebonja(com.haryharsono.common.GrpcServiceData.RequestPayload request) {
      return blockingUnaryCall(
          getChannel(), getNattebonjaMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * 定义通用的 Grpc 服务
   * </pre>
   */
  public static final class CommonServiceFutureStub extends io.grpc.stub.AbstractFutureStub<CommonServiceFutureStub> {
    private CommonServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CommonServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CommonServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * 处理请求
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.haryharsono.common.GrpcServiceData.ResponseData> nattebonja(
        com.haryharsono.common.GrpcServiceData.RequestPayload request) {
      return futureUnaryCall(
          getChannel().newCall(getNattebonjaMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_NATTEBONJA = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CommonServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CommonServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_NATTEBONJA:
          serviceImpl.nattebonja((com.haryharsono.common.GrpcServiceData.RequestPayload) request,
              (io.grpc.stub.StreamObserver<com.haryharsono.common.GrpcServiceData.ResponseData>) responseObserver);
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

  private static abstract class CommonServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CommonServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.haryharsono.common.GrpcServiceData.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CommonService");
    }
  }

  private static final class CommonServiceFileDescriptorSupplier
      extends CommonServiceBaseDescriptorSupplier {
    CommonServiceFileDescriptorSupplier() {}
  }

  private static final class CommonServiceMethodDescriptorSupplier
      extends CommonServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CommonServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (CommonServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CommonServiceFileDescriptorSupplier())
              .addMethod(getNattebonjaMethod())
              .build();
        }
      }
    }
    return result;
  }
}
