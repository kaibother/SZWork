package pluto.entity;

import java.util.ArrayList;
import java.util.List;

public class DogIQExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DogIQExample() {
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

        public Criteria andDogiqidIsNull() {
            addCriterion("dogiqid is null");
            return (Criteria) this;
        }

        public Criteria andDogiqidIsNotNull() {
            addCriterion("dogiqid is not null");
            return (Criteria) this;
        }

        public Criteria andDogiqidEqualTo(Integer value) {
            addCriterion("dogiqid =", value, "dogiqid");
            return (Criteria) this;
        }

        public Criteria andDogiqidNotEqualTo(Integer value) {
            addCriterion("dogiqid <>", value, "dogiqid");
            return (Criteria) this;
        }

        public Criteria andDogiqidGreaterThan(Integer value) {
            addCriterion("dogiqid >", value, "dogiqid");
            return (Criteria) this;
        }

        public Criteria andDogiqidGreaterThanOrEqualTo(Integer value) {
            addCriterion("dogiqid >=", value, "dogiqid");
            return (Criteria) this;
        }

        public Criteria andDogiqidLessThan(Integer value) {
            addCriterion("dogiqid <", value, "dogiqid");
            return (Criteria) this;
        }

        public Criteria andDogiqidLessThanOrEqualTo(Integer value) {
            addCriterion("dogiqid <=", value, "dogiqid");
            return (Criteria) this;
        }

        public Criteria andDogiqidIn(List<Integer> values) {
            addCriterion("dogiqid in", values, "dogiqid");
            return (Criteria) this;
        }

        public Criteria andDogiqidNotIn(List<Integer> values) {
            addCriterion("dogiqid not in", values, "dogiqid");
            return (Criteria) this;
        }

        public Criteria andDogiqidBetween(Integer value1, Integer value2) {
            addCriterion("dogiqid between", value1, value2, "dogiqid");
            return (Criteria) this;
        }

        public Criteria andDogiqidNotBetween(Integer value1, Integer value2) {
            addCriterion("dogiqid not between", value1, value2, "dogiqid");
            return (Criteria) this;
        }

        public Criteria andIqIsNull() {
            addCriterion("iq is null");
            return (Criteria) this;
        }

        public Criteria andIqIsNotNull() {
            addCriterion("iq is not null");
            return (Criteria) this;
        }

        public Criteria andIqEqualTo(String value) {
            addCriterion("iq =", value, "iq");
            return (Criteria) this;
        }

        public Criteria andIqNotEqualTo(String value) {
            addCriterion("iq <>", value, "iq");
            return (Criteria) this;
        }

        public Criteria andIqGreaterThan(String value) {
            addCriterion("iq >", value, "iq");
            return (Criteria) this;
        }

        public Criteria andIqGreaterThanOrEqualTo(String value) {
            addCriterion("iq >=", value, "iq");
            return (Criteria) this;
        }

        public Criteria andIqLessThan(String value) {
            addCriterion("iq <", value, "iq");
            return (Criteria) this;
        }

        public Criteria andIqLessThanOrEqualTo(String value) {
            addCriterion("iq <=", value, "iq");
            return (Criteria) this;
        }

        public Criteria andIqLike(String value) {
            addCriterion("iq like", value, "iq");
            return (Criteria) this;
        }

        public Criteria andIqNotLike(String value) {
            addCriterion("iq not like", value, "iq");
            return (Criteria) this;
        }

        public Criteria andIqIn(List<String> values) {
            addCriterion("iq in", values, "iq");
            return (Criteria) this;
        }

        public Criteria andIqNotIn(List<String> values) {
            addCriterion("iq not in", values, "iq");
            return (Criteria) this;
        }

        public Criteria andIqBetween(String value1, String value2) {
            addCriterion("iq between", value1, value2, "iq");
            return (Criteria) this;
        }

        public Criteria andIqNotBetween(String value1, String value2) {
            addCriterion("iq not between", value1, value2, "iq");
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