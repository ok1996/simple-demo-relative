package cn.iosd.demo.test.api.service.impl;

import cn.iosd.demo.test.api.feign.ArticleFeign;
import cn.iosd.demo.test.api.service.IArticleService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * <p>
 * 测试示例文章 服务实现类-Feign
 * </p>
 *
 * @author ok1996
 */
public class ArticleServiceFeign implements IArticleService{

    @Autowired
    private ArticleFeign articleFeign;

}
