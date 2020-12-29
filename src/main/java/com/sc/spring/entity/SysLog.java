//package com.sc.spring.entity;
//
//import com.fasterxml.jackson.annotation.JsonFormat;
//import org.springframework.format.annotation.DateTimeFormat;
//
//import java.io.Serializable;
//import java.math.BigDecimal;
//import java.util.Date;
//
///**
// * SYS_LOG
// * @author
// */
//public class SysLog implements Serializable {
//    private BigDecimal logNum;
//
//    private BigDecimal usernum;
//
//    private String fromip;
//
//    private String limit;
//
//    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
//    private BigDecimal sysCompanyId;
//
//    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
//    private Date lastchangeTime;
//
//    private static final long serialVersionUID = 1L;
//
//    public BigDecimal getLogNum() {
//        return logNum;
//    }
//
//    public void setLogNum(BigDecimal logNum) {
//        this.logNum = logNum;
//    }
//
//    public BigDecimal getUsernum() {
//        return usernum;
//    }
//
//    public void setUsernum(BigDecimal usernum) {
//        this.usernum = usernum;
//    }
//
//    public String getFromip() {
//        return fromip;
//    }
//
//    public void setFromip(String fromip) {
//        this.fromip = fromip;
//    }
//
//    public String getLimit() {
//        return limit;
//    }
//
//    public void setLimit(String limit) {
//        this.limit = limit;
//    }
//
//    public BigDecimal getSysCompanyId() {
//        return sysCompanyId;
//    }
//
//    public void setSysCompanyId(BigDecimal sysCompanyId) {
//        this.sysCompanyId = sysCompanyId;
//    }
//    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
//
//    public Date getLastchangeTime() {
//        return lastchangeTime;
//    }
//
//    public void setLastchangeTime(Date lasttime) {
//        this.lastchangeTime = lastchangeTime;
//    }
//
//    @Override
//    public boolean equals(Object that) {
//        if (this == that) {
//            return true;
//        }
//        if (that == null) {
//            return false;
//        }
//        if (getClass() != that.getClass()) {
//            return false;
//        }
//        SysLog other = (SysLog) that;
//        return (this.getLogNum() == null ? other.getLogNum() == null : this.getLogNum().equals(other.getLogNum()))
//            && (this.getUsernum() == null ? other.getUsernum() == null : this.getUsernum().equals(other.getUsernum()))
//            && (this.getFromip() == null ? other.getFromip() == null : this.getFromip().equals(other.getFromip()))
//            && (this.getLimit() == null ? other.getLimit() == null : this.getLimit().equals(other.getLimit()))
//            && (this.getSysCompanyId() == null ? other.getSysCompanyId() == null : this.getSysCompanyId().equals(other.getSysCompanyId()))
//            && (this.getLastchangeTime() == null ? other.getLastchangeTime() == null : this.getLastchangeTime().equals(other.getLastchangeTime()));
//    }
//
//    @Override
//    public int hashCode() {
//        final int prime = 31;
//        int result = 1;
//        result = prime * result + ((getLogNum() == null) ? 0 : getLogNum().hashCode());
//        result = prime * result + ((getUsernum() == null) ? 0 : getUsernum().hashCode());
//        result = prime * result + ((getFromip() == null) ? 0 : getFromip().hashCode());
//        result = prime * result + ((getLimit() == null) ? 0 : getLimit().hashCode());
//        result = prime * result + ((getSysCompanyId() == null) ? 0 : getSysCompanyId().hashCode());
//        result = prime * result + ((getLastchangeTime() == null) ? 0 : getLastchangeTime().hashCode());
//        return result;
//    }
//
//    @Override
//    public String toString() {
//        StringBuilder sb = new StringBuilder();
//        sb.append(getClass().getSimpleName());
//        sb.append(" [");
//        sb.append("Hash = ").append(hashCode());
//        sb.append(", logNum=").append(logNum);
//        sb.append(", usernum=").append(usernum);
//        sb.append(", fromip=").append(fromip);
//        sb.append(", limit=").append(limit);
//        sb.append(", sysCompanyID=").append(sysCompanyId);
//        sb.append(", lastchangeTime=").append(lastchangeTime);
//        sb.append(", serialVersionUID=").append(serialVersionUID);
//        sb.append("]");
//        return sb.toString();
//    }
//}
package com.sc.spring.entity;

import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * SYS_LOG
 * @author
 */
public class SysLog implements Serializable {
    private BigDecimal logNum;

    private BigDecimal usernum;

    private String fromip;

    private String limit;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date whattime;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date lasttime;

    private static final long serialVersionUID = 1L;

    public BigDecimal getLogNum() {
        return logNum;
    }

    public void setLogNum(BigDecimal logNum) {
        this.logNum = logNum;
    }

    public BigDecimal getUsernum() {
        return usernum;
    }

    public void setUsernum(BigDecimal usernum) {
        this.usernum = usernum;
    }

    public String getFromip() {
        return fromip;
    }

    public void setFromip(String fromip) {
        this.fromip = fromip;
    }

    public String getLimit() {
        return limit;
    }

    public void setLimit(String limit) {
        this.limit = limit;
    }

    public Date getWhattime() {
        return whattime;
    }

    public void setWhattime(Date whattime) {
        this.whattime = whattime;
    }

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
        SysLog other = (SysLog) that;
        return (this.getLogNum() == null ? other.getLogNum() == null : this.getLogNum().equals(other.getLogNum()))
                && (this.getUsernum() == null ? other.getUsernum() == null : this.getUsernum().equals(other.getUsernum()))
                && (this.getFromip() == null ? other.getFromip() == null : this.getFromip().equals(other.getFromip()))
                && (this.getLimit() == null ? other.getLimit() == null : this.getLimit().equals(other.getLimit()))
                && (this.getWhattime() == null ? other.getWhattime() == null : this.getWhattime().equals(other.getWhattime()))
                && (this.getLasttime() == null ? other.getLasttime() == null : this.getLasttime().equals(other.getLasttime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getLogNum() == null) ? 0 : getLogNum().hashCode());
        result = prime * result + ((getUsernum() == null) ? 0 : getUsernum().hashCode());
        result = prime * result + ((getFromip() == null) ? 0 : getFromip().hashCode());
        result = prime * result + ((getLimit() == null) ? 0 : getLimit().hashCode());
        result = prime * result + ((getWhattime() == null) ? 0 : getWhattime().hashCode());
        result = prime * result + ((getLasttime() == null) ? 0 : getLasttime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", logNum=").append(logNum);
        sb.append(", usernum=").append(usernum);
        sb.append(", fromip=").append(fromip);
        sb.append(", limit=").append(limit);
        sb.append(", whattime=").append(whattime);
        sb.append(", lasttime=").append(lasttime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}