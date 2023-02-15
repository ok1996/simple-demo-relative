package cn.iosd.demo.generator.code.service.impl;

import cn.iosd.demo.generator.code.entity.Article;
import cn.iosd.demo.generator.code.mapper.ArticleMapper;
import cn.iosd.demo.generator.code.service.IArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * <p>
 * 测试示例文章 服务实现类
 * </p>
 *
 * @author ok1996
 * @since 2023-02-15
 */
@Service
public class ArticleServiceImpl implements IArticleService {
    @Autowired
    private ArticleMapper mapper;

    @Override
    public Article selectById(Long id) {
        return mapper.selectById(id);
    }

    @Override
    public List<Article> selectList(Article article) {
        return mapper.selectList(article);
    }

    @Override
    public int insert(Article article) {
        return mapper.insert(article);
    }

    @Override
    public int update(Article article) {
        return mapper.update(article);
    }

    @Override
    public int deleteByIds(Long[] ids) {
        return mapper.deleteByIds(ids);
    }

    @Override
    public int deleteById(Long id) {
        return mapper.deleteById(id);
    }
}
