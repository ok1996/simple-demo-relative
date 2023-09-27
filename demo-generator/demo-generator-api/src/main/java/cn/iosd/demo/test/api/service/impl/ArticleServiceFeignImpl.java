package cn.iosd.demo.test.api.service.impl;

import cn.iosd.demo.test.api.feign.ArticleFeign;
import cn.iosd.demo.test.api.service.IArticleService;
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
public class ArticleServiceFeignImpl implements IArticleService{

    @Autowired
    private ArticleFeign articleFeign;

}
