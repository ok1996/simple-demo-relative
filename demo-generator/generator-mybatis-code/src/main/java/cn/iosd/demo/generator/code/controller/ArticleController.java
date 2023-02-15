package cn.iosd.demo.generator.code.controller;

import cn.iosd.demo.generator.code.entity.Article;
import cn.iosd.demo.generator.code.service.IArticleService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import cn.iosd.starter.datasource.domain.PageRequest;
import cn.iosd.starter.datasource.domain.PageResponse;
import cn.iosd.starter.web.domain.Response;
import com.github.pagehelper.PageHelper;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.List;

/**
 * <p>
 * 测试示例文章 前端控制器
 * </p>
 *
 * @author ok1996
 * @since 2023-02-15
 */
@RestController
@RequestMapping("/code/article")
public class ArticleController {
    @Autowired
    private IArticleService service;

    @Operation(summary = "查询列表")
    @PostMapping("/list")
    public Response<List<Article>> list(@RequestBody Article article) {
        return Response.ok(service.selectList(article));
    }

    @Operation(summary = "查询分页")
    @PostMapping("/page")
    public Response<PageResponse<Article>> page(@RequestBody PageRequest<Article> req) {
        PageHelper.startPage(req.getPageNum(), req.getPageSize(), req.getOrderBy());
        return Response.ok(
                PageResponse.getPage(
                        service.selectList(req.getData())
                ));
    }

    @Operation(summary = "获取详细信息")
    @GetMapping(value = "/{id}")
    public Response<Article> getInfo(@PathVariable("id") Long id) {
        return Response.ok(service.selectById(id));
    }

    @Operation(summary = "新增")
    @PostMapping
    public Response<Integer> add(@RequestBody Article article) {
        return Response.ok(service.insert(article));
    }

    @Operation(summary = "修改")
    @PutMapping
    public Response<Integer> edit(@RequestBody Article article) {
        return Response.ok(service.update(article));
    }

    @Operation(summary = "删除")
    @DeleteMapping("/{ids}")
    public Response<Integer> remove(@PathVariable Long[] ids) {
        return Response.ok(service.deleteByIds(ids));
    }
}
