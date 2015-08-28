package com.xjk.project.controller.admin;

import com.xjk.project.utils.HomeProperty;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
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


    @RequestMapping("/index")
    public Object index(ModelAndView model){






        return new ModelAndView(ADMIN_MENU_INDEX);
    }





}
