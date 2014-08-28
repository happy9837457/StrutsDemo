package com.palm.struts.web.interceptor;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import com.palm.struts.bean.UserInfo;

/**
 * 登录拦截器
 * 
 * @author weixiang.qin
 * 
 */
@SuppressWarnings("serial")
public class CheckLoginInterceptor extends AbstractInterceptor {

	public String intercept(ActionInvocation actionInvocation) throws Exception {
		HttpSession session = ServletActionContext.getRequest().getSession();
		UserInfo userInfo = (UserInfo) session.getAttribute("userInfo");
		if (userInfo != null) {
			return actionInvocation.invoke();
		} else {
			return Action.LOGIN;
		}
	}
}
