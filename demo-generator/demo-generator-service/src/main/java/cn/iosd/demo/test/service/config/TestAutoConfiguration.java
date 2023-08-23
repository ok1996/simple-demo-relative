package cn.iosd.demo.test.service.config;

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
@MapperScan(basePackages = "cn.iosd.demo.test.service.mapper")
public class TestAutoConfiguration {

    @Bean
    public Flyway testFlyway(DataSource dataSource) {
        Flyway flyway = Flyway.configure()
                .dataSource(dataSource)
                .locations("classpath:db/mysql/test")
                .baselineOnMigrate(true)
                .table("test_flyway_schema_history")
                .load();
        flyway.migrate();
        return flyway;
    }

    @Bean
    public MapperLocations testMapperLocations() {
        return new MapperLocations("classpath*:/cn/iosd/demo/test/service/mapper/**/*Mapper.xml");
    }
}
