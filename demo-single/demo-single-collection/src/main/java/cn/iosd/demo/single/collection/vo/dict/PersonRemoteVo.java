package cn.iosd.demo.single.collection.vo.dict;

import cn.iosd.demo.single.collection.service.CustomDictServiceImpl;
import cn.iosd.demo.single.collection.service.dict.RemoteDictServiceImpl;
import cn.iosd.starter.dict.annotation.DictField;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author ok1996
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PersonRemoteVo {
    @Schema(description = "姓名")
    private String name;

    @Schema(description = "身份标识-自定义远程调用接口实现类字典")
    @DictField(dictionaryParams = "idCard", dictImplClass = CustomDictServiceImpl.class, relatedField = "idCardText")
    private Integer idCard;

    private String idCardText;

    @Schema(description = "隐藏身份-默认远程调用接口实现类字典")
    @DictField(dictionaryParams = "/dict/remote/hideIdentity",dictImplClass = RemoteDictServiceImpl.class, relatedField = "hideIdentityText")
    private Integer hideIdentity;

    private String hideIdentityText;
}
