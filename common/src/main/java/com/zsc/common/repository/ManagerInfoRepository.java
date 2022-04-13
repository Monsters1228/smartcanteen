package com.zsc.common.repository;

import com.zsc.common.entity.system.ManagerInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;

/**
 * 管理员信息仓库
 * @author Monsters
 * @date 2021/12/8 8:21 上午
 */
@Repository
public interface ManagerInfoRepository extends JpaRepository<ManagerInfo,Long>, QuerydslPredicateExecutor<ManagerInfo> {
}
