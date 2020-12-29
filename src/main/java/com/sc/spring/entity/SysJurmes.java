package com.sc.spring.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * SYS_JURMES
 * @author 
 */
public class SysJurmes implements Serializable {
    private Long powerId;

    private String powerName;

    private String power;

    private Long powerColumnsId;

    private String remarks;



    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date lastchangeTime;

    private static final long serialVersionUID = 1L;

    public Long getPowerId() {
        return powerId;
    }

    public void setPowerId(Long powerId) {
        this.powerId = powerId;
    }

    public String getPowerName() {
        return powerName;
    }

    public void setPowerName(String powerName) {
        this.powerName = powerName;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public Long getPowerColumnsId() {
        return powerColumnsId;
    }

    public void setPowerColumnsId(Long powerColumnsId) {
        this.powerColumnsId = powerColumnsId;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    public Date getLastchangeTime() {
        return lastchangeTime;
    }

    public void setLastchangeTime(Date lastchangeTime) {
        this.lastchangeTime = lastchangeTime;
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
        SysJurmes other = (SysJurmes) that;
        return (this.getPowerId() == null ? other.getPowerId() == null : this.getPowerId().equals(other.getPowerId()))
            && (this.getPowerName() == null ? other.getPowerName() == null : this.getPowerName().equals(other.getPowerName()))
            && (this.getPower() == null ? other.getPower() == null : this.getPower().equals(other.getPower()))
            && (this.getPowerColumnsId() == null ? other.getPowerColumnsId() == null : this.getPowerColumnsId().equals(other.getPowerColumnsId()))
            && (this.getRemarks() == null ? other.getRemarks() == null : this.getRemarks().equals(other.getRemarks()))
            && (this.getLastchangeTime() == null ? other.getLastchangeTime() == null : this.getLastchangeTime().equals(other.getLastchangeTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPowerId() == null) ? 0 : getPowerId().hashCode());
        result = prime * result + ((getPowerName() == null) ? 0 : getPowerName().hashCode());
        result = prime * result + ((getPower() == null) ? 0 : getPower().hashCode());
        result = prime * result + ((getPowerColumnsId() == null) ? 0 : getPowerColumnsId().hashCode());
        result = prime * result + ((getRemarks() == null) ? 0 : getRemarks().hashCode());
        result = prime * result + ((getLastchangeTime() == null) ? 0 : getLastchangeTime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", powerId=").append(powerId);
        sb.append(", powerName=").append(powerName);
        sb.append(", power=").append(power);
        sb.append(", powerColumnsId=").append(powerColumnsId);
        sb.append(", remarks=").append(remarks);
        sb.append(", lastchangeTime=").append(lastchangeTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}