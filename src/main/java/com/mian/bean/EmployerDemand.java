package com.mian.bean;

import java.util.Date;

/**
 * com.mian.bean
 * Created by Reinhard Tristan Eugen Heydrich
 * 2016/11/11.
 * 顾问发布的需求信息
 */
public class EmployerDemand {
    private String demandType;
    private String demandName;
    private String description;
    /*赏金*/
    private Double Bonti;
    private Integer totalHours;
    private Date expectingStartTime;
    private String location;
    private String realName;
    private String contactPhoneNumber;

    public String getDemandType() {
        return demandType;
    }

    public void setDemandType(String demandType) {
        this.demandType = demandType;
    }

    public String getDemandName() {
        return demandName;
    }

    public void setDemandName(String demandName) {
        this.demandName = demandName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getBonti() {
        return Bonti;
    }

    public void setBonti(Double bonti) {
        Bonti = bonti;
    }

    public Integer getTotalHours() {
        return totalHours;
    }

    public void setTotalHours(Integer totalHours) {
        this.totalHours = totalHours;
    }

    public Date getExpectingStartTime() {
        return expectingStartTime;
    }

    public void setExpectingStartTime(Date expectingStartTime) {
        this.expectingStartTime = expectingStartTime;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getContactPhoneNumber() {
        return contactPhoneNumber;
    }

    public void setContactPhoneNumber(String contactPhoneNumber) {
        this.contactPhoneNumber = contactPhoneNumber;
    }
}
