package com.zsc.webapi.controller;

import com.zsc.common.entity.base.BasePageDTO;
import com.zsc.common.entity.base.PageData;
import com.zsc.common.entity.base.ResultData;
import com.zsc.common.entity.model.vo.ManagerInfoVO;
import com.zsc.common.entity.system.ManagerInfo;
import com.zsc.common.service.ManagerService;
import io.swagger.annotations.Api;
import io.swagger.v3.oas.annotations.Operation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

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


    @Operation(summary = "获取管理员列表")
    @PostMapping("/manager/query")
    public ResultData<PageData<ManagerInfoVO>> query(@Validated @RequestBody BasePageDTO pageDTO, BindingResult bindingResult) {
        if (bindingResult.hasErrors()){
            return ResultData.getFailResult(bindingResult.getFieldError().getDefaultMessage());
        }
        return managerService.query(pageDTO);
    }


    @Operation(summary = "根据名称查询管理员")
    @GetMapping("/manager/getOneByName")
    public ManagerInfo getByName() {
        return managerService.getItemByName("root");
    }

    @Operation(summary = "管理员新增")
    @PostMapping("/manager/add")
    public ResultData insert(@RequestBody ManagerInfo managerInfo){
        // TODO
        return null;
    }

    @Operation(summary = "manager/delete")
    @GetMapping("/manager/delete/{Id}")
    public ResultData delete(@PathVariable Integer Id){
        //TODO
        return null;
    }


}
