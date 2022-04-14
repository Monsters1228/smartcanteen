package com.zsc.common.entity.model.vo;

import com.zsc.common.entity.base.BaseCreateTimeVO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;


/**
 * @author Monsters
 * @date 2022/4/14 8:08 上午
 */
@ApiModel("管理员列表返回结果")
@Data
public class ManagerInfoVO extends BaseCreateTimeVO {

    @ApiModelProperty("角色id")
    private long roleId;

    @ApiModelProperty("状态")
    private Boolean status;


    @ApiModelProperty("用户名")
    private String username;

    @ApiModelProperty("密码")
    private String password;


    @ApiModelProperty("邮箱")
    private String email;


    @ApiModelProperty("手机号")
    private String phone;

    @ApiModelProperty("用户类型")
    private Integer userType;
}
