package com.xjk.project.service.imp;

import com.xjk.project.constant.RequestMethodConstant;
import com.xjk.project.model.wx.TokenModel;
import com.xjk.project.service.WxService;
import com.xjk.project.utils.HomeProperty;
import com.xjk.project.utils.HttpRequest;
import org.springframework.stereotype.Service;

/**
 * Intro:
 * Project: nightsky_wx
 * Date:    8/25/15
 * Author:  xujinkai
 */

@Service("wxService")
public class WxServiceImp implements WxService{

	private static final String TOKEN_URL = HomeProperty.getInstance().getWxProperties().getProperty("TOKEN_URL");

	private static final String APPID = HomeProperty.getInstance().getWxProperties().getProperty("APPID");

	private static final String APPSECRET = HomeProperty.getInstance().getWxProperties().getProperty("APPSECRET");


	@Override
	public TokenModel getToken() {

		String url = TOKEN_URL+"&appid="+APPID+"&secret="+APPSECRET;

		String response = HttpRequest.send(url, RequestMethodConstant.METHOD_GET);

		System.out.println("--------------"+response+"------------");
		return null;



	}







}
