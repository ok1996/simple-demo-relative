package cn.iosd.demo.test.service.service;

import cn.iosd.demo.test.service.entity.ArticleEntity;
import cn.iosd.demo.test.service.mapper.ArticleMapper;
import cn.iosd.demo.test.api.service.IArticleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 测试示例文章 服务实现类-Mybatis
 * </p>
 *
 * @author ok1996
 */
@Service
public class ArticleServiceImpl extends ServiceImpl<ArticleMapper, ArticleEntity> implements IArticleService {

}
