package com.zsc.common.entity.base;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @author Monsters
 * @date 2022/4/13 8:17 下午
 */
@Data
@ApiModel(value = "返回结果")
public class ResultData<T> implements Serializable {

    // 处理成功
    public static final String OK = "0000";
    public static final String OK_MSG = "操作成功";
    // 未知异常
    public static final String ERR = "9999";
    // 其他错误
    public static final String ERR_MSG = "操作失败";
    private static final long serialVersionUID = 1L;
    @ApiModelProperty(value = "状态码")
    private String code = ERR;
    @ApiModelProperty(value = "状态描述")
    private String msg = "";
    @ApiModelProperty(value = "数据")
    private T data;


    public ResultData() {
    }

    public ResultData(String code, String message) {
        this.code = code;
        this.msg = message;
    }

    public ResultData(String code, String message, T result) {
        this.code = code;
        this.msg = message;
        this.data = result;
    }

    public ResultData(T result) {
        this(OK, OK_MSG, result);
    }

    /**
     * 失败
     */
    public static ResultData getFailResult() {
        return new ResultData(ERR, ERR_MSG);
    }

    /**
     * 失败
     * @param message
     * @return
     */
    public static ResultData getFailResult(String message) {

        return new ResultData(ERR, message);
    }

    /**
     * 失败
     * @param code 错误码
     * @param message 提示信息
     * @return
     */
    public static ResultData getFailResult(String code, String message) {

        return new ResultData(code, message);
    }

    /**
     * 成功
     */
    public static ResultData getSuccessResult() {
        return new ResultData(OK, OK_MSG);
    }

    /**
     * 成功
     * @param message
     * @return
     */
    public static ResultData getSuccessResult(String message) {
        return new ResultData(OK, message);
    }

    /**
     * 成功
     * @param data
     * @param <T>
     * @return
     */
    public static <T> ResultData getSuccessData(T data) {
        return new ResultData(OK, OK_MSG, data);
    }

    /**
     * 成功
     * @param data
     * @param message
     * @param <T>
     * @return
     */
    public static <T> ResultData getSuccessResult(T data, String message) {
        return new ResultData(OK, message, data);
    }
}
