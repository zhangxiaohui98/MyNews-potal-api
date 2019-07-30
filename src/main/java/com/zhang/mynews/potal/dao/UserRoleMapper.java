package com.zhang.mynews.potal.dao;

import java.util.List;

import com.zhang.mynews.bean.UserRole;

public interface UserRoleMapper {
	
	int deleteByPrimaryKey(Integer id);

    int insert(UserRole record);

    UserRole selectByPrimaryKey(Integer id);

    List<UserRole> selectAll();

    int updateByPrimaryKey(UserRole record);

}
