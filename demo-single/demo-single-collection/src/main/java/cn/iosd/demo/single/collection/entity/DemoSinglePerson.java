package cn.iosd.demo.single.collection.entity;

import cn.iosd.starter.dict.annotation.DictField;
import com.baomidou.mybatisplus.annotation.TableField;
import io.swagger.v3.oas.annotations.media.Schema;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * <p>
 * 人员列表
 * </p>
 *
 * @author ok1996
 */
@TableName("demo_single_person")
@Schema(name = "DemoSinglePerson", description = "人员列表")
public class DemoSinglePerson {

    private Long id;

    @Schema(description = "姓名")
    private String name;

    @Schema(description = "性别")
    @DictField(dictionaryParams = "sex", dictImplBeanName = "localDictServiceImpl", relatedField = "sexText")
    private Integer sex;

    @Schema(description = "性别")
    @TableField(exist = false)
    private String sexText;

    @Schema(description = "备注")
    private String remark;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getSexText() {
        return sexText;
    }

    public void setSexText(String sexText) {
        this.sexText = sexText;
    }

    @Override
    public String toString() {
        return "DemoSinglePerson{" +
            "id = " + id +
            ", name = " + name +
            ", sex = " + sex +
            ", remark = " + remark +
        "}";
    }
}
