package com.mian.controller;

import org.omg.CORBA.Request;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by victor on 31/10/2016.
 */
@Controller
public class IndexController {
    @RequestMapping(value="/",method = RequestMethod.GET)
    public String index(){
        return "你好用户这是面筋，你可以在这找工作";
    }

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String hello(Model model){
        //ModelAndView mv = new ModelAndView("index");
        return "index";
    }
}
