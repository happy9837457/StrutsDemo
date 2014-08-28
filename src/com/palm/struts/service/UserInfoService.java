package com.palm.struts.service;

/**
 * 
 * @author weixiang.qin
 * 
 */
public interface UserInfoService {
	/**
	 * 根据用户名和密码查询
	 * 
	 * @param username
	 * @param password
	 * @return
	 */
	public boolean queryByUsernameAndPassword(String username, String password);
}
