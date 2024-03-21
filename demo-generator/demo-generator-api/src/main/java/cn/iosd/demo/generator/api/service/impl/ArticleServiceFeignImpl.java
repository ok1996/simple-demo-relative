package cn.iosd.demo.generator.api.service.impl;

import cn.iosd.demo.generator.api.domain.Article;
import cn.iosd.demo.generator.api.feign.ArticleFeign;
import cn.iosd.demo.generator.api.service.IArticleService;
import cn.iosd.starter.web.base.ICrudServiceFeignImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 测试示例文章 服务实现类-Feign
 * </p>
 *
 * @author ok1996
 */
@Service
public class ArticleServiceFeignImpl extends ICrudServiceFeignImpl<Article,ArticleFeign> implements IArticleService{

    @Autowired
    private ArticleFeign articleFeign;

}
