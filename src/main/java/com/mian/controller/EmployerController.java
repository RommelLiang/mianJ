package com.mian.controller;

import com.mian.bean.EmployerDemand;
import com.mian.request.DemondRequest;
import com.mian.request.SeekersListRequest;
import com.mian.response.PublishedResponse;
import com.mian.response.SeekersListResponose;
import org.springframework.web.bind.annotation.*;

/**
 * Created by xiaoxiong on 2016/11/14.
 */
@RequestMapping("/employer")
public class EmployerController {
    @RequestMapping(value = "/publishPosition",method = RequestMethod.POST)
    public
    @ResponseBody
    String publishPosition(@RequestBody EmployerDemand employerDemand){
        String success = null;
        return success;
    }

    @RequestMapping(value = "/validateMobile",method = RequestMethod.GET)
    public
    @ResponseBody
    String validateMobile(@RequestParam("number")String number){
        String verification = "";
        return verification;
    }

    @RequestMapping(value = "/checkPublishRecord",method = RequestMethod.GET)//浏览求助信息历史记录
    public
    @ResponseBody
    PublishedResponse checkPublishRecord(@RequestParam("uuid") String uuid) {
        PublishedResponse publishedResponse = new PublishedResponse();
        return publishedResponse;
    }

    @RequestMapping(value = "/updateDamand",method = RequestMethod.POST)//管理求助信息（修改内容，删除信息）
    public
    @ResponseBody
    String updateDamand(@RequestBody DemondRequest demondRequest){
        String success = null;
        return success;
    }

    @RequestMapping(value = "findSeekers",method = RequestMethod.POST)
    public
    @ResponseBody
    SeekersListResponose findSeekers(@RequestBody SeekersListRequest seekersListRequest){
        SeekersListResponose seekersListResponose = new SeekersListResponose();
        return seekersListResponose;
    }

    @RequestMapping(value = "/arrangeWithSeekers",method = RequestMethod.POST)//预约求助者
    public
    @ResponseBody
    String arrangeWithSeekers(@RequestParam("value")String value){
        String success = null;
        return success;
    }
}
