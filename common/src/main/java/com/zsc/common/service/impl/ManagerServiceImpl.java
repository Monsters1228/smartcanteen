package com.zsc.common.service.impl;

import com.querydsl.core.types.Predicate;
import com.querydsl.jpa.impl.JPAQueryFactory;
import com.zsc.common.entity.system.ManagerInfo;
import com.zsc.common.entity.system.QManagerInfo;
import com.zsc.common.repository.ManagerInfoRepository;
import com.zsc.common.service.ManagerService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Monsters
 * @date 2022/4/11 7:29 下午
 */
@Service
public class ManagerServiceImpl implements ManagerService {


    private final ManagerInfoRepository repository;

    private final JPAQueryFactory factory;

    QManagerInfo qManagerInfo = QManagerInfo.managerInfo;

    public ManagerServiceImpl(ManagerInfoRepository repository, JPAQueryFactory factory) {
        this.repository = repository;
        this.factory = factory;
    }


    @Override
    public List<ManagerInfo> getAll() {
        return repository.findAll();
    }

    @Override
    public ManagerInfo getItemByName(String name) {
        Predicate predicate = qManagerInfo.username.eq(name);
        return repository.findOne(predicate).get();
    }
}
