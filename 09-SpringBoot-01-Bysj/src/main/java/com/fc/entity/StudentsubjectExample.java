package com.fc.entity;

import java.util.ArrayList;
import java.util.List;

public class StudentsubjectExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StudentsubjectExample() {
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

        public Criteria andSsidIsNull() {
            addCriterion("ssid is null");
            return (Criteria) this;
        }

        public Criteria andSsidIsNotNull() {
            addCriterion("ssid is not null");
            return (Criteria) this;
        }

        public Criteria andSsidEqualTo(Integer value) {
            addCriterion("ssid =", value, "ssid");
            return (Criteria) this;
        }

        public Criteria andSsidNotEqualTo(Integer value) {
            addCriterion("ssid <>", value, "ssid");
            return (Criteria) this;
        }

        public Criteria andSsidGreaterThan(Integer value) {
            addCriterion("ssid >", value, "ssid");
            return (Criteria) this;
        }

        public Criteria andSsidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ssid >=", value, "ssid");
            return (Criteria) this;
        }

        public Criteria andSsidLessThan(Integer value) {
            addCriterion("ssid <", value, "ssid");
            return (Criteria) this;
        }

        public Criteria andSsidLessThanOrEqualTo(Integer value) {
            addCriterion("ssid <=", value, "ssid");
            return (Criteria) this;
        }

        public Criteria andSsidIn(List<Integer> values) {
            addCriterion("ssid in", values, "ssid");
            return (Criteria) this;
        }

        public Criteria andSsidNotIn(List<Integer> values) {
            addCriterion("ssid not in", values, "ssid");
            return (Criteria) this;
        }

        public Criteria andSsidBetween(Integer value1, Integer value2) {
            addCriterion("ssid between", value1, value2, "ssid");
            return (Criteria) this;
        }

        public Criteria andSsidNotBetween(Integer value1, Integer value2) {
            addCriterion("ssid not between", value1, value2, "ssid");
            return (Criteria) this;
        }

        public Criteria andSeidIsNull() {
            addCriterion("seid is null");
            return (Criteria) this;
        }

        public Criteria andSeidIsNotNull() {
            addCriterion("seid is not null");
            return (Criteria) this;
        }

        public Criteria andSeidEqualTo(Integer value) {
            addCriterion("seid =", value, "seid");
            return (Criteria) this;
        }

        public Criteria andSeidNotEqualTo(Integer value) {
            addCriterion("seid <>", value, "seid");
            return (Criteria) this;
        }

        public Criteria andSeidGreaterThan(Integer value) {
            addCriterion("seid >", value, "seid");
            return (Criteria) this;
        }

        public Criteria andSeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("seid >=", value, "seid");
            return (Criteria) this;
        }

        public Criteria andSeidLessThan(Integer value) {
            addCriterion("seid <", value, "seid");
            return (Criteria) this;
        }

        public Criteria andSeidLessThanOrEqualTo(Integer value) {
            addCriterion("seid <=", value, "seid");
            return (Criteria) this;
        }

        public Criteria andSeidIn(List<Integer> values) {
            addCriterion("seid in", values, "seid");
            return (Criteria) this;
        }

        public Criteria andSeidNotIn(List<Integer> values) {
            addCriterion("seid not in", values, "seid");
            return (Criteria) this;
        }

        public Criteria andSeidBetween(Integer value1, Integer value2) {
            addCriterion("seid between", value1, value2, "seid");
            return (Criteria) this;
        }

        public Criteria andSeidNotBetween(Integer value1, Integer value2) {
            addCriterion("seid not between", value1, value2, "seid");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("userid is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userid is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Integer value) {
            addCriterion("userid =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Integer value) {
            addCriterion("userid <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Integer value) {
            addCriterion("userid >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("userid >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Integer value) {
            addCriterion("userid <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Integer value) {
            addCriterion("userid <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Integer> values) {
            addCriterion("userid in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Integer> values) {
            addCriterion("userid not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Integer value1, Integer value2) {
            addCriterion("userid between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("userid not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andEidIsNull() {
            addCriterion("eid is null");
            return (Criteria) this;
        }

        public Criteria andEidIsNotNull() {
            addCriterion("eid is not null");
            return (Criteria) this;
        }

        public Criteria andEidEqualTo(Integer value) {
            addCriterion("eid =", value, "eid");
            return (Criteria) this;
        }

        public Criteria andEidNotEqualTo(Integer value) {
            addCriterion("eid <>", value, "eid");
            return (Criteria) this;
        }

        public Criteria andEidGreaterThan(Integer value) {
            addCriterion("eid >", value, "eid");
            return (Criteria) this;
        }

        public Criteria andEidGreaterThanOrEqualTo(Integer value) {
            addCriterion("eid >=", value, "eid");
            return (Criteria) this;
        }

        public Criteria andEidLessThan(Integer value) {
            addCriterion("eid <", value, "eid");
            return (Criteria) this;
        }

        public Criteria andEidLessThanOrEqualTo(Integer value) {
            addCriterion("eid <=", value, "eid");
            return (Criteria) this;
        }

        public Criteria andEidIn(List<Integer> values) {
            addCriterion("eid in", values, "eid");
            return (Criteria) this;
        }

        public Criteria andEidNotIn(List<Integer> values) {
            addCriterion("eid not in", values, "eid");
            return (Criteria) this;
        }

        public Criteria andEidBetween(Integer value1, Integer value2) {
            addCriterion("eid between", value1, value2, "eid");
            return (Criteria) this;
        }

        public Criteria andEidNotBetween(Integer value1, Integer value2) {
            addCriterion("eid not between", value1, value2, "eid");
            return (Criteria) this;
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

        public Criteria andStudentkeyIsNull() {
            addCriterion("studentkey is null");
            return (Criteria) this;
        }

        public Criteria andStudentkeyIsNotNull() {
            addCriterion("studentkey is not null");
            return (Criteria) this;
        }

        public Criteria andStudentkeyEqualTo(String value) {
            addCriterion("studentkey =", value, "studentkey");
            return (Criteria) this;
        }

        public Criteria andStudentkeyNotEqualTo(String value) {
            addCriterion("studentkey <>", value, "studentkey");
            return (Criteria) this;
        }

        public Criteria andStudentkeyGreaterThan(String value) {
            addCriterion("studentkey >", value, "studentkey");
            return (Criteria) this;
        }

        public Criteria andStudentkeyGreaterThanOrEqualTo(String value) {
            addCriterion("studentkey >=", value, "studentkey");
            return (Criteria) this;
        }

        public Criteria andStudentkeyLessThan(String value) {
            addCriterion("studentkey <", value, "studentkey");
            return (Criteria) this;
        }

        public Criteria andStudentkeyLessThanOrEqualTo(String value) {
            addCriterion("studentkey <=", value, "studentkey");
            return (Criteria) this;
        }

        public Criteria andStudentkeyLike(String value) {
            addCriterion("studentkey like", value, "studentkey");
            return (Criteria) this;
        }

        public Criteria andStudentkeyNotLike(String value) {
            addCriterion("studentkey not like", value, "studentkey");
            return (Criteria) this;
        }

        public Criteria andStudentkeyIn(List<String> values) {
            addCriterion("studentkey in", values, "studentkey");
            return (Criteria) this;
        }

        public Criteria andStudentkeyNotIn(List<String> values) {
            addCriterion("studentkey not in", values, "studentkey");
            return (Criteria) this;
        }

        public Criteria andStudentkeyBetween(String value1, String value2) {
            addCriterion("studentkey between", value1, value2, "studentkey");
            return (Criteria) this;
        }

        public Criteria andStudentkeyNotBetween(String value1, String value2) {
            addCriterion("studentkey not between", value1, value2, "studentkey");
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