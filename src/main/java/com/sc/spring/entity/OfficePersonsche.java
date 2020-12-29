package com.sc.spring.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * OFFICE_PERSONSCHE
 * @author 
 */
public class OfficePersonsche implements Serializable {
    /**
     * 日程安排编号
     */
    private Long seId;

    /**
     * 安排类别
     */
    private String arrangementCategroy;

    /**
     * 安排主题
     */
    private String arrangeTheTheme;

    /**
     * 开始时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date startDate;

    /**
     * 结束时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date startTime;

    /**
     * 填写人员编号
     */
    private BigDecimal fillInThePersonnelNumber;

    /**
     * 安排描述
     */
    private String arrangementDescription;

    /**
     * 公司编号
     */
    private BigDecimal cpmpanyNumber;

    /**
     * 最后修改时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date lasttime;

    private static final long serialVersionUID = 1L;

    public Long getSeId() {
        return seId;
    }

    public void setSeId(Long seId) {
        this.seId = seId;
    }

    public String getArrangementCategroy() {
        return arrangementCategroy;
    }

    public void setArrangementCategroy(String arrangementCategroy) {
        this.arrangementCategroy = arrangementCategroy;
    }

    public String getArrangeTheTheme() {
        return arrangeTheTheme;
    }

    public void setArrangeTheTheme(String arrangeTheTheme) {
        this.arrangeTheTheme = arrangeTheTheme;
    }

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public BigDecimal getFillInThePersonnelNumber() {
        return fillInThePersonnelNumber;
    }

    public void setFillInThePersonnelNumber(BigDecimal fillInThePersonnelNumber) {
        this.fillInThePersonnelNumber = fillInThePersonnelNumber;
    }

    public String getArrangementDescription() {
        return arrangementDescription;
    }

    public void setArrangementDescription(String arrangementDescription) {
        this.arrangementDescription = arrangementDescription;
    }

    public BigDecimal getCpmpanyNumber() {
        return cpmpanyNumber;
    }

    public void setCpmpanyNumber(BigDecimal cpmpanyNumber) {
        this.cpmpanyNumber = cpmpanyNumber;
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
        OfficePersonsche other = (OfficePersonsche) that;
        return (this.getSeId() == null ? other.getSeId() == null : this.getSeId().equals(other.getSeId()))
            && (this.getArrangementCategroy() == null ? other.getArrangementCategroy() == null : this.getArrangementCategroy().equals(other.getArrangementCategroy()))
            && (this.getArrangeTheTheme() == null ? other.getArrangeTheTheme() == null : this.getArrangeTheTheme().equals(other.getArrangeTheTheme()))
            && (this.getStartDate() == null ? other.getStartDate() == null : this.getStartDate().equals(other.getStartDate()))
            && (this.getStartTime() == null ? other.getStartTime() == null : this.getStartTime().equals(other.getStartTime()))
            && (this.getFillInThePersonnelNumber() == null ? other.getFillInThePersonnelNumber() == null : this.getFillInThePersonnelNumber().equals(other.getFillInThePersonnelNumber()))
            && (this.getArrangementDescription() == null ? other.getArrangementDescription() == null : this.getArrangementDescription().equals(other.getArrangementDescription()))
            && (this.getCpmpanyNumber() == null ? other.getCpmpanyNumber() == null : this.getCpmpanyNumber().equals(other.getCpmpanyNumber()))
            && (this.getLasttime() == null ? other.getLasttime() == null : this.getLasttime().equals(other.getLasttime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSeId() == null) ? 0 : getSeId().hashCode());
        result = prime * result + ((getArrangementCategroy() == null) ? 0 : getArrangementCategroy().hashCode());
        result = prime * result + ((getArrangeTheTheme() == null) ? 0 : getArrangeTheTheme().hashCode());
        result = prime * result + ((getStartDate() == null) ? 0 : getStartDate().hashCode());
        result = prime * result + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        result = prime * result + ((getFillInThePersonnelNumber() == null) ? 0 : getFillInThePersonnelNumber().hashCode());
        result = prime * result + ((getArrangementDescription() == null) ? 0 : getArrangementDescription().hashCode());
        result = prime * result + ((getCpmpanyNumber() == null) ? 0 : getCpmpanyNumber().hashCode());
        result = prime * result + ((getLasttime() == null) ? 0 : getLasttime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", seId=").append(seId);
        sb.append(", arrangementCategroy=").append(arrangementCategroy);
        sb.append(", arrangeTheTheme=").append(arrangeTheTheme);
        sb.append(", startDate=").append(startDate);
        sb.append(", startTime=").append(startTime);
        sb.append(", fillInThePersonnelNumber=").append(fillInThePersonnelNumber);
        sb.append(", arrangementDescription=").append(arrangementDescription);
        sb.append(", cpmpanyNumber=").append(cpmpanyNumber);
        sb.append(", lasttime=").append(lasttime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}