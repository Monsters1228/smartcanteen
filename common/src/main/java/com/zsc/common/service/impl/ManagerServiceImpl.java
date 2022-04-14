package com.zsc.common.service.impl;

import com.querydsl.core.types.Predicate;
import com.querydsl.jpa.impl.JPAQueryFactory;
import com.zsc.common.entity.base.BasePageDTO;
import com.zsc.common.entity.base.PageData;
import com.zsc.common.entity.base.ResultData;
import com.zsc.common.entity.model.transfer.ManagerInfoTransfer;
import com.zsc.common.entity.model.vo.ManagerInfoVO;
import com.zsc.common.entity.system.ManagerInfo;
import com.zsc.common.entity.system.QManagerInfo;
import com.zsc.common.repository.ManagerInfoRepository;
import com.zsc.common.service.ManagerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * @author Monsters
 * @date 2022/4/11 7:29 下午
 */
@Slf4j
@Service
public class ManagerServiceImpl implements ManagerService {


    // jpa 基础查询仓库
    private final ManagerInfoRepository repository;

    // queryDsl 查询构建器
    private final JPAQueryFactory factory;

    QManagerInfo qManagerInfo = QManagerInfo.managerInfo;

    public ManagerServiceImpl(ManagerInfoRepository repository, JPAQueryFactory factory) {
        this.repository = repository;
        this.factory = factory;
    }


    @Override
    public ResultData<PageData<ManagerInfoVO>> query(BasePageDTO pageDTO) {
        // 使用 jap + queryDsl 进行查询
        PageRequest pageRequest = PageRequest.of(pageDTO.getPageNum() - 1, pageDTO.getPageSize());
        Page<ManagerInfo> page = repository.findAll(pageRequest);
        List<ManagerInfoVO> voList = ManagerInfoTransfer.INSTANCE.toVOList(page.getContent());
        return ResultData.getSuccessData(PageData.convertPageData(page, voList));
    }

    @Override
    public ManagerInfo getItemByName(String name) {
        // 使用原生 queryDsl 查询
        return this.factory.selectFrom(qManagerInfo).where(qManagerInfo.username.eq(name)).fetchOne();
    }

    @Override
    public ResultData managerLogin(String username, String password) {
        ManagerInfo managerInfo = this.getItemByName(username);
        if (managerInfo == null){
            return ResultData.getFailResult("用户名不存在");
        }
        if (!managerInfo.getPassword().equals(password)){
            return ResultData.getFailResult("密码错误");
        }
        return ResultData.getSuccessResult("登录成功");
    }
}
