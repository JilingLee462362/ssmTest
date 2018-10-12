package com.tzhu.ssm.domain;

import java.util.ArrayList;
import java.util.List;

public class GuanggaoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GuanggaoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
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

        public Criteria andGgidIsNull() {
            addCriterion("ggid is null");
            return (Criteria) this;
        }

        public Criteria andGgidIsNotNull() {
            addCriterion("ggid is not null");
            return (Criteria) this;
        }

        public Criteria andGgidEqualTo(Integer value) {
            addCriterion("ggid =", value, "ggid");
            return (Criteria) this;
        }

        public Criteria andGgidNotEqualTo(Integer value) {
            addCriterion("ggid <>", value, "ggid");
            return (Criteria) this;
        }

        public Criteria andGgidGreaterThan(Integer value) {
            addCriterion("ggid >", value, "ggid");
            return (Criteria) this;
        }

        public Criteria andGgidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ggid >=", value, "ggid");
            return (Criteria) this;
        }

        public Criteria andGgidLessThan(Integer value) {
            addCriterion("ggid <", value, "ggid");
            return (Criteria) this;
        }

        public Criteria andGgidLessThanOrEqualTo(Integer value) {
            addCriterion("ggid <=", value, "ggid");
            return (Criteria) this;
        }

        public Criteria andGgidIn(List<Integer> values) {
            addCriterion("ggid in", values, "ggid");
            return (Criteria) this;
        }

        public Criteria andGgidNotIn(List<Integer> values) {
            addCriterion("ggid not in", values, "ggid");
            return (Criteria) this;
        }

        public Criteria andGgidBetween(Integer value1, Integer value2) {
            addCriterion("ggid between", value1, value2, "ggid");
            return (Criteria) this;
        }

        public Criteria andGgidNotBetween(Integer value1, Integer value2) {
            addCriterion("ggid not between", value1, value2, "ggid");
            return (Criteria) this;
        }

        public Criteria andGgtitleIsNull() {
            addCriterion("ggtitle is null");
            return (Criteria) this;
        }

        public Criteria andGgtitleIsNotNull() {
            addCriterion("ggtitle is not null");
            return (Criteria) this;
        }

        public Criteria andGgtitleEqualTo(String value) {
            addCriterion("ggtitle =", value, "ggtitle");
            return (Criteria) this;
        }

        public Criteria andGgtitleNotEqualTo(String value) {
            addCriterion("ggtitle <>", value, "ggtitle");
            return (Criteria) this;
        }

        public Criteria andGgtitleGreaterThan(String value) {
            addCriterion("ggtitle >", value, "ggtitle");
            return (Criteria) this;
        }

        public Criteria andGgtitleGreaterThanOrEqualTo(String value) {
            addCriterion("ggtitle >=", value, "ggtitle");
            return (Criteria) this;
        }

        public Criteria andGgtitleLessThan(String value) {
            addCriterion("ggtitle <", value, "ggtitle");
            return (Criteria) this;
        }

        public Criteria andGgtitleLessThanOrEqualTo(String value) {
            addCriterion("ggtitle <=", value, "ggtitle");
            return (Criteria) this;
        }

        public Criteria andGgtitleLike(String value) {
            addCriterion("ggtitle like", value, "ggtitle");
            return (Criteria) this;
        }

        public Criteria andGgtitleNotLike(String value) {
            addCriterion("ggtitle not like", value, "ggtitle");
            return (Criteria) this;
        }

        public Criteria andGgtitleIn(List<String> values) {
            addCriterion("ggtitle in", values, "ggtitle");
            return (Criteria) this;
        }

        public Criteria andGgtitleNotIn(List<String> values) {
            addCriterion("ggtitle not in", values, "ggtitle");
            return (Criteria) this;
        }

        public Criteria andGgtitleBetween(String value1, String value2) {
            addCriterion("ggtitle between", value1, value2, "ggtitle");
            return (Criteria) this;
        }

        public Criteria andGgtitleNotBetween(String value1, String value2) {
            addCriterion("ggtitle not between", value1, value2, "ggtitle");
            return (Criteria) this;
        }

        public Criteria andGgimgIsNull() {
            addCriterion("ggimg is null");
            return (Criteria) this;
        }

        public Criteria andGgimgIsNotNull() {
            addCriterion("ggimg is not null");
            return (Criteria) this;
        }

        public Criteria andGgimgEqualTo(String value) {
            addCriterion("ggimg =", value, "ggimg");
            return (Criteria) this;
        }

        public Criteria andGgimgNotEqualTo(String value) {
            addCriterion("ggimg <>", value, "ggimg");
            return (Criteria) this;
        }

        public Criteria andGgimgGreaterThan(String value) {
            addCriterion("ggimg >", value, "ggimg");
            return (Criteria) this;
        }

        public Criteria andGgimgGreaterThanOrEqualTo(String value) {
            addCriterion("ggimg >=", value, "ggimg");
            return (Criteria) this;
        }

        public Criteria andGgimgLessThan(String value) {
            addCriterion("ggimg <", value, "ggimg");
            return (Criteria) this;
        }

        public Criteria andGgimgLessThanOrEqualTo(String value) {
            addCriterion("ggimg <=", value, "ggimg");
            return (Criteria) this;
        }

        public Criteria andGgimgLike(String value) {
            addCriterion("ggimg like", value, "ggimg");
            return (Criteria) this;
        }

        public Criteria andGgimgNotLike(String value) {
            addCriterion("ggimg not like", value, "ggimg");
            return (Criteria) this;
        }

        public Criteria andGgimgIn(List<String> values) {
            addCriterion("ggimg in", values, "ggimg");
            return (Criteria) this;
        }

        public Criteria andGgimgNotIn(List<String> values) {
            addCriterion("ggimg not in", values, "ggimg");
            return (Criteria) this;
        }

        public Criteria andGgimgBetween(String value1, String value2) {
            addCriterion("ggimg between", value1, value2, "ggimg");
            return (Criteria) this;
        }

        public Criteria andGgimgNotBetween(String value1, String value2) {
            addCriterion("ggimg not between", value1, value2, "ggimg");
            return (Criteria) this;
        }

        public Criteria andGgurlIsNull() {
            addCriterion("ggurl is null");
            return (Criteria) this;
        }

        public Criteria andGgurlIsNotNull() {
            addCriterion("ggurl is not null");
            return (Criteria) this;
        }

        public Criteria andGgurlEqualTo(String value) {
            addCriterion("ggurl =", value, "ggurl");
            return (Criteria) this;
        }

        public Criteria andGgurlNotEqualTo(String value) {
            addCriterion("ggurl <>", value, "ggurl");
            return (Criteria) this;
        }

        public Criteria andGgurlGreaterThan(String value) {
            addCriterion("ggurl >", value, "ggurl");
            return (Criteria) this;
        }

        public Criteria andGgurlGreaterThanOrEqualTo(String value) {
            addCriterion("ggurl >=", value, "ggurl");
            return (Criteria) this;
        }

        public Criteria andGgurlLessThan(String value) {
            addCriterion("ggurl <", value, "ggurl");
            return (Criteria) this;
        }

        public Criteria andGgurlLessThanOrEqualTo(String value) {
            addCriterion("ggurl <=", value, "ggurl");
            return (Criteria) this;
        }

        public Criteria andGgurlLike(String value) {
            addCriterion("ggurl like", value, "ggurl");
            return (Criteria) this;
        }

        public Criteria andGgurlNotLike(String value) {
            addCriterion("ggurl not like", value, "ggurl");
            return (Criteria) this;
        }

        public Criteria andGgurlIn(List<String> values) {
            addCriterion("ggurl in", values, "ggurl");
            return (Criteria) this;
        }

        public Criteria andGgurlNotIn(List<String> values) {
            addCriterion("ggurl not in", values, "ggurl");
            return (Criteria) this;
        }

        public Criteria andGgurlBetween(String value1, String value2) {
            addCriterion("ggurl between", value1, value2, "ggurl");
            return (Criteria) this;
        }

        public Criteria andGgurlNotBetween(String value1, String value2) {
            addCriterion("ggurl not between", value1, value2, "ggurl");
            return (Criteria) this;
        }

        public Criteria andGgtimeIsNull() {
            addCriterion("ggtime is null");
            return (Criteria) this;
        }

        public Criteria andGgtimeIsNotNull() {
            addCriterion("ggtime is not null");
            return (Criteria) this;
        }

        public Criteria andGgtimeEqualTo(Integer value) {
            addCriterion("ggtime =", value, "ggtime");
            return (Criteria) this;
        }

        public Criteria andGgtimeNotEqualTo(Integer value) {
            addCriterion("ggtime <>", value, "ggtime");
            return (Criteria) this;
        }

        public Criteria andGgtimeGreaterThan(Integer value) {
            addCriterion("ggtime >", value, "ggtime");
            return (Criteria) this;
        }

        public Criteria andGgtimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("ggtime >=", value, "ggtime");
            return (Criteria) this;
        }

        public Criteria andGgtimeLessThan(Integer value) {
            addCriterion("ggtime <", value, "ggtime");
            return (Criteria) this;
        }

        public Criteria andGgtimeLessThanOrEqualTo(Integer value) {
            addCriterion("ggtime <=", value, "ggtime");
            return (Criteria) this;
        }

        public Criteria andGgtimeIn(List<Integer> values) {
            addCriterion("ggtime in", values, "ggtime");
            return (Criteria) this;
        }

        public Criteria andGgtimeNotIn(List<Integer> values) {
            addCriterion("ggtime not in", values, "ggtime");
            return (Criteria) this;
        }

        public Criteria andGgtimeBetween(Integer value1, Integer value2) {
            addCriterion("ggtime between", value1, value2, "ggtime");
            return (Criteria) this;
        }

        public Criteria andGgtimeNotBetween(Integer value1, Integer value2) {
            addCriterion("ggtime not between", value1, value2, "ggtime");
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
    }
}