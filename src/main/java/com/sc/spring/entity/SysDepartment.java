package com.sc.spring.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * SYS_DEPARTMENT
 * @author 
 */
public class SysDepartment implements Serializable {
    private Long departId;

    private String departmentName;

    private String remarks;

    private Long companyId;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date lastchangeTime;

    private static final long serialVersionUID = 1L;

    public Long getDepartId() {
        return departId;
    }

    public void setDepartId(Long departId) {
        this.departId = departId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")

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
        SysDepartment other = (SysDepartment) that;
        return (this.getDepartId() == null ? other.getDepartId() == null : this.getDepartId().equals(other.getDepartId()))
            && (this.getDepartmentName() == null ? other.getDepartmentName() == null : this.getDepartmentName().equals(other.getDepartmentName()))
            && (this.getRemarks() == null ? other.getRemarks() == null : this.getRemarks().equals(other.getRemarks()))
            && (this.getCompanyId() == null ? other.getCompanyId() == null : this.getCompanyId().equals(other.getCompanyId()))
            && (this.getLastchangeTime() == null ? other.getLastchangeTime() == null : this.getLastchangeTime().equals(other.getLastchangeTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getDepartId() == null) ? 0 : getDepartId().hashCode());
        result = prime * result + ((getDepartmentName() == null) ? 0 : getDepartmentName().hashCode());
        result = prime * result + ((getRemarks() == null) ? 0 : getRemarks().hashCode());
        result = prime * result + ((getCompanyId() == null) ? 0 : getCompanyId().hashCode());
        result = prime * result + ((getLastchangeTime() == null) ? 0 : getLastchangeTime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", departId=").append(departId);
        sb.append(", departmentName=").append(departmentName);
        sb.append(", remarks=").append(remarks);
        sb.append(", companyId=").append(companyId);
        sb.append(", lastchangeTime=").append(lastchangeTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}