package com.sc.spring.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * SALE_CLIENTLOSS
 * @author 
 */
public class SaleClientloss implements Serializable {
    private BigDecimal lossnum;

    private BigDecimal clientnum;

    private BigDecimal opnum;

    private String handleway;

    private String measures;

    private String whetherloss;

    private BigDecimal sysnum;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date lasttime;

    private static final long serialVersionUID = 1L;

    public BigDecimal getLossnum() {
        return lossnum;
    }

    public void setLossnum(BigDecimal lossnum) {
        this.lossnum = lossnum;
    }

    public BigDecimal getClientnum() {
        return clientnum;
    }

    public void setClientnum(BigDecimal clientnum) {
        this.clientnum = clientnum;
    }

    public BigDecimal getOpnum() {
        return opnum;
    }

    public void setOpnum(BigDecimal opnum) {
        this.opnum = opnum;
    }

    public String getHandleway() {
        return handleway;
    }

    public void setHandleway(String handleway) {
        this.handleway = handleway;
    }

    public String getMeasures() {
        return measures;
    }

    public void setMeasures(String measures) {
        this.measures = measures;
    }

    public String getWhetherloss() {
        return whetherloss;
    }

    public void setWhetherloss(String whetherloss) {
        this.whetherloss = whetherloss;
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
        SaleClientloss other = (SaleClientloss) that;
        return (this.getLossnum() == null ? other.getLossnum() == null : this.getLossnum().equals(other.getLossnum()))
            && (this.getClientnum() == null ? other.getClientnum() == null : this.getClientnum().equals(other.getClientnum()))
            && (this.getOpnum() == null ? other.getOpnum() == null : this.getOpnum().equals(other.getOpnum()))
            && (this.getHandleway() == null ? other.getHandleway() == null : this.getHandleway().equals(other.getHandleway()))
            && (this.getMeasures() == null ? other.getMeasures() == null : this.getMeasures().equals(other.getMeasures()))
            && (this.getWhetherloss() == null ? other.getWhetherloss() == null : this.getWhetherloss().equals(other.getWhetherloss()))
            && (this.getSysnum() == null ? other.getSysnum() == null : this.getSysnum().equals(other.getSysnum()))
            && (this.getLasttime() == null ? other.getLasttime() == null : this.getLasttime().equals(other.getLasttime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getLossnum() == null) ? 0 : getLossnum().hashCode());
        result = prime * result + ((getClientnum() == null) ? 0 : getClientnum().hashCode());
        result = prime * result + ((getOpnum() == null) ? 0 : getOpnum().hashCode());
        result = prime * result + ((getHandleway() == null) ? 0 : getHandleway().hashCode());
        result = prime * result + ((getMeasures() == null) ? 0 : getMeasures().hashCode());
        result = prime * result + ((getWhetherloss() == null) ? 0 : getWhetherloss().hashCode());
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
        sb.append(", lossnum=").append(lossnum);
        sb.append(", clientnum=").append(clientnum);
        sb.append(", opnum=").append(opnum);
        sb.append(", handleway=").append(handleway);
        sb.append(", measures=").append(measures);
        sb.append(", whetherloss=").append(whetherloss);
        sb.append(", sysnum=").append(sysnum);
        sb.append(", lasttime=").append(lasttime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}