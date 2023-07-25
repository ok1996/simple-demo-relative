package cn.iosd.demo.single.collection.config;

import cn.iosd.starter.datasource.mybatis.MapperLocations;
import org.flywaydb.core.Flyway;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.util.List;

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
    @Bean
    public Flyway collectionFlyway(DataSource dataSource) {
        Flyway flyway = Flyway.configure()
                .dataSource(dataSource)
                .locations("classpath:db/mysql/collection")
                .baselineOnMigrate(true)
                .table("collection_flyway_schema_history")
                .load();
        flyway.migrate();
        return flyway;
    }

    @Bean
    public MapperLocations collectionMapperLocations() {
        return new MapperLocations("classpath*:/cn/iosd/demo/single/collection/mapper/**/*Mapper.xml");
    }
}
