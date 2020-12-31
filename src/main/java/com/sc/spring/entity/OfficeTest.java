package com.sc.spring.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * OFFICE_TEST
 * @author 
 */
public class OfficeTest implements Serializable {
    private String indexId;

    private String assessmentIndex;

    private String remarks;

    private String companyNumber;


    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date lastModificationTime;

    private static final long serialVersionUID = 1L;

    public String getIndexId() {
        return indexId;
    }

    public void setIndexId(String indexId) {
        this.indexId = indexId;
    }

    public String getAssessmentIndex() {
        return assessmentIndex;
    }

    public void setAssessmentIndex(String assessmentIndex) {
        this.assessmentIndex = assessmentIndex;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
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
        OfficeTest other = (OfficeTest) that;
        return (this.getIndexId() == null ? other.getIndexId() == null : this.getIndexId().equals(other.getIndexId()))
            && (this.getAssessmentIndex() == null ? other.getAssessmentIndex() == null : this.getAssessmentIndex().equals(other.getAssessmentIndex()))
            && (this.getRemarks() == null ? other.getRemarks() == null : this.getRemarks().equals(other.getRemarks()))
            && (this.getCompanyNumber() == null ? other.getCompanyNumber() == null : this.getCompanyNumber().equals(other.getCompanyNumber()))
            && (this.getLastModificationTime() == null ? other.getLastModificationTime() == null : this.getLastModificationTime().equals(other.getLastModificationTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getIndexId() == null) ? 0 : getIndexId().hashCode());
        result = prime * result + ((getAssessmentIndex() == null) ? 0 : getAssessmentIndex().hashCode());
        result = prime * result + ((getRemarks() == null) ? 0 : getRemarks().hashCode());
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
        sb.append(", indexId=").append(indexId);
        sb.append(", assessmentIndex=").append(assessmentIndex);
        sb.append(", remarks=").append(remarks);
        sb.append(", companyNumber=").append(companyNumber);
        sb.append(", lastModificationTime=").append(lastModificationTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}