# simple-demo-relative

Simple独立示例模块

## demo-native示例模块

| 模块名称             | 说明                         | 文档                    | 端口号  |
|------------------|----------------------------|-----------------------|------|
| native-demo-boot | native示例simple-starter-web | demo-native\README.md | 7010 |

## demo-generator示例模块

| 模块名称                   | 说明                          | 端口号  |
|------------------------|-----------------------------|------|
| generator-mybatis-code | generator生成Mybatis代码后测试使用示例 | 7020 |

## demo-single示例模块

demo-single-collection 单体集合各模块测试类

| 依赖模块                      | 集成测试 | 端口号  |
|:--------------------------|:----:|:----:|
| simple-starter-web        |  √   | 7030 |
| simple-starter-socket     |  √   | 7031 |
| simple-starter-grpc       |  √   | 7032 |
| simple-starter-s3         |  √   |      |
| simple-starter-cloud      |  √   |      |
| simple-starter-redisson   |  √   |      |
| simple-starter-datasource |  √   |      |
| simple-starter-freemarker |  √   |      |
| simple-base-param         |  √   |      |

Nacos远程配置中心:application.yml  公共-通用配置
~~~
simple:
  openApi:
    version: 1.0.0
    contact:
      name: ok1996
      url: https://ok96.cn
      email: ku29@qq.com
~~~

## 启动Demo需修改的配置 - Add VM options

GeneratorMybatisApplication

~~~
-Dspring.datasource.dynamic.datasource.master.url=
-Dspring.datasource.dynamic.datasource.master.username=root
-Dspring.datasource.dynamic.datasource.master.password=
~~~

CollectionApplication

~~~
-Dspring.datasource.dynamic.datasource.master.url=
-Dspring.datasource.dynamic.datasource.master.username=root
-Dspring.datasource.dynamic.datasource.master.password=
-Dsimple.redisson.address=
-Dsimple.redisson.password=
-Dsimple.s3.endpoint=
-Dspring.cloud.nacos.server-addr=
-Dspring.cloud.nacos.username=
-Dspring.cloud.nacos.password=
-Dspring.cloud.nacos.discovery.namespace=
-Dspring.cloud.nacos.config.namespace=
--add-opens
java.base/java.util=ALL-UNNAMED
~~~

