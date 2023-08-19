package com.client.haryharsono.clientservice;

import com.haryharsono.common.CommonServiceGrpc.CommonServiceBlockingStub;
import com.haryharsono.common.GrpcServiceData.RequestPayload;
import com.haryharsono.common.GrpcServiceData.ResponseData;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ClientService {


//    @GrpcClient("server-service")
//    private CommonServiceBlockingStub commonServiceBlockingStub;
//
//    @RequestMapping("/test")
//    @ResponseBody
//    public String commonServiceBlockingStubResponse(){
//
//        RequestPayload request=RequestPayload.newBuilder().setName("hary").setEmail("311098haryharsono@gmail.com").build();
//        ResponseData response= commonServiceBlockingStub.nattebonja(request);
//
//        return  response.getResult();
//    }

}
