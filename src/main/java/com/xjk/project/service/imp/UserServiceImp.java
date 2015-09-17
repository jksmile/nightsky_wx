package com.xjk.project.service.imp;

import com.xjk.project.dao.admin.UserDao;
import com.xjk.project.model.UserModel;
import com.xjk.project.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Intro:
 * Project: projectA
 * Date:    3/22/15
 * Author:  xujinkai
 */

@Service("userService")
public class UserServiceImp implements UserService {


	@Resource
	private UserDao userDao;

	@Override
	public UserModel checkLogin(String userName,String userPass) {
		return userDao.checkLogin(userName,userPass);
	}


}
