package com.zsc.webapi.controller;

import com.zsc.common.entity.base.ResultData;
import com.zsc.common.entity.system.ManagerInfo;
import com.zsc.common.service.ManagerService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.v3.oas.annotations.Operation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Monsters
 * @date 2022/4/11 8:16 下午
 */
@Api(tags = "管理员信息接口")
@Slf4j
@RestController
@RequestMapping("/api")
public class ManagerController {

    private final ManagerService managerService;

    public ManagerController(ManagerService managerService) {
        this.managerService = managerService;
    }


    @ApiOperation("获取管理员列表")
    @GetMapping("/manager/getAll")
    public ResultData getAll() {
        return new ResultData(managerService.getAll());
    }

    @ApiOperation("根据名称查询管理员")
    @GetMapping("/manager/getOneByName")
    public ManagerInfo getOneByName() {
        return managerService.getItemByName("root");
    }
}
