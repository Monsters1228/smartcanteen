package com.zsc.webapi.controller;

import com.zsc.common.entity.base.ResultData;
import com.zsc.common.service.ManagerService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Monsters
 * @date 2022/4/13 10:22 下午
 */
@Api(tags = "后台管理登录接口")
@RestController
@RequestMapping("/api")
public class LoginController {

    private final ManagerService managerService;

    public LoginController(ManagerService managerService) {
        this.managerService = managerService;
    }

    @ApiOperation("管理员登录")
    @GetMapping("/login")
    public ResultData managerLogin(@RequestParam(value = "managerName") String managerName,
                                   @RequestParam(value = "password") String password) {
        return managerService.managerLogin(managerName, password);
    }

    @ApiOperation("管理员登出")
    @GetMapping("/login")
    public ResultData logout() {
        return ResultData.getSuccessResult();
    }
}


