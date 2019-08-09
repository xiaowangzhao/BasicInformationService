package com.sdjzu.basicinformationservice.dao;

import com.sdjzu.basicinformationservice.entity.RoleUserMapping;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoleUserMappingMapper {
    int deleteByPrimaryKey(@Param("userid") String userid, @Param("roleid") String roleid);

    int insert(RoleUserMapping record);

    List<RoleUserMapping> selectAll();
}