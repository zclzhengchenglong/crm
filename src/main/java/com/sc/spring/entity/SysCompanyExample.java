package com.sc.spring.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysCompanyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysCompanyExample() {
        oredCriteria = new ArrayList<>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andSysCompanyIdIsNull() {
            addCriterion("SYS_COMPANY_ID is null");
            return (Criteria) this;
        }

        public Criteria andSysCompanyIdIsNotNull() {
            addCriterion("SYS_COMPANY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSysCompanyIdEqualTo(BigDecimal value) {
            addCriterion("SYS_COMPANY_ID =", value, "sysCompanyId");
            return (Criteria) this;
        }

        public Criteria andSysCompanyIdNotEqualTo(BigDecimal value) {
            addCriterion("SYS_COMPANY_ID <>", value, "sysCompanyId");
            return (Criteria) this;
        }

        public Criteria andSysCompanyIdGreaterThan(BigDecimal value) {
            addCriterion("SYS_COMPANY_ID >", value, "sysCompanyId");
            return (Criteria) this;
        }

        public Criteria andSysCompanyIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SYS_COMPANY_ID >=", value, "sysCompanyId");
            return (Criteria) this;
        }

        public Criteria andSysCompanyIdLessThan(BigDecimal value) {
            addCriterion("SYS_COMPANY_ID <", value, "sysCompanyId");
            return (Criteria) this;
        }

        public Criteria andSysCompanyIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SYS_COMPANY_ID <=", value, "sysCompanyId");
            return (Criteria) this;
        }

        public Criteria andSysCompanyIdIn(List<BigDecimal> values) {
            addCriterion("SYS_COMPANY_ID in", values, "sysCompanyId");
            return (Criteria) this;
        }

        public Criteria andSysCompanyIdNotIn(List<BigDecimal> values) {
            addCriterion("SYS_COMPANY_ID not in", values, "sysCompanyId");
            return (Criteria) this;
        }

        public Criteria andSysCompanyIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SYS_COMPANY_ID between", value1, value2, "sysCompanyId");
            return (Criteria) this;
        }

        public Criteria andSysCompanyIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SYS_COMPANY_ID not between", value1, value2, "sysCompanyId");
            return (Criteria) this;
        }

        public Criteria andSysCompanyNameIsNull() {
            addCriterion("SYS_COMPANY_NAME is null");
            return (Criteria) this;
        }

        public Criteria andSysCompanyNameIsNotNull() {
            addCriterion("SYS_COMPANY_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andSysCompanyNameEqualTo(String value) {
            addCriterion("SYS_COMPANY_NAME =", value, "sysCompanyName");
            return (Criteria) this;
        }

        public Criteria andSysCompanyNameNotEqualTo(String value) {
            addCriterion("SYS_COMPANY_NAME <>", value, "sysCompanyName");
            return (Criteria) this;
        }

        public Criteria andSysCompanyNameGreaterThan(String value) {
            addCriterion("SYS_COMPANY_NAME >", value, "sysCompanyName");
            return (Criteria) this;
        }

        public Criteria andSysCompanyNameGreaterThanOrEqualTo(String value) {
            addCriterion("SYS_COMPANY_NAME >=", value, "sysCompanyName");
            return (Criteria) this;
        }

        public Criteria andSysCompanyNameLessThan(String value) {
            addCriterion("SYS_COMPANY_NAME <", value, "sysCompanyName");
            return (Criteria) this;
        }

        public Criteria andSysCompanyNameLessThanOrEqualTo(String value) {
            addCriterion("SYS_COMPANY_NAME <=", value, "sysCompanyName");
            return (Criteria) this;
        }

        public Criteria andSysCompanyNameLike(String value) {
            addCriterion("SYS_COMPANY_NAME like", value, "sysCompanyName");
            return (Criteria) this;
        }

        public Criteria andSysCompanyNameNotLike(String value) {
            addCriterion("SYS_COMPANY_NAME not like", value, "sysCompanyName");
            return (Criteria) this;
        }

        public Criteria andSysCompanyNameIn(List<String> values) {
            addCriterion("SYS_COMPANY_NAME in", values, "sysCompanyName");
            return (Criteria) this;
        }

        public Criteria andSysCompanyNameNotIn(List<String> values) {
            addCriterion("SYS_COMPANY_NAME not in", values, "sysCompanyName");
            return (Criteria) this;
        }

        public Criteria andSysCompanyNameBetween(String value1, String value2) {
            addCriterion("SYS_COMPANY_NAME between", value1, value2, "sysCompanyName");
            return (Criteria) this;
        }

        public Criteria andSysCompanyNameNotBetween(String value1, String value2) {
            addCriterion("SYS_COMPANY_NAME not between", value1, value2, "sysCompanyName");
            return (Criteria) this;
        }

        public Criteria andSysCompanyDmIsNull() {
            addCriterion("SYS_COMPANY_DM is null");
            return (Criteria) this;
        }

        public Criteria andSysCompanyDmIsNotNull() {
            addCriterion("SYS_COMPANY_DM is not null");
            return (Criteria) this;
        }

        public Criteria andSysCompanyDmEqualTo(String value) {
            addCriterion("SYS_COMPANY_DM =", value, "sysCompanyDm");
            return (Criteria) this;
        }

        public Criteria andSysCompanyDmNotEqualTo(String value) {
            addCriterion("SYS_COMPANY_DM <>", value, "sysCompanyDm");
            return (Criteria) this;
        }

        public Criteria andSysCompanyDmGreaterThan(String value) {
            addCriterion("SYS_COMPANY_DM >", value, "sysCompanyDm");
            return (Criteria) this;
        }

        public Criteria andSysCompanyDmGreaterThanOrEqualTo(String value) {
            addCriterion("SYS_COMPANY_DM >=", value, "sysCompanyDm");
            return (Criteria) this;
        }

        public Criteria andSysCompanyDmLessThan(String value) {
            addCriterion("SYS_COMPANY_DM <", value, "sysCompanyDm");
            return (Criteria) this;
        }

        public Criteria andSysCompanyDmLessThanOrEqualTo(String value) {
            addCriterion("SYS_COMPANY_DM <=", value, "sysCompanyDm");
            return (Criteria) this;
        }

        public Criteria andSysCompanyDmLike(String value) {
            addCriterion("SYS_COMPANY_DM like", value, "sysCompanyDm");
            return (Criteria) this;
        }

        public Criteria andSysCompanyDmNotLike(String value) {
            addCriterion("SYS_COMPANY_DM not like", value, "sysCompanyDm");
            return (Criteria) this;
        }

        public Criteria andSysCompanyDmIn(List<String> values) {
            addCriterion("SYS_COMPANY_DM in", values, "sysCompanyDm");
            return (Criteria) this;
        }

        public Criteria andSysCompanyDmNotIn(List<String> values) {
            addCriterion("SYS_COMPANY_DM not in", values, "sysCompanyDm");
            return (Criteria) this;
        }

        public Criteria andSysCompanyDmBetween(String value1, String value2) {
            addCriterion("SYS_COMPANY_DM between", value1, value2, "sysCompanyDm");
            return (Criteria) this;
        }

        public Criteria andSysCompanyDmNotBetween(String value1, String value2) {
            addCriterion("SYS_COMPANY_DM not between", value1, value2, "sysCompanyDm");
            return (Criteria) this;
        }

        public Criteria andSysCompanyIsNull() {
            addCriterion("SYS_COMPANY is null");
            return (Criteria) this;
        }

        public Criteria andSysCompanyIsNotNull() {
            addCriterion("SYS_COMPANY is not null");
            return (Criteria) this;
        }

        public Criteria andSysCompanyEqualTo(String value) {
            addCriterion("SYS_COMPANY =", value, "sysCompany");
            return (Criteria) this;
        }

        public Criteria andSysCompanyNotEqualTo(String value) {
            addCriterion("SYS_COMPANY <>", value, "sysCompany");
            return (Criteria) this;
        }

        public Criteria andSysCompanyGreaterThan(String value) {
            addCriterion("SYS_COMPANY >", value, "sysCompany");
            return (Criteria) this;
        }

        public Criteria andSysCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("SYS_COMPANY >=", value, "sysCompany");
            return (Criteria) this;
        }

        public Criteria andSysCompanyLessThan(String value) {
            addCriterion("SYS_COMPANY <", value, "sysCompany");
            return (Criteria) this;
        }

        public Criteria andSysCompanyLessThanOrEqualTo(String value) {
            addCriterion("SYS_COMPANY <=", value, "sysCompany");
            return (Criteria) this;
        }

        public Criteria andSysCompanyLike(String value) {
            addCriterion("SYS_COMPANY like", value, "sysCompany");
            return (Criteria) this;
        }

        public Criteria andSysCompanyNotLike(String value) {
            addCriterion("SYS_COMPANY not like", value, "sysCompany");
            return (Criteria) this;
        }

        public Criteria andSysCompanyIn(List<String> values) {
            addCriterion("SYS_COMPANY in", values, "sysCompany");
            return (Criteria) this;
        }

        public Criteria andSysCompanyNotIn(List<String> values) {
            addCriterion("SYS_COMPANY not in", values, "sysCompany");
            return (Criteria) this;
        }

        public Criteria andSysCompanyBetween(String value1, String value2) {
            addCriterion("SYS_COMPANY between", value1, value2, "sysCompany");
            return (Criteria) this;
        }

        public Criteria andSysCompanyNotBetween(String value1, String value2) {
            addCriterion("SYS_COMPANY not between", value1, value2, "sysCompany");
            return (Criteria) this;
        }

        public Criteria andSysCompanyDhIsNull() {
            addCriterion("SYS_COMPANY_DH is null");
            return (Criteria) this;
        }

        public Criteria andSysCompanyDhIsNotNull() {
            addCriterion("SYS_COMPANY_DH is not null");
            return (Criteria) this;
        }

        public Criteria andSysCompanyDhEqualTo(String value) {
            addCriterion("SYS_COMPANY_DH =", value, "sysCompanyDh");
            return (Criteria) this;
        }

        public Criteria andSysCompanyDhNotEqualTo(String value) {
            addCriterion("SYS_COMPANY_DH <>", value, "sysCompanyDh");
            return (Criteria) this;
        }

        public Criteria andSysCompanyDhGreaterThan(String value) {
            addCriterion("SYS_COMPANY_DH >", value, "sysCompanyDh");
            return (Criteria) this;
        }

        public Criteria andSysCompanyDhGreaterThanOrEqualTo(String value) {
            addCriterion("SYS_COMPANY_DH >=", value, "sysCompanyDh");
            return (Criteria) this;
        }

        public Criteria andSysCompanyDhLessThan(String value) {
            addCriterion("SYS_COMPANY_DH <", value, "sysCompanyDh");
            return (Criteria) this;
        }

        public Criteria andSysCompanyDhLessThanOrEqualTo(String value) {
            addCriterion("SYS_COMPANY_DH <=", value, "sysCompanyDh");
            return (Criteria) this;
        }

        public Criteria andSysCompanyDhLike(String value) {
            addCriterion("SYS_COMPANY_DH like", value, "sysCompanyDh");
            return (Criteria) this;
        }

        public Criteria andSysCompanyDhNotLike(String value) {
            addCriterion("SYS_COMPANY_DH not like", value, "sysCompanyDh");
            return (Criteria) this;
        }

        public Criteria andSysCompanyDhIn(List<String> values) {
            addCriterion("SYS_COMPANY_DH in", values, "sysCompanyDh");
            return (Criteria) this;
        }

        public Criteria andSysCompanyDhNotIn(List<String> values) {
            addCriterion("SYS_COMPANY_DH not in", values, "sysCompanyDh");
            return (Criteria) this;
        }

        public Criteria andSysCompanyDhBetween(String value1, String value2) {
            addCriterion("SYS_COMPANY_DH between", value1, value2, "sysCompanyDh");
            return (Criteria) this;
        }

        public Criteria andSysCompanyDhNotBetween(String value1, String value2) {
            addCriterion("SYS_COMPANY_DH not between", value1, value2, "sysCompanyDh");
            return (Criteria) this;
        }

        public Criteria andSysCompanyHongIsNull() {
            addCriterion("SYS_COMPANY_HONG is null");
            return (Criteria) this;
        }

        public Criteria andSysCompanyHongIsNotNull() {
            addCriterion("SYS_COMPANY_HONG is not null");
            return (Criteria) this;
        }

        public Criteria andSysCompanyHongEqualTo(String value) {
            addCriterion("SYS_COMPANY_HONG =", value, "sysCompanyHong");
            return (Criteria) this;
        }

        public Criteria andSysCompanyHongNotEqualTo(String value) {
            addCriterion("SYS_COMPANY_HONG <>", value, "sysCompanyHong");
            return (Criteria) this;
        }

        public Criteria andSysCompanyHongGreaterThan(String value) {
            addCriterion("SYS_COMPANY_HONG >", value, "sysCompanyHong");
            return (Criteria) this;
        }

        public Criteria andSysCompanyHongGreaterThanOrEqualTo(String value) {
            addCriterion("SYS_COMPANY_HONG >=", value, "sysCompanyHong");
            return (Criteria) this;
        }

        public Criteria andSysCompanyHongLessThan(String value) {
            addCriterion("SYS_COMPANY_HONG <", value, "sysCompanyHong");
            return (Criteria) this;
        }

        public Criteria andSysCompanyHongLessThanOrEqualTo(String value) {
            addCriterion("SYS_COMPANY_HONG <=", value, "sysCompanyHong");
            return (Criteria) this;
        }

        public Criteria andSysCompanyHongLike(String value) {
            addCriterion("SYS_COMPANY_HONG like", value, "sysCompanyHong");
            return (Criteria) this;
        }

        public Criteria andSysCompanyHongNotLike(String value) {
            addCriterion("SYS_COMPANY_HONG not like", value, "sysCompanyHong");
            return (Criteria) this;
        }

        public Criteria andSysCompanyHongIn(List<String> values) {
            addCriterion("SYS_COMPANY_HONG in", values, "sysCompanyHong");
            return (Criteria) this;
        }

        public Criteria andSysCompanyHongNotIn(List<String> values) {
            addCriterion("SYS_COMPANY_HONG not in", values, "sysCompanyHong");
            return (Criteria) this;
        }

        public Criteria andSysCompanyHongBetween(String value1, String value2) {
            addCriterion("SYS_COMPANY_HONG between", value1, value2, "sysCompanyHong");
            return (Criteria) this;
        }

        public Criteria andSysCompanyHongNotBetween(String value1, String value2) {
            addCriterion("SYS_COMPANY_HONG not between", value1, value2, "sysCompanyHong");
            return (Criteria) this;
        }

        public Criteria andSysCompanyPhoneIsNull() {
            addCriterion("SYS_COMPANY_PHONE is null");
            return (Criteria) this;
        }

        public Criteria andSysCompanyPhoneIsNotNull() {
            addCriterion("SYS_COMPANY_PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andSysCompanyPhoneEqualTo(String value) {
            addCriterion("SYS_COMPANY_PHONE =", value, "sysCompanyPhone");
            return (Criteria) this;
        }

        public Criteria andSysCompanyPhoneNotEqualTo(String value) {
            addCriterion("SYS_COMPANY_PHONE <>", value, "sysCompanyPhone");
            return (Criteria) this;
        }

        public Criteria andSysCompanyPhoneGreaterThan(String value) {
            addCriterion("SYS_COMPANY_PHONE >", value, "sysCompanyPhone");
            return (Criteria) this;
        }

        public Criteria andSysCompanyPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("SYS_COMPANY_PHONE >=", value, "sysCompanyPhone");
            return (Criteria) this;
        }

        public Criteria andSysCompanyPhoneLessThan(String value) {
            addCriterion("SYS_COMPANY_PHONE <", value, "sysCompanyPhone");
            return (Criteria) this;
        }

        public Criteria andSysCompanyPhoneLessThanOrEqualTo(String value) {
            addCriterion("SYS_COMPANY_PHONE <=", value, "sysCompanyPhone");
            return (Criteria) this;
        }

        public Criteria andSysCompanyPhoneLike(String value) {
            addCriterion("SYS_COMPANY_PHONE like", value, "sysCompanyPhone");
            return (Criteria) this;
        }

        public Criteria andSysCompanyPhoneNotLike(String value) {
            addCriterion("SYS_COMPANY_PHONE not like", value, "sysCompanyPhone");
            return (Criteria) this;
        }

        public Criteria andSysCompanyPhoneIn(List<String> values) {
            addCriterion("SYS_COMPANY_PHONE in", values, "sysCompanyPhone");
            return (Criteria) this;
        }

        public Criteria andSysCompanyPhoneNotIn(List<String> values) {
            addCriterion("SYS_COMPANY_PHONE not in", values, "sysCompanyPhone");
            return (Criteria) this;
        }

        public Criteria andSysCompanyPhoneBetween(String value1, String value2) {
            addCriterion("SYS_COMPANY_PHONE between", value1, value2, "sysCompanyPhone");
            return (Criteria) this;
        }

        public Criteria andSysCompanyPhoneNotBetween(String value1, String value2) {
            addCriterion("SYS_COMPANY_PHONE not between", value1, value2, "sysCompanyPhone");
            return (Criteria) this;
        }

        public Criteria andSysCompanyYphoneIsNull() {
            addCriterion("SYS_COMPANY_YPHONE is null");
            return (Criteria) this;
        }

        public Criteria andSysCompanyYphoneIsNotNull() {
            addCriterion("SYS_COMPANY_YPHONE is not null");
            return (Criteria) this;
        }

        public Criteria andSysCompanyYphoneEqualTo(String value) {
            addCriterion("SYS_COMPANY_YPHONE =", value, "sysCompanyYphone");
            return (Criteria) this;
        }

        public Criteria andSysCompanyYphoneNotEqualTo(String value) {
            addCriterion("SYS_COMPANY_YPHONE <>", value, "sysCompanyYphone");
            return (Criteria) this;
        }

        public Criteria andSysCompanyYphoneGreaterThan(String value) {
            addCriterion("SYS_COMPANY_YPHONE >", value, "sysCompanyYphone");
            return (Criteria) this;
        }

        public Criteria andSysCompanyYphoneGreaterThanOrEqualTo(String value) {
            addCriterion("SYS_COMPANY_YPHONE >=", value, "sysCompanyYphone");
            return (Criteria) this;
        }

        public Criteria andSysCompanyYphoneLessThan(String value) {
            addCriterion("SYS_COMPANY_YPHONE <", value, "sysCompanyYphone");
            return (Criteria) this;
        }

        public Criteria andSysCompanyYphoneLessThanOrEqualTo(String value) {
            addCriterion("SYS_COMPANY_YPHONE <=", value, "sysCompanyYphone");
            return (Criteria) this;
        }

        public Criteria andSysCompanyYphoneLike(String value) {
            addCriterion("SYS_COMPANY_YPHONE like", value, "sysCompanyYphone");
            return (Criteria) this;
        }

        public Criteria andSysCompanyYphoneNotLike(String value) {
            addCriterion("SYS_COMPANY_YPHONE not like", value, "sysCompanyYphone");
            return (Criteria) this;
        }

        public Criteria andSysCompanyYphoneIn(List<String> values) {
            addCriterion("SYS_COMPANY_YPHONE in", values, "sysCompanyYphone");
            return (Criteria) this;
        }

        public Criteria andSysCompanyYphoneNotIn(List<String> values) {
            addCriterion("SYS_COMPANY_YPHONE not in", values, "sysCompanyYphone");
            return (Criteria) this;
        }

        public Criteria andSysCompanyYphoneBetween(String value1, String value2) {
            addCriterion("SYS_COMPANY_YPHONE between", value1, value2, "sysCompanyYphone");
            return (Criteria) this;
        }

        public Criteria andSysCompanyYphoneNotBetween(String value1, String value2) {
            addCriterion("SYS_COMPANY_YPHONE not between", value1, value2, "sysCompanyYphone");
            return (Criteria) this;
        }

        public Criteria andSysCompanyCzIsNull() {
            addCriterion("SYS_COMPANY_CZ is null");
            return (Criteria) this;
        }

        public Criteria andSysCompanyCzIsNotNull() {
            addCriterion("SYS_COMPANY_CZ is not null");
            return (Criteria) this;
        }

        public Criteria andSysCompanyCzEqualTo(String value) {
            addCriterion("SYS_COMPANY_CZ =", value, "sysCompanyCz");
            return (Criteria) this;
        }

        public Criteria andSysCompanyCzNotEqualTo(String value) {
            addCriterion("SYS_COMPANY_CZ <>", value, "sysCompanyCz");
            return (Criteria) this;
        }

        public Criteria andSysCompanyCzGreaterThan(String value) {
            addCriterion("SYS_COMPANY_CZ >", value, "sysCompanyCz");
            return (Criteria) this;
        }

        public Criteria andSysCompanyCzGreaterThanOrEqualTo(String value) {
            addCriterion("SYS_COMPANY_CZ >=", value, "sysCompanyCz");
            return (Criteria) this;
        }

        public Criteria andSysCompanyCzLessThan(String value) {
            addCriterion("SYS_COMPANY_CZ <", value, "sysCompanyCz");
            return (Criteria) this;
        }

        public Criteria andSysCompanyCzLessThanOrEqualTo(String value) {
            addCriterion("SYS_COMPANY_CZ <=", value, "sysCompanyCz");
            return (Criteria) this;
        }

        public Criteria andSysCompanyCzLike(String value) {
            addCriterion("SYS_COMPANY_CZ like", value, "sysCompanyCz");
            return (Criteria) this;
        }

        public Criteria andSysCompanyCzNotLike(String value) {
            addCriterion("SYS_COMPANY_CZ not like", value, "sysCompanyCz");
            return (Criteria) this;
        }

        public Criteria andSysCompanyCzIn(List<String> values) {
            addCriterion("SYS_COMPANY_CZ in", values, "sysCompanyCz");
            return (Criteria) this;
        }

        public Criteria andSysCompanyCzNotIn(List<String> values) {
            addCriterion("SYS_COMPANY_CZ not in", values, "sysCompanyCz");
            return (Criteria) this;
        }

        public Criteria andSysCompanyCzBetween(String value1, String value2) {
            addCriterion("SYS_COMPANY_CZ between", value1, value2, "sysCompanyCz");
            return (Criteria) this;
        }

        public Criteria andSysCompanyCzNotBetween(String value1, String value2) {
            addCriterion("SYS_COMPANY_CZ not between", value1, value2, "sysCompanyCz");
            return (Criteria) this;
        }

        public Criteria andSysCompanyYhIsNull() {
            addCriterion("SYS_COMPANY_YH is null");
            return (Criteria) this;
        }

        public Criteria andSysCompanyYhIsNotNull() {
            addCriterion("SYS_COMPANY_YH is not null");
            return (Criteria) this;
        }

        public Criteria andSysCompanyYhEqualTo(String value) {
            addCriterion("SYS_COMPANY_YH =", value, "sysCompanyYh");
            return (Criteria) this;
        }

        public Criteria andSysCompanyYhNotEqualTo(String value) {
            addCriterion("SYS_COMPANY_YH <>", value, "sysCompanyYh");
            return (Criteria) this;
        }

        public Criteria andSysCompanyYhGreaterThan(String value) {
            addCriterion("SYS_COMPANY_YH >", value, "sysCompanyYh");
            return (Criteria) this;
        }

        public Criteria andSysCompanyYhGreaterThanOrEqualTo(String value) {
            addCriterion("SYS_COMPANY_YH >=", value, "sysCompanyYh");
            return (Criteria) this;
        }

        public Criteria andSysCompanyYhLessThan(String value) {
            addCriterion("SYS_COMPANY_YH <", value, "sysCompanyYh");
            return (Criteria) this;
        }

        public Criteria andSysCompanyYhLessThanOrEqualTo(String value) {
            addCriterion("SYS_COMPANY_YH <=", value, "sysCompanyYh");
            return (Criteria) this;
        }

        public Criteria andSysCompanyYhLike(String value) {
            addCriterion("SYS_COMPANY_YH like", value, "sysCompanyYh");
            return (Criteria) this;
        }

        public Criteria andSysCompanyYhNotLike(String value) {
            addCriterion("SYS_COMPANY_YH not like", value, "sysCompanyYh");
            return (Criteria) this;
        }

        public Criteria andSysCompanyYhIn(List<String> values) {
            addCriterion("SYS_COMPANY_YH in", values, "sysCompanyYh");
            return (Criteria) this;
        }

        public Criteria andSysCompanyYhNotIn(List<String> values) {
            addCriterion("SYS_COMPANY_YH not in", values, "sysCompanyYh");
            return (Criteria) this;
        }

        public Criteria andSysCompanyYhBetween(String value1, String value2) {
            addCriterion("SYS_COMPANY_YH between", value1, value2, "sysCompanyYh");
            return (Criteria) this;
        }

        public Criteria andSysCompanyYhNotBetween(String value1, String value2) {
            addCriterion("SYS_COMPANY_YH not between", value1, value2, "sysCompanyYh");
            return (Criteria) this;
        }

        public Criteria andSysCompanyYhzhIsNull() {
            addCriterion("SYS_COMPANY_YHZH is null");
            return (Criteria) this;
        }

        public Criteria andSysCompanyYhzhIsNotNull() {
            addCriterion("SYS_COMPANY_YHZH is not null");
            return (Criteria) this;
        }

        public Criteria andSysCompanyYhzhEqualTo(String value) {
            addCriterion("SYS_COMPANY_YHZH =", value, "sysCompanyYhzh");
            return (Criteria) this;
        }

        public Criteria andSysCompanyYhzhNotEqualTo(String value) {
            addCriterion("SYS_COMPANY_YHZH <>", value, "sysCompanyYhzh");
            return (Criteria) this;
        }

        public Criteria andSysCompanyYhzhGreaterThan(String value) {
            addCriterion("SYS_COMPANY_YHZH >", value, "sysCompanyYhzh");
            return (Criteria) this;
        }

        public Criteria andSysCompanyYhzhGreaterThanOrEqualTo(String value) {
            addCriterion("SYS_COMPANY_YHZH >=", value, "sysCompanyYhzh");
            return (Criteria) this;
        }

        public Criteria andSysCompanyYhzhLessThan(String value) {
            addCriterion("SYS_COMPANY_YHZH <", value, "sysCompanyYhzh");
            return (Criteria) this;
        }

        public Criteria andSysCompanyYhzhLessThanOrEqualTo(String value) {
            addCriterion("SYS_COMPANY_YHZH <=", value, "sysCompanyYhzh");
            return (Criteria) this;
        }

        public Criteria andSysCompanyYhzhLike(String value) {
            addCriterion("SYS_COMPANY_YHZH like", value, "sysCompanyYhzh");
            return (Criteria) this;
        }

        public Criteria andSysCompanyYhzhNotLike(String value) {
            addCriterion("SYS_COMPANY_YHZH not like", value, "sysCompanyYhzh");
            return (Criteria) this;
        }

        public Criteria andSysCompanyYhzhIn(List<String> values) {
            addCriterion("SYS_COMPANY_YHZH in", values, "sysCompanyYhzh");
            return (Criteria) this;
        }

        public Criteria andSysCompanyYhzhNotIn(List<String> values) {
            addCriterion("SYS_COMPANY_YHZH not in", values, "sysCompanyYhzh");
            return (Criteria) this;
        }

        public Criteria andSysCompanyYhzhBetween(String value1, String value2) {
            addCriterion("SYS_COMPANY_YHZH between", value1, value2, "sysCompanyYhzh");
            return (Criteria) this;
        }

        public Criteria andSysCompanyYhzhNotBetween(String value1, String value2) {
            addCriterion("SYS_COMPANY_YHZH not between", value1, value2, "sysCompanyYhzh");
            return (Criteria) this;
        }

        public Criteria andSysCompanyYxwIsNull() {
            addCriterion("SYS_COMPANY_YXW is null");
            return (Criteria) this;
        }

        public Criteria andSysCompanyYxwIsNotNull() {
            addCriterion("SYS_COMPANY_YXW is not null");
            return (Criteria) this;
        }

        public Criteria andSysCompanyYxwEqualTo(String value) {
            addCriterion("SYS_COMPANY_YXW =", value, "sysCompanyYxw");
            return (Criteria) this;
        }

        public Criteria andSysCompanyYxwNotEqualTo(String value) {
            addCriterion("SYS_COMPANY_YXW <>", value, "sysCompanyYxw");
            return (Criteria) this;
        }

        public Criteria andSysCompanyYxwGreaterThan(String value) {
            addCriterion("SYS_COMPANY_YXW >", value, "sysCompanyYxw");
            return (Criteria) this;
        }

        public Criteria andSysCompanyYxwGreaterThanOrEqualTo(String value) {
            addCriterion("SYS_COMPANY_YXW >=", value, "sysCompanyYxw");
            return (Criteria) this;
        }

        public Criteria andSysCompanyYxwLessThan(String value) {
            addCriterion("SYS_COMPANY_YXW <", value, "sysCompanyYxw");
            return (Criteria) this;
        }

        public Criteria andSysCompanyYxwLessThanOrEqualTo(String value) {
            addCriterion("SYS_COMPANY_YXW <=", value, "sysCompanyYxw");
            return (Criteria) this;
        }

        public Criteria andSysCompanyYxwLike(String value) {
            addCriterion("SYS_COMPANY_YXW like", value, "sysCompanyYxw");
            return (Criteria) this;
        }

        public Criteria andSysCompanyYxwNotLike(String value) {
            addCriterion("SYS_COMPANY_YXW not like", value, "sysCompanyYxw");
            return (Criteria) this;
        }

        public Criteria andSysCompanyYxwIn(List<String> values) {
            addCriterion("SYS_COMPANY_YXW in", values, "sysCompanyYxw");
            return (Criteria) this;
        }

        public Criteria andSysCompanyYxwNotIn(List<String> values) {
            addCriterion("SYS_COMPANY_YXW not in", values, "sysCompanyYxw");
            return (Criteria) this;
        }

        public Criteria andSysCompanyYxwBetween(String value1, String value2) {
            addCriterion("SYS_COMPANY_YXW between", value1, value2, "sysCompanyYxw");
            return (Criteria) this;
        }

        public Criteria andSysCompanyYxwNotBetween(String value1, String value2) {
            addCriterion("SYS_COMPANY_YXW not between", value1, value2, "sysCompanyYxw");
            return (Criteria) this;
        }

        public Criteria andSysCompanyBzxxIsNull() {
            addCriterion("SYS_COMPANY_BZXX is null");
            return (Criteria) this;
        }

        public Criteria andSysCompanyBzxxIsNotNull() {
            addCriterion("SYS_COMPANY_BZXX is not null");
            return (Criteria) this;
        }

        public Criteria andSysCompanyBzxxEqualTo(String value) {
            addCriterion("SYS_COMPANY_BZXX =", value, "sysCompanyBzxx");
            return (Criteria) this;
        }

        public Criteria andSysCompanyBzxxNotEqualTo(String value) {
            addCriterion("SYS_COMPANY_BZXX <>", value, "sysCompanyBzxx");
            return (Criteria) this;
        }

        public Criteria andSysCompanyBzxxGreaterThan(String value) {
            addCriterion("SYS_COMPANY_BZXX >", value, "sysCompanyBzxx");
            return (Criteria) this;
        }

        public Criteria andSysCompanyBzxxGreaterThanOrEqualTo(String value) {
            addCriterion("SYS_COMPANY_BZXX >=", value, "sysCompanyBzxx");
            return (Criteria) this;
        }

        public Criteria andSysCompanyBzxxLessThan(String value) {
            addCriterion("SYS_COMPANY_BZXX <", value, "sysCompanyBzxx");
            return (Criteria) this;
        }

        public Criteria andSysCompanyBzxxLessThanOrEqualTo(String value) {
            addCriterion("SYS_COMPANY_BZXX <=", value, "sysCompanyBzxx");
            return (Criteria) this;
        }

        public Criteria andSysCompanyBzxxLike(String value) {
            addCriterion("SYS_COMPANY_BZXX like", value, "sysCompanyBzxx");
            return (Criteria) this;
        }

        public Criteria andSysCompanyBzxxNotLike(String value) {
            addCriterion("SYS_COMPANY_BZXX not like", value, "sysCompanyBzxx");
            return (Criteria) this;
        }

        public Criteria andSysCompanyBzxxIn(List<String> values) {
            addCriterion("SYS_COMPANY_BZXX in", values, "sysCompanyBzxx");
            return (Criteria) this;
        }

        public Criteria andSysCompanyBzxxNotIn(List<String> values) {
            addCriterion("SYS_COMPANY_BZXX not in", values, "sysCompanyBzxx");
            return (Criteria) this;
        }

        public Criteria andSysCompanyBzxxBetween(String value1, String value2) {
            addCriterion("SYS_COMPANY_BZXX between", value1, value2, "sysCompanyBzxx");
            return (Criteria) this;
        }

        public Criteria andSysCompanyBzxxNotBetween(String value1, String value2) {
            addCriterion("SYS_COMPANY_BZXX not between", value1, value2, "sysCompanyBzxx");
            return (Criteria) this;
        }

        public Criteria andLasttimeIsNull() {
            addCriterion("LASTTIME is null");
            return (Criteria) this;
        }

        public Criteria andLasttimeIsNotNull() {
            addCriterion("LASTTIME is not null");
            return (Criteria) this;
        }

        public Criteria andLasttimeEqualTo(Date value) {
            addCriterion("LASTTIME =", value, "lasttime");
            return (Criteria) this;
        }

        public Criteria andLasttimeNotEqualTo(Date value) {
            addCriterion("LASTTIME <>", value, "lasttime");
            return (Criteria) this;
        }

        public Criteria andLasttimeGreaterThan(Date value) {
            addCriterion("LASTTIME >", value, "lasttime");
            return (Criteria) this;
        }

        public Criteria andLasttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("LASTTIME >=", value, "lasttime");
            return (Criteria) this;
        }

        public Criteria andLasttimeLessThan(Date value) {
            addCriterion("LASTTIME <", value, "lasttime");
            return (Criteria) this;
        }

        public Criteria andLasttimeLessThanOrEqualTo(Date value) {
            addCriterion("LASTTIME <=", value, "lasttime");
            return (Criteria) this;
        }

        public Criteria andLasttimeIn(List<Date> values) {
            addCriterion("LASTTIME in", values, "lasttime");
            return (Criteria) this;
        }

        public Criteria andLasttimeNotIn(List<Date> values) {
            addCriterion("LASTTIME not in", values, "lasttime");
            return (Criteria) this;
        }

        public Criteria andLasttimeBetween(Date value1, Date value2) {
            addCriterion("LASTTIME between", value1, value2, "lasttime");
            return (Criteria) this;
        }

        public Criteria andLasttimeNotBetween(Date value1, Date value2) {
            addCriterion("LASTTIME not between", value1, value2, "lasttime");
            return (Criteria) this;
        }
    }

    /**
     */
    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}