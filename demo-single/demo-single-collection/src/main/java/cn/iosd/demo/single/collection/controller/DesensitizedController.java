package cn.iosd.demo.single.collection.controller;

import cn.iosd.demo.single.collection.service.DesensitizedService;
import cn.iosd.demo.single.collection.vo.PersonVo;
import cn.iosd.demo.single.collection.vo.SuperPersonVo;
import cn.iosd.starter.web.domain.Response;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author ok1996
 */
@Tag(name = "脱敏测试模块")
@RestController
@RequestMapping("desensitized")
public class DesensitizedController {
    @Autowired
    private DesensitizedService service;

    @Operation(summary = "测试单体")
    @GetMapping(value = "/person")
    public Response<PersonVo> person() {
        return Response.ok(service.getPerson());
    }

    @Operation(summary = "测试列表")
    @GetMapping(value = "/personList")
    public Response<List<PersonVo>> personList() {
        return Response.ok(service.getPersonList());
    }

    @Operation(summary = "测试单体-嵌套")
    @GetMapping(value = "/superPerson")
    public Response<SuperPersonVo> superPerson() {
        return Response.ok(service.getSuperPerson());
    }

    @Operation(summary = "测试列表-嵌套")
    @GetMapping(value = "/superPersonList")
    public Response<List<SuperPersonVo>> superPersonList() {
        return Response.ok(service.getSuperPersonList());
    }

}
