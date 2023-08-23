## demo-generator

demo-generator


## 启动Service需修改的配置
根据实际情况修改参数

- Add VM options
~~~
-Dspring.datasource.dynamic.datasource.master.url=jdbc:mysql://127.0.0.1:3306/simple_demo?useUnicode=true&characterEncoding=utf8&zeroDateTimeBehavior=convertToNull&useSSL=true&serverTimezone=GMT%2B8
-Dspring.datasource.dynamic.datasource.master.username=root
-Dspring.datasource.dynamic.datasource.master.password=
-Dspring.cloud.nacos.discovery.enabled=false
-Dspring.cloud.nacos.config.enabled=false
-Dspring.cloud.nacos.server-addr=
-Dspring.cloud.nacos.username=
-Dspring.cloud.nacos.password=
-Dspring.cloud.nacos.discovery.namespace=
-Dspring.cloud.nacos.config.namespace=
~~~
