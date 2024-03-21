package cn.iosd.demo.generator.service.service;

import cn.iosd.demo.generator.api.domain.Article;
import cn.iosd.demo.generator.service.entity.ArticleEntity;
import cn.iosd.demo.generator.service.mapper.ArticleMapper;
import cn.iosd.demo.generator.api.service.IArticleService;
import cn.iosd.starter.datasource.base.BaseServiceImpl;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 测试示例文章 服务实现类-Mybatis
 * </p>
 *
 * @author ok1996
 */
@Service
@Primary
public class ArticleServiceImpl extends BaseServiceImpl<ArticleMapper, ArticleEntity, Article> implements IArticleService {

}
