package com.sc.spring.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * SALE_DETAILS
 * @author 
 */
public class SaleDetails implements Serializable {
    private String saleDid;

    private String saleId;

    private String saleCommid;

    private String saleNum;

    private String salePrice;

    private String saleRemark;

    private String saleComid;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date saleLastdate;

    private static final long serialVersionUID = 1L;

    public String getSaleDid() {
        return saleDid;
    }

    public void setSaleDid(String saleDid) {
        this.saleDid = saleDid;
    }

    public String getSaleId() {
        return saleId;
    }

    public void setSaleId(String saleId) {
        this.saleId = saleId;
    }

    public String getSaleCommid() {
        return saleCommid;
    }

    public void setSaleCommid(String saleCommid) {
        this.saleCommid = saleCommid;
    }

    public String getSaleNum() {
        return saleNum;
    }

    public void setSaleNum(String saleNum) {
        this.saleNum = saleNum;
    }

    public String getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(String salePrice) {
        this.salePrice = salePrice;
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
        SaleDetails other = (SaleDetails) that;
        return (this.getSaleDid() == null ? other.getSaleDid() == null : this.getSaleDid().equals(other.getSaleDid()))
            && (this.getSaleId() == null ? other.getSaleId() == null : this.getSaleId().equals(other.getSaleId()))
            && (this.getSaleCommid() == null ? other.getSaleCommid() == null : this.getSaleCommid().equals(other.getSaleCommid()))
            && (this.getSaleNum() == null ? other.getSaleNum() == null : this.getSaleNum().equals(other.getSaleNum()))
            && (this.getSalePrice() == null ? other.getSalePrice() == null : this.getSalePrice().equals(other.getSalePrice()))
            && (this.getSaleRemark() == null ? other.getSaleRemark() == null : this.getSaleRemark().equals(other.getSaleRemark()))
            && (this.getSaleComid() == null ? other.getSaleComid() == null : this.getSaleComid().equals(other.getSaleComid()))
            && (this.getSaleLastdate() == null ? other.getSaleLastdate() == null : this.getSaleLastdate().equals(other.getSaleLastdate()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSaleDid() == null) ? 0 : getSaleDid().hashCode());
        result = prime * result + ((getSaleId() == null) ? 0 : getSaleId().hashCode());
        result = prime * result + ((getSaleCommid() == null) ? 0 : getSaleCommid().hashCode());
        result = prime * result + ((getSaleNum() == null) ? 0 : getSaleNum().hashCode());
        result = prime * result + ((getSalePrice() == null) ? 0 : getSalePrice().hashCode());
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
        sb.append(", saleDid=").append(saleDid);
        sb.append(", saleId=").append(saleId);
        sb.append(", saleCommid=").append(saleCommid);
        sb.append(", saleNum=").append(saleNum);
        sb.append(", salePrice=").append(salePrice);
        sb.append(", saleRemark=").append(saleRemark);
        sb.append(", saleComid=").append(saleComid);
        sb.append(", saleLastdate=").append(saleLastdate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}