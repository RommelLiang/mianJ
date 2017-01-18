package com.mian.controller;

import com.mian.bean.Account;
import com.mian.bean.BaseJson;
import com.mian.bean.UserReservation;
import com.mian.repository.AccountRepository;
import com.mian.repository.UserReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * com.mian.controller
 * Created by Reinhard Tristan Eugen Heydrich
 * 2017/1/18
 * 预约
 */
@RestController
@CrossOrigin
@RequestMapping(value = "/reservationController")
public class UserReservationController {
    @Autowired
    UserReservationRepository userReservationRepository;
    @Autowired
    AccountRepository accountRepository;
    private BaseJson baseJson;

    @RequestMapping(value = "/findMyReservation",method = RequestMethod.POST)
    public @ResponseBody
    BaseJson findMyReservation(@RequestParam("userOpenId") String userOpenId){
        Account byOpenId = accountRepository.findByOpenId(userOpenId);
        if (byOpenId == null) {
            baseJson = new BaseJson(1,"您的账号存在安全问题");
            return baseJson;
        }
        List<UserReservation> byOpenIdList
                = userReservationRepository.findByOpenId(userOpenId);
        baseJson = new BaseJson(0,"操作成功");
        baseJson.setData(byOpenIdList);
        return baseJson;
    }
}
