package pluto.entity;

import java.util.ArrayList;
import java.util.List;

public class ServiceGradeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ServiceGradeExample() {
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

        public Criteria andServicegradeidIsNull() {
            addCriterion("servicegradeid is null");
            return (Criteria) this;
        }

        public Criteria andServicegradeidIsNotNull() {
            addCriterion("servicegradeid is not null");
            return (Criteria) this;
        }

        public Criteria andServicegradeidEqualTo(Integer value) {
            addCriterion("servicegradeid =", value, "servicegradeid");
            return (Criteria) this;
        }

        public Criteria andServicegradeidNotEqualTo(Integer value) {
            addCriterion("servicegradeid <>", value, "servicegradeid");
            return (Criteria) this;
        }

        public Criteria andServicegradeidGreaterThan(Integer value) {
            addCriterion("servicegradeid >", value, "servicegradeid");
            return (Criteria) this;
        }

        public Criteria andServicegradeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("servicegradeid >=", value, "servicegradeid");
            return (Criteria) this;
        }

        public Criteria andServicegradeidLessThan(Integer value) {
            addCriterion("servicegradeid <", value, "servicegradeid");
            return (Criteria) this;
        }

        public Criteria andServicegradeidLessThanOrEqualTo(Integer value) {
            addCriterion("servicegradeid <=", value, "servicegradeid");
            return (Criteria) this;
        }

        public Criteria andServicegradeidIn(List<Integer> values) {
            addCriterion("servicegradeid in", values, "servicegradeid");
            return (Criteria) this;
        }

        public Criteria andServicegradeidNotIn(List<Integer> values) {
            addCriterion("servicegradeid not in", values, "servicegradeid");
            return (Criteria) this;
        }

        public Criteria andServicegradeidBetween(Integer value1, Integer value2) {
            addCriterion("servicegradeid between", value1, value2, "servicegradeid");
            return (Criteria) this;
        }

        public Criteria andServicegradeidNotBetween(Integer value1, Integer value2) {
            addCriterion("servicegradeid not between", value1, value2, "servicegradeid");
            return (Criteria) this;
        }

        public Criteria andServicepriceIsNull() {
            addCriterion("serviceprice is null");
            return (Criteria) this;
        }

        public Criteria andServicepriceIsNotNull() {
            addCriterion("serviceprice is not null");
            return (Criteria) this;
        }

        public Criteria andServicepriceEqualTo(Double value) {
            addCriterion("serviceprice =", value, "serviceprice");
            return (Criteria) this;
        }

        public Criteria andServicepriceNotEqualTo(Double value) {
            addCriterion("serviceprice <>", value, "serviceprice");
            return (Criteria) this;
        }

        public Criteria andServicepriceGreaterThan(Double value) {
            addCriterion("serviceprice >", value, "serviceprice");
            return (Criteria) this;
        }

        public Criteria andServicepriceGreaterThanOrEqualTo(Double value) {
            addCriterion("serviceprice >=", value, "serviceprice");
            return (Criteria) this;
        }

        public Criteria andServicepriceLessThan(Double value) {
            addCriterion("serviceprice <", value, "serviceprice");
            return (Criteria) this;
        }

        public Criteria andServicepriceLessThanOrEqualTo(Double value) {
            addCriterion("serviceprice <=", value, "serviceprice");
            return (Criteria) this;
        }

        public Criteria andServicepriceIn(List<Double> values) {
            addCriterion("serviceprice in", values, "serviceprice");
            return (Criteria) this;
        }

        public Criteria andServicepriceNotIn(List<Double> values) {
            addCriterion("serviceprice not in", values, "serviceprice");
            return (Criteria) this;
        }

        public Criteria andServicepriceBetween(Double value1, Double value2) {
            addCriterion("serviceprice between", value1, value2, "serviceprice");
            return (Criteria) this;
        }

        public Criteria andServicepriceNotBetween(Double value1, Double value2) {
            addCriterion("serviceprice not between", value1, value2, "serviceprice");
            return (Criteria) this;
        }

        public Criteria andDogweightIsNull() {
            addCriterion("dogweight is null");
            return (Criteria) this;
        }

        public Criteria andDogweightIsNotNull() {
            addCriterion("dogweight is not null");
            return (Criteria) this;
        }

        public Criteria andDogweightEqualTo(Double value) {
            addCriterion("dogweight =", value, "dogweight");
            return (Criteria) this;
        }

        public Criteria andDogweightNotEqualTo(Double value) {
            addCriterion("dogweight <>", value, "dogweight");
            return (Criteria) this;
        }

        public Criteria andDogweightGreaterThan(Double value) {
            addCriterion("dogweight >", value, "dogweight");
            return (Criteria) this;
        }

        public Criteria andDogweightGreaterThanOrEqualTo(Double value) {
            addCriterion("dogweight >=", value, "dogweight");
            return (Criteria) this;
        }

        public Criteria andDogweightLessThan(Double value) {
            addCriterion("dogweight <", value, "dogweight");
            return (Criteria) this;
        }

        public Criteria andDogweightLessThanOrEqualTo(Double value) {
            addCriterion("dogweight <=", value, "dogweight");
            return (Criteria) this;
        }

        public Criteria andDogweightIn(List<Double> values) {
            addCriterion("dogweight in", values, "dogweight");
            return (Criteria) this;
        }

        public Criteria andDogweightNotIn(List<Double> values) {
            addCriterion("dogweight not in", values, "dogweight");
            return (Criteria) this;
        }

        public Criteria andDogweightBetween(Double value1, Double value2) {
            addCriterion("dogweight between", value1, value2, "dogweight");
            return (Criteria) this;
        }

        public Criteria andDogweightNotBetween(Double value1, Double value2) {
            addCriterion("dogweight not between", value1, value2, "dogweight");
            return (Criteria) this;
        }

        public Criteria andVippriceIsNull() {
            addCriterion("vipprice is null");
            return (Criteria) this;
        }

        public Criteria andVippriceIsNotNull() {
            addCriterion("vipprice is not null");
            return (Criteria) this;
        }

        public Criteria andVippriceEqualTo(Double value) {
            addCriterion("vipprice =", value, "vipprice");
            return (Criteria) this;
        }

        public Criteria andVippriceNotEqualTo(Double value) {
            addCriterion("vipprice <>", value, "vipprice");
            return (Criteria) this;
        }

        public Criteria andVippriceGreaterThan(Double value) {
            addCriterion("vipprice >", value, "vipprice");
            return (Criteria) this;
        }

        public Criteria andVippriceGreaterThanOrEqualTo(Double value) {
            addCriterion("vipprice >=", value, "vipprice");
            return (Criteria) this;
        }

        public Criteria andVippriceLessThan(Double value) {
            addCriterion("vipprice <", value, "vipprice");
            return (Criteria) this;
        }

        public Criteria andVippriceLessThanOrEqualTo(Double value) {
            addCriterion("vipprice <=", value, "vipprice");
            return (Criteria) this;
        }

        public Criteria andVippriceIn(List<Double> values) {
            addCriterion("vipprice in", values, "vipprice");
            return (Criteria) this;
        }

        public Criteria andVippriceNotIn(List<Double> values) {
            addCriterion("vipprice not in", values, "vipprice");
            return (Criteria) this;
        }

        public Criteria andVippriceBetween(Double value1, Double value2) {
            addCriterion("vipprice between", value1, value2, "vipprice");
            return (Criteria) this;
        }

        public Criteria andVippriceNotBetween(Double value1, Double value2) {
            addCriterion("vipprice not between", value1, value2, "vipprice");
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