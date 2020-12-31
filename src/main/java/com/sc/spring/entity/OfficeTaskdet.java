package com.sc.spring.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * OFFICE_TASKDET
 * @author 
 */
public class OfficeTaskdet implements Serializable {

    private  OfficeTasktest officeTasktest;//配置任务的发布详情

    public OfficeTasktest getOfficeTasktest() {
        return officeTasktest;
    }

    public void setOfficeTasktest(OfficeTasktest officeTasktest) {
        this.officeTasktest = officeTasktest;
    }

    private String userName;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    private Long officeId;

    private String taskId;

    private String acceptUserNumber;

    private String itIsCompeleted;

    private String state;

    private String companyNumber;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date lastModificationTime;

    private static final long serialVersionUID = 1L;

    public Long getOfficeId() {
        return officeId;
    }

    public void setOfficeId(Long officeId) {
        this.officeId = officeId;
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public String getAcceptUserNumber() {
        return acceptUserNumber;
    }

    public void setAcceptUserNumber(String acceptUserNumber) {
        this.acceptUserNumber = acceptUserNumber;
    }

    public String getItIsCompeleted() {
        return itIsCompeleted;
    }

    public void setItIsCompeleted(String itIsCompeleted) {
        this.itIsCompeleted = itIsCompeleted;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCompanyNumber() {
        return companyNumber;
    }

    public void setCompanyNumber(String companyNumber) {
        this.companyNumber = companyNumber;
    }

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    public Date getLastModificationTime() {
        return lastModificationTime;
    }


    public void setLastModificationTime(Date lastModificationTime) {
        this.lastModificationTime = lastModificationTime;
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
        OfficeTaskdet other = (OfficeTaskdet) that;
        return (this.getOfficeId() == null ? other.getOfficeId() == null : this.getOfficeId().equals(other.getOfficeId()))
            && (this.getTaskId() == null ? other.getTaskId() == null : this.getTaskId().equals(other.getTaskId()))
            && (this.getAcceptUserNumber() == null ? other.getAcceptUserNumber() == null : this.getAcceptUserNumber().equals(other.getAcceptUserNumber()))
            && (this.getItIsCompeleted() == null ? other.getItIsCompeleted() == null : this.getItIsCompeleted().equals(other.getItIsCompeleted()))
            && (this.getState() == null ? other.getState() == null : this.getState().equals(other.getState()))
            && (this.getCompanyNumber() == null ? other.getCompanyNumber() == null : this.getCompanyNumber().equals(other.getCompanyNumber()))
            && (this.getLastModificationTime() == null ? other.getLastModificationTime() == null : this.getLastModificationTime().equals(other.getLastModificationTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOfficeId() == null) ? 0 : getOfficeId().hashCode());
        result = prime * result + ((getTaskId() == null) ? 0 : getTaskId().hashCode());
        result = prime * result + ((getAcceptUserNumber() == null) ? 0 : getAcceptUserNumber().hashCode());
        result = prime * result + ((getItIsCompeleted() == null) ? 0 : getItIsCompeleted().hashCode());
        result = prime * result + ((getState() == null) ? 0 : getState().hashCode());
        result = prime * result + ((getCompanyNumber() == null) ? 0 : getCompanyNumber().hashCode());
        result = prime * result + ((getLastModificationTime() == null) ? 0 : getLastModificationTime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", officeId=").append(officeId);
        sb.append(", taskId=").append(taskId);
        sb.append(", acceptUserNumber=").append(acceptUserNumber);
        sb.append(", itIsCompeleted=").append(itIsCompeleted);
        sb.append(", state=").append(state);
        sb.append(", companyNumber=").append(companyNumber);
        sb.append(", lastModificationTime=").append(lastModificationTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}