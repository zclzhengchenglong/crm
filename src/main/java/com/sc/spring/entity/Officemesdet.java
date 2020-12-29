package com.sc.spring.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * OFFICE_MESDET
 * @author 
 */
public class Officemesdet implements Serializable {
    /**
     * 详情编号
     */
    private Long detailNo;

    /**
     * 短消息编号==消息表里面的 短信编号
     */
    private BigDecimal smsNumner;

    /**
     * 接收者编号
     */
    private BigDecimal receiverNumber;

    /**
     * 消息状态
     */
    private String messageStatus;

    /**
     * 消息编号
     */
    private BigDecimal companyNumber;

    /**
     * 最后修改时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date lasttime;


    private Officemes officemes;   //与Officemes实体类进行关联  多对一 定义为对象，一对多，定义为集合

    public Officemes getOfficemes() {
        return officemes;
    }

    public void setOfficemes(Officemes officemes) {
        this.officemes = officemes;
    }



    private static final long serialVersionUID = 1L;

    public Long getDetailNo() {
        return detailNo;
    }

    public void setDetailNo(Long detailNo) {
        this.detailNo = detailNo;
    }

    public BigDecimal getSmsNumner() {
        return smsNumner;
    }

    public void setSmsNumner(BigDecimal smsNumner) {
        this.smsNumner = smsNumner;
    }

    public BigDecimal getReceiverNumber() {
        return receiverNumber;
    }

    public void setReceiverNumber(BigDecimal receiverNumber) {
        this.receiverNumber = receiverNumber;
    }

    public String getMessageStatus() {
        return messageStatus;
    }

    public void setMessageStatus(String messageStatus) {
        this.messageStatus = messageStatus;
    }

    public BigDecimal getCompanyNumber() {
        return companyNumber;
    }

    public void setCompanyNumber(BigDecimal companyNumber) {
        this.companyNumber = companyNumber;
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
        Officemesdet other = (Officemesdet) that;
        return (this.getDetailNo() == null ? other.getDetailNo() == null : this.getDetailNo().equals(other.getDetailNo()))
            && (this.getSmsNumner() == null ? other.getSmsNumner() == null : this.getSmsNumner().equals(other.getSmsNumner()))
            && (this.getReceiverNumber() == null ? other.getReceiverNumber() == null : this.getReceiverNumber().equals(other.getReceiverNumber()))
            && (this.getMessageStatus() == null ? other.getMessageStatus() == null : this.getMessageStatus().equals(other.getMessageStatus()))
            && (this.getCompanyNumber() == null ? other.getCompanyNumber() == null : this.getCompanyNumber().equals(other.getCompanyNumber()))
            && (this.getLasttime() == null ? other.getLasttime() == null : this.getLasttime().equals(other.getLasttime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getDetailNo() == null) ? 0 : getDetailNo().hashCode());
        result = prime * result + ((getSmsNumner() == null) ? 0 : getSmsNumner().hashCode());
        result = prime * result + ((getReceiverNumber() == null) ? 0 : getReceiverNumber().hashCode());
        result = prime * result + ((getMessageStatus() == null) ? 0 : getMessageStatus().hashCode());
        result = prime * result + ((getCompanyNumber() == null) ? 0 : getCompanyNumber().hashCode());
        result = prime * result + ((getLasttime() == null) ? 0 : getLasttime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", detailNo=").append(detailNo);
        sb.append(", smsNumner=").append(smsNumner);
        sb.append(", receiverNumber=").append(receiverNumber);
        sb.append(", messageStatus=").append(messageStatus);
        sb.append(", companyNumber=").append(companyNumber);
        sb.append(", lasttime=").append(lasttime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}