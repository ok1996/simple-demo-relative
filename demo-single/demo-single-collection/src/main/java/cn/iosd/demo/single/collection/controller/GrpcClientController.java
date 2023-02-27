package cn.iosd.demo.single.collection.controller;

import cn.iosd.demo.single.collection.service.GrpcDemoClientService;
import cn.iosd.starter.web.domain.Response;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ok1996
 */
@Tag(name = "Grpc客户端调用服务端测试")
@RestController
@RequestMapping("grpcClient")
public class GrpcClientController {
    @Autowired
    private GrpcDemoClientService service;

    @Operation(summary = "往Hello服务端发送消息")
    @GetMapping("sendHello")
    public Response<String> sendHello(String chatMessage) {
        return Response.ok(service.sendHelloMessage(chatMessage));
    }

    @Operation(summary = "往Person服务端发送消息")
    @GetMapping("sendPerson")
    public Response<String> sendPerson(String chatMessage) {
        return Response.ok(service.sendPersonMessage(chatMessage));
    }
}
