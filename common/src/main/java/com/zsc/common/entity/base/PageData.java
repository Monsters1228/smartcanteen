package com.zsc.common.entity.base;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.data.domain.Page;

import java.util.List;

/**
 * 返回分页结果
 * @author Monsters
 * @date 2022/4/14 1:05 上午
 */
@Data
public class PageData<T>{

    @ApiModelProperty(value = "当前页", example = "1")
    long current;

    @ApiModelProperty(value = "每页显示的记录数", example = "10")
    long pageSize;

    @ApiModelProperty(value = "总记录数", example = "10")
    long total;

    @ApiModelProperty(value = "总页数", example = "1")
    long pages;

    @ApiModelProperty(value = "数据")
    List<T> data;

    /**
     * 将 page 对象 转为 pageData
     * @param page
     * @param <T>
     * @return
     */
    public static <T> PageData convertPageData(Page<T> page){
        PageData<T> pageData = new PageData<>();
        pageData.setCurrent(page.getNumber() + 1);
        pageData.setPageSize(page.getSize());
        pageData.setTotal(page.getTotalElements());
        pageData.setPages(page.getTotalPages());
        pageData.setData(page.getContent());
        return pageData;
    }
}
