package com.client.haryharsono.clientservice;

import com.haryharsono.common.CommonServiceGrpc;
import com.haryharsono.common.GrpcServiceData;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class ClientGrpcApplication {

	public static void main(String[] args) {
		 SpringApplication.run(ClientGrpcApplication.class, args);
		ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8083)
				.usePlaintext()
				.build();
		GrpcServiceData.RequestPayload request= GrpcServiceData.RequestPayload.newBuilder().setName("hary").setEmail("311098haryharsono@gmail.com").build();
		CommonServiceGrpc.CommonServiceBlockingStub stub= CommonServiceGrpc.newBlockingStub(channel);
		stub.nattebonja(request);
		channel.shutdown();
	}

}
