package cn.iosd.demo.generator.code.service;

import cn.iosd.demo.generator.code.entity.Article;
import java.util.List;

/**
 * <p>
 * 测试示例文章 服务类
 * </p>
 *
 * @author ok1996
 * @since 2023-02-15
 */
public interface IArticleService {
    /**
     * 查询单体
     *
     * @param id 主键
     * @return
     */
    Article selectById(Long id);

    /**
     * 查询列表
     *
     * @param article 实体参数
     * @return 集合
     */
    List<Article> selectList(Article article);

    /**
     * 新增
     *
     * @param article 实体
     * @return 结果
     */
    int insert(Article article);

    /**
     * 修改
     *
     * @param article 实体
     * @return 结果
     */
    int update(Article article);

    /**
     * 批量删除
     *
     * @param ids 需要删除的主键集合
     * @return 结果
     */
    int deleteByIds(Long[] ids);

    /**
     * 删除
     *
     * @param id 主键
     * @return 结果
     */
    int deleteById(Long id);
}
