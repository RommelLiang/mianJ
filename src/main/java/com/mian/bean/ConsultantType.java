package com.mian.bean;

/**
 * com.mian.bean
 * Created by Reinhard Tristan Eugen Heydrich
 * 2016/11/11.
 */
public enum ConsultantType {
    IT("IT"),
    ;
    private String description;
    ConsultantType(String description) {
        this.description = description;
    }
    @Override
    public String toString() {
        return this.description;
    }
}
