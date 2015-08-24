package com.xjk.project.controller.admin;

import com.xjk.project.constant.SessionConstant;
import com.xjk.project.model.UserModel;
import com.xjk.project.service.UserService;
import com.xjk.project.utils.HomeProperty;
import com.xjk.project.utils.MD5Util;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Intro:
 * Project: projectA
 * Date:    3/2/15
 * Author:  xujinkai
 */

@Controller
@RequestMapping("/login")
public class LoginController {

	private static final String ADMIN_LOGIN_PAGE = HomeProperty.getInstance().getTemplateProperites().getProperty("ADMIN_LOGIN_PAGE");

	private static final String ADMIN_INDEX_PAGE = HomeProperty.getInstance().getTemplateProperites().getProperty("ADMIN_INDEX_PAGE");

	@Autowired
	private UserService userService;


	@RequestMapping("/index")
	public Object login(HttpServletRequest request, HttpServletResponse response, Model model) {

		String userName = request.getParameter(SessionConstant.SESSION_USER_NAME);

		String userPass = request.getParameter(SessionConstant.SESSION_USER_PASS);

		if (StringUtils.isNotBlank(userName) && StringUtils.isNotBlank(userPass)) {

			UserModel userInfo = userService.checkLogin(userName, MD5Util.getPassMD5(userPass));

			if (null != userInfo && !userInfo.getUserName().isEmpty()) {

				request.getSession().setAttribute(SessionConstant.SESSION_USER_NAME,request.getParameter(SessionConstant.SESSION_USER_NAME));

				return ADMIN_INDEX_PAGE;

			}

		}


		model.addAttribute("loginName",SessionConstant.SESSION_USER_NAME);

		model.addAttribute("loginPass",SessionConstant.SESSION_USER_PASS);

		return new ModelAndView(ADMIN_LOGIN_PAGE);

	}





}
