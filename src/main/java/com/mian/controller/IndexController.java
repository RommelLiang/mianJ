package com.mian.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by victor on 31/10/2016.
 */
@Controller
public class IndexController {
    @RequestMapping(value="/",method = RequestMethod.GET)
    public ModelAndView index(){
        ModelAndView modelAndView = new ModelAndView("index");
        System.out.println("Hello should be");
        return modelAndView;
    }
}
