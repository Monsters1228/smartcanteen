package com.zsc.common.repository;

import com.zsc.common.entity.system.RoleInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;

/**
 * 角色信息仓库
 * @author Monsters
 * @date 2021/12/8 8:24 上午
 */
@Repository
public interface RoleInfoRepository extends JpaRepository<RoleInfo,Long>, QuerydslPredicateExecutor<RoleInfo> {
}
