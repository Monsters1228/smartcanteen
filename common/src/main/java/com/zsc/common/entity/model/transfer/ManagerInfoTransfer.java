package com.zsc.common.entity.model.transfer;

import com.zsc.common.entity.base.UserType;
import com.zsc.common.entity.model.vo.ManagerInfoVO;
import com.zsc.common.entity.system.ManagerInfo;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * @author Monsters
 * @date 2022/4/14 8:25 上午
 */
@Mapper
public interface ManagerInfoTransfer {

    ManagerInfoTransfer INSTANCE = Mappers.getMapper(ManagerInfoTransfer.class);

    ManagerInfoVO toDomain(ManagerInfo domain);

    List<ManagerInfoVO> toVOList(List<ManagerInfo> content);

    default Integer UserTypeMap(UserType value){
        return value.getValue();
    }
}
