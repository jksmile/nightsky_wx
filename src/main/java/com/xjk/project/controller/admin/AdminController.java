package com.xjk.project.controller.admin;

import com.xjk.project.service.WxService;
import com.xjk.project.utils.HomeProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.concurrent.ExecutionException;

/**
 * Intro:
 * Project: projectA
 * Date:    2/28/15
 * Author:  xujinkai
 */

@Controller
@RequestMapping("/admin")
public class AdminController {

	private static final String ADMIN_INDEX_PAGE = HomeProperty.getInstance().getTemplateProperties().getProperty("ADMIN_INDEX_PAGE");

	private static final String ADMIN_LOGIN_PAGE = HomeProperty.getInstance().getTemplateProperties().getProperty("ADMIN_LOGIN_PAGE");

	@RequestMapping("/index")
	public Object index(HttpServletRequest request,HttpServletResponse response){

		System.out.println("admin/index");


		return ADMIN_INDEX_PAGE;
	}



}