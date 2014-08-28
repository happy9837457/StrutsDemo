package com.palm.struts.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.palm.struts.dao.UserInfoDao;
import com.palm.struts.service.UserInfoService;

@Service("userInfoService")
public class UserInfoServiceImpl implements UserInfoService {
	@Resource
	private UserInfoDao userInfoDao;

	@Override
	public boolean queryByUsernameAndPassword(String username, String password) {
		return userInfoDao.queryByUsernameAndPassword(username, password);
	}

}
