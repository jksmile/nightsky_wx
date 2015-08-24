package com.xjk.project.aspect;

import com.xjk.project.constant.SessionConstant;
import com.xjk.project.constant.UrlConstant;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Intro:
 * Project: projectA
 * Date:    3/2/15
 * Author:  xujinkai
 */


public class LoginInterceptor implements HandlerInterceptor {

	public String[] allowUrls;

	public void setAllowUrls(String[] allowUrls){
		this.allowUrls = allowUrls;
	}

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

		String requestUrl = request.getRequestURI().replace(request.getContextPath(), "");

		if(null != allowUrls && allowUrls.length>=1){
			for(String url:allowUrls){
				if(requestUrl.contains(url)){
					return true;
				}
			}
		}

		try {

			HttpSession session = request.getSession(true);

			Object userName = session.getAttribute(SessionConstant.SESSION_USER_NAME);

			if(null == userName || "".equals(userName)){

				response.sendRedirect(UrlConstant.LOGIN_ACTION_URL);
				return false;

			}else{

				return true;
			}


		}catch (Exception e){

			response.sendRedirect(UrlConstant.LOGIN_ACTION_URL);
			return false;
		}


	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse httpServletResponse, Object handler, Exception ex) throws Exception {

	}
}
