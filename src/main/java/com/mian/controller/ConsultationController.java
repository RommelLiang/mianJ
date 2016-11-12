package com.mian.controller;

import com.mian.bean.Consultant;
import org.springframework.web.bind.annotation.*;

/**
 * Created by victor on 11/11/2016.
 */
@RestController
@CrossOrigin
@RequestMapping(value = "/consultant")
public class ConsultationController {
    @RequestMapping(value = "/information",method = RequestMethod.POST)
    public @ResponseBody
    String information(@RequestBody Consultant consultant){
        String success= "";

        return success;
    }

    @RequestMapping(value = "/getRequirments",method = RequestMethod.GET)
    public @ResponseBody
    String getRequirments(@RequestParam("")String value){
        String success= "";

        return success;
    }
}
