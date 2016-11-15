package com.mian.controller;

import com.mian.bean.Account;
import com.mian.bean.Tencent;
import com.mian.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.UUID;

/**
 * mianjing
 * Created by Reinhard Tristan Eugen Heydrich
 * On 2016/11/4.
 */
@Controller
@CrossOrigin
@RequestMapping(value = "/login")
public class TencentLoginController {
    @Autowired
    private AccountRepository accountRepository;

    private Account account;
    @RequestMapping(value = "/qq")
    public @ResponseBody boolean qqLogin(@RequestBody Tencent tencent){
        if (accountRepository.findByOpenId(tencent.getOpenId()) != null) {
            //已经注册过的用户，更新头像用户名等信息
            account.setOpenId(tencent.getOpenId());
            account.setUserName(tencent.getNickname());
            account.setHeadPortrait(tencent.getProfilePhoto());
            return true;
        } else {
            //首次登陆的用户
            account = new Account();
            account.setAccessToken(tencent.getAccessToken());
            account.setHeadPortrait(tencent.getProfilePhoto());
            account.setOpenId(tencent.getOpenId());
            account.setUserName(tencent.getNickname());
            account.setConsultant(false);
            account.setAccountUuid(UUID.randomUUID().toString());
            Account save = accountRepository.save(account);
            return accountRepository.exists(save.getId());
        }

    }
}
