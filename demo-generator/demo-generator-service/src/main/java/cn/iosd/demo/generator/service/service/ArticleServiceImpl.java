package cn.iosd.demo.generator.service.service;

import cn.iosd.demo.generator.service.entity.ArticleEntity;
import cn.iosd.demo.generator.service.mapper.ArticleMapper;
import cn.iosd.demo.generator.api.service.IArticleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
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
public class ArticleServiceImpl extends ServiceImpl<ArticleMapper, ArticleEntity> implements IArticleService {

}
