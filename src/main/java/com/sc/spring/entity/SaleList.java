package com.sc.spring.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * SALE_LIST
 * @author 
 */
public class SaleList implements Serializable {
    private String saleId;

    private String saleFirstdate;

    private String saleNum;

    private String saleUserid;

    private String saleMoney;

    private String saleOutstate;

    private String saleRebate;

    private String saleOrderstate;

    private String saleRemark;

    private String saleComid;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date saleLastdate;

    private static final long serialVersionUID = 1L;

    public String getSaleId() {
        return saleId;
    }

    public void setSaleId(String saleId) {
        this.saleId = saleId;
    }

    public String getSaleFirstdate() {
        return saleFirstdate;
    }

    public void setSaleFirstdate(String saleFirstdate) {
        this.saleFirstdate = saleFirstdate;
    }

    public String getSaleNum() {
        return saleNum;
    }

    public void setSaleNum(String saleNum) {
        this.saleNum = saleNum;
    }

    public String getSaleUserid() {
        return saleUserid;
    }

    public void setSaleUserid(String saleUserid) {
        this.saleUserid = saleUserid;
    }

    public String getSaleMoney() {
        return saleMoney;
    }

    public void setSaleMoney(String saleMoney) {
        this.saleMoney = saleMoney;
    }

    public String getSaleOutstate() {
        return saleOutstate;
    }

    public void setSaleOutstate(String saleOutstate) {
        this.saleOutstate = saleOutstate;
    }

    public String getSaleRebate() {
        return saleRebate;
    }

    public void setSaleRebate(String saleRebate) {
        this.saleRebate = saleRebate;
    }

    public String getSaleOrderstate() {
        return saleOrderstate;
    }

    public void setSaleOrderstate(String saleOrderstate) {
        this.saleOrderstate = saleOrderstate;
    }

    public String getSaleRemark() {
        return saleRemark;
    }

    public void setSaleRemark(String saleRemark) {
        this.saleRemark = saleRemark;
    }

    public String getSaleComid() {
        return saleComid;
    }

    public void setSaleComid(String saleComid) {
        this.saleComid = saleComid;
    }
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    public Date getSaleLastdate() {
        return saleLastdate;
    }

    public void setSaleLastdate(Date saleLastdate) {
        this.saleLastdate = saleLastdate;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        SaleList other = (SaleList) that;
        return (this.getSaleId() == null ? other.getSaleId() == null : this.getSaleId().equals(other.getSaleId()))
            && (this.getSaleFirstdate() == null ? other.getSaleFirstdate() == null : this.getSaleFirstdate().equals(other.getSaleFirstdate()))
            && (this.getSaleNum() == null ? other.getSaleNum() == null : this.getSaleNum().equals(other.getSaleNum()))
            && (this.getSaleUserid() == null ? other.getSaleUserid() == null : this.getSaleUserid().equals(other.getSaleUserid()))
            && (this.getSaleMoney() == null ? other.getSaleMoney() == null : this.getSaleMoney().equals(other.getSaleMoney()))
            && (this.getSaleOutstate() == null ? other.getSaleOutstate() == null : this.getSaleOutstate().equals(other.getSaleOutstate()))
            && (this.getSaleRebate() == null ? other.getSaleRebate() == null : this.getSaleRebate().equals(other.getSaleRebate()))
            && (this.getSaleOrderstate() == null ? other.getSaleOrderstate() == null : this.getSaleOrderstate().equals(other.getSaleOrderstate()))
            && (this.getSaleRemark() == null ? other.getSaleRemark() == null : this.getSaleRemark().equals(other.getSaleRemark()))
            && (this.getSaleComid() == null ? other.getSaleComid() == null : this.getSaleComid().equals(other.getSaleComid()))
            && (this.getSaleLastdate() == null ? other.getSaleLastdate() == null : this.getSaleLastdate().equals(other.getSaleLastdate()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSaleId() == null) ? 0 : getSaleId().hashCode());
        result = prime * result + ((getSaleFirstdate() == null) ? 0 : getSaleFirstdate().hashCode());
        result = prime * result + ((getSaleNum() == null) ? 0 : getSaleNum().hashCode());
        result = prime * result + ((getSaleUserid() == null) ? 0 : getSaleUserid().hashCode());
        result = prime * result + ((getSaleMoney() == null) ? 0 : getSaleMoney().hashCode());
        result = prime * result + ((getSaleOutstate() == null) ? 0 : getSaleOutstate().hashCode());
        result = prime * result + ((getSaleRebate() == null) ? 0 : getSaleRebate().hashCode());
        result = prime * result + ((getSaleOrderstate() == null) ? 0 : getSaleOrderstate().hashCode());
        result = prime * result + ((getSaleRemark() == null) ? 0 : getSaleRemark().hashCode());
        result = prime * result + ((getSaleComid() == null) ? 0 : getSaleComid().hashCode());
        result = prime * result + ((getSaleLastdate() == null) ? 0 : getSaleLastdate().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", saleId=").append(saleId);
        sb.append(", saleFirstdate=").append(saleFirstdate);
        sb.append(", saleNum=").append(saleNum);
        sb.append(", saleUserid=").append(saleUserid);
        sb.append(", saleMoney=").append(saleMoney);
        sb.append(", saleOutstate=").append(saleOutstate);
        sb.append(", saleRebate=").append(saleRebate);
        sb.append(", saleOrderstate=").append(saleOrderstate);
        sb.append(", saleRemark=").append(saleRemark);
        sb.append(", saleComid=").append(saleComid);
        sb.append(", saleLastdate=").append(saleLastdate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}