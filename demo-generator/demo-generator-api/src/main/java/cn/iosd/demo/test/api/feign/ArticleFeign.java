package cn.iosd.demo.test.api.feign;

import cn.iosd.demo.test.api.domain.Article;
import cn.iosd.starter.web.base.CrudOperations;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author ok1996
 */
@FeignClient(name = "demo-generator", contextId = "ArticleServiceFeign", path = "/demo-generator/Article"
        , url = "${simple.feign.simple-base-generator.url:}", primary = false)
public interface ArticleFeign extends CrudOperations<Article> {

}