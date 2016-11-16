package com.mian.controller;

import com.mian.bean.Consultant;
import com.mian.bean.EmployerDemand;
import com.mian.repository.EmployerDemandRepository;
import com.mian.request.DemondRequest;
import com.mian.request.SeekersListRequest;
import com.mian.response.PublishedResponse;
import com.mian.response.SeekersListResponose;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

/**
 * Created by xiaoxiong on 2016/11/14.
 */
@RequestMapping("/employer")
public class EmployerDemandController{
    @Autowired
    private EmployerDemandRepository employerDemand;

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

    @RequestMapping(value = "/findAllConsultant",method = RequestMethod.POST)
    public @ResponseBody
    Page<EmployerDemand> findAllConsultant(@RequestParam("pageNow") int pageNow, @RequestParam("pageSize") int pageSize) {
        Pageable pageable = new PageRequest(pageNow - 1,pageSize);
        Page<EmployerDemand> pages = employerDemand.findAll(pageable);
        return pages;
    }

    @RequestMapping(value = "/findByCondition",method = RequestMethod.POST)
    public @ResponseBody
    ArrayList<EmployerDemand> findByCondition(@RequestParam("location") String location, @RequestParam("type") String type) {
        if (location.equals("")) location = "*";
        if (type.equals("")) type = "*";
        ArrayList<EmployerDemand> employerDemands = employerDemand.findByCondition(location, type);
        return employerDemands;
    }
}
