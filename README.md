# simple-demo-relative
Simple独立示例模块

## demo-native示例模块
| 模块名称             | 说明                         | 文档                    | 端口号   |
|------------------|----------------------------|-----------------------|-------|
| native-demo-boot | native示例simple-starter-web | demo-native\README.md | 11010 |

## demo-generator示例模块
| 模块名称                    | 说明                          | 端口号   |
|-------------------------|-----------------------------|-------|
| generator-mybatis-code  | generator生成Mybatis代码后测试使用示例 | 13021 |


## 启动Demo需修改的配置  - Add VM options

GeneratorMybatisApplication
~~~
-Dspring.datasource.dynamic.datasource.master.url=
-Dspring.datasource.dynamic.datasource.master.username=root
-Dspring.datasource.dynamic.datasource.master.password=
~~~


