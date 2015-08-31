package com.xjk.project.controller.admin;

import com.sun.deploy.net.HttpResponse;
import com.xjk.project.service.WxService;
import com.xjk.project.utils.HomeProperty;
import com.xjk.project.utils.HttpRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;


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

    @RequestMapping("/index")
    public Object index(ModelAndView model){






        return new ModelAndView(ADMIN_MENU_INDEX);
    }


    @RequestMapping("/getMenu")
    public @ResponseBody Object getMenuFromAPI(){

        String menuList = wxService.getMenuFromAPI();

        System.out.println("--------"+menuList.toString()+"-----------");

        return null;
    }


    @RequestMapping("/addMenu")
    public @ResponseBody Object addMenu(HttpRequest request,HttpResponse response){




        return null;
    }


    @RequestMapping("/delMenu")
    public @ResponseBody Object delMenu(HttpRequest request){


        return null;
    }


}
