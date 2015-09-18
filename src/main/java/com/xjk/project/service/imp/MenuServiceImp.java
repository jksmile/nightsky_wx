package com.xjk.project.service.imp;

import com.xjk.project.dao.admin.WxMenuDao;
import com.xjk.project.model.WxMenuModel;
import com.xjk.project.service.MenuService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.*;

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


    @Override
    public void updateMenu(int id) {


    }

    @Override
    public Map<Integer,List<WxMenuModel>> handleMenu(){

        List<WxMenuModel> menuList = getMenuList();

        Map<Integer,List<WxMenuModel>> map = new HashMap<>();

        for (WxMenuModel menu : menuList){

            if(menu.getPid()==0){

                if(map.containsKey(menu.getId())){

                    map.get(menu.getId()).add(menu);

                    continue;
                }

                List<WxMenuModel> list= new ArrayList<>();

                list.add(menu);

                map.put(menu.getId(),list);

                continue;
            }

            if (map.containsKey(menu.getPid())) {

                map.get(menu.getPid()).add(0,menu);

            } else {

                List<WxMenuModel> list= new ArrayList<>();

                list.add(menu);

                map.put(menu.getPid(),list);
            }

        }


        return map;

    }

}
