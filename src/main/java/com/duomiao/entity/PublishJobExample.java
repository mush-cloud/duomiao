package com.duomiao.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PublishJobExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PublishJobExample() {
        oredCriteria = new ArrayList<Criteria>();
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
            criteria = new ArrayList<Criterion>();
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

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("ID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("ID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andJobNameIsNull() {
            addCriterion("PJ_JOB_NAME is null");
            return (Criteria) this;
        }

        public Criteria andJobNameIsNotNull() {
            addCriterion("PJ_JOB_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andJobNameEqualTo(String value) {
            addCriterion("PJ_JOB_NAME =", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameNotEqualTo(String value) {
            addCriterion("PJ_JOB_NAME <>", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameGreaterThan(String value) {
            addCriterion("PJ_JOB_NAME >", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameGreaterThanOrEqualTo(String value) {
            addCriterion("PJ_JOB_NAME >=", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameLessThan(String value) {
            addCriterion("PJ_JOB_NAME <", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameLessThanOrEqualTo(String value) {
            addCriterion("PJ_JOB_NAME <=", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameLike(String value) {
            addCriterion("PJ_JOB_NAME like", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameNotLike(String value) {
            addCriterion("PJ_JOB_NAME not like", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameIn(List<String> values) {
            addCriterion("PJ_JOB_NAME in", values, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameNotIn(List<String> values) {
            addCriterion("PJ_JOB_NAME not in", values, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameBetween(String value1, String value2) {
            addCriterion("PJ_JOB_NAME between", value1, value2, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameNotBetween(String value1, String value2) {
            addCriterion("PJ_JOB_NAME not between", value1, value2, "jobName");
            return (Criteria) this;
        }

        public Criteria andEntIdIsNull() {
            addCriterion("PJ_ENT_ID is null");
            return (Criteria) this;
        }

        public Criteria andEntIdIsNotNull() {
            addCriterion("PJ_ENT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andEntIdEqualTo(String value) {
            addCriterion("PJ_ENT_ID =", value, "entId");
            return (Criteria) this;
        }

        public Criteria andEntIdNotEqualTo(String value) {
            addCriterion("PJ_ENT_ID <>", value, "entId");
            return (Criteria) this;
        }

        public Criteria andEntIdGreaterThan(String value) {
            addCriterion("PJ_ENT_ID >", value, "entId");
            return (Criteria) this;
        }

        public Criteria andEntIdGreaterThanOrEqualTo(String value) {
            addCriterion("PJ_ENT_ID >=", value, "entId");
            return (Criteria) this;
        }

        public Criteria andEntIdLessThan(String value) {
            addCriterion("PJ_ENT_ID <", value, "entId");
            return (Criteria) this;
        }

        public Criteria andEntIdLessThanOrEqualTo(String value) {
            addCriterion("PJ_ENT_ID <=", value, "entId");
            return (Criteria) this;
        }

        public Criteria andEntIdLike(String value) {
            addCriterion("PJ_ENT_ID like", value, "entId");
            return (Criteria) this;
        }

        public Criteria andEntIdNotLike(String value) {
            addCriterion("PJ_ENT_ID not like", value, "entId");
            return (Criteria) this;
        }

        public Criteria andEntIdIn(List<String> values) {
            addCriterion("PJ_ENT_ID in", values, "entId");
            return (Criteria) this;
        }

        public Criteria andEntIdNotIn(List<String> values) {
            addCriterion("PJ_ENT_ID not in", values, "entId");
            return (Criteria) this;
        }

        public Criteria andEntIdBetween(String value1, String value2) {
            addCriterion("PJ_ENT_ID between", value1, value2, "entId");
            return (Criteria) this;
        }

        public Criteria andEntIdNotBetween(String value1, String value2) {
            addCriterion("PJ_ENT_ID not between", value1, value2, "entId");
            return (Criteria) this;
        }

        public Criteria andPcIdIsNull() {
            addCriterion("PJ_PC_ID is null");
            return (Criteria) this;
        }

        public Criteria andPcIdIsNotNull() {
            addCriterion("PJ_PC_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPcIdEqualTo(String value) {
            addCriterion("PJ_PC_ID =", value, "pcId");
            return (Criteria) this;
        }

        public Criteria andPcIdNotEqualTo(String value) {
            addCriterion("PJ_PC_ID <>", value, "pcId");
            return (Criteria) this;
        }

        public Criteria andPcIdGreaterThan(String value) {
            addCriterion("PJ_PC_ID >", value, "pcId");
            return (Criteria) this;
        }

        public Criteria andPcIdGreaterThanOrEqualTo(String value) {
            addCriterion("PJ_PC_ID >=", value, "pcId");
            return (Criteria) this;
        }

        public Criteria andPcIdLessThan(String value) {
            addCriterion("PJ_PC_ID <", value, "pcId");
            return (Criteria) this;
        }

        public Criteria andPcIdLessThanOrEqualTo(String value) {
            addCriterion("PJ_PC_ID <=", value, "pcId");
            return (Criteria) this;
        }

        public Criteria andPcIdLike(String value) {
            addCriterion("PJ_PC_ID like", value, "pcId");
            return (Criteria) this;
        }

        public Criteria andPcIdNotLike(String value) {
            addCriterion("PJ_PC_ID not like", value, "pcId");
            return (Criteria) this;
        }

        public Criteria andPcIdIn(List<String> values) {
            addCriterion("PJ_PC_ID in", values, "pcId");
            return (Criteria) this;
        }

        public Criteria andPcIdNotIn(List<String> values) {
            addCriterion("PJ_PC_ID not in", values, "pcId");
            return (Criteria) this;
        }

        public Criteria andPcIdBetween(String value1, String value2) {
            addCriterion("PJ_PC_ID between", value1, value2, "pcId");
            return (Criteria) this;
        }

        public Criteria andPcIdNotBetween(String value1, String value2) {
            addCriterion("PJ_PC_ID not between", value1, value2, "pcId");
            return (Criteria) this;
        }

        public Criteria andMinSalaryIsNull() {
            addCriterion("PJ_MIN_SALARY is null");
            return (Criteria) this;
        }

        public Criteria andMinSalaryIsNotNull() {
            addCriterion("PJ_MIN_SALARY is not null");
            return (Criteria) this;
        }

        public Criteria andMinSalaryEqualTo(String value) {
            addCriterion("PJ_MIN_SALARY =", value, "minSalary");
            return (Criteria) this;
        }

        public Criteria andMinSalaryNotEqualTo(String value) {
            addCriterion("PJ_MIN_SALARY <>", value, "minSalary");
            return (Criteria) this;
        }

        public Criteria andMinSalaryGreaterThan(String value) {
            addCriterion("PJ_MIN_SALARY >", value, "minSalary");
            return (Criteria) this;
        }

        public Criteria andMinSalaryGreaterThanOrEqualTo(String value) {
            addCriterion("PJ_MIN_SALARY >=", value, "minSalary");
            return (Criteria) this;
        }

        public Criteria andMinSalaryLessThan(String value) {
            addCriterion("PJ_MIN_SALARY <", value, "minSalary");
            return (Criteria) this;
        }

        public Criteria andMinSalaryLessThanOrEqualTo(String value) {
            addCriterion("PJ_MIN_SALARY <=", value, "minSalary");
            return (Criteria) this;
        }

        public Criteria andMinSalaryLike(String value) {
            addCriterion("PJ_MIN_SALARY like", value, "minSalary");
            return (Criteria) this;
        }

        public Criteria andMinSalaryNotLike(String value) {
            addCriterion("PJ_MIN_SALARY not like", value, "minSalary");
            return (Criteria) this;
        }

        public Criteria andMinSalaryIn(List<String> values) {
            addCriterion("PJ_MIN_SALARY in", values, "minSalary");
            return (Criteria) this;
        }

        public Criteria andMinSalaryNotIn(List<String> values) {
            addCriterion("PJ_MIN_SALARY not in", values, "minSalary");
            return (Criteria) this;
        }

        public Criteria andMinSalaryBetween(String value1, String value2) {
            addCriterion("PJ_MIN_SALARY between", value1, value2, "minSalary");
            return (Criteria) this;
        }

        public Criteria andMinSalaryNotBetween(String value1, String value2) {
            addCriterion("PJ_MIN_SALARY not between", value1, value2, "minSalary");
            return (Criteria) this;
        }

        public Criteria andMaxSalaryIsNull() {
            addCriterion("PJ_MAX_SALARY is null");
            return (Criteria) this;
        }

        public Criteria andMaxSalaryIsNotNull() {
            addCriterion("PJ_MAX_SALARY is not null");
            return (Criteria) this;
        }

        public Criteria andMaxSalaryEqualTo(String value) {
            addCriterion("PJ_MAX_SALARY =", value, "maxSalary");
            return (Criteria) this;
        }

        public Criteria andMaxSalaryNotEqualTo(String value) {
            addCriterion("PJ_MAX_SALARY <>", value, "maxSalary");
            return (Criteria) this;
        }

        public Criteria andMaxSalaryGreaterThan(String value) {
            addCriterion("PJ_MAX_SALARY >", value, "maxSalary");
            return (Criteria) this;
        }

        public Criteria andMaxSalaryGreaterThanOrEqualTo(String value) {
            addCriterion("PJ_MAX_SALARY >=", value, "maxSalary");
            return (Criteria) this;
        }

        public Criteria andMaxSalaryLessThan(String value) {
            addCriterion("PJ_MAX_SALARY <", value, "maxSalary");
            return (Criteria) this;
        }

        public Criteria andMaxSalaryLessThanOrEqualTo(String value) {
            addCriterion("PJ_MAX_SALARY <=", value, "maxSalary");
            return (Criteria) this;
        }

        public Criteria andMaxSalaryLike(String value) {
            addCriterion("PJ_MAX_SALARY like", value, "maxSalary");
            return (Criteria) this;
        }

        public Criteria andMaxSalaryNotLike(String value) {
            addCriterion("PJ_MAX_SALARY not like", value, "maxSalary");
            return (Criteria) this;
        }

        public Criteria andMaxSalaryIn(List<String> values) {
            addCriterion("PJ_MAX_SALARY in", values, "maxSalary");
            return (Criteria) this;
        }

        public Criteria andMaxSalaryNotIn(List<String> values) {
            addCriterion("PJ_MAX_SALARY not in", values, "maxSalary");
            return (Criteria) this;
        }

        public Criteria andMaxSalaryBetween(String value1, String value2) {
            addCriterion("PJ_MAX_SALARY between", value1, value2, "maxSalary");
            return (Criteria) this;
        }

        public Criteria andMaxSalaryNotBetween(String value1, String value2) {
            addCriterion("PJ_MAX_SALARY not between", value1, value2, "maxSalary");
            return (Criteria) this;
        }

        public Criteria andMinEducationLevIsNull() {
            addCriterion("PJ_MIN_EDUCATION_LEV is null");
            return (Criteria) this;
        }

        public Criteria andMinEducationLevIsNotNull() {
            addCriterion("PJ_MIN_EDUCATION_LEV is not null");
            return (Criteria) this;
        }

        public Criteria andMinEducationLevEqualTo(String value) {
            addCriterion("PJ_MIN_EDUCATION_LEV =", value, "minEducationLev");
            return (Criteria) this;
        }

        public Criteria andMinEducationLevNotEqualTo(String value) {
            addCriterion("PJ_MIN_EDUCATION_LEV <>", value, "minEducationLev");
            return (Criteria) this;
        }

        public Criteria andMinEducationLevGreaterThan(String value) {
            addCriterion("PJ_MIN_EDUCATION_LEV >", value, "minEducationLev");
            return (Criteria) this;
        }

        public Criteria andMinEducationLevGreaterThanOrEqualTo(String value) {
            addCriterion("PJ_MIN_EDUCATION_LEV >=", value, "minEducationLev");
            return (Criteria) this;
        }

        public Criteria andMinEducationLevLessThan(String value) {
            addCriterion("PJ_MIN_EDUCATION_LEV <", value, "minEducationLev");
            return (Criteria) this;
        }

        public Criteria andMinEducationLevLessThanOrEqualTo(String value) {
            addCriterion("PJ_MIN_EDUCATION_LEV <=", value, "minEducationLev");
            return (Criteria) this;
        }

        public Criteria andMinEducationLevLike(String value) {
            addCriterion("PJ_MIN_EDUCATION_LEV like", value, "minEducationLev");
            return (Criteria) this;
        }

        public Criteria andMinEducationLevNotLike(String value) {
            addCriterion("PJ_MIN_EDUCATION_LEV not like", value, "minEducationLev");
            return (Criteria) this;
        }

        public Criteria andMinEducationLevIn(List<String> values) {
            addCriterion("PJ_MIN_EDUCATION_LEV in", values, "minEducationLev");
            return (Criteria) this;
        }

        public Criteria andMinEducationLevNotIn(List<String> values) {
            addCriterion("PJ_MIN_EDUCATION_LEV not in", values, "minEducationLev");
            return (Criteria) this;
        }

        public Criteria andMinEducationLevBetween(String value1, String value2) {
            addCriterion("PJ_MIN_EDUCATION_LEV between", value1, value2, "minEducationLev");
            return (Criteria) this;
        }

        public Criteria andMinEducationLevNotBetween(String value1, String value2) {
            addCriterion("PJ_MIN_EDUCATION_LEV not between", value1, value2, "minEducationLev");
            return (Criteria) this;
        }

        public Criteria andWorkPlaceIsNull() {
            addCriterion("PJ_WORK_PLACE is null");
            return (Criteria) this;
        }

        public Criteria andWorkPlaceIsNotNull() {
            addCriterion("PJ_WORK_PLACE is not null");
            return (Criteria) this;
        }

        public Criteria andWorkPlaceEqualTo(String value) {
            addCriterion("PJ_WORK_PLACE =", value, "workPlace");
            return (Criteria) this;
        }

        public Criteria andWorkPlaceNotEqualTo(String value) {
            addCriterion("PJ_WORK_PLACE <>", value, "workPlace");
            return (Criteria) this;
        }

        public Criteria andWorkPlaceGreaterThan(String value) {
            addCriterion("PJ_WORK_PLACE >", value, "workPlace");
            return (Criteria) this;
        }

        public Criteria andWorkPlaceGreaterThanOrEqualTo(String value) {
            addCriterion("PJ_WORK_PLACE >=", value, "workPlace");
            return (Criteria) this;
        }

        public Criteria andWorkPlaceLessThan(String value) {
            addCriterion("PJ_WORK_PLACE <", value, "workPlace");
            return (Criteria) this;
        }

        public Criteria andWorkPlaceLessThanOrEqualTo(String value) {
            addCriterion("PJ_WORK_PLACE <=", value, "workPlace");
            return (Criteria) this;
        }

        public Criteria andWorkPlaceLike(String value) {
            addCriterion("PJ_WORK_PLACE like", value, "workPlace");
            return (Criteria) this;
        }

        public Criteria andWorkPlaceNotLike(String value) {
            addCriterion("PJ_WORK_PLACE not like", value, "workPlace");
            return (Criteria) this;
        }

        public Criteria andWorkPlaceIn(List<String> values) {
            addCriterion("PJ_WORK_PLACE in", values, "workPlace");
            return (Criteria) this;
        }

        public Criteria andWorkPlaceNotIn(List<String> values) {
            addCriterion("PJ_WORK_PLACE not in", values, "workPlace");
            return (Criteria) this;
        }

        public Criteria andWorkPlaceBetween(String value1, String value2) {
            addCriterion("PJ_WORK_PLACE between", value1, value2, "workPlace");
            return (Criteria) this;
        }

        public Criteria andWorkPlaceNotBetween(String value1, String value2) {
            addCriterion("PJ_WORK_PLACE not between", value1, value2, "workPlace");
            return (Criteria) this;
        }

        public Criteria andWorkDaysIsNull() {
            addCriterion("PJ_WORK_DAYS is null");
            return (Criteria) this;
        }

        public Criteria andWorkDaysIsNotNull() {
            addCriterion("PJ_WORK_DAYS is not null");
            return (Criteria) this;
        }

        public Criteria andWorkDaysEqualTo(String value) {
            addCriterion("PJ_WORK_DAYS =", value, "workDays");
            return (Criteria) this;
        }

        public Criteria andWorkDaysNotEqualTo(String value) {
            addCriterion("PJ_WORK_DAYS <>", value, "workDays");
            return (Criteria) this;
        }

        public Criteria andWorkDaysGreaterThan(String value) {
            addCriterion("PJ_WORK_DAYS >", value, "workDays");
            return (Criteria) this;
        }

        public Criteria andWorkDaysGreaterThanOrEqualTo(String value) {
            addCriterion("PJ_WORK_DAYS >=", value, "workDays");
            return (Criteria) this;
        }

        public Criteria andWorkDaysLessThan(String value) {
            addCriterion("PJ_WORK_DAYS <", value, "workDays");
            return (Criteria) this;
        }

        public Criteria andWorkDaysLessThanOrEqualTo(String value) {
            addCriterion("PJ_WORK_DAYS <=", value, "workDays");
            return (Criteria) this;
        }

        public Criteria andWorkDaysLike(String value) {
            addCriterion("PJ_WORK_DAYS like", value, "workDays");
            return (Criteria) this;
        }

        public Criteria andWorkDaysNotLike(String value) {
            addCriterion("PJ_WORK_DAYS not like", value, "workDays");
            return (Criteria) this;
        }

        public Criteria andWorkDaysIn(List<String> values) {
            addCriterion("PJ_WORK_DAYS in", values, "workDays");
            return (Criteria) this;
        }

        public Criteria andWorkDaysNotIn(List<String> values) {
            addCriterion("PJ_WORK_DAYS not in", values, "workDays");
            return (Criteria) this;
        }

        public Criteria andWorkDaysBetween(String value1, String value2) {
            addCriterion("PJ_WORK_DAYS between", value1, value2, "workDays");
            return (Criteria) this;
        }

        public Criteria andWorkDaysNotBetween(String value1, String value2) {
            addCriterion("PJ_WORK_DAYS not between", value1, value2, "workDays");
            return (Criteria) this;
        }

        public Criteria andWorkMonthIsNull() {
            addCriterion("PJ_WORK_MONTH is null");
            return (Criteria) this;
        }

        public Criteria andWorkMonthIsNotNull() {
            addCriterion("PJ_WORK_MONTH is not null");
            return (Criteria) this;
        }

        public Criteria andWorkMonthEqualTo(String value) {
            addCriterion("PJ_WORK_MONTH =", value, "workMonth");
            return (Criteria) this;
        }

        public Criteria andWorkMonthNotEqualTo(String value) {
            addCriterion("PJ_WORK_MONTH <>", value, "workMonth");
            return (Criteria) this;
        }

        public Criteria andWorkMonthGreaterThan(String value) {
            addCriterion("PJ_WORK_MONTH >", value, "workMonth");
            return (Criteria) this;
        }

        public Criteria andWorkMonthGreaterThanOrEqualTo(String value) {
            addCriterion("PJ_WORK_MONTH >=", value, "workMonth");
            return (Criteria) this;
        }

        public Criteria andWorkMonthLessThan(String value) {
            addCriterion("PJ_WORK_MONTH <", value, "workMonth");
            return (Criteria) this;
        }

        public Criteria andWorkMonthLessThanOrEqualTo(String value) {
            addCriterion("PJ_WORK_MONTH <=", value, "workMonth");
            return (Criteria) this;
        }

        public Criteria andWorkMonthLike(String value) {
            addCriterion("PJ_WORK_MONTH like", value, "workMonth");
            return (Criteria) this;
        }

        public Criteria andWorkMonthNotLike(String value) {
            addCriterion("PJ_WORK_MONTH not like", value, "workMonth");
            return (Criteria) this;
        }

        public Criteria andWorkMonthIn(List<String> values) {
            addCriterion("PJ_WORK_MONTH in", values, "workMonth");
            return (Criteria) this;
        }

        public Criteria andWorkMonthNotIn(List<String> values) {
            addCriterion("PJ_WORK_MONTH not in", values, "workMonth");
            return (Criteria) this;
        }

        public Criteria andWorkMonthBetween(String value1, String value2) {
            addCriterion("PJ_WORK_MONTH between", value1, value2, "workMonth");
            return (Criteria) this;
        }

        public Criteria andWorkMonthNotBetween(String value1, String value2) {
            addCriterion("PJ_WORK_MONTH not between", value1, value2, "workMonth");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("PJ_UPDATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("PJ_UPDATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("PJ_UPDATE_TIME =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("PJ_UPDATE_TIME <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("PJ_UPDATE_TIME >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("PJ_UPDATE_TIME >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("PJ_UPDATE_TIME <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("PJ_UPDATE_TIME <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("PJ_UPDATE_TIME in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("PJ_UPDATE_TIME not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("PJ_UPDATE_TIME between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("PJ_UPDATE_TIME not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andCutDateIsNull() {
            addCriterion("PJ_CUT_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCutDateIsNotNull() {
            addCriterion("PJ_CUT_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCutDateEqualTo(Date value) {
            addCriterion("PJ_CUT_DATE =", value, "cutDate");
            return (Criteria) this;
        }

        public Criteria andCutDateNotEqualTo(Date value) {
            addCriterion("PJ_CUT_DATE <>", value, "cutDate");
            return (Criteria) this;
        }

        public Criteria andCutDateGreaterThan(Date value) {
            addCriterion("PJ_CUT_DATE >", value, "cutDate");
            return (Criteria) this;
        }

        public Criteria andCutDateGreaterThanOrEqualTo(Date value) {
            addCriterion("PJ_CUT_DATE >=", value, "cutDate");
            return (Criteria) this;
        }

        public Criteria andCutDateLessThan(Date value) {
            addCriterion("PJ_CUT_DATE <", value, "cutDate");
            return (Criteria) this;
        }

        public Criteria andCutDateLessThanOrEqualTo(Date value) {
            addCriterion("PJ_CUT_DATE <=", value, "cutDate");
            return (Criteria) this;
        }

        public Criteria andCutDateIn(List<Date> values) {
            addCriterion("PJ_CUT_DATE in", values, "cutDate");
            return (Criteria) this;
        }

        public Criteria andCutDateNotIn(List<Date> values) {
            addCriterion("PJ_CUT_DATE not in", values, "cutDate");
            return (Criteria) this;
        }

        public Criteria andCutDateBetween(Date value1, Date value2) {
            addCriterion("PJ_CUT_DATE between", value1, value2, "cutDate");
            return (Criteria) this;
        }

        public Criteria andCutDateNotBetween(Date value1, Date value2) {
            addCriterion("PJ_CUT_DATE not between", value1, value2, "cutDate");
            return (Criteria) this;
        }

        public Criteria andUrgencyIsNull() {
            addCriterion("PJ_URGENCY is null");
            return (Criteria) this;
        }

        public Criteria andUrgencyIsNotNull() {
            addCriterion("PJ_URGENCY is not null");
            return (Criteria) this;
        }

        public Criteria andUrgencyEqualTo(String value) {
            addCriterion("PJ_URGENCY =", value, "urgency");
            return (Criteria) this;
        }

        public Criteria andUrgencyNotEqualTo(String value) {
            addCriterion("PJ_URGENCY <>", value, "urgency");
            return (Criteria) this;
        }

        public Criteria andUrgencyGreaterThan(String value) {
            addCriterion("PJ_URGENCY >", value, "urgency");
            return (Criteria) this;
        }

        public Criteria andUrgencyGreaterThanOrEqualTo(String value) {
            addCriterion("PJ_URGENCY >=", value, "urgency");
            return (Criteria) this;
        }

        public Criteria andUrgencyLessThan(String value) {
            addCriterion("PJ_URGENCY <", value, "urgency");
            return (Criteria) this;
        }

        public Criteria andUrgencyLessThanOrEqualTo(String value) {
            addCriterion("PJ_URGENCY <=", value, "urgency");
            return (Criteria) this;
        }

        public Criteria andUrgencyLike(String value) {
            addCriterion("PJ_URGENCY like", value, "urgency");
            return (Criteria) this;
        }

        public Criteria andUrgencyNotLike(String value) {
            addCriterion("PJ_URGENCY not like", value, "urgency");
            return (Criteria) this;
        }

        public Criteria andUrgencyIn(List<String> values) {
            addCriterion("PJ_URGENCY in", values, "urgency");
            return (Criteria) this;
        }

        public Criteria andUrgencyNotIn(List<String> values) {
            addCriterion("PJ_URGENCY not in", values, "urgency");
            return (Criteria) this;
        }

        public Criteria andUrgencyBetween(String value1, String value2) {
            addCriterion("PJ_URGENCY between", value1, value2, "urgency");
            return (Criteria) this;
        }

        public Criteria andUrgencyNotBetween(String value1, String value2) {
            addCriterion("PJ_URGENCY not between", value1, value2, "urgency");
            return (Criteria) this;
        }

        public Criteria andSendNumIsNull() {
            addCriterion("PJ_SEND_NUM is null");
            return (Criteria) this;
        }

        public Criteria andSendNumIsNotNull() {
            addCriterion("PJ_SEND_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andSendNumEqualTo(Integer value) {
            addCriterion("PJ_SEND_NUM =", value, "sendNum");
            return (Criteria) this;
        }

        public Criteria andSendNumNotEqualTo(Integer value) {
            addCriterion("PJ_SEND_NUM <>", value, "sendNum");
            return (Criteria) this;
        }

        public Criteria andSendNumGreaterThan(Integer value) {
            addCriterion("PJ_SEND_NUM >", value, "sendNum");
            return (Criteria) this;
        }

        public Criteria andSendNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("PJ_SEND_NUM >=", value, "sendNum");
            return (Criteria) this;
        }

        public Criteria andSendNumLessThan(Integer value) {
            addCriterion("PJ_SEND_NUM <", value, "sendNum");
            return (Criteria) this;
        }

        public Criteria andSendNumLessThanOrEqualTo(Integer value) {
            addCriterion("PJ_SEND_NUM <=", value, "sendNum");
            return (Criteria) this;
        }

        public Criteria andSendNumIn(List<Integer> values) {
            addCriterion("PJ_SEND_NUM in", values, "sendNum");
            return (Criteria) this;
        }

        public Criteria andSendNumNotIn(List<Integer> values) {
            addCriterion("PJ_SEND_NUM not in", values, "sendNum");
            return (Criteria) this;
        }

        public Criteria andSendNumBetween(Integer value1, Integer value2) {
            addCriterion("PJ_SEND_NUM between", value1, value2, "sendNum");
            return (Criteria) this;
        }

        public Criteria andSendNumNotBetween(Integer value1, Integer value2) {
            addCriterion("PJ_SEND_NUM not between", value1, value2, "sendNum");
            return (Criteria) this;
        }
    }

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