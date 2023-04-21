package cn.iosd.demo.single.collection.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * <p>
 * 配置文件
 * </p>
 *
 * @author ok1996
 */
@Configuration
@MapperScan("cn.iosd.demo.single.collection.mapper")
public class CollectionAutoConfig {
}
