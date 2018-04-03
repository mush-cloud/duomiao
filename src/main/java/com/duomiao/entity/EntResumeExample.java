package com.duomiao.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EntResumeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EntResumeExample() {
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

        public Criteria andEntIdIsNull() {
            addCriterion("ER_ENT_ID is null");
            return (Criteria) this;
        }

        public Criteria andEntIdIsNotNull() {
            addCriterion("ER_ENT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andEntIdEqualTo(String value) {
            addCriterion("ER_ENT_ID =", value, "entId");
            return (Criteria) this;
        }

        public Criteria andEntIdNotEqualTo(String value) {
            addCriterion("ER_ENT_ID <>", value, "entId");
            return (Criteria) this;
        }

        public Criteria andEntIdGreaterThan(String value) {
            addCriterion("ER_ENT_ID >", value, "entId");
            return (Criteria) this;
        }

        public Criteria andEntIdGreaterThanOrEqualTo(String value) {
            addCriterion("ER_ENT_ID >=", value, "entId");
            return (Criteria) this;
        }

        public Criteria andEntIdLessThan(String value) {
            addCriterion("ER_ENT_ID <", value, "entId");
            return (Criteria) this;
        }

        public Criteria andEntIdLessThanOrEqualTo(String value) {
            addCriterion("ER_ENT_ID <=", value, "entId");
            return (Criteria) this;
        }

        public Criteria andEntIdLike(String value) {
            addCriterion("ER_ENT_ID like", value, "entId");
            return (Criteria) this;
        }

        public Criteria andEntIdNotLike(String value) {
            addCriterion("ER_ENT_ID not like", value, "entId");
            return (Criteria) this;
        }

        public Criteria andEntIdIn(List<String> values) {
            addCriterion("ER_ENT_ID in", values, "entId");
            return (Criteria) this;
        }

        public Criteria andEntIdNotIn(List<String> values) {
            addCriterion("ER_ENT_ID not in", values, "entId");
            return (Criteria) this;
        }

        public Criteria andEntIdBetween(String value1, String value2) {
            addCriterion("ER_ENT_ID between", value1, value2, "entId");
            return (Criteria) this;
        }

        public Criteria andEntIdNotBetween(String value1, String value2) {
            addCriterion("ER_ENT_ID not between", value1, value2, "entId");
            return (Criteria) this;
        }

        public Criteria andPjIdIsNull() {
            addCriterion("ER_PJ_ID is null");
            return (Criteria) this;
        }

        public Criteria andPjIdIsNotNull() {
            addCriterion("ER_PJ_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPjIdEqualTo(String value) {
            addCriterion("ER_PJ_ID =", value, "pjId");
            return (Criteria) this;
        }

        public Criteria andPjIdNotEqualTo(String value) {
            addCriterion("ER_PJ_ID <>", value, "pjId");
            return (Criteria) this;
        }

        public Criteria andPjIdGreaterThan(String value) {
            addCriterion("ER_PJ_ID >", value, "pjId");
            return (Criteria) this;
        }

        public Criteria andPjIdGreaterThanOrEqualTo(String value) {
            addCriterion("ER_PJ_ID >=", value, "pjId");
            return (Criteria) this;
        }

        public Criteria andPjIdLessThan(String value) {
            addCriterion("ER_PJ_ID <", value, "pjId");
            return (Criteria) this;
        }

        public Criteria andPjIdLessThanOrEqualTo(String value) {
            addCriterion("ER_PJ_ID <=", value, "pjId");
            return (Criteria) this;
        }

        public Criteria andPjIdLike(String value) {
            addCriterion("ER_PJ_ID like", value, "pjId");
            return (Criteria) this;
        }

        public Criteria andPjIdNotLike(String value) {
            addCriterion("ER_PJ_ID not like", value, "pjId");
            return (Criteria) this;
        }

        public Criteria andPjIdIn(List<String> values) {
            addCriterion("ER_PJ_ID in", values, "pjId");
            return (Criteria) this;
        }

        public Criteria andPjIdNotIn(List<String> values) {
            addCriterion("ER_PJ_ID not in", values, "pjId");
            return (Criteria) this;
        }

        public Criteria andPjIdBetween(String value1, String value2) {
            addCriterion("ER_PJ_ID between", value1, value2, "pjId");
            return (Criteria) this;
        }

        public Criteria andPjIdNotBetween(String value1, String value2) {
            addCriterion("ER_PJ_ID not between", value1, value2, "pjId");
            return (Criteria) this;
        }

        public Criteria andRiIdIsNull() {
            addCriterion("ER_RI_ID is null");
            return (Criteria) this;
        }

        public Criteria andRiIdIsNotNull() {
            addCriterion("ER_RI_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRiIdEqualTo(String value) {
            addCriterion("ER_RI_ID =", value, "riId");
            return (Criteria) this;
        }

        public Criteria andRiIdNotEqualTo(String value) {
            addCriterion("ER_RI_ID <>", value, "riId");
            return (Criteria) this;
        }

        public Criteria andRiIdGreaterThan(String value) {
            addCriterion("ER_RI_ID >", value, "riId");
            return (Criteria) this;
        }

        public Criteria andRiIdGreaterThanOrEqualTo(String value) {
            addCriterion("ER_RI_ID >=", value, "riId");
            return (Criteria) this;
        }

        public Criteria andRiIdLessThan(String value) {
            addCriterion("ER_RI_ID <", value, "riId");
            return (Criteria) this;
        }

        public Criteria andRiIdLessThanOrEqualTo(String value) {
            addCriterion("ER_RI_ID <=", value, "riId");
            return (Criteria) this;
        }

        public Criteria andRiIdLike(String value) {
            addCriterion("ER_RI_ID like", value, "riId");
            return (Criteria) this;
        }

        public Criteria andRiIdNotLike(String value) {
            addCriterion("ER_RI_ID not like", value, "riId");
            return (Criteria) this;
        }

        public Criteria andRiIdIn(List<String> values) {
            addCriterion("ER_RI_ID in", values, "riId");
            return (Criteria) this;
        }

        public Criteria andRiIdNotIn(List<String> values) {
            addCriterion("ER_RI_ID not in", values, "riId");
            return (Criteria) this;
        }

        public Criteria andRiIdBetween(String value1, String value2) {
            addCriterion("ER_RI_ID between", value1, value2, "riId");
            return (Criteria) this;
        }

        public Criteria andRiIdNotBetween(String value1, String value2) {
            addCriterion("ER_RI_ID not between", value1, value2, "riId");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNull() {
            addCriterion("ER_ADD_TIME is null");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNotNull() {
            addCriterion("ER_ADD_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andAddTimeEqualTo(Date value) {
            addCriterion("ER_ADD_TIME =", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotEqualTo(Date value) {
            addCriterion("ER_ADD_TIME <>", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThan(Date value) {
            addCriterion("ER_ADD_TIME >", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ER_ADD_TIME >=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThan(Date value) {
            addCriterion("ER_ADD_TIME <", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThanOrEqualTo(Date value) {
            addCriterion("ER_ADD_TIME <=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeIn(List<Date> values) {
            addCriterion("ER_ADD_TIME in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotIn(List<Date> values) {
            addCriterion("ER_ADD_TIME not in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeBetween(Date value1, Date value2) {
            addCriterion("ER_ADD_TIME between", value1, value2, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotBetween(Date value1, Date value2) {
            addCriterion("ER_ADD_TIME not between", value1, value2, "addTime");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("ER_SEX is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("ER_SEX is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("ER_SEX =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("ER_SEX <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("ER_SEX >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("ER_SEX >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("ER_SEX <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("ER_SEX <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("ER_SEX like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("ER_SEX not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("ER_SEX in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("ER_SEX not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("ER_SEX between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("ER_SEX not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andAgeIsNull() {
            addCriterion("ER_AGE is null");
            return (Criteria) this;
        }

        public Criteria andAgeIsNotNull() {
            addCriterion("ER_AGE is not null");
            return (Criteria) this;
        }

        public Criteria andAgeEqualTo(String value) {
            addCriterion("ER_AGE =", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotEqualTo(String value) {
            addCriterion("ER_AGE <>", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThan(String value) {
            addCriterion("ER_AGE >", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThanOrEqualTo(String value) {
            addCriterion("ER_AGE >=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThan(String value) {
            addCriterion("ER_AGE <", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThanOrEqualTo(String value) {
            addCriterion("ER_AGE <=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLike(String value) {
            addCriterion("ER_AGE like", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotLike(String value) {
            addCriterion("ER_AGE not like", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeIn(List<String> values) {
            addCriterion("ER_AGE in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotIn(List<String> values) {
            addCriterion("ER_AGE not in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeBetween(String value1, String value2) {
            addCriterion("ER_AGE between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotBetween(String value1, String value2) {
            addCriterion("ER_AGE not between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andAcademicIsNull() {
            addCriterion("ER_ACADEMIC is null");
            return (Criteria) this;
        }

        public Criteria andAcademicIsNotNull() {
            addCriterion("ER_ACADEMIC is not null");
            return (Criteria) this;
        }

        public Criteria andAcademicEqualTo(String value) {
            addCriterion("ER_ACADEMIC =", value, "academic");
            return (Criteria) this;
        }

        public Criteria andAcademicNotEqualTo(String value) {
            addCriterion("ER_ACADEMIC <>", value, "academic");
            return (Criteria) this;
        }

        public Criteria andAcademicGreaterThan(String value) {
            addCriterion("ER_ACADEMIC >", value, "academic");
            return (Criteria) this;
        }

        public Criteria andAcademicGreaterThanOrEqualTo(String value) {
            addCriterion("ER_ACADEMIC >=", value, "academic");
            return (Criteria) this;
        }

        public Criteria andAcademicLessThan(String value) {
            addCriterion("ER_ACADEMIC <", value, "academic");
            return (Criteria) this;
        }

        public Criteria andAcademicLessThanOrEqualTo(String value) {
            addCriterion("ER_ACADEMIC <=", value, "academic");
            return (Criteria) this;
        }

        public Criteria andAcademicLike(String value) {
            addCriterion("ER_ACADEMIC like", value, "academic");
            return (Criteria) this;
        }

        public Criteria andAcademicNotLike(String value) {
            addCriterion("ER_ACADEMIC not like", value, "academic");
            return (Criteria) this;
        }

        public Criteria andAcademicIn(List<String> values) {
            addCriterion("ER_ACADEMIC in", values, "academic");
            return (Criteria) this;
        }

        public Criteria andAcademicNotIn(List<String> values) {
            addCriterion("ER_ACADEMIC not in", values, "academic");
            return (Criteria) this;
        }

        public Criteria andAcademicBetween(String value1, String value2) {
            addCriterion("ER_ACADEMIC between", value1, value2, "academic");
            return (Criteria) this;
        }

        public Criteria andAcademicNotBetween(String value1, String value2) {
            addCriterion("ER_ACADEMIC not between", value1, value2, "academic");
            return (Criteria) this;
        }

        public Criteria andIsdelIsNull() {
            addCriterion("ER_ISDEL is null");
            return (Criteria) this;
        }

        public Criteria andIsdelIsNotNull() {
            addCriterion("ER_ISDEL is not null");
            return (Criteria) this;
        }

        public Criteria andIsdelEqualTo(String value) {
            addCriterion("ER_ISDEL =", value, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelNotEqualTo(String value) {
            addCriterion("ER_ISDEL <>", value, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelGreaterThan(String value) {
            addCriterion("ER_ISDEL >", value, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelGreaterThanOrEqualTo(String value) {
            addCriterion("ER_ISDEL >=", value, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelLessThan(String value) {
            addCriterion("ER_ISDEL <", value, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelLessThanOrEqualTo(String value) {
            addCriterion("ER_ISDEL <=", value, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelLike(String value) {
            addCriterion("ER_ISDEL like", value, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelNotLike(String value) {
            addCriterion("ER_ISDEL not like", value, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelIn(List<String> values) {
            addCriterion("ER_ISDEL in", values, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelNotIn(List<String> values) {
            addCriterion("ER_ISDEL not in", values, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelBetween(String value1, String value2) {
            addCriterion("ER_ISDEL between", value1, value2, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelNotBetween(String value1, String value2) {
            addCriterion("ER_ISDEL not between", value1, value2, "isdel");
            return (Criteria) this;
        }

        public Criteria andDelTimeIsNull() {
            addCriterion("ER_DEL_TIME is null");
            return (Criteria) this;
        }

        public Criteria andDelTimeIsNotNull() {
            addCriterion("ER_DEL_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andDelTimeEqualTo(Date value) {
            addCriterion("ER_DEL_TIME =", value, "delTime");
            return (Criteria) this;
        }

        public Criteria andDelTimeNotEqualTo(Date value) {
            addCriterion("ER_DEL_TIME <>", value, "delTime");
            return (Criteria) this;
        }

        public Criteria andDelTimeGreaterThan(Date value) {
            addCriterion("ER_DEL_TIME >", value, "delTime");
            return (Criteria) this;
        }

        public Criteria andDelTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ER_DEL_TIME >=", value, "delTime");
            return (Criteria) this;
        }

        public Criteria andDelTimeLessThan(Date value) {
            addCriterion("ER_DEL_TIME <", value, "delTime");
            return (Criteria) this;
        }

        public Criteria andDelTimeLessThanOrEqualTo(Date value) {
            addCriterion("ER_DEL_TIME <=", value, "delTime");
            return (Criteria) this;
        }

        public Criteria andDelTimeIn(List<Date> values) {
            addCriterion("ER_DEL_TIME in", values, "delTime");
            return (Criteria) this;
        }

        public Criteria andDelTimeNotIn(List<Date> values) {
            addCriterion("ER_DEL_TIME not in", values, "delTime");
            return (Criteria) this;
        }

        public Criteria andDelTimeBetween(Date value1, Date value2) {
            addCriterion("ER_DEL_TIME between", value1, value2, "delTime");
            return (Criteria) this;
        }

        public Criteria andDelTimeNotBetween(Date value1, Date value2) {
            addCriterion("ER_DEL_TIME not between", value1, value2, "delTime");
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