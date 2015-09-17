package com.xjk.project.service.imp;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.xjk.project.constant.RequestMethodConstant;
import com.xjk.project.constant.WxConstant;
import com.xjk.project.model.WxMenuModel;
import com.xjk.project.service.MenuService;
import com.xjk.project.service.WxService;
import com.xjk.project.utils.HomeProperty;
import com.xjk.project.utils.HttpRequest;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;



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


	private static final int EXPIRESTIME = 7200;


	private static final String GET_MENU_URL = HomeProperty.getInstance().getWxProperties().getProperty("GET_MENU_URL");


	private static final String CREATE_MENU_URL = HomeProperty.getInstance().getWxProperties().getProperty("CREATE_MENU_URL");


	private static final String DELETE_MENU_URL = HomeProperty.getInstance().getWxProperties().getProperty("DELETE_MENU_URL");


	@Autowired
	private MenuService menuService;


	LoadingCache<String,String> cache = CacheBuilder.newBuilder().expireAfterAccess(EXPIRESTIME, TimeUnit.SECONDS)
			.refreshAfterWrite(EXPIRESTIME,TimeUnit.SECONDS).maximumSize(1).build(

					new CacheLoader<String, String>() {

						@Override
						public String load(String s) throws Exception {

							return getTokenFromAPI();
						}

					}
			);



	public  String  getToken(){

		String accessToken = null;

		try {

			accessToken = cache.get(WxConstant.ACCESS_TOKE);

		} catch (ExecutionException e) {
			//Todo.
			e.printStackTrace();
		}


		return accessToken;
	}


	@Override
	public String getTokenFromAPI() {

		String url = TOKEN_URL + "&appid=" + APPID + "&secret=" + APPSECRET;

		String response = HttpRequest.send(url, RequestMethodConstant.METHOD_GET);

		JSONObject responseObj = JSONObject.fromObject(response);

		return (String) responseObj.get(WxConstant.ACCESS_TOKE);

	}


	@Override
	public String getMenuFromAPI(){


		String menuUrl = GET_MENU_URL+"?"+WxConstant.ACCESS_TOKE+"="+getToken();

		String result = HttpRequest.send(menuUrl,RequestMethodConstant.METHOD_GET);


		return result;
	}


	@Override
	public String createMenuToAPI() {


		List<WxMenuModel> menuList = menuService.getMenuList();









		return null;
	}


	@Override
	public String delMenuToAPI() {




		return null;
	}
}
