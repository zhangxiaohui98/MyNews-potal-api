package com.zhang.mynews.potal.dao;

import java.util.HashMap;
import java.util.List;

import com.zhang.mynews.bean.User;


public interface UserMapper {
	
	 	int deleteByPrimaryKey(Integer id);

	    int insert(User record);

	    User selectByPrimaryKey(Integer id);

	    List<User> selectAll();

	    int updateByPrimaryKey(User record);

	    //根据用户名搜索用户
		User queryUserByUsername(HashMap<String,Object> paramMap);
}
