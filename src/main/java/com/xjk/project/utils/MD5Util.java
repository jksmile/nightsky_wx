package com.xjk.project.utils;

import org.apache.log4j.Logger;

import java.security.MessageDigest;


/**
 * Intro:
 * Project: projectA
 * Date:    3/22/15
 * Author:  xujinkai
 */


public class MD5Util {

	private static final String ALGORITHM_MD5 = "MD5";

	private static Logger logger = Logger.getLogger(MD5Util.class);

	public static String getPassMD5(String pass) {
		String keys = null;
		try {
			MessageDigest md = MessageDigest.getInstance(ALGORITHM_MD5);
			if (pass == null) {
				pass = "";
			}
			byte[] bPass = pass.getBytes("UTF-8");
			md.update(bPass);
            //keys = new String(md.digest(), "GBK");
			keys = bytesToHexString(md.digest());
		}catch (Exception e){
			logger.warn("MD5 for password is failed!",e);
		}
		return keys;
	}

	/**
	 * 将beye[]转换为十六进制字符串
	 * @param bArray
	 * @return
	 */
	public static final String bytesToHexString(byte[] bArray) {
		StringBuffer sb = new StringBuffer(bArray.length);
		String sTemp;
		for (int i = 0; i < bArray.length; i++) {
			sTemp = Integer.toHexString(0xFF & bArray[i]);
			if (sTemp.length() < 2){
				sb.append(0);
			}
			sb.append(sTemp.toUpperCase());
		}
		return sb.toString();
	}
}
