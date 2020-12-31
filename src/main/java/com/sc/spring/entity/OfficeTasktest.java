package com.sc.spring.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * OFFICE_TASKTEST
 * @author 
 */
public class OfficeTasktest implements Serializable {
    private String taskId;

    private String taskTitle;

    private String taskSpecificContent;

    private String taskPublisher;

    private String assessmentIndex;

    private String taskStartTime;

    private String taskEndTime;

    private String companyNumber;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date lastModificationTime;

    private String recevier;

    public String getRecevier() {
        return recevier;
    }

    public void setRecevier(String recevier) {
        this.recevier = recevier;
    }

    private static final long serialVersionUID = 1L;

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public String getTaskTitle() {
        return taskTitle;
    }

    public void setTaskTitle(String taskTitle) {
        this.taskTitle = taskTitle;
    }

    public String getTaskSpecificContent() {
        return taskSpecificContent;
    }

    public void setTaskSpecificContent(String taskSpecificContent) {
        this.taskSpecificContent = taskSpecificContent;
    }

    public String getTaskPublisher() {
        return taskPublisher;
    }

    public void setTaskPublisher(String taskPublisher) {
        this.taskPublisher = taskPublisher;
    }

    public String getAssessmentIndex() {
        return assessmentIndex;
    }

    public void setAssessmentIndex(String assessmentIndex) {
        this.assessmentIndex = assessmentIndex;
    }

    public String getTaskStartTime() {
        return taskStartTime;
    }

    public void setTaskStartTime(String taskStartTime) {
        this.taskStartTime = taskStartTime;
    }

    public String getTaskEndTime() {
        return taskEndTime;
    }

    public void setTaskEndTime(String taskEndTime) {
        this.taskEndTime = taskEndTime;
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
        OfficeTasktest other = (OfficeTasktest) that;
        return (this.getTaskId() == null ? other.getTaskId() == null : this.getTaskId().equals(other.getTaskId()))
            && (this.getTaskTitle() == null ? other.getTaskTitle() == null : this.getTaskTitle().equals(other.getTaskTitle()))
            && (this.getTaskSpecificContent() == null ? other.getTaskSpecificContent() == null : this.getTaskSpecificContent().equals(other.getTaskSpecificContent()))
            && (this.getTaskPublisher() == null ? other.getTaskPublisher() == null : this.getTaskPublisher().equals(other.getTaskPublisher()))
            && (this.getAssessmentIndex() == null ? other.getAssessmentIndex() == null : this.getAssessmentIndex().equals(other.getAssessmentIndex()))
            && (this.getTaskStartTime() == null ? other.getTaskStartTime() == null : this.getTaskStartTime().equals(other.getTaskStartTime()))
            && (this.getTaskEndTime() == null ? other.getTaskEndTime() == null : this.getTaskEndTime().equals(other.getTaskEndTime()))
            && (this.getCompanyNumber() == null ? other.getCompanyNumber() == null : this.getCompanyNumber().equals(other.getCompanyNumber()))
            && (this.getLastModificationTime() == null ? other.getLastModificationTime() == null : this.getLastModificationTime().equals(other.getLastModificationTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTaskId() == null) ? 0 : getTaskId().hashCode());
        result = prime * result + ((getTaskTitle() == null) ? 0 : getTaskTitle().hashCode());
        result = prime * result + ((getTaskSpecificContent() == null) ? 0 : getTaskSpecificContent().hashCode());
        result = prime * result + ((getTaskPublisher() == null) ? 0 : getTaskPublisher().hashCode());
        result = prime * result + ((getAssessmentIndex() == null) ? 0 : getAssessmentIndex().hashCode());
        result = prime * result + ((getTaskStartTime() == null) ? 0 : getTaskStartTime().hashCode());
        result = prime * result + ((getTaskEndTime() == null) ? 0 : getTaskEndTime().hashCode());
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
        sb.append(", taskId=").append(taskId);
        sb.append(", taskTitle=").append(taskTitle);
        sb.append(", taskSpecificContent=").append(taskSpecificContent);
        sb.append(", taskPublisher=").append(taskPublisher);
        sb.append(", assessmentIndex=").append(assessmentIndex);
        sb.append(", taskStartTime=").append(taskStartTime);
        sb.append(", taskEndTime=").append(taskEndTime);
        sb.append(", companyNumber=").append(companyNumber);
        sb.append(", lastModificationTime=").append(lastModificationTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}