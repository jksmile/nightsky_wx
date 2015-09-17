package com.xjk.project.service;

import com.xjk.project.model.UserModel;
import org.springframework.stereotype.Service;

/**
 *
 *
 *
 * Date:    3/22/15
 *
 * Author:  xujinkai
 */


public interface UserService {


	UserModel checkLogin(String userName,String userPass);

}
