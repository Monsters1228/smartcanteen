package com.zsc.common.entity.base;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;


/**
 * 基础分页查询参数
 *
 * @author Monsters
 * @date 2022/4/13 10:44 下午
 */
@Data
public class BasePageDTO {

    /**
     * 默认查询第一页
     */
    private Integer pageNum = 1;

    /**
     * 默认分页大小为 10
     */
    private Integer pageSize = 10;

}
