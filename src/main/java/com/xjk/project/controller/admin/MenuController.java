package com.xjk.project.controller.admin;

import com.xjk.project.model.WxMenuModel;
import com.xjk.project.service.MenuService;
import com.xjk.project.service.WxService;
import com.xjk.project.utils.HomeProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;


/**
 * @Verfion:
 *
 * @author: jinkai.xu
 *
 * @Date: 15/8/27 ${Time}
 */

@Controller
@RequestMapping("/menu")
public class MenuController {

    private static final String ADMIN_MENU_INDEX = HomeProperty.getInstance().getTemplateProperties().getProperty("ADMIN_MENU_INDEX");


    @Autowired
    private WxService wxService;


    @Autowired
    private MenuService menuService;




    @RequestMapping("/index")
    public Object index(Model model){


        Map<Integer,List<WxMenuModel>> menuList = menuService.handleMenu();

        model.addAttribute("menuList",menuList);

        return new ModelAndView(ADMIN_MENU_INDEX);
    }


    @RequestMapping("/getMenu")
    public @ResponseBody Object getMenuFromAPI(){

        String menuList = wxService.getMenuFromAPI();

        System.out.println("--------" + menuList.toString() + "-----------");



        System.out.println("-----------"+menuService.getMenuList().toString()+"------------");

        return null;
    }


    @RequestMapping("/addMenu")
    public @ResponseBody Object addMenu(HttpServletRequest request){




        return null;
    }


    @RequestMapping("/delMenu")
    public @ResponseBody Object delMenu(HttpServletRequest request){


        return null;
    }


    @RequestMapping("/updateMenu")
    public @ResponseBody String updateMenu(HttpServletRequest request){

        //Updata remote data.



        //updata local database.



        return null;
    }


}
