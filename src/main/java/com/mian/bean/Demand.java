package com.mian.bean;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.xml.crypto.Data;
import java.util.Date;
import java.util.Set;

/**
 * com.mian.bean
 * Created by Reinhard Tristan Eugen Heydrich
 * 2017/1/18
 * 顾问需求
 */
@Entity
@Table(name = "demand")
public class Demand {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotNull
    private String openId;
    //需求类别
    private String demandType;
    //需求名称
    private String demandName;
    //需求描述
    private String demandDescription;
    //悬赏金额（元/小时）
    private Double demandSalary;
    //预估时间
    private Double time;
    //期望开始时间
    private String startDate;
    //工作地点
    private String workLocation;
    //真实姓名
    private String realName;
    //手机号码
    private String phone;
    //是否接受远程
    private boolean isRemotely;
    //是否被预约
    private boolean isClaim;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

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

    public String getDemandDescription() {
        return demandDescription;
    }

    public void setDemandDescription(String demandDescription) {
        this.demandDescription = demandDescription;
    }

    public Double getDemandSalary() {
        return demandSalary;
    }

    public void setDemandSalary(Double demandSalary) {
        this.demandSalary = demandSalary;
    }

    public Double getTime() {
        return time;
    }

    public void setTime(Double time) {
        this.time = time;
    }

    public String getWorkLocation() {
        return workLocation;
    }

    public void setWorkLocation(String workLocation) {
        this.workLocation = workLocation;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public boolean isRemotely() {
        return isRemotely;
    }

    public void setRemotely(boolean remotely) {
        isRemotely = remotely;
    }

    public boolean isClaim() {
        return isClaim;
    }

    public void setClaim(boolean claim) {
        isClaim = claim;
    }
}
