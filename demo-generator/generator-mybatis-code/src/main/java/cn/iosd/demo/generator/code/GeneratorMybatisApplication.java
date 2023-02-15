package cn.iosd.demo.generator.code;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author ok1996
 */
@SpringBootApplication
public class GeneratorMybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(GeneratorMybatisApplication.class, args);
    }

    /**
     * 生成代码示例 引入simple-base-generator
     */
/*
    public static void main(String[] args) {
        MybatisGeneratorVo vo = new MybatisGeneratorVo();
        vo.setAuthorName("ok1996");
        vo.setDataBaseUrl("jdbc:mysql://127.0.0.1:3306/generator?useUnicode=true&characterEncoding=utf8&zeroDateTimeBehavior=convertToNull&useSSL=true");
        vo.setDataBaseUserName("root");
        vo.setDataBasePassword("123456");
        vo.setPackageName("cn.iosd.demo.generator");
        vo.setModuleName("code");
        vo.setTableName("demo_article");
        List<String> tablePrefix=new ArrayList<>();
        tablePrefix.add("demo");
        vo.setTablePrefix(tablePrefix);
        MybatisGenerator.generate(vo);
    }
*/
}


