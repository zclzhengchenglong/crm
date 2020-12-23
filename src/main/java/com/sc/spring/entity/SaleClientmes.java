package com.sc.spring.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * SALE_CLIENTMES
 * @author 
 */
public class SaleClientmes implements Serializable {
    private BigDecimal clientnum;

    private String clientname;

    private String clientattr;

    private String crl;

    private String gupiaodm;

    private String leader;

    private String owner;

    private BigDecimal employesnum;

    private BigDecimal industrynum;

    private String clientkinds;

    private String clientstate;

    private String clientsource;

    private BigDecimal chargenum;

    private String telphone;

    private BigDecimal phonenum;

    private String fax;

    private String bank;

    private BigDecimal bankaccount;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date nextconttime;

    private String email;

    private BigDecimal sicnum;

    private String payway;

    private String effective;

    private String address;

    private String beizhu;

    private BigDecimal sysnum;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date lasttime;

    private static final long serialVersionUID = 1L;

    public BigDecimal getClientnum() {
        return clientnum;
    }

    public void setClientnum(BigDecimal clientnum) {
        this.clientnum = clientnum;
    }

    public String getClientname() {
        return clientname;
    }

    public void setClientname(String clientname) {
        this.clientname = clientname;
    }

    public String getClientattr() {
        return clientattr;
    }

    public void setClientattr(String clientattr) {
        this.clientattr = clientattr;
    }

    public String getCrl() {
        return crl;
    }

    public void setCrl(String crl) {
        this.crl = crl;
    }

    public String getGupiaodm() {
        return gupiaodm;
    }

    public void setGupiaodm(String gupiaodm) {
        this.gupiaodm = gupiaodm;
    }

    public String getLeader() {
        return leader;
    }

    public void setLeader(String leader) {
        this.leader = leader;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public BigDecimal getEmployesnum() {
        return employesnum;
    }

    public void setEmployesnum(BigDecimal employesnum) {
        this.employesnum = employesnum;
    }

    public BigDecimal getIndustrynum() {
        return industrynum;
    }

    public void setIndustrynum(BigDecimal industrynum) {
        this.industrynum = industrynum;
    }

    public String getClientkinds() {
        return clientkinds;
    }

    public void setClientkinds(String clientkinds) {
        this.clientkinds = clientkinds;
    }

    public String getClientstate() {
        return clientstate;
    }

    public void setClientstate(String clientstate) {
        this.clientstate = clientstate;
    }

    public String getClientsource() {
        return clientsource;
    }

    public void setClientsource(String clientsource) {
        this.clientsource = clientsource;
    }

    public BigDecimal getChargenum() {
        return chargenum;
    }

    public void setChargenum(BigDecimal chargenum) {
        this.chargenum = chargenum;
    }

    public String getTelphone() {
        return telphone;
    }

    public void setTelphone(String telphone) {
        this.telphone = telphone;
    }

    public BigDecimal getPhonenum() {
        return phonenum;
    }

    public void setPhonenum(BigDecimal phonenum) {
        this.phonenum = phonenum;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public BigDecimal getBankaccount() {
        return bankaccount;
    }

    public void setBankaccount(BigDecimal bankaccount) {
        this.bankaccount = bankaccount;
    }
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    public Date getNextconttime() {
        return nextconttime;
    }

    public void setNextconttime(Date nextconttime) {
        this.nextconttime = nextconttime;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public BigDecimal getSicnum() {
        return sicnum;
    }

    public void setSicnum(BigDecimal sicnum) {
        this.sicnum = sicnum;
    }

    public String getPayway() {
        return payway;
    }

    public void setPayway(String payway) {
        this.payway = payway;
    }

    public String getEffective() {
        return effective;
    }

    public void setEffective(String effective) {
        this.effective = effective;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBeizhu() {
        return beizhu;
    }

    public void setBeizhu(String beizhu) {
        this.beizhu = beizhu;
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
        SaleClientmes other = (SaleClientmes) that;
        return (this.getClientnum() == null ? other.getClientnum() == null : this.getClientnum().equals(other.getClientnum()))
            && (this.getClientname() == null ? other.getClientname() == null : this.getClientname().equals(other.getClientname()))
            && (this.getClientattr() == null ? other.getClientattr() == null : this.getClientattr().equals(other.getClientattr()))
            && (this.getCrl() == null ? other.getCrl() == null : this.getCrl().equals(other.getCrl()))
            && (this.getGupiaodm() == null ? other.getGupiaodm() == null : this.getGupiaodm().equals(other.getGupiaodm()))
            && (this.getLeader() == null ? other.getLeader() == null : this.getLeader().equals(other.getLeader()))
            && (this.getOwner() == null ? other.getOwner() == null : this.getOwner().equals(other.getOwner()))
            && (this.getEmployesnum() == null ? other.getEmployesnum() == null : this.getEmployesnum().equals(other.getEmployesnum()))
            && (this.getIndustrynum() == null ? other.getIndustrynum() == null : this.getIndustrynum().equals(other.getIndustrynum()))
            && (this.getClientkinds() == null ? other.getClientkinds() == null : this.getClientkinds().equals(other.getClientkinds()))
            && (this.getClientstate() == null ? other.getClientstate() == null : this.getClientstate().equals(other.getClientstate()))
            && (this.getClientsource() == null ? other.getClientsource() == null : this.getClientsource().equals(other.getClientsource()))
            && (this.getChargenum() == null ? other.getChargenum() == null : this.getChargenum().equals(other.getChargenum()))
            && (this.getTelphone() == null ? other.getTelphone() == null : this.getTelphone().equals(other.getTelphone()))
            && (this.getPhonenum() == null ? other.getPhonenum() == null : this.getPhonenum().equals(other.getPhonenum()))
            && (this.getFax() == null ? other.getFax() == null : this.getFax().equals(other.getFax()))
            && (this.getBank() == null ? other.getBank() == null : this.getBank().equals(other.getBank()))
            && (this.getBankaccount() == null ? other.getBankaccount() == null : this.getBankaccount().equals(other.getBankaccount()))
            && (this.getNextconttime() == null ? other.getNextconttime() == null : this.getNextconttime().equals(other.getNextconttime()))
            && (this.getEmail() == null ? other.getEmail() == null : this.getEmail().equals(other.getEmail()))
            && (this.getSicnum() == null ? other.getSicnum() == null : this.getSicnum().equals(other.getSicnum()))
            && (this.getPayway() == null ? other.getPayway() == null : this.getPayway().equals(other.getPayway()))
            && (this.getEffective() == null ? other.getEffective() == null : this.getEffective().equals(other.getEffective()))
            && (this.getAddress() == null ? other.getAddress() == null : this.getAddress().equals(other.getAddress()))
            && (this.getBeizhu() == null ? other.getBeizhu() == null : this.getBeizhu().equals(other.getBeizhu()))
            && (this.getSysnum() == null ? other.getSysnum() == null : this.getSysnum().equals(other.getSysnum()))
            && (this.getLasttime() == null ? other.getLasttime() == null : this.getLasttime().equals(other.getLasttime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getClientnum() == null) ? 0 : getClientnum().hashCode());
        result = prime * result + ((getClientname() == null) ? 0 : getClientname().hashCode());
        result = prime * result + ((getClientattr() == null) ? 0 : getClientattr().hashCode());
        result = prime * result + ((getCrl() == null) ? 0 : getCrl().hashCode());
        result = prime * result + ((getGupiaodm() == null) ? 0 : getGupiaodm().hashCode());
        result = prime * result + ((getLeader() == null) ? 0 : getLeader().hashCode());
        result = prime * result + ((getOwner() == null) ? 0 : getOwner().hashCode());
        result = prime * result + ((getEmployesnum() == null) ? 0 : getEmployesnum().hashCode());
        result = prime * result + ((getIndustrynum() == null) ? 0 : getIndustrynum().hashCode());
        result = prime * result + ((getClientkinds() == null) ? 0 : getClientkinds().hashCode());
        result = prime * result + ((getClientstate() == null) ? 0 : getClientstate().hashCode());
        result = prime * result + ((getClientsource() == null) ? 0 : getClientsource().hashCode());
        result = prime * result + ((getChargenum() == null) ? 0 : getChargenum().hashCode());
        result = prime * result + ((getTelphone() == null) ? 0 : getTelphone().hashCode());
        result = prime * result + ((getPhonenum() == null) ? 0 : getPhonenum().hashCode());
        result = prime * result + ((getFax() == null) ? 0 : getFax().hashCode());
        result = prime * result + ((getBank() == null) ? 0 : getBank().hashCode());
        result = prime * result + ((getBankaccount() == null) ? 0 : getBankaccount().hashCode());
        result = prime * result + ((getNextconttime() == null) ? 0 : getNextconttime().hashCode());
        result = prime * result + ((getEmail() == null) ? 0 : getEmail().hashCode());
        result = prime * result + ((getSicnum() == null) ? 0 : getSicnum().hashCode());
        result = prime * result + ((getPayway() == null) ? 0 : getPayway().hashCode());
        result = prime * result + ((getEffective() == null) ? 0 : getEffective().hashCode());
        result = prime * result + ((getAddress() == null) ? 0 : getAddress().hashCode());
        result = prime * result + ((getBeizhu() == null) ? 0 : getBeizhu().hashCode());
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
        sb.append(", clientnum=").append(clientnum);
        sb.append(", clientname=").append(clientname);
        sb.append(", clientattr=").append(clientattr);
        sb.append(", crl=").append(crl);
        sb.append(", gupiaodm=").append(gupiaodm);
        sb.append(", leader=").append(leader);
        sb.append(", owner=").append(owner);
        sb.append(", employesnum=").append(employesnum);
        sb.append(", industrynum=").append(industrynum);
        sb.append(", clientkinds=").append(clientkinds);
        sb.append(", clientstate=").append(clientstate);
        sb.append(", clientsource=").append(clientsource);
        sb.append(", chargenum=").append(chargenum);
        sb.append(", telphone=").append(telphone);
        sb.append(", phonenum=").append(phonenum);
        sb.append(", fax=").append(fax);
        sb.append(", bank=").append(bank);
        sb.append(", bankaccount=").append(bankaccount);
        sb.append(", nextconttime=").append(nextconttime);
        sb.append(", email=").append(email);
        sb.append(", sicnum=").append(sicnum);
        sb.append(", payway=").append(payway);
        sb.append(", effective=").append(effective);
        sb.append(", address=").append(address);
        sb.append(", beizhu=").append(beizhu);
        sb.append(", sysnum=").append(sysnum);
        sb.append(", lasttime=").append(lasttime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}