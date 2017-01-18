package com.mian.bean;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * com.mian.bean
 * Created by Reinhard Tristan Eugen Heydrich
 * 2017/1/17
 * 精英
 */
@Entity
@Table(name = "elite")
public class Elite {
    @Id
    @NotNull
    private String openId;
    private String realName;
    private String phoneNumber;
    private String email;
    /*支付宝账号*/
    private String paynumber;
    /*所属公司:美团*/
    private String company;
    /*职务：高级Android工程师*/
    private String position;
    /*工作年限*：5（年工作经验）*/
    private Double workYears;
    /*薪资 元/小时*/
    private Double payroll;
    /*可兼职时间*/
    private String advisoryTime;
    /*工作经历*/
    private String workExperience;
    /*可工作地点*/
    private String workLocation;
    /*所属行业*/
    private String profession;
    /*被预约次数*/
    private int appointment;


    public Double getWorkYears() {
        return workYears;
    }

    public void setWorkYears(Double workYears) {
        this.workYears = workYears;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public int getAppointment() {
        return appointment;
    }

    public void setAppointment(int appointment) {
        this.appointment = appointment;
    }

    public String getWorkLocation() {
        return workLocation;
    }

    public void setWorkLocation(String workLocation) {
        this.workLocation = workLocation;
    }

    public String getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(String workExperience) {
        this.workExperience = workExperience;
    }

    public String getAdvisoryTime() {
        return advisoryTime;
    }

    public void setAdvisoryTime(String advisoryTime) {
        this.advisoryTime = advisoryTime;
    }

    public Double getPayroll() {
        return payroll;
    }

    public void setPayroll(Double payroll) {
        this.payroll = payroll;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getPaynumber() {
        return paynumber;
    }

    public void setPaynumber(String paynumber) {
        this.paynumber = paynumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }
}
