package com.mian.bean;

/**
 * com.mian.bean
 * Created by Reinhard Tristan Eugen Heydrich
 * 2016/11/11.
 */
public enum AdvisoryTime {
    SAT("周六"),
    SUN("周日"),
    AFTER_WORK_WORKDAY("工作日下班后"),
    ANYTIME("自由职业者");
    private String description;
    AdvisoryTime(String description) {
        this.description = description;
    }
    @Override
    public String toString() {
        return this.description;
    }
}
