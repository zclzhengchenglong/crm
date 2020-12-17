package com.sc.spring.entity;

import java.util.List;

/**
 * 类名：Result
 * 描述：一段话描述类的信息
 * 作者“郑成龙
 * 日期：2020/12/11 19:09
 * 版本：V1.0
 */
public class Result {

    private List aaData;//list数据集合
    private int recordsTotal;//实际的总行数
    private int  recordsFiltered;//显示的行数,这个要和上面写的一样

    public Result(List aaData, int recordsTotal, int recordsFiltered) {
        this.aaData = aaData;
        this.recordsTotal = recordsTotal;
        this.recordsFiltered = recordsFiltered;
    }

    public Result() {
    }

    public List getAaData() {
        return aaData;
    }

    public void setAaData(List aaData) {
        this.aaData = aaData;
    }

    public int getRecordsTotal() {
        return recordsTotal;
    }

    public void setRecordsTotal(int recordsTotal) {
        this.recordsTotal = recordsTotal;
    }

    public int getRecordsFiltered() {
        return recordsFiltered;
    }

    public void setRecordsFiltered(int recordsFiltered) {
        this.recordsFiltered = recordsFiltered;
    }
}
