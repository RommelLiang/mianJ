package com.mian.bean;

/**
 * Created by Nazi on 2016/11/11.
 * 求职顾问信息
 */
public class Consultant {
    private long id;
    private String accountUuid;
    private String realName;
    private String phoneNumber;
    private String email;
    /*支付宝账号*/
    private String aliPay;
    private String company;
    /*职务*/
    private String position;
    /*工作年限*/
    private double workYears;
    /*薪资 元/小时*/
    private double payroll;
    /*咨询时间*/
    private AdvisoryTime advisoryTime;
    /*顾问类型*/
    private ConsultantType consultanType;
    /*工作经历*/
    private String workExperience;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAccountUuid() {
        return accountUuid;
    }

    public void setAccountUuid(String accountUuid) {
        this.accountUuid = accountUuid;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAliPay() {
        return aliPay;
    }

    public void setAliPay(String aliPay) {
        this.aliPay = aliPay;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getWorkYears() {
        return workYears;
    }

    public void setWorkYears(double workYears) {
        this.workYears = workYears;
    }

    public double getPayroll() {
        return payroll;
    }

    public void setPayroll(double payroll) {
        this.payroll = payroll;
    }

    public String getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(String workExperience) {
        this.workExperience = workExperience;
    }

    public AdvisoryTime getAdvisoryTime() {
        return advisoryTime;
    }

    public void setAdvisoryTime(AdvisoryTime advisoryTime) {
        this.advisoryTime = advisoryTime;
    }

    public ConsultantType getConsultanType() {
        return consultanType;
    }

    public void setConsultanType(ConsultantType consultanType) {
        this.consultanType = consultanType;
    }
}
