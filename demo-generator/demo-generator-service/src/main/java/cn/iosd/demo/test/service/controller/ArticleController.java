package cn.iosd.demo.test.service.controller;

import cn.iosd.demo.test.service.entity.ArticleEntity;
import cn.iosd.starter.datasource.base.BaseController;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 测试示例文章 前端控制器
 * </p>
 *
 * @author ok1996
 */
@Tag(name = "测试示例文章")
@RestController
@RequestMapping("/demo-generator-service/Article")
public class ArticleController extends BaseController<ArticleEntity>{

}
