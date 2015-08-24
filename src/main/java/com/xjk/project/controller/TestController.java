package com.xjk.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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
