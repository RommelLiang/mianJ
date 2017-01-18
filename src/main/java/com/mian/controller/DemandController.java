package com.mian.controller;

import com.mian.bean.*;
import com.mian.repository.AccountRepository;
import com.mian.repository.DemandRepository;
import com.mian.repository.UserReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Set;

/**
 * com.mian.controller
 * Created by Reinhard Tristan Eugen Heydrich
 * 2017/1/18
 */
@RestController
@CrossOrigin
@RequestMapping(value = "/demand")
public class DemandController {
    @Autowired
    DemandRepository demandRepository;
    @Autowired
    AccountRepository accountRepository;
    @Autowired
    UserReservationRepository userReservationRepository;
    private BaseJson baseJson;

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public @ResponseBody
    BaseJson saveDemand(Demand demand) {
        if (demand.getRealName() == null || demand.getOpenId() == null ||
                demand.getDemandDescription() == null || demand.getDemandName() == null ||
                demand.getDemandSalary() == null || demand.getDemandType() == null ||
                demand.getPhone() == null || demand.getTime() == null ||
                demand.getStartDate() == null || demand.getWorkLocation() == null){
            baseJson = new BaseJson(1,"参数错误");
            return baseJson;
        }
        Account byOpenId = accountRepository.findByOpenId(demand.getOpenId());
        if (byOpenId == null) {
            baseJson = new BaseJson(1,"您的账号存在安全隐患");
            return baseJson;
        }
        Demand save = demandRepository.save(demand);
        if (save == null) {
            baseJson = new BaseJson(1,"操作失败");
        } else {
            baseJson = new BaseJson(0,"操作成功");
            baseJson.setData(save);
        }
        return baseJson;
    }

    @RequestMapping(value = "/findAll",method = RequestMethod.POST)
    public @ResponseBody
    Page<Demand> findAllDemand(@RequestParam("pageNow") int pageNow, @RequestParam("pageSize") int pageSize){
        Pageable pageable = new PageRequest(pageNow - 1,pageSize);
        Page<Demand> pages = demandRepository.findAll(pageable);
        return pages;
    }

    @RequestMapping(value ="/applicantDemand",method = RequestMethod.POST)
    public @ResponseBody
    BaseJson applicantDemand(@RequestParam("demandId") Long demandId, @RequestParam("userOpenId") String userOpenId){
        Account byOpenId = accountRepository.findByOpenId(userOpenId);
        if (byOpenId == null) {
            baseJson = new BaseJson(1,"您的账号存在安全隐患");
            return baseJson;
        }
        if (!demandRepository.exists(demandId)) {
            baseJson = new BaseJson(1,"您申请的需求不存在");
            return baseJson;
        }
        UserReservation userReservation = new UserReservation();
        UserReservation byOpenIdAndDemandId = userReservationRepository.findByOpenIdAndDemandId(userOpenId, demandId);
        if (byOpenIdAndDemandId != null) {
            baseJson = new BaseJson(1,"您已经申请过该项目，请勿重复申请");
            return baseJson;
        }
        Demand demandById = demandRepository.findById(demandId);
        userReservation.setDemandId(demandId);
        userReservation.setOpenId(userOpenId);
        userReservation.setConsultantName(demandById.getRealName());
        userReservation.setOrderNumber(String.valueOf(System.currentTimeMillis()));
        userReservation.setDemandCharacter(demandById.getDemandType());
        userReservation.setMoney(demandById.getDemandSalary() * demandById.getTime());
        userReservation.setTime(demandById.getTime());
        userReservation.setStatus(0);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        userReservation.setDate(simpleDateFormat.format(new Date()));
        UserReservation save = userReservationRepository.save(userReservation);
        if (save == null) {
            baseJson = new BaseJson(1,"申请失败");
            return baseJson;
        }
        baseJson = new BaseJson(0,"您已经成功申请改需求，请等待顾问回复");
        return baseJson;
    }
}
