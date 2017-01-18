package com.mian.controller;

import com.mian.bean.Account;
import com.mian.bean.BaseJson;
import com.mian.bean.Elite;
import com.mian.repository.AccountRepository;
import com.mian.repository.EliteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import javax.persistence.*;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * com.mian.controller
 * Created by Reinhard Tristan Eugen Heydrich
 * 2017/1/17
 */
@RestController
@CrossOrigin
@RequestMapping(value = "/elite")
public class EliteController {
    @Autowired
    EliteRepository eliteRepository;
    @Autowired
    AccountRepository accountRepository;
    @PersistenceContext
    private EntityManager entityManager;
    private BaseJson baseJson;

    @RequestMapping(value = "/save",method = RequestMethod.POST)
    public @ResponseBody
    BaseJson saveElite(Elite elite){
        if (elite.getOpenId() == null || elite.getCompany() == null ||
                elite.getEmail() == null || elite.getRealName() == null ||
                elite.getPaynumber() == null || elite.getPhoneNumber() == null ||
                elite.getPosition() == null || elite.getWorkExperience() == null ||
                elite.getProfession() == null || elite.getWorkLocation() == null){
            baseJson = new BaseJson(1,"参数错误");
            return baseJson;
        }
        Account byOpenId = accountRepository.findByOpenId(elite.getOpenId());
        if (byOpenId == null) {
            baseJson = new BaseJson(1,"您的账号存在安全隐患");
            return baseJson;
        }
        Elite save = eliteRepository.save(elite);
        baseJson = new BaseJson(0,"操作成功");
        baseJson.setData(elite);
        byOpenId.setConsultant(false);
        accountRepository.save(byOpenId);
        return baseJson;
    }

    @RequestMapping(value = "/findAll",method = RequestMethod.POST)
    public @ResponseBody
    Page<Elite> findAllElite(@RequestParam("pageNow") int pageNow, @RequestParam("pageSize") int pageSize){
        Pageable pageable = new PageRequest(pageNow - 1,pageSize);
        Page<Elite> pages = eliteRepository.findAll(pageable);
        return pages;
    }
}
