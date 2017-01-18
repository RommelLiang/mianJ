package com.mian.bean;

/**
 * com.mian.bean
 * Created by Reinhard Tristan Eugen Heydrich
 * 2017/1/13
 */
public class BaseJson<T> {
    private int code;
    private String message;
    private T data;

    /*public BaseJson(T t) {
        t =
    }*/


    public BaseJson(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }


}
