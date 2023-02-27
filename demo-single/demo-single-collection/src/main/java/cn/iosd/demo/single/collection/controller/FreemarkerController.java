package cn.iosd.demo.single.collection.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * @author ok1996
 */
@Tag(name = "Freemarker页面跳转")
@Controller
@RequestMapping("freemarker")
public class FreemarkerController {

    @Operation(summary = "首页")
    @GetMapping("/index")
    public String index(Map<String, Object> map) {
        map.put("name", "ok1996");
        return "index";
    }
}
