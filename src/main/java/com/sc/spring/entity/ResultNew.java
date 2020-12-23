package com.sc.spring.entity;

import java.util.List;

/**
 * 类名：ResultNew
 * 描述：一段话描述类的信息
 * 作者“郑成龙
 * 日期：2020/12/18 15:34
 * 版本：V1.0
 */
public class ResultNew {

    private int sEcho;//当前第几页
    private int iTotalRecords;//每页显示的行数
    private long  iTotalDisplayRecords;//实际的总行数
    private List aaData;//list数据集合

    public ResultNew() {
    }

    public ResultNew(int sEcho, int iTotalRecords, long iTotalDisplayRecords, List aaData) {
        this.sEcho = sEcho;
        this.iTotalRecords = iTotalRecords;
        this.iTotalDisplayRecords = iTotalDisplayRecords;
        this.aaData = aaData;
    }

    public int getsEcho() {
        return sEcho;
    }

    public void setsEcho(int sEcho) {
        this.sEcho = sEcho;
    }

    public int getiTotalRecords() {
        return iTotalRecords;
    }

    public void setiTotalRecords(int iTotalRecords) {
        this.iTotalRecords = iTotalRecords;
    }

    public long getiTotalDisplayRecords() {
        return iTotalDisplayRecords;
    }

    public void setiTotalDisplayRecords(long iTotalDisplayRecords) {
        this.iTotalDisplayRecords = iTotalDisplayRecords;
    }

    public List getAaData() {
        return aaData;
    }

    public void setAaData(List aaData) {
        this.aaData = aaData;
    }
}
