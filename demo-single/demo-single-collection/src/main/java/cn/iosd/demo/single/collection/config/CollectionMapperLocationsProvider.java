package cn.iosd.demo.single.collection.config;

import cn.iosd.starter.datasource.mybatis.provider.MapperLocationsProvider;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 接口配置 mapper-locations
 *
 * @author ok1996
 */
@Component
public class CollectionMapperLocationsProvider implements MapperLocationsProvider {
    @Override
    public List<String> getMapperLocations() {
        return List.of("classpath*:/cn/iosd/demo/single/collection/mapper/**/*Mapper.xml");
    }
}
