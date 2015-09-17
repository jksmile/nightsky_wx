package com.xjk.project.service.imp;

import com.xjk.project.dao.admin.WxMenuDao;
import com.xjk.project.model.WxMenuModel;
import com.xjk.project.service.MenuService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 *
 *
 * @author: jinkai.xu
 *
 * @Date: 15/9/17
 */

@Service("menuService")
public class MenuServiceImp implements MenuService {

    @Resource
    private WxMenuDao wxMenuDao;


    @Override
    public List<WxMenuModel> getMenuList() {




        return wxMenuDao.getMenuList();

    }



}
