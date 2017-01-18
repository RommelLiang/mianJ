package com.mian.bean;

import org.springframework.context.annotation.Primary;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Set;

/**
 * mianjing
 * Created by Reinhard Tristan Eugen Heydrich
 * On 2016/11/4.
 * 普通用户
 * 用户账号
 */
@Entity
@Table(name = "account")
public class Account {
    @Id
    @NotNull
    private String openId;
    @NotNull
    private String accountId;
    @NotNull
    private String userName;
    private String password;
    @NotNull
    private String headPortrait;
    //是否为顾问
    private boolean isConsultant;
    /**
     * 登陆类型（QQ:0/WeChat:1）*/
    private int loginType;
    //是否已经完善个人资料
    private boolean isConsummate;
    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getHeadPortrait() {
        return headPortrait;
    }

    public void setHeadPortrait(String headPortrait) {
        this.headPortrait = headPortrait;
    }

    public int getLoginType() {
        return loginType;
    }

    public void setLoginType(int loginType) {
        this.loginType = loginType;
    }

    public boolean isConsultant() {
        return isConsultant;
    }

    public void setConsultant(boolean consultant) {
        isConsultant = consultant;
    }

    public boolean isConsummate() {
        return isConsummate;
    }

    public void setConsummate(boolean consummate) {
        isConsummate = consummate;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

}
