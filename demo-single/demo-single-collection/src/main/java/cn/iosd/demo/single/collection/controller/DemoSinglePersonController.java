package cn.iosd.demo.single.collection.controller;

import cn.iosd.demo.single.collection.entity.DemoSinglePerson;
import cn.iosd.demo.single.collection.service.IDemoSinglePersonService;
import cn.iosd.starter.datasource.base.BaseController;
import cn.iosd.starter.web.domain.Response;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 人员列表 前端控制器
 * </p>
 *
 * @author ok1996
 */
@Slf4j
@Tag(name = "人员列表")
@RestController
@RequestMapping("/collection/demoSinglePerson")
public class DemoSinglePersonController extends BaseController<DemoSinglePerson> {

    @Autowired
    private IDemoSinglePersonService iDemoSinglePersonService;

    @Operation(summary = "字典测试列表-数据库")
    @GetMapping(value = "/personList")
    public Response<List<DemoSinglePerson>> personList() {
        long startTime = System.currentTimeMillis();
        List<DemoSinglePerson> all = iDemoSinglePersonService.getPersonList();
        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;
        log.info("方法执行时间为：" + elapsedTime + "毫秒");
        return Response.ok(all);
    }

    @Operation(summary = "无字典测试列表-数据库")
    @GetMapping(value = "/personListNotDict")
    public Response<List<DemoSinglePerson>> personListNotDict() {
        long startTime = System.currentTimeMillis();
        List<DemoSinglePerson> all = iDemoSinglePersonService.personListNotDict();
        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;
        log.info("方法执行时间为：" + elapsedTime + "毫秒");
        return Response.ok(all);
    }
}
