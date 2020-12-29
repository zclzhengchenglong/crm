package com.sc.spring.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * SYS_USERMES
 * @author 
 */
public class SysUsermes implements Serializable {
    private Long workerId;

    private String workerName;

    private String workerSex;

    private String workerPhoto;

    private String workerIdcard;

    private String homeAddress;

    private String nowAddress;

    private String workerEdu;

    private String politcOutlook;

    private String school;

    private String phone;

    private String onlineContact;

    private String contactinfo;

    private String examineState;

    private Long postId;

    private String remarks;

    private Long companyId;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date lastchangeTime;

    private static final long serialVersionUID = 1L;

    public Long getWorkerId() {
        return workerId;
    }

    public void setWorkerId(Long workerId) {
        this.workerId = workerId;
    }

    public String getWorkerName() {
        return workerName;
    }

    public void setWorkerName(String workerName) {
        this.workerName = workerName;
    }

    public String getWorkerSex() {
        return workerSex;
    }

    public void setWorkerSex(String workerSex) {
        this.workerSex = workerSex;
    }

    public String getWorkerPhoto() {
        return workerPhoto;
    }

    public void setWorkerPhoto(String workerPhoto) {
        this.workerPhoto = workerPhoto;
    }

    public String getWorkerIdcard() {
        return workerIdcard;
    }

    public void setWorkerIdcard(String workerIdcard) {
        this.workerIdcard = workerIdcard;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public String getNowAddress() {
        return nowAddress;
    }

    public void setNowAddress(String nowAddress) {
        this.nowAddress = nowAddress;
    }

    public String getWorkerEdu() {
        return workerEdu;
    }

    public void setWorkerEdu(String workerEdu) {
        this.workerEdu = workerEdu;
    }

    public String getPolitcOutlook() {
        return politcOutlook;
    }

    public void setPolitcOutlook(String politcOutlook) {
        this.politcOutlook = politcOutlook;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getOnlineContact() {
        return onlineContact;
    }

    public void setOnlineContact(String onlineContact) {
        this.onlineContact = onlineContact;
    }

    public String getContactinfo() {
        return contactinfo;
    }

    public void setContactinfo(String contactinfo) {
        this.contactinfo = contactinfo;
    }

    public String getExamineState() {
        return examineState;
    }

    public void setExamineState(String examineState) {
        this.examineState = examineState;
    }

    public Long getPostId() {
        return postId;
    }

    public void setPostId(Long postId) {
        this.postId = postId;
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
        SysUsermes other = (SysUsermes) that;
        return (this.getWorkerId() == null ? other.getWorkerId() == null : this.getWorkerId().equals(other.getWorkerId()))
            && (this.getWorkerName() == null ? other.getWorkerName() == null : this.getWorkerName().equals(other.getWorkerName()))
            && (this.getWorkerSex() == null ? other.getWorkerSex() == null : this.getWorkerSex().equals(other.getWorkerSex()))
            && (this.getWorkerPhoto() == null ? other.getWorkerPhoto() == null : this.getWorkerPhoto().equals(other.getWorkerPhoto()))
            && (this.getWorkerIdcard() == null ? other.getWorkerIdcard() == null : this.getWorkerIdcard().equals(other.getWorkerIdcard()))
            && (this.getHomeAddress() == null ? other.getHomeAddress() == null : this.getHomeAddress().equals(other.getHomeAddress()))
            && (this.getNowAddress() == null ? other.getNowAddress() == null : this.getNowAddress().equals(other.getNowAddress()))
            && (this.getWorkerEdu() == null ? other.getWorkerEdu() == null : this.getWorkerEdu().equals(other.getWorkerEdu()))
            && (this.getPolitcOutlook() == null ? other.getPolitcOutlook() == null : this.getPolitcOutlook().equals(other.getPolitcOutlook()))
            && (this.getSchool() == null ? other.getSchool() == null : this.getSchool().equals(other.getSchool()))
            && (this.getPhone() == null ? other.getPhone() == null : this.getPhone().equals(other.getPhone()))
            && (this.getOnlineContact() == null ? other.getOnlineContact() == null : this.getOnlineContact().equals(other.getOnlineContact()))
            && (this.getContactinfo() == null ? other.getContactinfo() == null : this.getContactinfo().equals(other.getContactinfo()))
            && (this.getExamineState() == null ? other.getExamineState() == null : this.getExamineState().equals(other.getExamineState()))
            && (this.getPostId() == null ? other.getPostId() == null : this.getPostId().equals(other.getPostId()))
            && (this.getRemarks() == null ? other.getRemarks() == null : this.getRemarks().equals(other.getRemarks()))
            && (this.getCompanyId() == null ? other.getCompanyId() == null : this.getCompanyId().equals(other.getCompanyId()))
            && (this.getLastchangeTime() == null ? other.getLastchangeTime() == null : this.getLastchangeTime().equals(other.getLastchangeTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getWorkerId() == null) ? 0 : getWorkerId().hashCode());
        result = prime * result + ((getWorkerName() == null) ? 0 : getWorkerName().hashCode());
        result = prime * result + ((getWorkerSex() == null) ? 0 : getWorkerSex().hashCode());
        result = prime * result + ((getWorkerPhoto() == null) ? 0 : getWorkerPhoto().hashCode());
        result = prime * result + ((getWorkerIdcard() == null) ? 0 : getWorkerIdcard().hashCode());
        result = prime * result + ((getHomeAddress() == null) ? 0 : getHomeAddress().hashCode());
        result = prime * result + ((getNowAddress() == null) ? 0 : getNowAddress().hashCode());
        result = prime * result + ((getWorkerEdu() == null) ? 0 : getWorkerEdu().hashCode());
        result = prime * result + ((getPolitcOutlook() == null) ? 0 : getPolitcOutlook().hashCode());
        result = prime * result + ((getSchool() == null) ? 0 : getSchool().hashCode());
        result = prime * result + ((getPhone() == null) ? 0 : getPhone().hashCode());
        result = prime * result + ((getOnlineContact() == null) ? 0 : getOnlineContact().hashCode());
        result = prime * result + ((getContactinfo() == null) ? 0 : getContactinfo().hashCode());
        result = prime * result + ((getExamineState() == null) ? 0 : getExamineState().hashCode());
        result = prime * result + ((getPostId() == null) ? 0 : getPostId().hashCode());
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
        sb.append(", workerId=").append(workerId);
        sb.append(", workerName=").append(workerName);
        sb.append(", workerSex=").append(workerSex);
        sb.append(", workerPhoto=").append(workerPhoto);
        sb.append(", workerIdcard=").append(workerIdcard);
        sb.append(", homeAddress=").append(homeAddress);
        sb.append(", nowAddress=").append(nowAddress);
        sb.append(", workerEdu=").append(workerEdu);
        sb.append(", politcOutlook=").append(politcOutlook);
        sb.append(", school=").append(school);
        sb.append(", phone=").append(phone);
        sb.append(", onlineContact=").append(onlineContact);
        sb.append(", contactinfo=").append(contactinfo);
        sb.append(", examineState=").append(examineState);
        sb.append(", postId=").append(postId);
        sb.append(", remarks=").append(remarks);
        sb.append(", companyId=").append(companyId);
        sb.append(", lastchangeTime=").append(lastchangeTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}