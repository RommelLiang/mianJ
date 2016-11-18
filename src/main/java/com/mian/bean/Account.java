package com.mian.bean;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

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
    @NotNull
    private String accountUuid;
    @Id
    private String openId;
    private String accessToken;
    private String userName;
    private String password;
    private String headPortrait;
    private boolean isConsultant;
    /**
     * 登陆类型（QQ:0/WeChat:1）*/
    private int loginType;

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
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


    public String getAccountUuid() {
        return accountUuid;
    }

    public void setAccountUuid(String accountUuid) {
        this.accountUuid = accountUuid;
    }

    public boolean isConsultant() {
        return isConsultant;
    }

    public void setConsultant(boolean consultant) {
        isConsultant = consultant;
    }
}
