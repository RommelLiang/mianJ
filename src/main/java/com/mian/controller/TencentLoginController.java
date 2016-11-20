package com.mian.controller;

import com.mian.bean.Account;
import com.mian.bean.Tencent;
import com.mian.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

/**
 * mianjing
 * Created by Reinhard Tristan Eugen Heydrich
 * On 2016/11/4.
 */
@RestController
@CrossOrigin
@RequestMapping(value = "/login")
public class TencentLoginController {
    @Autowired
    private AccountRepository accountRepository;
    private Account account;
    @RequestMapping(value = "/qq",method = RequestMethod.POST)
    public @ResponseBody boolean qqLogin(@RequestBody Account account){

        System.out.print(account.getOpenId());
        if (accountRepository.findByOpenId(account.getOpenId()) != null) {
            //已经注册过的用户，更新头像用户名等信息
            account.setAccountUuid(accountRepository.findByOpenId(account.getOpenId()).getAccountUuid());
            accountRepository.save(account);
            return true;
        } else {
            //首次登陆的用户
            /*account = new Account();
            account.setAccessToken(tencent.getAccessToken());
            account.setHeadPortrait(tencent.getProfilePhoto());
            account.setOpenId(tencent.getOpenId());
            account.setUserName(tencent.getNickname());
            account.setConsultant(false);
            account.setAccountUuid(UUID.randomUUID().toString());
            account.setLoginType(0);*/
            account.setAccountUuid(UUID.randomUUID().toString());
            account.setLoginType(0);
            Account save = accountRepository.save(account);
            return true;
        }
    }

    @RequestMapping(value = "/weChat",method = RequestMethod.POST)
    public @ResponseBody boolean weChatLogin(@RequestBody Account account){

        System.out.print(account.getOpenId());
        if (accountRepository.findByOpenId(account.getOpenId()) != null) {
            //已经注册过的用户，更新头像用户名等信息
            account.setAccountUuid(accountRepository.findByOpenId(account.getOpenId()).getAccountUuid());
            accountRepository.save(account);
            return true;
        } else {
            account.setAccountUuid(UUID.randomUUID().toString());
            account.setLoginType(1);
            Account save = accountRepository.save(account);
            return true;
        }
    }
}
