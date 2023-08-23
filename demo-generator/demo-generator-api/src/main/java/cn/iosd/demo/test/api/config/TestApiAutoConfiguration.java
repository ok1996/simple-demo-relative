package cn.iosd.demo.test.api.config;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author ok1996
 */
@Configuration
@EnableFeignClients(basePackages = {"cn.iosd.demo.test.api.feign"})
@ComponentScan(value = {"cn.iosd.demo.test.api"})
public class TestApiAutoConfiguration {
}
