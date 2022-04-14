package com.zsc.common.service;

import com.zsc.common.entity.base.BasePageDTO;
import com.zsc.common.entity.base.PageData;
import com.zsc.common.entity.base.ResultData;
import com.zsc.common.entity.model.vo.ManagerInfoVO;
import com.zsc.common.entity.system.ManagerInfo;

import java.util.List;

/**
 * 管理员服务类
 * @author Monsters
 * @date 2021/12/8 8:36 上午
 */
public interface ManagerService {

    ResultData<PageData<ManagerInfoVO>> query(BasePageDTO pageDTO);

    ManagerInfo getItemByName(String name);

    ResultData managerLogin(String username, String password);
}
