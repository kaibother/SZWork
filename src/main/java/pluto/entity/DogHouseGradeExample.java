package pluto.entity;

import java.util.ArrayList;
import java.util.List;

public class DogHouseGradeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DogHouseGradeExample() {
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

        public Criteria andDoghousegradeidIsNull() {
            addCriterion("doghousegradeid is null");
            return (Criteria) this;
        }

        public Criteria andDoghousegradeidIsNotNull() {
            addCriterion("doghousegradeid is not null");
            return (Criteria) this;
        }

        public Criteria andDoghousegradeidEqualTo(Integer value) {
            addCriterion("doghousegradeid =", value, "doghousegradeid");
            return (Criteria) this;
        }

        public Criteria andDoghousegradeidNotEqualTo(Integer value) {
            addCriterion("doghousegradeid <>", value, "doghousegradeid");
            return (Criteria) this;
        }

        public Criteria andDoghousegradeidGreaterThan(Integer value) {
            addCriterion("doghousegradeid >", value, "doghousegradeid");
            return (Criteria) this;
        }

        public Criteria andDoghousegradeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("doghousegradeid >=", value, "doghousegradeid");
            return (Criteria) this;
        }

        public Criteria andDoghousegradeidLessThan(Integer value) {
            addCriterion("doghousegradeid <", value, "doghousegradeid");
            return (Criteria) this;
        }

        public Criteria andDoghousegradeidLessThanOrEqualTo(Integer value) {
            addCriterion("doghousegradeid <=", value, "doghousegradeid");
            return (Criteria) this;
        }

        public Criteria andDoghousegradeidIn(List<Integer> values) {
            addCriterion("doghousegradeid in", values, "doghousegradeid");
            return (Criteria) this;
        }

        public Criteria andDoghousegradeidNotIn(List<Integer> values) {
            addCriterion("doghousegradeid not in", values, "doghousegradeid");
            return (Criteria) this;
        }

        public Criteria andDoghousegradeidBetween(Integer value1, Integer value2) {
            addCriterion("doghousegradeid between", value1, value2, "doghousegradeid");
            return (Criteria) this;
        }

        public Criteria andDoghousegradeidNotBetween(Integer value1, Integer value2) {
            addCriterion("doghousegradeid not between", value1, value2, "doghousegradeid");
            return (Criteria) this;
        }

        public Criteria andDoghousegradeIsNull() {
            addCriterion("doghousegrade is null");
            return (Criteria) this;
        }

        public Criteria andDoghousegradeIsNotNull() {
            addCriterion("doghousegrade is not null");
            return (Criteria) this;
        }

        public Criteria andDoghousegradeEqualTo(String value) {
            addCriterion("doghousegrade =", value, "doghousegrade");
            return (Criteria) this;
        }

        public Criteria andDoghousegradeNotEqualTo(String value) {
            addCriterion("doghousegrade <>", value, "doghousegrade");
            return (Criteria) this;
        }

        public Criteria andDoghousegradeGreaterThan(String value) {
            addCriterion("doghousegrade >", value, "doghousegrade");
            return (Criteria) this;
        }

        public Criteria andDoghousegradeGreaterThanOrEqualTo(String value) {
            addCriterion("doghousegrade >=", value, "doghousegrade");
            return (Criteria) this;
        }

        public Criteria andDoghousegradeLessThan(String value) {
            addCriterion("doghousegrade <", value, "doghousegrade");
            return (Criteria) this;
        }

        public Criteria andDoghousegradeLessThanOrEqualTo(String value) {
            addCriterion("doghousegrade <=", value, "doghousegrade");
            return (Criteria) this;
        }

        public Criteria andDoghousegradeLike(String value) {
            addCriterion("doghousegrade like", value, "doghousegrade");
            return (Criteria) this;
        }

        public Criteria andDoghousegradeNotLike(String value) {
            addCriterion("doghousegrade not like", value, "doghousegrade");
            return (Criteria) this;
        }

        public Criteria andDoghousegradeIn(List<String> values) {
            addCriterion("doghousegrade in", values, "doghousegrade");
            return (Criteria) this;
        }

        public Criteria andDoghousegradeNotIn(List<String> values) {
            addCriterion("doghousegrade not in", values, "doghousegrade");
            return (Criteria) this;
        }

        public Criteria andDoghousegradeBetween(String value1, String value2) {
            addCriterion("doghousegrade between", value1, value2, "doghousegrade");
            return (Criteria) this;
        }

        public Criteria andDoghousegradeNotBetween(String value1, String value2) {
            addCriterion("doghousegrade not between", value1, value2, "doghousegrade");
            return (Criteria) this;
        }

        public Criteria andDoghousevippriceIsNull() {
            addCriterion("doghousevipprice is null");
            return (Criteria) this;
        }

        public Criteria andDoghousevippriceIsNotNull() {
            addCriterion("doghousevipprice is not null");
            return (Criteria) this;
        }

        public Criteria andDoghousevippriceEqualTo(Double value) {
            addCriterion("doghousevipprice =", value, "doghousevipprice");
            return (Criteria) this;
        }

        public Criteria andDoghousevippriceNotEqualTo(Double value) {
            addCriterion("doghousevipprice <>", value, "doghousevipprice");
            return (Criteria) this;
        }

        public Criteria andDoghousevippriceGreaterThan(Double value) {
            addCriterion("doghousevipprice >", value, "doghousevipprice");
            return (Criteria) this;
        }

        public Criteria andDoghousevippriceGreaterThanOrEqualTo(Double value) {
            addCriterion("doghousevipprice >=", value, "doghousevipprice");
            return (Criteria) this;
        }

        public Criteria andDoghousevippriceLessThan(Double value) {
            addCriterion("doghousevipprice <", value, "doghousevipprice");
            return (Criteria) this;
        }

        public Criteria andDoghousevippriceLessThanOrEqualTo(Double value) {
            addCriterion("doghousevipprice <=", value, "doghousevipprice");
            return (Criteria) this;
        }

        public Criteria andDoghousevippriceIn(List<Double> values) {
            addCriterion("doghousevipprice in", values, "doghousevipprice");
            return (Criteria) this;
        }

        public Criteria andDoghousevippriceNotIn(List<Double> values) {
            addCriterion("doghousevipprice not in", values, "doghousevipprice");
            return (Criteria) this;
        }

        public Criteria andDoghousevippriceBetween(Double value1, Double value2) {
            addCriterion("doghousevipprice between", value1, value2, "doghousevipprice");
            return (Criteria) this;
        }

        public Criteria andDoghousevippriceNotBetween(Double value1, Double value2) {
            addCriterion("doghousevipprice not between", value1, value2, "doghousevipprice");
            return (Criteria) this;
        }

        public Criteria andDoghousepriceIsNull() {
            addCriterion("doghouseprice is null");
            return (Criteria) this;
        }

        public Criteria andDoghousepriceIsNotNull() {
            addCriterion("doghouseprice is not null");
            return (Criteria) this;
        }

        public Criteria andDoghousepriceEqualTo(Double value) {
            addCriterion("doghouseprice =", value, "doghouseprice");
            return (Criteria) this;
        }

        public Criteria andDoghousepriceNotEqualTo(Double value) {
            addCriterion("doghouseprice <>", value, "doghouseprice");
            return (Criteria) this;
        }

        public Criteria andDoghousepriceGreaterThan(Double value) {
            addCriterion("doghouseprice >", value, "doghouseprice");
            return (Criteria) this;
        }

        public Criteria andDoghousepriceGreaterThanOrEqualTo(Double value) {
            addCriterion("doghouseprice >=", value, "doghouseprice");
            return (Criteria) this;
        }

        public Criteria andDoghousepriceLessThan(Double value) {
            addCriterion("doghouseprice <", value, "doghouseprice");
            return (Criteria) this;
        }

        public Criteria andDoghousepriceLessThanOrEqualTo(Double value) {
            addCriterion("doghouseprice <=", value, "doghouseprice");
            return (Criteria) this;
        }

        public Criteria andDoghousepriceIn(List<Double> values) {
            addCriterion("doghouseprice in", values, "doghouseprice");
            return (Criteria) this;
        }

        public Criteria andDoghousepriceNotIn(List<Double> values) {
            addCriterion("doghouseprice not in", values, "doghouseprice");
            return (Criteria) this;
        }

        public Criteria andDoghousepriceBetween(Double value1, Double value2) {
            addCriterion("doghouseprice between", value1, value2, "doghouseprice");
            return (Criteria) this;
        }

        public Criteria andDoghousepriceNotBetween(Double value1, Double value2) {
            addCriterion("doghouseprice not between", value1, value2, "doghouseprice");
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