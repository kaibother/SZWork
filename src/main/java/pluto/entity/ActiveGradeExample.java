package pluto.entity;

import java.util.ArrayList;
import java.util.List;

public class ActiveGradeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ActiveGradeExample() {
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

        public Criteria andActivegradeidIsNull() {
            addCriterion("activegradeid is null");
            return (Criteria) this;
        }

        public Criteria andActivegradeidIsNotNull() {
            addCriterion("activegradeid is not null");
            return (Criteria) this;
        }

        public Criteria andActivegradeidEqualTo(Integer value) {
            addCriterion("activegradeid =", value, "activegradeid");
            return (Criteria) this;
        }

        public Criteria andActivegradeidNotEqualTo(Integer value) {
            addCriterion("activegradeid <>", value, "activegradeid");
            return (Criteria) this;
        }

        public Criteria andActivegradeidGreaterThan(Integer value) {
            addCriterion("activegradeid >", value, "activegradeid");
            return (Criteria) this;
        }

        public Criteria andActivegradeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("activegradeid >=", value, "activegradeid");
            return (Criteria) this;
        }

        public Criteria andActivegradeidLessThan(Integer value) {
            addCriterion("activegradeid <", value, "activegradeid");
            return (Criteria) this;
        }

        public Criteria andActivegradeidLessThanOrEqualTo(Integer value) {
            addCriterion("activegradeid <=", value, "activegradeid");
            return (Criteria) this;
        }

        public Criteria andActivegradeidIn(List<Integer> values) {
            addCriterion("activegradeid in", values, "activegradeid");
            return (Criteria) this;
        }

        public Criteria andActivegradeidNotIn(List<Integer> values) {
            addCriterion("activegradeid not in", values, "activegradeid");
            return (Criteria) this;
        }

        public Criteria andActivegradeidBetween(Integer value1, Integer value2) {
            addCriterion("activegradeid between", value1, value2, "activegradeid");
            return (Criteria) this;
        }

        public Criteria andActivegradeidNotBetween(Integer value1, Integer value2) {
            addCriterion("activegradeid not between", value1, value2, "activegradeid");
            return (Criteria) this;
        }

        public Criteria andActicegradeIsNull() {
            addCriterion("acticegrade is null");
            return (Criteria) this;
        }

        public Criteria andActicegradeIsNotNull() {
            addCriterion("acticegrade is not null");
            return (Criteria) this;
        }

        public Criteria andActicegradeEqualTo(String value) {
            addCriterion("acticegrade =", value, "acticegrade");
            return (Criteria) this;
        }

        public Criteria andActicegradeNotEqualTo(String value) {
            addCriterion("acticegrade <>", value, "acticegrade");
            return (Criteria) this;
        }

        public Criteria andActicegradeGreaterThan(String value) {
            addCriterion("acticegrade >", value, "acticegrade");
            return (Criteria) this;
        }

        public Criteria andActicegradeGreaterThanOrEqualTo(String value) {
            addCriterion("acticegrade >=", value, "acticegrade");
            return (Criteria) this;
        }

        public Criteria andActicegradeLessThan(String value) {
            addCriterion("acticegrade <", value, "acticegrade");
            return (Criteria) this;
        }

        public Criteria andActicegradeLessThanOrEqualTo(String value) {
            addCriterion("acticegrade <=", value, "acticegrade");
            return (Criteria) this;
        }

        public Criteria andActicegradeLike(String value) {
            addCriterion("acticegrade like", value, "acticegrade");
            return (Criteria) this;
        }

        public Criteria andActicegradeNotLike(String value) {
            addCriterion("acticegrade not like", value, "acticegrade");
            return (Criteria) this;
        }

        public Criteria andActicegradeIn(List<String> values) {
            addCriterion("acticegrade in", values, "acticegrade");
            return (Criteria) this;
        }

        public Criteria andActicegradeNotIn(List<String> values) {
            addCriterion("acticegrade not in", values, "acticegrade");
            return (Criteria) this;
        }

        public Criteria andActicegradeBetween(String value1, String value2) {
            addCriterion("acticegrade between", value1, value2, "acticegrade");
            return (Criteria) this;
        }

        public Criteria andActicegradeNotBetween(String value1, String value2) {
            addCriterion("acticegrade not between", value1, value2, "acticegrade");
            return (Criteria) this;
        }

        public Criteria andActivepriceIsNull() {
            addCriterion("activeprice is null");
            return (Criteria) this;
        }

        public Criteria andActivepriceIsNotNull() {
            addCriterion("activeprice is not null");
            return (Criteria) this;
        }

        public Criteria andActivepriceEqualTo(Double value) {
            addCriterion("activeprice =", value, "activeprice");
            return (Criteria) this;
        }

        public Criteria andActivepriceNotEqualTo(Double value) {
            addCriterion("activeprice <>", value, "activeprice");
            return (Criteria) this;
        }

        public Criteria andActivepriceGreaterThan(Double value) {
            addCriterion("activeprice >", value, "activeprice");
            return (Criteria) this;
        }

        public Criteria andActivepriceGreaterThanOrEqualTo(Double value) {
            addCriterion("activeprice >=", value, "activeprice");
            return (Criteria) this;
        }

        public Criteria andActivepriceLessThan(Double value) {
            addCriterion("activeprice <", value, "activeprice");
            return (Criteria) this;
        }

        public Criteria andActivepriceLessThanOrEqualTo(Double value) {
            addCriterion("activeprice <=", value, "activeprice");
            return (Criteria) this;
        }

        public Criteria andActivepriceIn(List<Double> values) {
            addCriterion("activeprice in", values, "activeprice");
            return (Criteria) this;
        }

        public Criteria andActivepriceNotIn(List<Double> values) {
            addCriterion("activeprice not in", values, "activeprice");
            return (Criteria) this;
        }

        public Criteria andActivepriceBetween(Double value1, Double value2) {
            addCriterion("activeprice between", value1, value2, "activeprice");
            return (Criteria) this;
        }

        public Criteria andActivepriceNotBetween(Double value1, Double value2) {
            addCriterion("activeprice not between", value1, value2, "activeprice");
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