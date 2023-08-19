package com.server.haryharsono.serverservice;

import com.server.haryharsono.serverservice.Service.CommonService;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class ServerServiceApplication {

	public static void main(String[] args) throws IOException, InterruptedException {
		SpringApplication.run(ServerServiceApplication.class, args);
		Server server = ServerBuilder
				.forPort(8083)
				.addService(new CommonService()).build();

		server.start();
		server.awaitTermination();
	}

}
