package cn.iosd.demo.generator.code.service.impl;

import cn.iosd.demo.generator.code.entity.Article;
import cn.iosd.demo.generator.code.mapper.ArticleMapper;
import cn.iosd.demo.generator.code.service.IArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.time.LocalDateTime;
/**
 * <p>
 * 测试示例文章 服务实现类
 * </p>
 *
 * @author ok1996
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
        article.setCreateTime(LocalDateTime.now());
        article.setModifyTime(LocalDateTime.now());
        return mapper.insert(article);
    }

    @Override
    public int update(Article article) {
        article.setModifyTime(LocalDateTime.now());
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
