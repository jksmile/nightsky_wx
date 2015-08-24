package com.xjk.project.utils;

import com.xjk.project.constant.FileConstant;
import org.springframework.core.io.support.PropertiesLoaderUtils;

import java.io.IOException;
import java.util.Properties;

/**
 * Intro:
 * Project: projectA
 * Date:    2/28/15
 * Author:  xujinkai
 */


public class HomeProperty {

	private static HomeProperty instance;

	private Properties templateProperties;

	private Properties wxProperties;

	public HomeProperty() {

		try {

			templateProperties = PropertiesLoaderUtils.loadAllProperties(FileConstant.TEMPLATE_FILE_PATH);

			wxProperties = PropertiesLoaderUtils.loadAllProperties(FileConstant.WX_FILE_PATH);

		} catch (IOException e) {

			e.printStackTrace();

		}

	}


	public static HomeProperty getInstance() {

		if (instance == null) instance = new HomeProperty();

		return instance;

	}



	public Properties getTemplateProperties() {

		return templateProperties;

	}


	public Properties getWxProperties() {

		return wxProperties;

	}



}
