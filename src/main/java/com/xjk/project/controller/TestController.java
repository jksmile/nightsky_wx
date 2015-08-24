package com.xjk.project.controller;

import com.xjk.project.model.wx.TokenModel;
import com.xjk.project.service.WxService;
import org.springframework.beans.factory.annotation.Autowired;
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

	@Autowired
	private WxService wxService;

//	@Autowired
//	@Qualifier("juggler")
//	private Performer performer;

	@RequestMapping("/ok")
	public Object test(){
		System.out.println("Got it!");

		TokenModel token = wxService.getToken();

		return null;
	}


}
