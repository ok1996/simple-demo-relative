package cn.iosd.demo.generator.gen;


import cn.iosd.base.generator.api.utils.DatabaseGenUtils;
import cn.iosd.base.generator.api.vo.DatabaseGenVo;
import java.io.File;
import java.util.Collections;

/**
 * @author ok1996
 */
public class GeneratorServiceGen {

    public static void main(String[] args) {
        DatabaseGenVo vo = new DatabaseGenVo();
        vo.setAuthorName("ok1996");
        vo.setDataBaseUrl("jdbc:mysql://127.0.0.1:3306/simple_demo?useUnicode=true&characterEncoding=utf8&zeroDateTimeBehavior=convertToNull&useSSL=true&serverTimezone=GMT%2B8");
        vo.setDataBaseUserName("root");
        vo.setDataBasePassword("123456");
        vo.setPackageName("cn.iosd.demo");
        vo.setProjectName("demo-generator");
        vo.setModuleName("generator");
        vo.setTableNames(Collections.singletonList("demo_article"));
        vo.setTablePrefix(Collections.singletonList("demo"));
        DatabaseGenUtils.generate(vo);
        System.out.println("文件生成目录：" + new File("target/generator").getAbsolutePath());
    }
}


