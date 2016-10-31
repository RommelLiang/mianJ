package com.mian.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by victor on 31/10/2016.
 */
@RestController
public class IndexController {
    @RequestMapping(value="/",method = RequestMethod.GET)
    public String index(){
        return "你好用户这是面筋，你可以在这找工作";
    }
}
