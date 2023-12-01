package cn.iosd.demo.generator.api.feign;

import cn.iosd.demo.generator.api.domain.Article;
import cn.iosd.starter.web.base.CrudOperations;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author ok1996
 */
@FeignClient(name = "demo-generator-service", contextId = "ArticleServiceFeign", path = "/demo-generator-service/Article"
        , url = "${simple.feign.demo-generator-service.url:}", primary = false)
public interface ArticleFeign extends CrudOperations<Article> {

}