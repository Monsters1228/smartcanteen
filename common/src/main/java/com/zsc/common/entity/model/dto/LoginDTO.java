package com.zsc.common.entity.model.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author Monsters
 * @date 2022/4/14 11:34 上午
 */
@ApiModel("登录请求参数")
@Data
public class LoginDTO {

    @ApiModelProperty
    private String managerName;

    @ApiModelProperty
    private String password;
}
