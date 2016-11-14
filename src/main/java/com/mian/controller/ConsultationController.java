package com.mian.controller;

import com.mian.bean.Consultant;
import com.mian.request.ConsultationRequest;
import com.mian.response.ConsultationResponse;
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
    ConsultationResponse getRequirments(@RequestParam("")String value){
        ConsultationResponse success= null;

        return success;
    }

    @RequestMapping(value = "/refineReuirments",method = RequestMethod.POST)
    public @ResponseBody
    ConsultationResponse refineReuirments(@RequestBody ConsultationRequest consultationRequest){
        ConsultationResponse success = null;
        return success;
    }
}
