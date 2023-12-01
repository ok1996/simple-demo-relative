package cn.iosd.demo.generator.api.config;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author ok1996
 */
@Configuration
@EnableFeignClients(basePackages = {"cn.iosd.demo.generator.api.feign"})
@ComponentScan(value = {"cn.iosd.demo.generator.api"})
public class GeneratorApiAutoConfiguration {
}
