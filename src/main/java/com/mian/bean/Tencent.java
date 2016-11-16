package com.mian.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Reinhard Tristan Eugen Heydrich 2016/11/10.
 */

public class Tencent {
    private String openId;
    private String accessToken;
    private String nickname;
    private String profilePhoto;

    public Tencent(String openId, String accessToken) {
        this.openId = openId;
        this.accessToken = accessToken;
    }
    public Tencent() {

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

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getProfilePhoto() {
        return profilePhoto;
    }

    public void setProfilePhoto(String profilePhoto) {
        this.profilePhoto = profilePhoto;
    }
}
