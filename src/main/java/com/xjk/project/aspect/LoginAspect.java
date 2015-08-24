package com.xjk.project.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.*;
import java.io.IOException;

/**
 * Intro:
 * Project: projectA
 * Date:    3/2/15
 * Author:  xujinkai
 */
@Aspect
public class LoginAspect {

	@Pointcut("execution(* com.xjk.project.controller.admin..*.*(..)) && !execution(* com.xjk.project.controller.admin.LoginController.*(..))")
	public void pointCut(){



	}

	@Before("pointCut() && args(request,response)")
	public Object doBefore(HttpServletRequest request,HttpServletResponse response) throws IOException {

		System.out.println("Do Before!!!!");

		try {
			request.getRequestDispatcher("/login/index").forward(request,response);
//			HttpSession  session = request.getSession();

//			Object userName = session.getAttribute("userName");



		}catch (Exception e){

			//System.out.println("Exception..");

			//return "redirect:/login/index";
		}



		return null;

	}


}
