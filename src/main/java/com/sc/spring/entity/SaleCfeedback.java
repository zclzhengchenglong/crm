package com.sc.spring.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * SALE_CFEEDBACK
 * @author 
 */
public class SaleCfeedback implements Serializable {
    private BigDecimal backnum;

    private String recordfirst;

    private BigDecimal clientnum;

    private String how;

    private String feedbacktype;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date feedbacktime;

    private String reason;

    private String chargemen;

    private String source;

    private String theme;

    private String analysis;

    private BigDecimal sysnum;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date lasttime;

    private static final long serialVersionUID = 1L;

    public BigDecimal getBacknum() {
        return backnum;
    }

    public void setBacknum(BigDecimal backnum) {
        this.backnum = backnum;
    }

    public String getRecordfirst() {
        return recordfirst;
    }

    public void setRecordfirst(String recordfirst) {
        this.recordfirst = recordfirst;
    }

    public BigDecimal getClientnum() {
        return clientnum;
    }

    public void setClientnum(BigDecimal clientnum) {
        this.clientnum = clientnum;
    }

    public String getHow() {
        return how;
    }

    public void setHow(String how) {
        this.how = how;
    }

    public String getFeedbacktype() {
        return feedbacktype;
    }

    public void setFeedbacktype(String feedbacktype) {
        this.feedbacktype = feedbacktype;
    }
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    public Date getFeedbacktime() {
        return feedbacktime;
    }

    public void setFeedbacktime(Date feedbacktime) {
        this.feedbacktime = feedbacktime;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getChargemen() {
        return chargemen;
    }

    public void setChargemen(String chargemen) {
        this.chargemen = chargemen;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public String getAnalysis() {
        return analysis;
    }

    public void setAnalysis(String analysis) {
        this.analysis = analysis;
    }

    public BigDecimal getSysnum() {
        return sysnum;
    }

    public void setSysnum(BigDecimal sysnum) {
        this.sysnum = sysnum;
    }

    public Date getLasttime() {
        return lasttime;
    }
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
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
        SaleCfeedback other = (SaleCfeedback) that;
        return (this.getBacknum() == null ? other.getBacknum() == null : this.getBacknum().equals(other.getBacknum()))
            && (this.getRecordfirst() == null ? other.getRecordfirst() == null : this.getRecordfirst().equals(other.getRecordfirst()))
            && (this.getClientnum() == null ? other.getClientnum() == null : this.getClientnum().equals(other.getClientnum()))
            && (this.getHow() == null ? other.getHow() == null : this.getHow().equals(other.getHow()))
            && (this.getFeedbacktype() == null ? other.getFeedbacktype() == null : this.getFeedbacktype().equals(other.getFeedbacktype()))
            && (this.getFeedbacktime() == null ? other.getFeedbacktime() == null : this.getFeedbacktime().equals(other.getFeedbacktime()))
            && (this.getReason() == null ? other.getReason() == null : this.getReason().equals(other.getReason()))
            && (this.getChargemen() == null ? other.getChargemen() == null : this.getChargemen().equals(other.getChargemen()))
            && (this.getSource() == null ? other.getSource() == null : this.getSource().equals(other.getSource()))
            && (this.getTheme() == null ? other.getTheme() == null : this.getTheme().equals(other.getTheme()))
            && (this.getAnalysis() == null ? other.getAnalysis() == null : this.getAnalysis().equals(other.getAnalysis()))
            && (this.getSysnum() == null ? other.getSysnum() == null : this.getSysnum().equals(other.getSysnum()))
            && (this.getLasttime() == null ? other.getLasttime() == null : this.getLasttime().equals(other.getLasttime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getBacknum() == null) ? 0 : getBacknum().hashCode());
        result = prime * result + ((getRecordfirst() == null) ? 0 : getRecordfirst().hashCode());
        result = prime * result + ((getClientnum() == null) ? 0 : getClientnum().hashCode());
        result = prime * result + ((getHow() == null) ? 0 : getHow().hashCode());
        result = prime * result + ((getFeedbacktype() == null) ? 0 : getFeedbacktype().hashCode());
        result = prime * result + ((getFeedbacktime() == null) ? 0 : getFeedbacktime().hashCode());
        result = prime * result + ((getReason() == null) ? 0 : getReason().hashCode());
        result = prime * result + ((getChargemen() == null) ? 0 : getChargemen().hashCode());
        result = prime * result + ((getSource() == null) ? 0 : getSource().hashCode());
        result = prime * result + ((getTheme() == null) ? 0 : getTheme().hashCode());
        result = prime * result + ((getAnalysis() == null) ? 0 : getAnalysis().hashCode());
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
        sb.append(", backnum=").append(backnum);
        sb.append(", recordfirst=").append(recordfirst);
        sb.append(", clientnum=").append(clientnum);
        sb.append(", how=").append(how);
        sb.append(", feedbacktype=").append(feedbacktype);
        sb.append(", feedbacktime=").append(feedbacktime);
        sb.append(", reason=").append(reason);
        sb.append(", chargemen=").append(chargemen);
        sb.append(", source=").append(source);
        sb.append(", theme=").append(theme);
        sb.append(", analysis=").append(analysis);
        sb.append(", sysnum=").append(sysnum);
        sb.append(", lasttime=").append(lasttime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}