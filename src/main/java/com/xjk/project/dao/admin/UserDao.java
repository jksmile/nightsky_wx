package com.xjk.project.dao.admin;

import com.xjk.project.model.UserModel;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * Intro:
 * Project: projectA
 * Date:    3/22/15
 * Author:  xujinkai
 */

@Repository
public interface UserDao {


	public UserModel checkLogin(@Param("userName") String userName, @Param("userPass") String userPass);




}
