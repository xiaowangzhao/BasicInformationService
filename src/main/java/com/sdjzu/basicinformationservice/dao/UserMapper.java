package com.sdjzu.basicinformationservice.dao;

import com.sdjzu.basicinformationservice.entity.User;
import java.util.List;

public interface UserMapper {
    int deleteByPrimaryKey(String userid);

    int insert(User record);

    User selectByPrimaryKey(String userid);

    List<User> selectAll();

    int updateByPrimaryKey(User record);
}