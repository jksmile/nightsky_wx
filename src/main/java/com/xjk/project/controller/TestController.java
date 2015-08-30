package com.xjk.project.controller;

import com.xjk.project.service.WxService;
import com.xjk.project.service.imp.WxServiceImp;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.concurrent.ExecutionException;

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


	@RequestMapping("/ok")
	public Object test() throws InterruptedException, ExecutionException {




		return null;
	}

	public static void main(String[] args) {

		String json = "{\"access_token\":\"7VBkYGLvRF_v6F8CD27y-N5hW2-OlmI5BncdNRpksnCrCr837PaAn6XBM_YReUQw_ORMSccYQxfv5Ieo51G5YcKn_fGjCd9ZQszY4IZY7t4\",\"expires_in\":7200}";

		JSONObject jsonObj = JSONObject.fromObject(json);

		Object a = jsonObj.get("access_token");

		Object x = jsonObj.get("expires_in");


	}


}
