package com.xjk.project.service;

import java.util.concurrent.ExecutionException;

/**
 * Intro:
 * Project: nightsky_wx
 * Date:    8/25/15
 * Author:  xujinkai
 */
public interface WxService {


	public  String getToken() throws ExecutionException;

	public String createTokenFromAPI();




}
