package cn.iosd.demo.single.collection.vo;

import cn.iosd.starter.encrypt.desensitized.annotation.SensitiveEntity;
import cn.iosd.starter.encrypt.desensitized.annotation.SensitiveField;
import cn.iosd.starter.encrypt.desensitized.vo.SensitiveRule;
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
public class SuperPersonVo {

    @SensitiveEntity
    private PersonVo personVo;

    @Schema(description = "昵称")
    @SensitiveField(rule = SensitiveRule.CHINESE_NAME)
    private String nickname;

    @Schema(description = "功能")
    private String specificFunction;
}
