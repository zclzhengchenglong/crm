package com.sc.spring.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * SALE_CLIENTCONTREC
 * @author 
 */
public class SaleClientcontrec implements Serializable {
    private BigDecimal recnum;

    private String title;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date time;

    private BigDecimal clientnum;

    private String details;

    private BigDecimal sysnum;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date lasttime;

    private static final long serialVersionUID = 1L;

    public BigDecimal getRecnum() {
        return recnum;
    }

    public void setRecnum(BigDecimal recnum) {
        this.recnum = recnum;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public BigDecimal getClientnum() {
        return clientnum;
    }

    public void setClientnum(BigDecimal clientnum) {
        this.clientnum = clientnum;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
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
        SaleClientcontrec other = (SaleClientcontrec) that;
        return (this.getRecnum() == null ? other.getRecnum() == null : this.getRecnum().equals(other.getRecnum()))
            && (this.getTitle() == null ? other.getTitle() == null : this.getTitle().equals(other.getTitle()))
            && (this.getTime() == null ? other.getTime() == null : this.getTime().equals(other.getTime()))
            && (this.getClientnum() == null ? other.getClientnum() == null : this.getClientnum().equals(other.getClientnum()))
            && (this.getDetails() == null ? other.getDetails() == null : this.getDetails().equals(other.getDetails()))
            && (this.getSysnum() == null ? other.getSysnum() == null : this.getSysnum().equals(other.getSysnum()))
            && (this.getLasttime() == null ? other.getLasttime() == null : this.getLasttime().equals(other.getLasttime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getRecnum() == null) ? 0 : getRecnum().hashCode());
        result = prime * result + ((getTitle() == null) ? 0 : getTitle().hashCode());
        result = prime * result + ((getTime() == null) ? 0 : getTime().hashCode());
        result = prime * result + ((getClientnum() == null) ? 0 : getClientnum().hashCode());
        result = prime * result + ((getDetails() == null) ? 0 : getDetails().hashCode());
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
        sb.append(", recnum=").append(recnum);
        sb.append(", title=").append(title);
        sb.append(", time=").append(time);
        sb.append(", clientnum=").append(clientnum);
        sb.append(", details=").append(details);
        sb.append(", sysnum=").append(sysnum);
        sb.append(", lasttime=").append(lasttime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}