package com.palm.struts.dao.impl;

import org.springframework.stereotype.Repository;

import com.palm.struts.dao.UserInfoDao;

@Repository("userInfoDao")
public class UserInfoDaoImpl implements UserInfoDao {

	@Override
	public boolean queryByUsernameAndPassword(String username, String password) {
		if("admin".equals(username) && "admin".equals(password)){
			return true;
		}
		return false;
	}

}
