package com.mian.controller;

import com.mian.bean.Account;
import com.mian.bean.BaseJson;
import com.mian.repository.AccountRepository;
import com.mian.utils.GsonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

/**
 * com.mian.controller
 * Created by Reinhard Tristan Eugen Heydrich
 * 2016/11/14.
 */
@RestController
@CrossOrigin
@RequestMapping(value = "/account")
public class AccountController {
    @Autowired
    private AccountRepository accountRepository;
    private Account account;
    private BaseJson baseJson;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public @ResponseBody
    BaseJson login(Account account) {
        if (account.getOpenId() == null || account.getAccountId() == null ||
                account.getUserName() == null || account.getHeadPortrait() == null ||
                String.valueOf(account.getLoginType()) == null) {
            baseJson = new BaseJson(1,"参数错误");
            return baseJson;
        }
        Account byOpenId = accountRepository.findByOpenId(account.getOpenId());
        if (byOpenId != null) {
            account.setConsultant(byOpenId.isConsultant());
            account.setConsummate(byOpenId.isConsummate());
        } else {
            account.setConsultant(false);
            account.setConsummate(false);
        }
        Account save = accountRepository.save(account);
        if (save != null) {
            baseJson = new BaseJson(0,"登陆成功");
            baseJson.setData(save);
        } else {
            baseJson = new BaseJson(1,"登录失败");
        }
        return baseJson;
    }

    @RequestMapping(value = "/findByAccountId", method = RequestMethod.POST)
    public
    @ResponseBody
    BaseJson findByAccountId(String accountId) {
        Account byAccountId = accountRepository.findByAccountId(accountId);

        if (byAccountId != null) {
            baseJson = new BaseJson(0,"查询成功");
            baseJson.setData(byAccountId);
        } else {
            baseJson = new BaseJson(1,"该账号尚未注册");
        }
        return baseJson;
    }

    @RequestMapping(value = "/findByOpenId")
    public
    @ResponseBody
    BaseJson findByOpenId(String openId) {
        account = accountRepository.findByOpenId(openId);
        if (account != null) {
            baseJson = new BaseJson(0,"查询成功");
            baseJson.setData(account);
        } else {
            baseJson = new BaseJson(1,"该账号尚未注册");
        }
        return baseJson;
    }
}
