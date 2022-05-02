package com.fc.entity;

import java.util.ArrayList;
import java.util.List;

public class SubjectExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SubjectExample() {
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

        public Criteria andSidIsNull() {
            addCriterion("sid is null");
            return (Criteria) this;
        }

        public Criteria andSidIsNotNull() {
            addCriterion("sid is not null");
            return (Criteria) this;
        }

        public Criteria andSidEqualTo(Integer value) {
            addCriterion("sid =", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotEqualTo(Integer value) {
            addCriterion("sid <>", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidGreaterThan(Integer value) {
            addCriterion("sid >", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidGreaterThanOrEqualTo(Integer value) {
            addCriterion("sid >=", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLessThan(Integer value) {
            addCriterion("sid <", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLessThanOrEqualTo(Integer value) {
            addCriterion("sid <=", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidIn(List<Integer> values) {
            addCriterion("sid in", values, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotIn(List<Integer> values) {
            addCriterion("sid not in", values, "sid");
            return (Criteria) this;
        }

        public Criteria andSidBetween(Integer value1, Integer value2) {
            addCriterion("sid between", value1, value2, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotBetween(Integer value1, Integer value2) {
            addCriterion("sid not between", value1, value2, "sid");
            return (Criteria) this;
        }

        public Criteria andCnoIsNull() {
            addCriterion("cno is null");
            return (Criteria) this;
        }

        public Criteria andCnoIsNotNull() {
            addCriterion("cno is not null");
            return (Criteria) this;
        }

        public Criteria andCnoEqualTo(Integer value) {
            addCriterion("cno =", value, "cno");
            return (Criteria) this;
        }

        public Criteria andCnoNotEqualTo(Integer value) {
            addCriterion("cno <>", value, "cno");
            return (Criteria) this;
        }

        public Criteria andCnoGreaterThan(Integer value) {
            addCriterion("cno >", value, "cno");
            return (Criteria) this;
        }

        public Criteria andCnoGreaterThanOrEqualTo(Integer value) {
            addCriterion("cno >=", value, "cno");
            return (Criteria) this;
        }

        public Criteria andCnoLessThan(Integer value) {
            addCriterion("cno <", value, "cno");
            return (Criteria) this;
        }

        public Criteria andCnoLessThanOrEqualTo(Integer value) {
            addCriterion("cno <=", value, "cno");
            return (Criteria) this;
        }

        public Criteria andCnoIn(List<Integer> values) {
            addCriterion("cno in", values, "cno");
            return (Criteria) this;
        }

        public Criteria andCnoNotIn(List<Integer> values) {
            addCriterion("cno not in", values, "cno");
            return (Criteria) this;
        }

        public Criteria andCnoBetween(Integer value1, Integer value2) {
            addCriterion("cno between", value1, value2, "cno");
            return (Criteria) this;
        }

        public Criteria andCnoNotBetween(Integer value1, Integer value2) {
            addCriterion("cno not between", value1, value2, "cno");
            return (Criteria) this;
        }

        public Criteria andStypeIsNull() {
            addCriterion("stype is null");
            return (Criteria) this;
        }

        public Criteria andStypeIsNotNull() {
            addCriterion("stype is not null");
            return (Criteria) this;
        }

        public Criteria andStypeEqualTo(Integer value) {
            addCriterion("stype =", value, "stype");
            return (Criteria) this;
        }

        public Criteria andStypeNotEqualTo(Integer value) {
            addCriterion("stype <>", value, "stype");
            return (Criteria) this;
        }

        public Criteria andStypeGreaterThan(Integer value) {
            addCriterion("stype >", value, "stype");
            return (Criteria) this;
        }

        public Criteria andStypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("stype >=", value, "stype");
            return (Criteria) this;
        }

        public Criteria andStypeLessThan(Integer value) {
            addCriterion("stype <", value, "stype");
            return (Criteria) this;
        }

        public Criteria andStypeLessThanOrEqualTo(Integer value) {
            addCriterion("stype <=", value, "stype");
            return (Criteria) this;
        }

        public Criteria andStypeIn(List<Integer> values) {
            addCriterion("stype in", values, "stype");
            return (Criteria) this;
        }

        public Criteria andStypeNotIn(List<Integer> values) {
            addCriterion("stype not in", values, "stype");
            return (Criteria) this;
        }

        public Criteria andStypeBetween(Integer value1, Integer value2) {
            addCriterion("stype between", value1, value2, "stype");
            return (Criteria) this;
        }

        public Criteria andStypeNotBetween(Integer value1, Integer value2) {
            addCriterion("stype not between", value1, value2, "stype");
            return (Criteria) this;
        }

        public Criteria andScontentIsNull() {
            addCriterion("scontent is null");
            return (Criteria) this;
        }

        public Criteria andScontentIsNotNull() {
            addCriterion("scontent is not null");
            return (Criteria) this;
        }

        public Criteria andScontentEqualTo(String value) {
            addCriterion("scontent =", value, "scontent");
            return (Criteria) this;
        }

        public Criteria andScontentNotEqualTo(String value) {
            addCriterion("scontent <>", value, "scontent");
            return (Criteria) this;
        }

        public Criteria andScontentGreaterThan(String value) {
            addCriterion("scontent >", value, "scontent");
            return (Criteria) this;
        }

        public Criteria andScontentGreaterThanOrEqualTo(String value) {
            addCriterion("scontent >=", value, "scontent");
            return (Criteria) this;
        }

        public Criteria andScontentLessThan(String value) {
            addCriterion("scontent <", value, "scontent");
            return (Criteria) this;
        }

        public Criteria andScontentLessThanOrEqualTo(String value) {
            addCriterion("scontent <=", value, "scontent");
            return (Criteria) this;
        }

        public Criteria andScontentLike(String value) {
            addCriterion("scontent like", value, "scontent");
            return (Criteria) this;
        }

        public Criteria andScontentNotLike(String value) {
            addCriterion("scontent not like", value, "scontent");
            return (Criteria) this;
        }

        public Criteria andScontentIn(List<String> values) {
            addCriterion("scontent in", values, "scontent");
            return (Criteria) this;
        }

        public Criteria andScontentNotIn(List<String> values) {
            addCriterion("scontent not in", values, "scontent");
            return (Criteria) this;
        }

        public Criteria andScontentBetween(String value1, String value2) {
            addCriterion("scontent between", value1, value2, "scontent");
            return (Criteria) this;
        }

        public Criteria andScontentNotBetween(String value1, String value2) {
            addCriterion("scontent not between", value1, value2, "scontent");
            return (Criteria) this;
        }

        public Criteria andSaIsNull() {
            addCriterion("sa is null");
            return (Criteria) this;
        }

        public Criteria andSaIsNotNull() {
            addCriterion("sa is not null");
            return (Criteria) this;
        }

        public Criteria andSaEqualTo(String value) {
            addCriterion("sa =", value, "sa");
            return (Criteria) this;
        }

        public Criteria andSaNotEqualTo(String value) {
            addCriterion("sa <>", value, "sa");
            return (Criteria) this;
        }

        public Criteria andSaGreaterThan(String value) {
            addCriterion("sa >", value, "sa");
            return (Criteria) this;
        }

        public Criteria andSaGreaterThanOrEqualTo(String value) {
            addCriterion("sa >=", value, "sa");
            return (Criteria) this;
        }

        public Criteria andSaLessThan(String value) {
            addCriterion("sa <", value, "sa");
            return (Criteria) this;
        }

        public Criteria andSaLessThanOrEqualTo(String value) {
            addCriterion("sa <=", value, "sa");
            return (Criteria) this;
        }

        public Criteria andSaLike(String value) {
            addCriterion("sa like", value, "sa");
            return (Criteria) this;
        }

        public Criteria andSaNotLike(String value) {
            addCriterion("sa not like", value, "sa");
            return (Criteria) this;
        }

        public Criteria andSaIn(List<String> values) {
            addCriterion("sa in", values, "sa");
            return (Criteria) this;
        }

        public Criteria andSaNotIn(List<String> values) {
            addCriterion("sa not in", values, "sa");
            return (Criteria) this;
        }

        public Criteria andSaBetween(String value1, String value2) {
            addCriterion("sa between", value1, value2, "sa");
            return (Criteria) this;
        }

        public Criteria andSaNotBetween(String value1, String value2) {
            addCriterion("sa not between", value1, value2, "sa");
            return (Criteria) this;
        }

        public Criteria andSbIsNull() {
            addCriterion("sb is null");
            return (Criteria) this;
        }

        public Criteria andSbIsNotNull() {
            addCriterion("sb is not null");
            return (Criteria) this;
        }

        public Criteria andSbEqualTo(String value) {
            addCriterion("sb =", value, "sb");
            return (Criteria) this;
        }

        public Criteria andSbNotEqualTo(String value) {
            addCriterion("sb <>", value, "sb");
            return (Criteria) this;
        }

        public Criteria andSbGreaterThan(String value) {
            addCriterion("sb >", value, "sb");
            return (Criteria) this;
        }

        public Criteria andSbGreaterThanOrEqualTo(String value) {
            addCriterion("sb >=", value, "sb");
            return (Criteria) this;
        }

        public Criteria andSbLessThan(String value) {
            addCriterion("sb <", value, "sb");
            return (Criteria) this;
        }

        public Criteria andSbLessThanOrEqualTo(String value) {
            addCriterion("sb <=", value, "sb");
            return (Criteria) this;
        }

        public Criteria andSbLike(String value) {
            addCriterion("sb like", value, "sb");
            return (Criteria) this;
        }

        public Criteria andSbNotLike(String value) {
            addCriterion("sb not like", value, "sb");
            return (Criteria) this;
        }

        public Criteria andSbIn(List<String> values) {
            addCriterion("sb in", values, "sb");
            return (Criteria) this;
        }

        public Criteria andSbNotIn(List<String> values) {
            addCriterion("sb not in", values, "sb");
            return (Criteria) this;
        }

        public Criteria andSbBetween(String value1, String value2) {
            addCriterion("sb between", value1, value2, "sb");
            return (Criteria) this;
        }

        public Criteria andSbNotBetween(String value1, String value2) {
            addCriterion("sb not between", value1, value2, "sb");
            return (Criteria) this;
        }

        public Criteria andScIsNull() {
            addCriterion("sc is null");
            return (Criteria) this;
        }

        public Criteria andScIsNotNull() {
            addCriterion("sc is not null");
            return (Criteria) this;
        }

        public Criteria andScEqualTo(String value) {
            addCriterion("sc =", value, "sc");
            return (Criteria) this;
        }

        public Criteria andScNotEqualTo(String value) {
            addCriterion("sc <>", value, "sc");
            return (Criteria) this;
        }

        public Criteria andScGreaterThan(String value) {
            addCriterion("sc >", value, "sc");
            return (Criteria) this;
        }

        public Criteria andScGreaterThanOrEqualTo(String value) {
            addCriterion("sc >=", value, "sc");
            return (Criteria) this;
        }

        public Criteria andScLessThan(String value) {
            addCriterion("sc <", value, "sc");
            return (Criteria) this;
        }

        public Criteria andScLessThanOrEqualTo(String value) {
            addCriterion("sc <=", value, "sc");
            return (Criteria) this;
        }

        public Criteria andScLike(String value) {
            addCriterion("sc like", value, "sc");
            return (Criteria) this;
        }

        public Criteria andScNotLike(String value) {
            addCriterion("sc not like", value, "sc");
            return (Criteria) this;
        }

        public Criteria andScIn(List<String> values) {
            addCriterion("sc in", values, "sc");
            return (Criteria) this;
        }

        public Criteria andScNotIn(List<String> values) {
            addCriterion("sc not in", values, "sc");
            return (Criteria) this;
        }

        public Criteria andScBetween(String value1, String value2) {
            addCriterion("sc between", value1, value2, "sc");
            return (Criteria) this;
        }

        public Criteria andScNotBetween(String value1, String value2) {
            addCriterion("sc not between", value1, value2, "sc");
            return (Criteria) this;
        }

        public Criteria andSdIsNull() {
            addCriterion("sd is null");
            return (Criteria) this;
        }

        public Criteria andSdIsNotNull() {
            addCriterion("sd is not null");
            return (Criteria) this;
        }

        public Criteria andSdEqualTo(String value) {
            addCriterion("sd =", value, "sd");
            return (Criteria) this;
        }

        public Criteria andSdNotEqualTo(String value) {
            addCriterion("sd <>", value, "sd");
            return (Criteria) this;
        }

        public Criteria andSdGreaterThan(String value) {
            addCriterion("sd >", value, "sd");
            return (Criteria) this;
        }

        public Criteria andSdGreaterThanOrEqualTo(String value) {
            addCriterion("sd >=", value, "sd");
            return (Criteria) this;
        }

        public Criteria andSdLessThan(String value) {
            addCriterion("sd <", value, "sd");
            return (Criteria) this;
        }

        public Criteria andSdLessThanOrEqualTo(String value) {
            addCriterion("sd <=", value, "sd");
            return (Criteria) this;
        }

        public Criteria andSdLike(String value) {
            addCriterion("sd like", value, "sd");
            return (Criteria) this;
        }

        public Criteria andSdNotLike(String value) {
            addCriterion("sd not like", value, "sd");
            return (Criteria) this;
        }

        public Criteria andSdIn(List<String> values) {
            addCriterion("sd in", values, "sd");
            return (Criteria) this;
        }

        public Criteria andSdNotIn(List<String> values) {
            addCriterion("sd not in", values, "sd");
            return (Criteria) this;
        }

        public Criteria andSdBetween(String value1, String value2) {
            addCriterion("sd between", value1, value2, "sd");
            return (Criteria) this;
        }

        public Criteria andSdNotBetween(String value1, String value2) {
            addCriterion("sd not between", value1, value2, "sd");
            return (Criteria) this;
        }

        public Criteria andSkeyIsNull() {
            addCriterion("skey is null");
            return (Criteria) this;
        }

        public Criteria andSkeyIsNotNull() {
            addCriterion("skey is not null");
            return (Criteria) this;
        }

        public Criteria andSkeyEqualTo(String value) {
            addCriterion("skey =", value, "skey");
            return (Criteria) this;
        }

        public Criteria andSkeyNotEqualTo(String value) {
            addCriterion("skey <>", value, "skey");
            return (Criteria) this;
        }

        public Criteria andSkeyGreaterThan(String value) {
            addCriterion("skey >", value, "skey");
            return (Criteria) this;
        }

        public Criteria andSkeyGreaterThanOrEqualTo(String value) {
            addCriterion("skey >=", value, "skey");
            return (Criteria) this;
        }

        public Criteria andSkeyLessThan(String value) {
            addCriterion("skey <", value, "skey");
            return (Criteria) this;
        }

        public Criteria andSkeyLessThanOrEqualTo(String value) {
            addCriterion("skey <=", value, "skey");
            return (Criteria) this;
        }

        public Criteria andSkeyLike(String value) {
            addCriterion("skey like", value, "skey");
            return (Criteria) this;
        }

        public Criteria andSkeyNotLike(String value) {
            addCriterion("skey not like", value, "skey");
            return (Criteria) this;
        }

        public Criteria andSkeyIn(List<String> values) {
            addCriterion("skey in", values, "skey");
            return (Criteria) this;
        }

        public Criteria andSkeyNotIn(List<String> values) {
            addCriterion("skey not in", values, "skey");
            return (Criteria) this;
        }

        public Criteria andSkeyBetween(String value1, String value2) {
            addCriterion("skey between", value1, value2, "skey");
            return (Criteria) this;
        }

        public Criteria andSkeyNotBetween(String value1, String value2) {
            addCriterion("skey not between", value1, value2, "skey");
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