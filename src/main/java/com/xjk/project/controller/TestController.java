package com.xjk.project.controller;

import com.xjk.project.service.Performer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletRequest;

/**
 * Intro:
 * Project: projectA
 * Date:    2/26/15
 * Author:  xujinkai
 */

@Controller
@RequestMapping("/test")
public class TestController {

//	@Autowired
//	@Qualifier("juggler")
//	private Performer performer;

	@RequestMapping("/ok")
	public Object test(){
		System.out.println("Got it!");

		return "test/ok";

	}


}
