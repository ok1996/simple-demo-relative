package cn.iosd.demo.single.collection.config;

import org.flywaydb.core.Flyway;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * @author ok1996
 */
@Configuration
public class CollectionFlywayConfig {

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
}
