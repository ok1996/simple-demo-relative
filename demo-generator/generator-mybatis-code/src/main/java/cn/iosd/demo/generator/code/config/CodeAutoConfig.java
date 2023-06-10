package cn.iosd.demo.generator.code.config;

import org.flywaydb.core.Flyway;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import javax.sql.DataSource;

/**
 * <p>
 * 配置MapperScan、Flyway、ComponentScan以及是否启用
 * </p>
 *
 * @author ok1996
 */
@Configuration
@MapperScan("cn.iosd.demo.generator.code.mapper")
@ComponentScan(value = {"cn.iosd.demo.generator.code.mapper"})
@ConditionalOnProperty(value = "simple.scan.enabled", havingValue = "true", matchIfMissing = true)
public class CodeAutoConfig {

    @Bean
    public Flyway codeFlyway(DataSource dataSource) {
        Flyway flyway = Flyway.configure()
                .dataSource(dataSource)
                .locations("classpath:db/mysql/code")
                .baselineOnMigrate(true)
                .table("code_flyway_schema_history")
                .load();
        flyway.migrate();
        return flyway;
    }

}
