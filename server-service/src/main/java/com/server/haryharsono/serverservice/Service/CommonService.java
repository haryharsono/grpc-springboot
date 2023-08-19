package com.server.haryharsono.serverservice.Service;


import com.haryharsono.common.CommonServiceGrpc;
import com.haryharsono.common.GrpcServiceData.RequestPayload;
import com.haryharsono.common.GrpcServiceData.ResponseData;
import io.grpc.stub.StreamObserver;
import lombok.extern.slf4j.Slf4j;
//import net.devh.boot.grpc.server.service.GrpcService;

//@GrpcService
@Slf4j
public class CommonService extends CommonServiceGrpc.CommonServiceImplBase {

    @Override
    public void nattebonja(RequestPayload request, StreamObserver<ResponseData> responseObserver) {
        log.info("hello");
        ResponseData response = ResponseData.newBuilder().setResult("Natte bonja").build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();

    }
}
