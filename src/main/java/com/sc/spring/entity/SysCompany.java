package com.sc.spring.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * SYS_COMPANY
 * @author 
 */
public class SysCompany implements Serializable {
    private BigDecimal sysCompanyId;

    private String sysCompanyName;

    private String sysCompanyDm;

    private String sysCompany;

    private String sysCompanyDh;

    private String sysCompanyHong;

    private String sysCompanyPhone;

    private String sysCompanyYphone;

    private String sysCompanyCz;

    private String sysCompanyYh;

    private String sysCompanyYhzh;

    private String sysCompanyYxw;

    private String sysCompanyBzxx;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date lasttime;

    private static final long serialVersionUID = 1L;

    public BigDecimal getSysCompanyId() {
        return sysCompanyId;
    }

    public void setSysCompanyId(BigDecimal sysCompanyId) {
        this.sysCompanyId = sysCompanyId;
    }

    public String getSysCompanyName() {
        return sysCompanyName;
    }

    public void setSysCompanyName(String sysCompanyName) {
        this.sysCompanyName = sysCompanyName;
    }

    public String getSysCompanyDm() {
        return sysCompanyDm;
    }

    public void setSysCompanyDm(String sysCompanyDm) {
        this.sysCompanyDm = sysCompanyDm;
    }

    public String getSysCompany() {
        return sysCompany;
    }

    public void setSysCompany(String sysCompany) {
        this.sysCompany = sysCompany;
    }

    public String getSysCompanyDh() {
        return sysCompanyDh;
    }

    public void setSysCompanyDh(String sysCompanyDh) {
        this.sysCompanyDh = sysCompanyDh;
    }

    public String getSysCompanyHong() {
        return sysCompanyHong;
    }

    public void setSysCompanyHong(String sysCompanyHong) {
        this.sysCompanyHong = sysCompanyHong;
    }

    public String getSysCompanyPhone() {
        return sysCompanyPhone;
    }

    public void setSysCompanyPhone(String sysCompanyPhone) {
        this.sysCompanyPhone = sysCompanyPhone;
    }

    public String getSysCompanyYphone() {
        return sysCompanyYphone;
    }

    public void setSysCompanyYphone(String sysCompanyYphone) {
        this.sysCompanyYphone = sysCompanyYphone;
    }

    public String getSysCompanyCz() {
        return sysCompanyCz;
    }

    public void setSysCompanyCz(String sysCompanyCz) {
        this.sysCompanyCz = sysCompanyCz;
    }

    public String getSysCompanyYh() {
        return sysCompanyYh;
    }

    public void setSysCompanyYh(String sysCompanyYh) {
        this.sysCompanyYh = sysCompanyYh;
    }

    public String getSysCompanyYhzh() {
        return sysCompanyYhzh;
    }

    public void setSysCompanyYhzh(String sysCompanyYhzh) {
        this.sysCompanyYhzh = sysCompanyYhzh;
    }

    public String getSysCompanyYxw() {
        return sysCompanyYxw;
    }

    public void setSysCompanyYxw(String sysCompanyYxw) {
        this.sysCompanyYxw = sysCompanyYxw;
    }

    public String getSysCompanyBzxx() {
        return sysCompanyBzxx;
    }

    public void setSysCompanyBzxx(String sysCompanyBzxx) {
        this.sysCompanyBzxx = sysCompanyBzxx;
    }
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    public Date getLasttime() {
        return lasttime;
    }

    public void setLasttime(Date lasttime) {
        this.lasttime = lasttime;
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
        SysCompany other = (SysCompany) that;
        return (this.getSysCompanyId() == null ? other.getSysCompanyId() == null : this.getSysCompanyId().equals(other.getSysCompanyId()))
            && (this.getSysCompanyName() == null ? other.getSysCompanyName() == null : this.getSysCompanyName().equals(other.getSysCompanyName()))
            && (this.getSysCompanyDm() == null ? other.getSysCompanyDm() == null : this.getSysCompanyDm().equals(other.getSysCompanyDm()))
            && (this.getSysCompany() == null ? other.getSysCompany() == null : this.getSysCompany().equals(other.getSysCompany()))
            && (this.getSysCompanyDh() == null ? other.getSysCompanyDh() == null : this.getSysCompanyDh().equals(other.getSysCompanyDh()))
            && (this.getSysCompanyHong() == null ? other.getSysCompanyHong() == null : this.getSysCompanyHong().equals(other.getSysCompanyHong()))
            && (this.getSysCompanyPhone() == null ? other.getSysCompanyPhone() == null : this.getSysCompanyPhone().equals(other.getSysCompanyPhone()))
            && (this.getSysCompanyYphone() == null ? other.getSysCompanyYphone() == null : this.getSysCompanyYphone().equals(other.getSysCompanyYphone()))
            && (this.getSysCompanyCz() == null ? other.getSysCompanyCz() == null : this.getSysCompanyCz().equals(other.getSysCompanyCz()))
            && (this.getSysCompanyYh() == null ? other.getSysCompanyYh() == null : this.getSysCompanyYh().equals(other.getSysCompanyYh()))
            && (this.getSysCompanyYhzh() == null ? other.getSysCompanyYhzh() == null : this.getSysCompanyYhzh().equals(other.getSysCompanyYhzh()))
            && (this.getSysCompanyYxw() == null ? other.getSysCompanyYxw() == null : this.getSysCompanyYxw().equals(other.getSysCompanyYxw()))
            && (this.getSysCompanyBzxx() == null ? other.getSysCompanyBzxx() == null : this.getSysCompanyBzxx().equals(other.getSysCompanyBzxx()))
            && (this.getLasttime() == null ? other.getLasttime() == null : this.getLasttime().equals(other.getLasttime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSysCompanyId() == null) ? 0 : getSysCompanyId().hashCode());
        result = prime * result + ((getSysCompanyName() == null) ? 0 : getSysCompanyName().hashCode());
        result = prime * result + ((getSysCompanyDm() == null) ? 0 : getSysCompanyDm().hashCode());
        result = prime * result + ((getSysCompany() == null) ? 0 : getSysCompany().hashCode());
        result = prime * result + ((getSysCompanyDh() == null) ? 0 : getSysCompanyDh().hashCode());
        result = prime * result + ((getSysCompanyHong() == null) ? 0 : getSysCompanyHong().hashCode());
        result = prime * result + ((getSysCompanyPhone() == null) ? 0 : getSysCompanyPhone().hashCode());
        result = prime * result + ((getSysCompanyYphone() == null) ? 0 : getSysCompanyYphone().hashCode());
        result = prime * result + ((getSysCompanyCz() == null) ? 0 : getSysCompanyCz().hashCode());
        result = prime * result + ((getSysCompanyYh() == null) ? 0 : getSysCompanyYh().hashCode());
        result = prime * result + ((getSysCompanyYhzh() == null) ? 0 : getSysCompanyYhzh().hashCode());
        result = prime * result + ((getSysCompanyYxw() == null) ? 0 : getSysCompanyYxw().hashCode());
        result = prime * result + ((getSysCompanyBzxx() == null) ? 0 : getSysCompanyBzxx().hashCode());
        result = prime * result + ((getLasttime() == null) ? 0 : getLasttime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sysCompanyId=").append(sysCompanyId);
        sb.append(", sysCompanyName=").append(sysCompanyName);
        sb.append(", sysCompanyDm=").append(sysCompanyDm);
        sb.append(", sysCompany=").append(sysCompany);
        sb.append(", sysCompanyDh=").append(sysCompanyDh);
        sb.append(", sysCompanyHong=").append(sysCompanyHong);
        sb.append(", sysCompanyPhone=").append(sysCompanyPhone);
        sb.append(", sysCompanyYphone=").append(sysCompanyYphone);
        sb.append(", sysCompanyCz=").append(sysCompanyCz);
        sb.append(", sysCompanyYh=").append(sysCompanyYh);
        sb.append(", sysCompanyYhzh=").append(sysCompanyYhzh);
        sb.append(", sysCompanyYxw=").append(sysCompanyYxw);
        sb.append(", sysCompanyBzxx=").append(sysCompanyBzxx);
        sb.append(", lasttime=").append(lasttime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}