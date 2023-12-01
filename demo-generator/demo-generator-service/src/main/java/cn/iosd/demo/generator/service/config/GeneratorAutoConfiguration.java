package cn.iosd.demo.generator.service.config;

import cn.iosd.starter.datasource.mybatis.MapperLocations;
import org.flywaydb.core.Flyway;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * 配置MapperScan、MapperLocations、Flyway
 *
 * @author ok1996
 */
@Configuration
@MapperScan(basePackages = "cn.iosd.demo.generator.service.mapper")
public class GeneratorAutoConfiguration {

    @Bean
    public Flyway generatorFlyway(DataSource dataSource) {
        Flyway flyway = Flyway.configure()
                .dataSource(dataSource)
                .locations("classpath:db/mysql/generator")
                .baselineOnMigrate(true)
                .table("generator_flyway_schema_history")
                .load();
        flyway.migrate();
        return flyway;
    }

    @Bean
    public MapperLocations generatorMapperLocations() {
        return new MapperLocations("classpath*:/cn/iosd/demo/generator/service/mapper/**/*Mapper.xml");
    }
}
