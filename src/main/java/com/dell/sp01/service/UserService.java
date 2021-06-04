package com.dell.sp01.service;

import com.dell.sp01.pojo.User;

public interface UserService {
	//获取订单
	User getUser(Integer id);
	
	//添加订单
	void addScore(Integer id, Integer score);

}
