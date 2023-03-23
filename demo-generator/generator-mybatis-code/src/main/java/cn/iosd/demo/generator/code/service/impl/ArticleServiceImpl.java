package cn.iosd.demo.generator.code.service.impl;

import cn.iosd.demo.generator.code.entity.Article;
import cn.iosd.demo.generator.code.mapper.ArticleMapper;
import cn.iosd.demo.generator.code.service.IArticleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 测试示例文章 服务实现类
 * </p>
 *
 * @author ok1996
 */
@Service
public class ArticleServiceImpl extends ServiceImpl<ArticleMapper, Article> implements IArticleService {

}
