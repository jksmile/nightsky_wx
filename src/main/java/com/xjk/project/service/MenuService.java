package com.xjk.project.service;

import com.xjk.project.model.WxMenuModel;

import java.util.List;
import java.util.Map;

/**
 *
 *
 * @author: jinkai.xu
 *
 * @Date: 15/9/17
 */

public interface MenuService {


    /**
     *
     *  The following method will get menu list.
     *
     * @author: jinkai.xu
     *
     * @return WxMenuModel
     *
     */
    List<WxMenuModel> getMenuList();


    /**
     *
     * The following method will update menu.
     *
     * @author: jinkai.xu
     *
     * @return String
     */
    void updateMenu(int id);


    Map<Integer,List<WxMenuModel>> handleMenu();

}
