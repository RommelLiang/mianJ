package com.mian.bean;

import org.springframework.context.annotation.Primary;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * com.mian.bean
 * Created by Reinhard Tristan Eugen Heydrich
 * 2017/1/18
 * 用户预约的需求
 */
@Entity
@Table(name = "userReservation",uniqueConstraints = {@UniqueConstraint(columnNames = {"openId","demandId"})})
public class UserReservation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    //求助者openID
    @NotNull
    private String openId;
    //需求id
    @NotNull
    private Long demandId;
    //状态(0:等待接受，1：进行中,2:已经完成,3：解约,4:等待支付,5:待评价)
    private int status;
    //订单号
    private String orderNumber;
    //顾问角色
    private String demandCharacter;
    //求职顾问
    private String consultantName;
    //预约时长
    private Double time;
    //订单金额
    private Double money;
    //创建日期
    private String date;

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public Long getDemandId() {
        return demandId;
    }

    public void setDemandId(Long demandId) {
        this.demandId = demandId;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getDemandCharacter() {
        return demandCharacter;
    }

    public void setDemandCharacter(String demandCharacter) {
        this.demandCharacter = demandCharacter;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Double getTime() {
        return time;
    }

    public void setTime(Double time) {
        this.time = time;
    }

    public String getConsultantName() {
        return consultantName;
    }

    public void setConsultantName(String consultantName) {
        this.consultantName = consultantName;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }
}
