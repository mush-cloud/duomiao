package com.duomiao.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class JobReplyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public JobReplyExample() {
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

        public Criteria andHrIdIsNull() {
            addCriterion("JR_HR_ID is null");
            return (Criteria) this;
        }

        public Criteria andHrIdIsNotNull() {
            addCriterion("JR_HR_ID is not null");
            return (Criteria) this;
        }

        public Criteria andHrIdEqualTo(String value) {
            addCriterion("JR_HR_ID =", value, "hrId");
            return (Criteria) this;
        }

        public Criteria andHrIdNotEqualTo(String value) {
            addCriterion("JR_HR_ID <>", value, "hrId");
            return (Criteria) this;
        }

        public Criteria andHrIdGreaterThan(String value) {
            addCriterion("JR_HR_ID >", value, "hrId");
            return (Criteria) this;
        }

        public Criteria andHrIdGreaterThanOrEqualTo(String value) {
            addCriterion("JR_HR_ID >=", value, "hrId");
            return (Criteria) this;
        }

        public Criteria andHrIdLessThan(String value) {
            addCriterion("JR_HR_ID <", value, "hrId");
            return (Criteria) this;
        }

        public Criteria andHrIdLessThanOrEqualTo(String value) {
            addCriterion("JR_HR_ID <=", value, "hrId");
            return (Criteria) this;
        }

        public Criteria andHrIdLike(String value) {
            addCriterion("JR_HR_ID like", value, "hrId");
            return (Criteria) this;
        }

        public Criteria andHrIdNotLike(String value) {
            addCriterion("JR_HR_ID not like", value, "hrId");
            return (Criteria) this;
        }

        public Criteria andHrIdIn(List<String> values) {
            addCriterion("JR_HR_ID in", values, "hrId");
            return (Criteria) this;
        }

        public Criteria andHrIdNotIn(List<String> values) {
            addCriterion("JR_HR_ID not in", values, "hrId");
            return (Criteria) this;
        }

        public Criteria andHrIdBetween(String value1, String value2) {
            addCriterion("JR_HR_ID between", value1, value2, "hrId");
            return (Criteria) this;
        }

        public Criteria andHrIdNotBetween(String value1, String value2) {
            addCriterion("JR_HR_ID not between", value1, value2, "hrId");
            return (Criteria) this;
        }

        public Criteria andIntIdIsNull() {
            addCriterion("JR_INT_ID is null");
            return (Criteria) this;
        }

        public Criteria andIntIdIsNotNull() {
            addCriterion("JR_INT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andIntIdEqualTo(String value) {
            addCriterion("JR_INT_ID =", value, "intId");
            return (Criteria) this;
        }

        public Criteria andIntIdNotEqualTo(String value) {
            addCriterion("JR_INT_ID <>", value, "intId");
            return (Criteria) this;
        }

        public Criteria andIntIdGreaterThan(String value) {
            addCriterion("JR_INT_ID >", value, "intId");
            return (Criteria) this;
        }

        public Criteria andIntIdGreaterThanOrEqualTo(String value) {
            addCriterion("JR_INT_ID >=", value, "intId");
            return (Criteria) this;
        }

        public Criteria andIntIdLessThan(String value) {
            addCriterion("JR_INT_ID <", value, "intId");
            return (Criteria) this;
        }

        public Criteria andIntIdLessThanOrEqualTo(String value) {
            addCriterion("JR_INT_ID <=", value, "intId");
            return (Criteria) this;
        }

        public Criteria andIntIdLike(String value) {
            addCriterion("JR_INT_ID like", value, "intId");
            return (Criteria) this;
        }

        public Criteria andIntIdNotLike(String value) {
            addCriterion("JR_INT_ID not like", value, "intId");
            return (Criteria) this;
        }

        public Criteria andIntIdIn(List<String> values) {
            addCriterion("JR_INT_ID in", values, "intId");
            return (Criteria) this;
        }

        public Criteria andIntIdNotIn(List<String> values) {
            addCriterion("JR_INT_ID not in", values, "intId");
            return (Criteria) this;
        }

        public Criteria andIntIdBetween(String value1, String value2) {
            addCriterion("JR_INT_ID between", value1, value2, "intId");
            return (Criteria) this;
        }

        public Criteria andIntIdNotBetween(String value1, String value2) {
            addCriterion("JR_INT_ID not between", value1, value2, "intId");
            return (Criteria) this;
        }

        public Criteria andMainInfoIsNull() {
            addCriterion("JR_MAIN_INFO is null");
            return (Criteria) this;
        }

        public Criteria andMainInfoIsNotNull() {
            addCriterion("JR_MAIN_INFO is not null");
            return (Criteria) this;
        }

        public Criteria andMainInfoEqualTo(String value) {
            addCriterion("JR_MAIN_INFO =", value, "mainInfo");
            return (Criteria) this;
        }

        public Criteria andMainInfoNotEqualTo(String value) {
            addCriterion("JR_MAIN_INFO <>", value, "mainInfo");
            return (Criteria) this;
        }

        public Criteria andMainInfoGreaterThan(String value) {
            addCriterion("JR_MAIN_INFO >", value, "mainInfo");
            return (Criteria) this;
        }

        public Criteria andMainInfoGreaterThanOrEqualTo(String value) {
            addCriterion("JR_MAIN_INFO >=", value, "mainInfo");
            return (Criteria) this;
        }

        public Criteria andMainInfoLessThan(String value) {
            addCriterion("JR_MAIN_INFO <", value, "mainInfo");
            return (Criteria) this;
        }

        public Criteria andMainInfoLessThanOrEqualTo(String value) {
            addCriterion("JR_MAIN_INFO <=", value, "mainInfo");
            return (Criteria) this;
        }

        public Criteria andMainInfoLike(String value) {
            addCriterion("JR_MAIN_INFO like", value, "mainInfo");
            return (Criteria) this;
        }

        public Criteria andMainInfoNotLike(String value) {
            addCriterion("JR_MAIN_INFO not like", value, "mainInfo");
            return (Criteria) this;
        }

        public Criteria andMainInfoIn(List<String> values) {
            addCriterion("JR_MAIN_INFO in", values, "mainInfo");
            return (Criteria) this;
        }

        public Criteria andMainInfoNotIn(List<String> values) {
            addCriterion("JR_MAIN_INFO not in", values, "mainInfo");
            return (Criteria) this;
        }

        public Criteria andMainInfoBetween(String value1, String value2) {
            addCriterion("JR_MAIN_INFO between", value1, value2, "mainInfo");
            return (Criteria) this;
        }

        public Criteria andMainInfoNotBetween(String value1, String value2) {
            addCriterion("JR_MAIN_INFO not between", value1, value2, "mainInfo");
            return (Criteria) this;
        }

        public Criteria andReplyTimeIsNull() {
            addCriterion("JR_REPLY_TIME is null");
            return (Criteria) this;
        }

        public Criteria andReplyTimeIsNotNull() {
            addCriterion("JR_REPLY_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andReplyTimeEqualTo(Date value) {
            addCriterion("JR_REPLY_TIME =", value, "replyTime");
            return (Criteria) this;
        }

        public Criteria andReplyTimeNotEqualTo(Date value) {
            addCriterion("JR_REPLY_TIME <>", value, "replyTime");
            return (Criteria) this;
        }

        public Criteria andReplyTimeGreaterThan(Date value) {
            addCriterion("JR_REPLY_TIME >", value, "replyTime");
            return (Criteria) this;
        }

        public Criteria andReplyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("JR_REPLY_TIME >=", value, "replyTime");
            return (Criteria) this;
        }

        public Criteria andReplyTimeLessThan(Date value) {
            addCriterion("JR_REPLY_TIME <", value, "replyTime");
            return (Criteria) this;
        }

        public Criteria andReplyTimeLessThanOrEqualTo(Date value) {
            addCriterion("JR_REPLY_TIME <=", value, "replyTime");
            return (Criteria) this;
        }

        public Criteria andReplyTimeIn(List<Date> values) {
            addCriterion("JR_REPLY_TIME in", values, "replyTime");
            return (Criteria) this;
        }

        public Criteria andReplyTimeNotIn(List<Date> values) {
            addCriterion("JR_REPLY_TIME not in", values, "replyTime");
            return (Criteria) this;
        }

        public Criteria andReplyTimeBetween(Date value1, Date value2) {
            addCriterion("JR_REPLY_TIME between", value1, value2, "replyTime");
            return (Criteria) this;
        }

        public Criteria andReplyTimeNotBetween(Date value1, Date value2) {
            addCriterion("JR_REPLY_TIME not between", value1, value2, "replyTime");
            return (Criteria) this;
        }

        public Criteria andJobIdIsNull() {
            addCriterion("JR_JOB_ID is null");
            return (Criteria) this;
        }

        public Criteria andJobIdIsNotNull() {
            addCriterion("JR_JOB_ID is not null");
            return (Criteria) this;
        }

        public Criteria andJobIdEqualTo(String value) {
            addCriterion("JR_JOB_ID =", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdNotEqualTo(String value) {
            addCriterion("JR_JOB_ID <>", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdGreaterThan(String value) {
            addCriterion("JR_JOB_ID >", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdGreaterThanOrEqualTo(String value) {
            addCriterion("JR_JOB_ID >=", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdLessThan(String value) {
            addCriterion("JR_JOB_ID <", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdLessThanOrEqualTo(String value) {
            addCriterion("JR_JOB_ID <=", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdLike(String value) {
            addCriterion("JR_JOB_ID like", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdNotLike(String value) {
            addCriterion("JR_JOB_ID not like", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdIn(List<String> values) {
            addCriterion("JR_JOB_ID in", values, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdNotIn(List<String> values) {
            addCriterion("JR_JOB_ID not in", values, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdBetween(String value1, String value2) {
            addCriterion("JR_JOB_ID between", value1, value2, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdNotBetween(String value1, String value2) {
            addCriterion("JR_JOB_ID not between", value1, value2, "jobId");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNull() {
            addCriterion("JR_PARENT_ID is null");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNotNull() {
            addCriterion("JR_PARENT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andParentIdEqualTo(String value) {
            addCriterion("JR_PARENT_ID =", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotEqualTo(String value) {
            addCriterion("JR_PARENT_ID <>", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThan(String value) {
            addCriterion("JR_PARENT_ID >", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThanOrEqualTo(String value) {
            addCriterion("JR_PARENT_ID >=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThan(String value) {
            addCriterion("JR_PARENT_ID <", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThanOrEqualTo(String value) {
            addCriterion("JR_PARENT_ID <=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLike(String value) {
            addCriterion("JR_PARENT_ID like", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotLike(String value) {
            addCriterion("JR_PARENT_ID not like", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdIn(List<String> values) {
            addCriterion("JR_PARENT_ID in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotIn(List<String> values) {
            addCriterion("JR_PARENT_ID not in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdBetween(String value1, String value2) {
            addCriterion("JR_PARENT_ID between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotBetween(String value1, String value2) {
            addCriterion("JR_PARENT_ID not between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andReplyNumIsNull() {
            addCriterion("JR_REPLY_NUM is null");
            return (Criteria) this;
        }

        public Criteria andReplyNumIsNotNull() {
            addCriterion("JR_REPLY_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andReplyNumEqualTo(String value) {
            addCriterion("JR_REPLY_NUM =", value, "replyNum");
            return (Criteria) this;
        }

        public Criteria andReplyNumNotEqualTo(String value) {
            addCriterion("JR_REPLY_NUM <>", value, "replyNum");
            return (Criteria) this;
        }

        public Criteria andReplyNumGreaterThan(String value) {
            addCriterion("JR_REPLY_NUM >", value, "replyNum");
            return (Criteria) this;
        }

        public Criteria andReplyNumGreaterThanOrEqualTo(String value) {
            addCriterion("JR_REPLY_NUM >=", value, "replyNum");
            return (Criteria) this;
        }

        public Criteria andReplyNumLessThan(String value) {
            addCriterion("JR_REPLY_NUM <", value, "replyNum");
            return (Criteria) this;
        }

        public Criteria andReplyNumLessThanOrEqualTo(String value) {
            addCriterion("JR_REPLY_NUM <=", value, "replyNum");
            return (Criteria) this;
        }

        public Criteria andReplyNumLike(String value) {
            addCriterion("JR_REPLY_NUM like", value, "replyNum");
            return (Criteria) this;
        }

        public Criteria andReplyNumNotLike(String value) {
            addCriterion("JR_REPLY_NUM not like", value, "replyNum");
            return (Criteria) this;
        }

        public Criteria andReplyNumIn(List<String> values) {
            addCriterion("JR_REPLY_NUM in", values, "replyNum");
            return (Criteria) this;
        }

        public Criteria andReplyNumNotIn(List<String> values) {
            addCriterion("JR_REPLY_NUM not in", values, "replyNum");
            return (Criteria) this;
        }

        public Criteria andReplyNumBetween(String value1, String value2) {
            addCriterion("JR_REPLY_NUM between", value1, value2, "replyNum");
            return (Criteria) this;
        }

        public Criteria andReplyNumNotBetween(String value1, String value2) {
            addCriterion("JR_REPLY_NUM not between", value1, value2, "replyNum");
            return (Criteria) this;
        }

        public Criteria andAgreeNumIsNull() {
            addCriterion("JR_AGREE_NUM is null");
            return (Criteria) this;
        }

        public Criteria andAgreeNumIsNotNull() {
            addCriterion("JR_AGREE_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andAgreeNumEqualTo(String value) {
            addCriterion("JR_AGREE_NUM =", value, "agreeNum");
            return (Criteria) this;
        }

        public Criteria andAgreeNumNotEqualTo(String value) {
            addCriterion("JR_AGREE_NUM <>", value, "agreeNum");
            return (Criteria) this;
        }

        public Criteria andAgreeNumGreaterThan(String value) {
            addCriterion("JR_AGREE_NUM >", value, "agreeNum");
            return (Criteria) this;
        }

        public Criteria andAgreeNumGreaterThanOrEqualTo(String value) {
            addCriterion("JR_AGREE_NUM >=", value, "agreeNum");
            return (Criteria) this;
        }

        public Criteria andAgreeNumLessThan(String value) {
            addCriterion("JR_AGREE_NUM <", value, "agreeNum");
            return (Criteria) this;
        }

        public Criteria andAgreeNumLessThanOrEqualTo(String value) {
            addCriterion("JR_AGREE_NUM <=", value, "agreeNum");
            return (Criteria) this;
        }

        public Criteria andAgreeNumLike(String value) {
            addCriterion("JR_AGREE_NUM like", value, "agreeNum");
            return (Criteria) this;
        }

        public Criteria andAgreeNumNotLike(String value) {
            addCriterion("JR_AGREE_NUM not like", value, "agreeNum");
            return (Criteria) this;
        }

        public Criteria andAgreeNumIn(List<String> values) {
            addCriterion("JR_AGREE_NUM in", values, "agreeNum");
            return (Criteria) this;
        }

        public Criteria andAgreeNumNotIn(List<String> values) {
            addCriterion("JR_AGREE_NUM not in", values, "agreeNum");
            return (Criteria) this;
        }

        public Criteria andAgreeNumBetween(String value1, String value2) {
            addCriterion("JR_AGREE_NUM between", value1, value2, "agreeNum");
            return (Criteria) this;
        }

        public Criteria andAgreeNumNotBetween(String value1, String value2) {
            addCriterion("JR_AGREE_NUM not between", value1, value2, "agreeNum");
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