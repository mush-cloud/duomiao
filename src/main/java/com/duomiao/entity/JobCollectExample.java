package com.duomiao.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class JobCollectExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public JobCollectExample() {
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

        public Criteria andIntIdIsNull() {
            addCriterion("JC_INT_ID is null");
            return (Criteria) this;
        }

        public Criteria andIntIdIsNotNull() {
            addCriterion("JC_INT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andIntIdEqualTo(String value) {
            addCriterion("JC_INT_ID =", value, "intId");
            return (Criteria) this;
        }

        public Criteria andIntIdNotEqualTo(String value) {
            addCriterion("JC_INT_ID <>", value, "intId");
            return (Criteria) this;
        }

        public Criteria andIntIdGreaterThan(String value) {
            addCriterion("JC_INT_ID >", value, "intId");
            return (Criteria) this;
        }

        public Criteria andIntIdGreaterThanOrEqualTo(String value) {
            addCriterion("JC_INT_ID >=", value, "intId");
            return (Criteria) this;
        }

        public Criteria andIntIdLessThan(String value) {
            addCriterion("JC_INT_ID <", value, "intId");
            return (Criteria) this;
        }

        public Criteria andIntIdLessThanOrEqualTo(String value) {
            addCriterion("JC_INT_ID <=", value, "intId");
            return (Criteria) this;
        }

        public Criteria andIntIdLike(String value) {
            addCriterion("JC_INT_ID like", value, "intId");
            return (Criteria) this;
        }

        public Criteria andIntIdNotLike(String value) {
            addCriterion("JC_INT_ID not like", value, "intId");
            return (Criteria) this;
        }

        public Criteria andIntIdIn(List<String> values) {
            addCriterion("JC_INT_ID in", values, "intId");
            return (Criteria) this;
        }

        public Criteria andIntIdNotIn(List<String> values) {
            addCriterion("JC_INT_ID not in", values, "intId");
            return (Criteria) this;
        }

        public Criteria andIntIdBetween(String value1, String value2) {
            addCriterion("JC_INT_ID between", value1, value2, "intId");
            return (Criteria) this;
        }

        public Criteria andIntIdNotBetween(String value1, String value2) {
            addCriterion("JC_INT_ID not between", value1, value2, "intId");
            return (Criteria) this;
        }

        public Criteria andPjIdIsNull() {
            addCriterion("JC_PJ_ID is null");
            return (Criteria) this;
        }

        public Criteria andPjIdIsNotNull() {
            addCriterion("JC_PJ_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPjIdEqualTo(String value) {
            addCriterion("JC_PJ_ID =", value, "pjId");
            return (Criteria) this;
        }

        public Criteria andPjIdNotEqualTo(String value) {
            addCriterion("JC_PJ_ID <>", value, "pjId");
            return (Criteria) this;
        }

        public Criteria andPjIdGreaterThan(String value) {
            addCriterion("JC_PJ_ID >", value, "pjId");
            return (Criteria) this;
        }

        public Criteria andPjIdGreaterThanOrEqualTo(String value) {
            addCriterion("JC_PJ_ID >=", value, "pjId");
            return (Criteria) this;
        }

        public Criteria andPjIdLessThan(String value) {
            addCriterion("JC_PJ_ID <", value, "pjId");
            return (Criteria) this;
        }

        public Criteria andPjIdLessThanOrEqualTo(String value) {
            addCriterion("JC_PJ_ID <=", value, "pjId");
            return (Criteria) this;
        }

        public Criteria andPjIdLike(String value) {
            addCriterion("JC_PJ_ID like", value, "pjId");
            return (Criteria) this;
        }

        public Criteria andPjIdNotLike(String value) {
            addCriterion("JC_PJ_ID not like", value, "pjId");
            return (Criteria) this;
        }

        public Criteria andPjIdIn(List<String> values) {
            addCriterion("JC_PJ_ID in", values, "pjId");
            return (Criteria) this;
        }

        public Criteria andPjIdNotIn(List<String> values) {
            addCriterion("JC_PJ_ID not in", values, "pjId");
            return (Criteria) this;
        }

        public Criteria andPjIdBetween(String value1, String value2) {
            addCriterion("JC_PJ_ID between", value1, value2, "pjId");
            return (Criteria) this;
        }

        public Criteria andPjIdNotBetween(String value1, String value2) {
            addCriterion("JC_PJ_ID not between", value1, value2, "pjId");
            return (Criteria) this;
        }

        public Criteria andPjNameIsNull() {
            addCriterion("JC_PJ_NAME is null");
            return (Criteria) this;
        }

        public Criteria andPjNameIsNotNull() {
            addCriterion("JC_PJ_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andPjNameEqualTo(String value) {
            addCriterion("JC_PJ_NAME =", value, "pjName");
            return (Criteria) this;
        }

        public Criteria andPjNameNotEqualTo(String value) {
            addCriterion("JC_PJ_NAME <>", value, "pjName");
            return (Criteria) this;
        }

        public Criteria andPjNameGreaterThan(String value) {
            addCriterion("JC_PJ_NAME >", value, "pjName");
            return (Criteria) this;
        }

        public Criteria andPjNameGreaterThanOrEqualTo(String value) {
            addCriterion("JC_PJ_NAME >=", value, "pjName");
            return (Criteria) this;
        }

        public Criteria andPjNameLessThan(String value) {
            addCriterion("JC_PJ_NAME <", value, "pjName");
            return (Criteria) this;
        }

        public Criteria andPjNameLessThanOrEqualTo(String value) {
            addCriterion("JC_PJ_NAME <=", value, "pjName");
            return (Criteria) this;
        }

        public Criteria andPjNameLike(String value) {
            addCriterion("JC_PJ_NAME like", value, "pjName");
            return (Criteria) this;
        }

        public Criteria andPjNameNotLike(String value) {
            addCriterion("JC_PJ_NAME not like", value, "pjName");
            return (Criteria) this;
        }

        public Criteria andPjNameIn(List<String> values) {
            addCriterion("JC_PJ_NAME in", values, "pjName");
            return (Criteria) this;
        }

        public Criteria andPjNameNotIn(List<String> values) {
            addCriterion("JC_PJ_NAME not in", values, "pjName");
            return (Criteria) this;
        }

        public Criteria andPjNameBetween(String value1, String value2) {
            addCriterion("JC_PJ_NAME between", value1, value2, "pjName");
            return (Criteria) this;
        }

        public Criteria andPjNameNotBetween(String value1, String value2) {
            addCriterion("JC_PJ_NAME not between", value1, value2, "pjName");
            return (Criteria) this;
        }

        public Criteria andGoUrlIsNull() {
            addCriterion("JC_GO_URL is null");
            return (Criteria) this;
        }

        public Criteria andGoUrlIsNotNull() {
            addCriterion("JC_GO_URL is not null");
            return (Criteria) this;
        }

        public Criteria andGoUrlEqualTo(String value) {
            addCriterion("JC_GO_URL =", value, "goUrl");
            return (Criteria) this;
        }

        public Criteria andGoUrlNotEqualTo(String value) {
            addCriterion("JC_GO_URL <>", value, "goUrl");
            return (Criteria) this;
        }

        public Criteria andGoUrlGreaterThan(String value) {
            addCriterion("JC_GO_URL >", value, "goUrl");
            return (Criteria) this;
        }

        public Criteria andGoUrlGreaterThanOrEqualTo(String value) {
            addCriterion("JC_GO_URL >=", value, "goUrl");
            return (Criteria) this;
        }

        public Criteria andGoUrlLessThan(String value) {
            addCriterion("JC_GO_URL <", value, "goUrl");
            return (Criteria) this;
        }

        public Criteria andGoUrlLessThanOrEqualTo(String value) {
            addCriterion("JC_GO_URL <=", value, "goUrl");
            return (Criteria) this;
        }

        public Criteria andGoUrlLike(String value) {
            addCriterion("JC_GO_URL like", value, "goUrl");
            return (Criteria) this;
        }

        public Criteria andGoUrlNotLike(String value) {
            addCriterion("JC_GO_URL not like", value, "goUrl");
            return (Criteria) this;
        }

        public Criteria andGoUrlIn(List<String> values) {
            addCriterion("JC_GO_URL in", values, "goUrl");
            return (Criteria) this;
        }

        public Criteria andGoUrlNotIn(List<String> values) {
            addCriterion("JC_GO_URL not in", values, "goUrl");
            return (Criteria) this;
        }

        public Criteria andGoUrlBetween(String value1, String value2) {
            addCriterion("JC_GO_URL between", value1, value2, "goUrl");
            return (Criteria) this;
        }

        public Criteria andGoUrlNotBetween(String value1, String value2) {
            addCriterion("JC_GO_URL not between", value1, value2, "goUrl");
            return (Criteria) this;
        }

        public Criteria andEntNameIsNull() {
            addCriterion("JC_ENT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andEntNameIsNotNull() {
            addCriterion("JC_ENT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andEntNameEqualTo(String value) {
            addCriterion("JC_ENT_NAME =", value, "entName");
            return (Criteria) this;
        }

        public Criteria andEntNameNotEqualTo(String value) {
            addCriterion("JC_ENT_NAME <>", value, "entName");
            return (Criteria) this;
        }

        public Criteria andEntNameGreaterThan(String value) {
            addCriterion("JC_ENT_NAME >", value, "entName");
            return (Criteria) this;
        }

        public Criteria andEntNameGreaterThanOrEqualTo(String value) {
            addCriterion("JC_ENT_NAME >=", value, "entName");
            return (Criteria) this;
        }

        public Criteria andEntNameLessThan(String value) {
            addCriterion("JC_ENT_NAME <", value, "entName");
            return (Criteria) this;
        }

        public Criteria andEntNameLessThanOrEqualTo(String value) {
            addCriterion("JC_ENT_NAME <=", value, "entName");
            return (Criteria) this;
        }

        public Criteria andEntNameLike(String value) {
            addCriterion("JC_ENT_NAME like", value, "entName");
            return (Criteria) this;
        }

        public Criteria andEntNameNotLike(String value) {
            addCriterion("JC_ENT_NAME not like", value, "entName");
            return (Criteria) this;
        }

        public Criteria andEntNameIn(List<String> values) {
            addCriterion("JC_ENT_NAME in", values, "entName");
            return (Criteria) this;
        }

        public Criteria andEntNameNotIn(List<String> values) {
            addCriterion("JC_ENT_NAME not in", values, "entName");
            return (Criteria) this;
        }

        public Criteria andEntNameBetween(String value1, String value2) {
            addCriterion("JC_ENT_NAME between", value1, value2, "entName");
            return (Criteria) this;
        }

        public Criteria andEntNameNotBetween(String value1, String value2) {
            addCriterion("JC_ENT_NAME not between", value1, value2, "entName");
            return (Criteria) this;
        }

        public Criteria andInputTimeIsNull() {
            addCriterion("JC_INPUT_TIME is null");
            return (Criteria) this;
        }

        public Criteria andInputTimeIsNotNull() {
            addCriterion("JC_INPUT_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andInputTimeEqualTo(Date value) {
            addCriterion("JC_INPUT_TIME =", value, "inputTime");
            return (Criteria) this;
        }

        public Criteria andInputTimeNotEqualTo(Date value) {
            addCriterion("JC_INPUT_TIME <>", value, "inputTime");
            return (Criteria) this;
        }

        public Criteria andInputTimeGreaterThan(Date value) {
            addCriterion("JC_INPUT_TIME >", value, "inputTime");
            return (Criteria) this;
        }

        public Criteria andInputTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("JC_INPUT_TIME >=", value, "inputTime");
            return (Criteria) this;
        }

        public Criteria andInputTimeLessThan(Date value) {
            addCriterion("JC_INPUT_TIME <", value, "inputTime");
            return (Criteria) this;
        }

        public Criteria andInputTimeLessThanOrEqualTo(Date value) {
            addCriterion("JC_INPUT_TIME <=", value, "inputTime");
            return (Criteria) this;
        }

        public Criteria andInputTimeIn(List<Date> values) {
            addCriterion("JC_INPUT_TIME in", values, "inputTime");
            return (Criteria) this;
        }

        public Criteria andInputTimeNotIn(List<Date> values) {
            addCriterion("JC_INPUT_TIME not in", values, "inputTime");
            return (Criteria) this;
        }

        public Criteria andInputTimeBetween(Date value1, Date value2) {
            addCriterion("JC_INPUT_TIME between", value1, value2, "inputTime");
            return (Criteria) this;
        }

        public Criteria andInputTimeNotBetween(Date value1, Date value2) {
            addCriterion("JC_INPUT_TIME not between", value1, value2, "inputTime");
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