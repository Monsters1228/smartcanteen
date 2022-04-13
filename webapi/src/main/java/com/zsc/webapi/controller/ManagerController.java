package com.zsc.webapi.controller;

import com.zsc.common.entity.system.ManagerInfo;
import com.zsc.common.service.ManagerService;
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
@Slf4j
@RestController
@RequestMapping("/api")
public class ManagerController {

    private final ManagerService managerService;

    public ManagerController(ManagerService managerService){
        this.managerService = managerService;
    }

    @GetMapping("/manager/getAll")
    public List<ManagerInfo> getAll(){
        return managerService.getAll();
    }

    @GetMapping("/manager/getOneByName")
    public ManagerInfo getOneByName(){
        return managerService.getItemByName("root");
    }
}
