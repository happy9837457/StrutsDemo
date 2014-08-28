package com.palm.struts.web.action;

import javax.annotation.Resource;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;
import com.palm.struts.service.UserInfoService;

/**
 * 登录Action
 * 
 * @author weixiang.qin
 * 
 */
@Namespace("/login")
@ParentPackage("default")
@Scope("prototype")
@Controller
public class LoginAction extends ActionSupport {
	private static final long serialVersionUID = 1505706242769633220L;
	@Resource
	private UserInfoService userInfoService;
	private String username;
	private String password;

	@Action(value = "login", results = {
			@Result(name = "success", location = "/index.jsp"),
			@Result(name = "input", location = "/error.jsp") })
	public String login() throws Exception {
		// HttpServletRequest request = ServletActionContext.getRequest();
		// HttpSession session = request.getSession();
		System.out.println("username:" + username + " " + "password:"
				+ password);
		boolean result = userInfoService.queryByUsernameAndPassword(username,
				password);
		if (result) {
			return SUCCESS;
		}
		return INPUT;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
