package com.mian.bean;

/**
 * Created by Nazi on 2016/11/10.
 */
public class WeChatBean {
    private String openId;
    private String accessToken;

    public WeChatBean(String openId, String accessToken) {
        this.openId = openId;
        this.accessToken = accessToken;
    }
    public WeChatBean() {

    }

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
}
