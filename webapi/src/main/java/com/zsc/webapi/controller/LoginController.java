package com.zsc.webapi.controller;

import com.zsc.common.entity.base.ResultData;
import com.zsc.common.entity.model.dto.LoginDTO;
import com.zsc.common.service.ManagerService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.*;

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

    @Operation(summary = "管理员登录")
    @PostMapping("/login")
    public ResultData managerLogin(@RequestBody LoginDTO loginDTO) {
        return managerService.managerLogin(loginDTO.getManagerName(), loginDTO.getPassword());
    }

    @Operation(summary = "管理员登出")
    @GetMapping("/logout")
    public ResultData logout() {
        return ResultData.getSuccessResult();
    }
}


