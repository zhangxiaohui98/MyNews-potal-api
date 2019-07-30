package com.zhang.mynews.potal.service;

import java.util.HashMap;

import com.zhang.mynews.bean.User;

public interface UserService {
	/**
	 * 	用户登录
	 * @param paramMap
	 * @return
	 */
	User queryUserLogin(HashMap<String,Object> paramMap);
	
	/**
	 * 注册用户
	 * @param paramMap
	 * @return
	 */
	int doReg(User user);

	/**
	 * 修改用户信息
	 * @param changeUser
	 * @return
	 */
	int doChang(User changeUser);
}
