package cn.iosd.demo.generator.code.config;

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
@MapperScan("cn.iosd.demo.generator.code.mapper")
public class CodeAutoConfig {
}
