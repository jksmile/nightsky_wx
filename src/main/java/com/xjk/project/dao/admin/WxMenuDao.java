package com.xjk.project.dao.admin;

import com.xjk.project.model.WxMenuModel;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * The following class is a interface for db.
 *
 * @author: jinkai.xu
 *
 * @Date: 15/9/17 ${Time}
 */


@Repository
public interface WxMenuDao {

    /**
     * The following function will get available menus from db.
     *
     * @return WxMenuModel
     */
    List<WxMenuModel> getMenuList();






}
