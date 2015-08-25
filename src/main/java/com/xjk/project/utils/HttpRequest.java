package com.xjk.project.utils;

import javax.net.ssl.HttpsURLConnection;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

/**
 * Intro:
 * Project: nightsky_wx
 * Date:    8/24/15
 * Author:  xujinkai
 */


public class HttpRequest {


	public static String send(String url, String method){

		String response = null;

		try {

			URL urlModel = new URL(url);

			HttpsURLConnection urlConnection = (HttpsURLConnection) urlModel.openConnection();

			urlConnection.setRequestMethod(method);

			urlConnection.connect();

			InputStream inputStream = urlConnection.getInputStream();

			response = convertToString(inputStream);


		}catch (IOException e){
			//Todo.
			e.printStackTrace();

		}

		return response;

	}



	public static String convertToString(InputStream inputStream){

		InputStreamReader inputStreamReader = new InputStreamReader(inputStream);

		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

		StringBuffer strBuf = new StringBuffer();

		String tempStr = null;

		try{

			while( (tempStr = bufferedReader.readLine()) != null )

				strBuf.append(tempStr);

		} catch (IOException e) {
			//Todo.
			e.printStackTrace();

		}finally {

			try {

				inputStreamReader.close();

				inputStream.close();

				bufferedReader.close();

			}catch (IOException e){
				//Todo.
				e.printStackTrace();

			}


		}

		return strBuf.toString();

	}










}
