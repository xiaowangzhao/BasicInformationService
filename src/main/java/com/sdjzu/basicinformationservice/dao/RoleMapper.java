package com.sdjzu.basicinformationservice.dao;

import com.sdjzu.basicinformationservice.entity.Role;
import java.util.List;

public interface RoleMapper {
    int deleteByPrimaryKey(String roleid);

    int insert(Role record);

    Role selectByPrimaryKey(String roleid);

    List<Role> selectAll();

    int updateByPrimaryKey(Role record);
}