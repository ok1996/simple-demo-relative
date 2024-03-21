package cn.iosd.demo.single.collection.controller;

import cn.iosd.starter.socketio.service.SocketIOMessageServer;
import cn.iosd.starter.web.domain.Response;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ok1996
 */
@Tag(name = "Socket测试")
@Slf4j
@RestController
@RequestMapping("socket")
public class SocketController {
    @Autowired(required = false)
    private SocketIOMessageServer socketMessageServer;

    @Operation(summary = "广播所有连接客户端")
    @PostMapping("broadcast")
    public Response broadcast(@RequestBody Object chatMessage) {
        socketMessageServer.sendBroadcast("broadcastTest", chatMessage);
        return Response.ok();
    }

}
