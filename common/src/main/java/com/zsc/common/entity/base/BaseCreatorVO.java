package com.zsc.common.entity.base;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.Column;

/**
 * @author Monsters
 * @date 2022/4/14 8:17 上午
 */
@Data
public class BaseCreatorVO {

    @ApiModelProperty("创建人名称")
    private String creatorName;

    @ApiModelProperty("创建人名称")
    private String modifiedName;
}
