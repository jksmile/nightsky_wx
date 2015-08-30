package com.xjk.project.service;

import java.util.concurrent.ExecutionException;

/**
 * Intro:
 * Project: nightsky_wx
 * Date:    8/25/15
 * Author:  xujinkai
 */
public interface WxService {



	/**
	 * @version
	 *
	 * 1. The following function will get token from remote service;
	 *
	 *
	 * @return string
	 *
	 * @throws ExecutionException
	 *
	 * @Author: jinkai.xu
	 *
	 */
	public String getTokenFromAPI();


	/**
	 * @version
	 *
	 * 1. The following function will get menu list from remote service;
	 *
	 *
	 * @return string
	 *
	 * @Author: jinkai.xu
	 */
	public String getMenuFromAPI();


	/**
	 * @version
	 *
	 * 1. The following function will create menu list on the remote server;
	 *
	 *
	 * @return
	 *
	 * @Author: jinkai.xu
	 */
	public String createMenuToAPI();


	/**
	 * @version
	 *
	 * 1. The following funciton will delete menu list on the remote server;
	 *
	 *
	 * @Author: jinkai.xu
	 *
	 */
	public String delMenuToAPI();






}
