package com.mian.bean;

/**
 * Created by Reinhard Tristan Eugen Heydrich 2016/11/10.
 */
public class WeChat {
    private String openId;
    private String accessToken;

    public WeChat(String openId, String accessToken) {
        this.openId = openId;
        this.accessToken = accessToken;
    }
    public WeChat() {

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
