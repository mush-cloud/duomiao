package com.duomiao.entity;

import java.util.ArrayList;
import java.util.List;

public class ResumeInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ResumeInfoExample() {
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

        public Criteria andNameIsNull() {
            addCriterion("RI_NAME is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("RI_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("RI_NAME =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("RI_NAME <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("RI_NAME >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("RI_NAME >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("RI_NAME <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("RI_NAME <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("RI_NAME like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("RI_NAME not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("RI_NAME in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("RI_NAME not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("RI_NAME between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("RI_NAME not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andMottoIsNull() {
            addCriterion("RI_MOTTO is null");
            return (Criteria) this;
        }

        public Criteria andMottoIsNotNull() {
            addCriterion("RI_MOTTO is not null");
            return (Criteria) this;
        }

        public Criteria andMottoEqualTo(String value) {
            addCriterion("RI_MOTTO =", value, "motto");
            return (Criteria) this;
        }

        public Criteria andMottoNotEqualTo(String value) {
            addCriterion("RI_MOTTO <>", value, "motto");
            return (Criteria) this;
        }

        public Criteria andMottoGreaterThan(String value) {
            addCriterion("RI_MOTTO >", value, "motto");
            return (Criteria) this;
        }

        public Criteria andMottoGreaterThanOrEqualTo(String value) {
            addCriterion("RI_MOTTO >=", value, "motto");
            return (Criteria) this;
        }

        public Criteria andMottoLessThan(String value) {
            addCriterion("RI_MOTTO <", value, "motto");
            return (Criteria) this;
        }

        public Criteria andMottoLessThanOrEqualTo(String value) {
            addCriterion("RI_MOTTO <=", value, "motto");
            return (Criteria) this;
        }

        public Criteria andMottoLike(String value) {
            addCriterion("RI_MOTTO like", value, "motto");
            return (Criteria) this;
        }

        public Criteria andMottoNotLike(String value) {
            addCriterion("RI_MOTTO not like", value, "motto");
            return (Criteria) this;
        }

        public Criteria andMottoIn(List<String> values) {
            addCriterion("RI_MOTTO in", values, "motto");
            return (Criteria) this;
        }

        public Criteria andMottoNotIn(List<String> values) {
            addCriterion("RI_MOTTO not in", values, "motto");
            return (Criteria) this;
        }

        public Criteria andMottoBetween(String value1, String value2) {
            addCriterion("RI_MOTTO between", value1, value2, "motto");
            return (Criteria) this;
        }

        public Criteria andMottoNotBetween(String value1, String value2) {
            addCriterion("RI_MOTTO not between", value1, value2, "motto");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("RI_SEX is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("RI_SEX is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("RI_SEX =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("RI_SEX <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("RI_SEX >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("RI_SEX >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("RI_SEX <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("RI_SEX <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("RI_SEX like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("RI_SEX not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("RI_SEX in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("RI_SEX not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("RI_SEX between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("RI_SEX not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andAgeIsNull() {
            addCriterion("RI_AGE is null");
            return (Criteria) this;
        }

        public Criteria andAgeIsNotNull() {
            addCriterion("RI_AGE is not null");
            return (Criteria) this;
        }

        public Criteria andAgeEqualTo(String value) {
            addCriterion("RI_AGE =", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotEqualTo(String value) {
            addCriterion("RI_AGE <>", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThan(String value) {
            addCriterion("RI_AGE >", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThanOrEqualTo(String value) {
            addCriterion("RI_AGE >=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThan(String value) {
            addCriterion("RI_AGE <", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThanOrEqualTo(String value) {
            addCriterion("RI_AGE <=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLike(String value) {
            addCriterion("RI_AGE like", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotLike(String value) {
            addCriterion("RI_AGE not like", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeIn(List<String> values) {
            addCriterion("RI_AGE in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotIn(List<String> values) {
            addCriterion("RI_AGE not in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeBetween(String value1, String value2) {
            addCriterion("RI_AGE between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotBetween(String value1, String value2) {
            addCriterion("RI_AGE not between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andHpIsNull() {
            addCriterion("RI_HP is null");
            return (Criteria) this;
        }

        public Criteria andHpIsNotNull() {
            addCriterion("RI_HP is not null");
            return (Criteria) this;
        }

        public Criteria andHpEqualTo(String value) {
            addCriterion("RI_HP =", value, "hp");
            return (Criteria) this;
        }

        public Criteria andHpNotEqualTo(String value) {
            addCriterion("RI_HP <>", value, "hp");
            return (Criteria) this;
        }

        public Criteria andHpGreaterThan(String value) {
            addCriterion("RI_HP >", value, "hp");
            return (Criteria) this;
        }

        public Criteria andHpGreaterThanOrEqualTo(String value) {
            addCriterion("RI_HP >=", value, "hp");
            return (Criteria) this;
        }

        public Criteria andHpLessThan(String value) {
            addCriterion("RI_HP <", value, "hp");
            return (Criteria) this;
        }

        public Criteria andHpLessThanOrEqualTo(String value) {
            addCriterion("RI_HP <=", value, "hp");
            return (Criteria) this;
        }

        public Criteria andHpLike(String value) {
            addCriterion("RI_HP like", value, "hp");
            return (Criteria) this;
        }

        public Criteria andHpNotLike(String value) {
            addCriterion("RI_HP not like", value, "hp");
            return (Criteria) this;
        }

        public Criteria andHpIn(List<String> values) {
            addCriterion("RI_HP in", values, "hp");
            return (Criteria) this;
        }

        public Criteria andHpNotIn(List<String> values) {
            addCriterion("RI_HP not in", values, "hp");
            return (Criteria) this;
        }

        public Criteria andHpBetween(String value1, String value2) {
            addCriterion("RI_HP between", value1, value2, "hp");
            return (Criteria) this;
        }

        public Criteria andHpNotBetween(String value1, String value2) {
            addCriterion("RI_HP not between", value1, value2, "hp");
            return (Criteria) this;
        }

        public Criteria andTelIsNull() {
            addCriterion("RI_TEl is null");
            return (Criteria) this;
        }

        public Criteria andTelIsNotNull() {
            addCriterion("RI_TEl is not null");
            return (Criteria) this;
        }

        public Criteria andTelEqualTo(String value) {
            addCriterion("RI_TEl =", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotEqualTo(String value) {
            addCriterion("RI_TEl <>", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThan(String value) {
            addCriterion("RI_TEl >", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThanOrEqualTo(String value) {
            addCriterion("RI_TEl >=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThan(String value) {
            addCriterion("RI_TEl <", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThanOrEqualTo(String value) {
            addCriterion("RI_TEl <=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLike(String value) {
            addCriterion("RI_TEl like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotLike(String value) {
            addCriterion("RI_TEl not like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelIn(List<String> values) {
            addCriterion("RI_TEl in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotIn(List<String> values) {
            addCriterion("RI_TEl not in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelBetween(String value1, String value2) {
            addCriterion("RI_TEl between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotBetween(String value1, String value2) {
            addCriterion("RI_TEl not between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("RI_EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("RI_EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("RI_EMAIL =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("RI_EMAIL <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("RI_EMAIL >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("RI_EMAIL >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("RI_EMAIL <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("RI_EMAIL <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("RI_EMAIL like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("RI_EMAIL not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("RI_EMAIL in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("RI_EMAIL not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("RI_EMAIL between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("RI_EMAIL not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andMajorIsNull() {
            addCriterion("RI_MAJOR is null");
            return (Criteria) this;
        }

        public Criteria andMajorIsNotNull() {
            addCriterion("RI_MAJOR is not null");
            return (Criteria) this;
        }

        public Criteria andMajorEqualTo(String value) {
            addCriterion("RI_MAJOR =", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotEqualTo(String value) {
            addCriterion("RI_MAJOR <>", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorGreaterThan(String value) {
            addCriterion("RI_MAJOR >", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorGreaterThanOrEqualTo(String value) {
            addCriterion("RI_MAJOR >=", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorLessThan(String value) {
            addCriterion("RI_MAJOR <", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorLessThanOrEqualTo(String value) {
            addCriterion("RI_MAJOR <=", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorLike(String value) {
            addCriterion("RI_MAJOR like", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotLike(String value) {
            addCriterion("RI_MAJOR not like", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorIn(List<String> values) {
            addCriterion("RI_MAJOR in", values, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotIn(List<String> values) {
            addCriterion("RI_MAJOR not in", values, "major");
            return (Criteria) this;
        }

        public Criteria andMajorBetween(String value1, String value2) {
            addCriterion("RI_MAJOR between", value1, value2, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotBetween(String value1, String value2) {
            addCriterion("RI_MAJOR not between", value1, value2, "major");
            return (Criteria) this;
        }

        public Criteria andCollogeIsNull() {
            addCriterion("RI_COLLOGE is null");
            return (Criteria) this;
        }

        public Criteria andCollogeIsNotNull() {
            addCriterion("RI_COLLOGE is not null");
            return (Criteria) this;
        }

        public Criteria andCollogeEqualTo(String value) {
            addCriterion("RI_COLLOGE =", value, "colloge");
            return (Criteria) this;
        }

        public Criteria andCollogeNotEqualTo(String value) {
            addCriterion("RI_COLLOGE <>", value, "colloge");
            return (Criteria) this;
        }

        public Criteria andCollogeGreaterThan(String value) {
            addCriterion("RI_COLLOGE >", value, "colloge");
            return (Criteria) this;
        }

        public Criteria andCollogeGreaterThanOrEqualTo(String value) {
            addCriterion("RI_COLLOGE >=", value, "colloge");
            return (Criteria) this;
        }

        public Criteria andCollogeLessThan(String value) {
            addCriterion("RI_COLLOGE <", value, "colloge");
            return (Criteria) this;
        }

        public Criteria andCollogeLessThanOrEqualTo(String value) {
            addCriterion("RI_COLLOGE <=", value, "colloge");
            return (Criteria) this;
        }

        public Criteria andCollogeLike(String value) {
            addCriterion("RI_COLLOGE like", value, "colloge");
            return (Criteria) this;
        }

        public Criteria andCollogeNotLike(String value) {
            addCriterion("RI_COLLOGE not like", value, "colloge");
            return (Criteria) this;
        }

        public Criteria andCollogeIn(List<String> values) {
            addCriterion("RI_COLLOGE in", values, "colloge");
            return (Criteria) this;
        }

        public Criteria andCollogeNotIn(List<String> values) {
            addCriterion("RI_COLLOGE not in", values, "colloge");
            return (Criteria) this;
        }

        public Criteria andCollogeBetween(String value1, String value2) {
            addCriterion("RI_COLLOGE between", value1, value2, "colloge");
            return (Criteria) this;
        }

        public Criteria andCollogeNotBetween(String value1, String value2) {
            addCriterion("RI_COLLOGE not between", value1, value2, "colloge");
            return (Criteria) this;
        }

        public Criteria andAcademicIsNull() {
            addCriterion("RI_ACADEMIC is null");
            return (Criteria) this;
        }

        public Criteria andAcademicIsNotNull() {
            addCriterion("RI_ACADEMIC is not null");
            return (Criteria) this;
        }

        public Criteria andAcademicEqualTo(String value) {
            addCriterion("RI_ACADEMIC =", value, "academic");
            return (Criteria) this;
        }

        public Criteria andAcademicNotEqualTo(String value) {
            addCriterion("RI_ACADEMIC <>", value, "academic");
            return (Criteria) this;
        }

        public Criteria andAcademicGreaterThan(String value) {
            addCriterion("RI_ACADEMIC >", value, "academic");
            return (Criteria) this;
        }

        public Criteria andAcademicGreaterThanOrEqualTo(String value) {
            addCriterion("RI_ACADEMIC >=", value, "academic");
            return (Criteria) this;
        }

        public Criteria andAcademicLessThan(String value) {
            addCriterion("RI_ACADEMIC <", value, "academic");
            return (Criteria) this;
        }

        public Criteria andAcademicLessThanOrEqualTo(String value) {
            addCriterion("RI_ACADEMIC <=", value, "academic");
            return (Criteria) this;
        }

        public Criteria andAcademicLike(String value) {
            addCriterion("RI_ACADEMIC like", value, "academic");
            return (Criteria) this;
        }

        public Criteria andAcademicNotLike(String value) {
            addCriterion("RI_ACADEMIC not like", value, "academic");
            return (Criteria) this;
        }

        public Criteria andAcademicIn(List<String> values) {
            addCriterion("RI_ACADEMIC in", values, "academic");
            return (Criteria) this;
        }

        public Criteria andAcademicNotIn(List<String> values) {
            addCriterion("RI_ACADEMIC not in", values, "academic");
            return (Criteria) this;
        }

        public Criteria andAcademicBetween(String value1, String value2) {
            addCriterion("RI_ACADEMIC between", value1, value2, "academic");
            return (Criteria) this;
        }

        public Criteria andAcademicNotBetween(String value1, String value2) {
            addCriterion("RI_ACADEMIC not between", value1, value2, "academic");
            return (Criteria) this;
        }

        public Criteria andJobNameIsNull() {
            addCriterion("RI_JOB_NAME is null");
            return (Criteria) this;
        }

        public Criteria andJobNameIsNotNull() {
            addCriterion("RI_JOB_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andJobNameEqualTo(String value) {
            addCriterion("RI_JOB_NAME =", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameNotEqualTo(String value) {
            addCriterion("RI_JOB_NAME <>", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameGreaterThan(String value) {
            addCriterion("RI_JOB_NAME >", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameGreaterThanOrEqualTo(String value) {
            addCriterion("RI_JOB_NAME >=", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameLessThan(String value) {
            addCriterion("RI_JOB_NAME <", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameLessThanOrEqualTo(String value) {
            addCriterion("RI_JOB_NAME <=", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameLike(String value) {
            addCriterion("RI_JOB_NAME like", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameNotLike(String value) {
            addCriterion("RI_JOB_NAME not like", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameIn(List<String> values) {
            addCriterion("RI_JOB_NAME in", values, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameNotIn(List<String> values) {
            addCriterion("RI_JOB_NAME not in", values, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameBetween(String value1, String value2) {
            addCriterion("RI_JOB_NAME between", value1, value2, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameNotBetween(String value1, String value2) {
            addCriterion("RI_JOB_NAME not between", value1, value2, "jobName");
            return (Criteria) this;
        }

        public Criteria andWorkplaceIsNull() {
            addCriterion("RI_WORKPLACE is null");
            return (Criteria) this;
        }

        public Criteria andWorkplaceIsNotNull() {
            addCriterion("RI_WORKPLACE is not null");
            return (Criteria) this;
        }

        public Criteria andWorkplaceEqualTo(String value) {
            addCriterion("RI_WORKPLACE =", value, "workplace");
            return (Criteria) this;
        }

        public Criteria andWorkplaceNotEqualTo(String value) {
            addCriterion("RI_WORKPLACE <>", value, "workplace");
            return (Criteria) this;
        }

        public Criteria andWorkplaceGreaterThan(String value) {
            addCriterion("RI_WORKPLACE >", value, "workplace");
            return (Criteria) this;
        }

        public Criteria andWorkplaceGreaterThanOrEqualTo(String value) {
            addCriterion("RI_WORKPLACE >=", value, "workplace");
            return (Criteria) this;
        }

        public Criteria andWorkplaceLessThan(String value) {
            addCriterion("RI_WORKPLACE <", value, "workplace");
            return (Criteria) this;
        }

        public Criteria andWorkplaceLessThanOrEqualTo(String value) {
            addCriterion("RI_WORKPLACE <=", value, "workplace");
            return (Criteria) this;
        }

        public Criteria andWorkplaceLike(String value) {
            addCriterion("RI_WORKPLACE like", value, "workplace");
            return (Criteria) this;
        }

        public Criteria andWorkplaceNotLike(String value) {
            addCriterion("RI_WORKPLACE not like", value, "workplace");
            return (Criteria) this;
        }

        public Criteria andWorkplaceIn(List<String> values) {
            addCriterion("RI_WORKPLACE in", values, "workplace");
            return (Criteria) this;
        }

        public Criteria andWorkplaceNotIn(List<String> values) {
            addCriterion("RI_WORKPLACE not in", values, "workplace");
            return (Criteria) this;
        }

        public Criteria andWorkplaceBetween(String value1, String value2) {
            addCriterion("RI_WORKPLACE between", value1, value2, "workplace");
            return (Criteria) this;
        }

        public Criteria andWorkplaceNotBetween(String value1, String value2) {
            addCriterion("RI_WORKPLACE not between", value1, value2, "workplace");
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