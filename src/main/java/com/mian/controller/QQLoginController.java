package com.mian.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;


/**
 * mianjing
 * Created by Reinhard Tristan Eugen Heydrich
 * On 2016/11/4.
 */
@Controller
public class QQLoginController {
    @Value("${application.message:Hello World}")
    private String message = "Hello World";

    @RequestMapping(value="/a")
    public @ResponseBody String index(){
        System.out.println("Controller.helloJsp().a"+message);
        return "OOOOOOOOOOOOOOO";
    }
    @RequestMapping(value="/qq", method = RequestMethod.GET)
    public @ResponseBody ModelAndView qq(Map<String,Object> map){
        System.out.println("Controller.helloJsp().qq="+message);
        map.put("hello", message);
        ModelAndView modelAndView = new ModelAndView("new");
        return modelAndView;
    }
    @RequestMapping("/jsontest")
    public @ResponseBody Map<String, String> callSomething () {

        Map<String, String> map = new HashMap<String, String>();
        map.put("url", "http://www.leveluplunch.com");
        return map;
    }
    @RequestMapping("/jsptest")
    public String test(ModelAndView modelAndView) {

        return "jsp-spring-boot";
    }
}
