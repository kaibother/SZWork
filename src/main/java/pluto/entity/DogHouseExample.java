package pluto.entity;

import java.util.ArrayList;
import java.util.List;

public class DogHouseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DogHouseExample() {
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

        public Criteria andDoghouseidIsNull() {
            addCriterion("doghouseid is null");
            return (Criteria) this;
        }

        public Criteria andDoghouseidIsNotNull() {
            addCriterion("doghouseid is not null");
            return (Criteria) this;
        }

        public Criteria andDoghouseidEqualTo(Integer value) {
            addCriterion("doghouseid =", value, "doghouseid");
            return (Criteria) this;
        }

        public Criteria andDoghouseidNotEqualTo(Integer value) {
            addCriterion("doghouseid <>", value, "doghouseid");
            return (Criteria) this;
        }

        public Criteria andDoghouseidGreaterThan(Integer value) {
            addCriterion("doghouseid >", value, "doghouseid");
            return (Criteria) this;
        }

        public Criteria andDoghouseidGreaterThanOrEqualTo(Integer value) {
            addCriterion("doghouseid >=", value, "doghouseid");
            return (Criteria) this;
        }

        public Criteria andDoghouseidLessThan(Integer value) {
            addCriterion("doghouseid <", value, "doghouseid");
            return (Criteria) this;
        }

        public Criteria andDoghouseidLessThanOrEqualTo(Integer value) {
            addCriterion("doghouseid <=", value, "doghouseid");
            return (Criteria) this;
        }

        public Criteria andDoghouseidIn(List<Integer> values) {
            addCriterion("doghouseid in", values, "doghouseid");
            return (Criteria) this;
        }

        public Criteria andDoghouseidNotIn(List<Integer> values) {
            addCriterion("doghouseid not in", values, "doghouseid");
            return (Criteria) this;
        }

        public Criteria andDoghouseidBetween(Integer value1, Integer value2) {
            addCriterion("doghouseid between", value1, value2, "doghouseid");
            return (Criteria) this;
        }

        public Criteria andDoghouseidNotBetween(Integer value1, Integer value2) {
            addCriterion("doghouseid not between", value1, value2, "doghouseid");
            return (Criteria) this;
        }

        public Criteria andDoghousenameIsNull() {
            addCriterion("doghousename is null");
            return (Criteria) this;
        }

        public Criteria andDoghousenameIsNotNull() {
            addCriterion("doghousename is not null");
            return (Criteria) this;
        }

        public Criteria andDoghousenameEqualTo(String value) {
            addCriterion("doghousename =", value, "doghousename");
            return (Criteria) this;
        }

        public Criteria andDoghousenameNotEqualTo(String value) {
            addCriterion("doghousename <>", value, "doghousename");
            return (Criteria) this;
        }

        public Criteria andDoghousenameGreaterThan(String value) {
            addCriterion("doghousename >", value, "doghousename");
            return (Criteria) this;
        }

        public Criteria andDoghousenameGreaterThanOrEqualTo(String value) {
            addCriterion("doghousename >=", value, "doghousename");
            return (Criteria) this;
        }

        public Criteria andDoghousenameLessThan(String value) {
            addCriterion("doghousename <", value, "doghousename");
            return (Criteria) this;
        }

        public Criteria andDoghousenameLessThanOrEqualTo(String value) {
            addCriterion("doghousename <=", value, "doghousename");
            return (Criteria) this;
        }

        public Criteria andDoghousenameLike(String value) {
            addCriterion("doghousename like", value, "doghousename");
            return (Criteria) this;
        }

        public Criteria andDoghousenameNotLike(String value) {
            addCriterion("doghousename not like", value, "doghousename");
            return (Criteria) this;
        }

        public Criteria andDoghousenameIn(List<String> values) {
            addCriterion("doghousename in", values, "doghousename");
            return (Criteria) this;
        }

        public Criteria andDoghousenameNotIn(List<String> values) {
            addCriterion("doghousename not in", values, "doghousename");
            return (Criteria) this;
        }

        public Criteria andDoghousenameBetween(String value1, String value2) {
            addCriterion("doghousename between", value1, value2, "doghousename");
            return (Criteria) this;
        }

        public Criteria andDoghousenameNotBetween(String value1, String value2) {
            addCriterion("doghousename not between", value1, value2, "doghousename");
            return (Criteria) this;
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

        public Criteria andDogsizeidIsNull() {
            addCriterion("dogsizeid is null");
            return (Criteria) this;
        }

        public Criteria andDogsizeidIsNotNull() {
            addCriterion("dogsizeid is not null");
            return (Criteria) this;
        }

        public Criteria andDogsizeidEqualTo(Integer value) {
            addCriterion("dogsizeid =", value, "dogsizeid");
            return (Criteria) this;
        }

        public Criteria andDogsizeidNotEqualTo(Integer value) {
            addCriterion("dogsizeid <>", value, "dogsizeid");
            return (Criteria) this;
        }

        public Criteria andDogsizeidGreaterThan(Integer value) {
            addCriterion("dogsizeid >", value, "dogsizeid");
            return (Criteria) this;
        }

        public Criteria andDogsizeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("dogsizeid >=", value, "dogsizeid");
            return (Criteria) this;
        }

        public Criteria andDogsizeidLessThan(Integer value) {
            addCriterion("dogsizeid <", value, "dogsizeid");
            return (Criteria) this;
        }

        public Criteria andDogsizeidLessThanOrEqualTo(Integer value) {
            addCriterion("dogsizeid <=", value, "dogsizeid");
            return (Criteria) this;
        }

        public Criteria andDogsizeidIn(List<Integer> values) {
            addCriterion("dogsizeid in", values, "dogsizeid");
            return (Criteria) this;
        }

        public Criteria andDogsizeidNotIn(List<Integer> values) {
            addCriterion("dogsizeid not in", values, "dogsizeid");
            return (Criteria) this;
        }

        public Criteria andDogsizeidBetween(Integer value1, Integer value2) {
            addCriterion("dogsizeid between", value1, value2, "dogsizeid");
            return (Criteria) this;
        }

        public Criteria andDogsizeidNotBetween(Integer value1, Integer value2) {
            addCriterion("dogsizeid not between", value1, value2, "dogsizeid");
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