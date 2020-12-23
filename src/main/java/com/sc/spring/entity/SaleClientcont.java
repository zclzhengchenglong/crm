package com.sc.spring.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * SALE_CLIENTCONT
 * @author 
 */
public class SaleClientcont implements Serializable {
    private BigDecimal contnum;

    private BigDecimal clientnum;

    private String contname;

    private String english;

    private String botany;

    private String department;

    private BigDecimal phonenum;

    private String telephone;

    private String email;

    private String adress;

    private String beizhuxx;

    private BigDecimal sysnum;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date lasttime;

    private static final long serialVersionUID = 1L;

    public BigDecimal getContnum() {
        return contnum;
    }

    public void setContnum(BigDecimal contnum) {
        this.contnum = contnum;
    }

    public BigDecimal getClientnum() {
        return clientnum;
    }

    public void setClientnum(BigDecimal clientnum) {
        this.clientnum = clientnum;
    }

    public String getContname() {
        return contname;
    }

    public void setContname(String contname) {
        this.contname = contname;
    }

    public String getEnglish() {
        return english;
    }

    public void setEnglish(String english) {
        this.english = english;
    }

    public String getBotany() {
        return botany;
    }

    public void setBotany(String botany) {
        this.botany = botany;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public BigDecimal getPhonenum() {
        return phonenum;
    }

    public void setPhonenum(BigDecimal phonenum) {
        this.phonenum = phonenum;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getBeizhuxx() {
        return beizhuxx;
    }

    public void setBeizhuxx(String beizhuxx) {
        this.beizhuxx = beizhuxx;
    }

    public BigDecimal getSysnum() {
        return sysnum;
    }

    public void setSysnum(BigDecimal sysnum) {
        this.sysnum = sysnum;
    }

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
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
        SaleClientcont other = (SaleClientcont) that;
        return (this.getContnum() == null ? other.getContnum() == null : this.getContnum().equals(other.getContnum()))
            && (this.getClientnum() == null ? other.getClientnum() == null : this.getClientnum().equals(other.getClientnum()))
            && (this.getContname() == null ? other.getContname() == null : this.getContname().equals(other.getContname()))
            && (this.getEnglish() == null ? other.getEnglish() == null : this.getEnglish().equals(other.getEnglish()))
            && (this.getBotany() == null ? other.getBotany() == null : this.getBotany().equals(other.getBotany()))
            && (this.getDepartment() == null ? other.getDepartment() == null : this.getDepartment().equals(other.getDepartment()))
            && (this.getPhonenum() == null ? other.getPhonenum() == null : this.getPhonenum().equals(other.getPhonenum()))
            && (this.getTelephone() == null ? other.getTelephone() == null : this.getTelephone().equals(other.getTelephone()))
            && (this.getEmail() == null ? other.getEmail() == null : this.getEmail().equals(other.getEmail()))
            && (this.getAdress() == null ? other.getAdress() == null : this.getAdress().equals(other.getAdress()))
            && (this.getBeizhuxx() == null ? other.getBeizhuxx() == null : this.getBeizhuxx().equals(other.getBeizhuxx()))
            && (this.getSysnum() == null ? other.getSysnum() == null : this.getSysnum().equals(other.getSysnum()))
            && (this.getLasttime() == null ? other.getLasttime() == null : this.getLasttime().equals(other.getLasttime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getContnum() == null) ? 0 : getContnum().hashCode());
        result = prime * result + ((getClientnum() == null) ? 0 : getClientnum().hashCode());
        result = prime * result + ((getContname() == null) ? 0 : getContname().hashCode());
        result = prime * result + ((getEnglish() == null) ? 0 : getEnglish().hashCode());
        result = prime * result + ((getBotany() == null) ? 0 : getBotany().hashCode());
        result = prime * result + ((getDepartment() == null) ? 0 : getDepartment().hashCode());
        result = prime * result + ((getPhonenum() == null) ? 0 : getPhonenum().hashCode());
        result = prime * result + ((getTelephone() == null) ? 0 : getTelephone().hashCode());
        result = prime * result + ((getEmail() == null) ? 0 : getEmail().hashCode());
        result = prime * result + ((getAdress() == null) ? 0 : getAdress().hashCode());
        result = prime * result + ((getBeizhuxx() == null) ? 0 : getBeizhuxx().hashCode());
        result = prime * result + ((getSysnum() == null) ? 0 : getSysnum().hashCode());
        result = prime * result + ((getLasttime() == null) ? 0 : getLasttime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", contnum=").append(contnum);
        sb.append(", clientnum=").append(clientnum);
        sb.append(", contname=").append(contname);
        sb.append(", english=").append(english);
        sb.append(", botany=").append(botany);
        sb.append(", department=").append(department);
        sb.append(", phonenum=").append(phonenum);
        sb.append(", telephone=").append(telephone);
        sb.append(", email=").append(email);
        sb.append(", adress=").append(adress);
        sb.append(", beizhuxx=").append(beizhuxx);
        sb.append(", sysnum=").append(sysnum);
        sb.append(", lasttime=").append(lasttime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}