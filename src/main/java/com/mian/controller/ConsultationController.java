package com.mian.controller;

import com.mian.bean.Consultant;
import org.springframework.web.bind.annotation.*;

/**
 * Created by victor on 11/11/2016.
 */
@RestController
@CrossOrigin
public class ConsultationController {
    @RequestMapping(value = "/ConsultantInfoForm",method = RequestMethod.POST)
    public @ResponseBody
    String privateInfoForm(@RequestBody Consultant consultant){
        String success= "";

        return success;
    }
}
