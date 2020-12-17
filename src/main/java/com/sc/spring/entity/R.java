package com.sc.spring.entity;

/**
 * 类名：R
 * 描述：一段话描述类的信息
 * 作者“郑成龙
 * 日期：2020/11/7 11:36
 * 版本：V1.0
 */
public class R {

    private int code;   //状态码
    private  String msg;    //消息内容
    private int count;  //总条数
    private Object data;    //响应数据

    public R() {

    }

    public R(int code, String msg, int count, Object data) {
        this.code = code;
        this.msg = msg;
        this.count = count;
        this.data = data;
    }

    public R(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
