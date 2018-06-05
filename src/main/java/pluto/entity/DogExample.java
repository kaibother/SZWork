package pluto.entity;

import java.util.ArrayList;
import java.util.List;

public class DogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DogExample() {
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

        public Criteria andDogidIsNull() {
            addCriterion("dogid is null");
            return (Criteria) this;
        }

        public Criteria andDogidIsNotNull() {
            addCriterion("dogid is not null");
            return (Criteria) this;
        }

        public Criteria andDogidEqualTo(Integer value) {
            addCriterion("dogid =", value, "dogid");
            return (Criteria) this;
        }

        public Criteria andDogidNotEqualTo(Integer value) {
            addCriterion("dogid <>", value, "dogid");
            return (Criteria) this;
        }

        public Criteria andDogidGreaterThan(Integer value) {
            addCriterion("dogid >", value, "dogid");
            return (Criteria) this;
        }

        public Criteria andDogidGreaterThanOrEqualTo(Integer value) {
            addCriterion("dogid >=", value, "dogid");
            return (Criteria) this;
        }

        public Criteria andDogidLessThan(Integer value) {
            addCriterion("dogid <", value, "dogid");
            return (Criteria) this;
        }

        public Criteria andDogidLessThanOrEqualTo(Integer value) {
            addCriterion("dogid <=", value, "dogid");
            return (Criteria) this;
        }

        public Criteria andDogidIn(List<Integer> values) {
            addCriterion("dogid in", values, "dogid");
            return (Criteria) this;
        }

        public Criteria andDogidNotIn(List<Integer> values) {
            addCriterion("dogid not in", values, "dogid");
            return (Criteria) this;
        }

        public Criteria andDogidBetween(Integer value1, Integer value2) {
            addCriterion("dogid between", value1, value2, "dogid");
            return (Criteria) this;
        }

        public Criteria andDogidNotBetween(Integer value1, Integer value2) {
            addCriterion("dogid not between", value1, value2, "dogid");
            return (Criteria) this;
        }

        public Criteria andDognameIsNull() {
            addCriterion("dogname is null");
            return (Criteria) this;
        }

        public Criteria andDognameIsNotNull() {
            addCriterion("dogname is not null");
            return (Criteria) this;
        }

        public Criteria andDognameEqualTo(String value) {
            addCriterion("dogname =", value, "dogname");
            return (Criteria) this;
        }

        public Criteria andDognameNotEqualTo(String value) {
            addCriterion("dogname <>", value, "dogname");
            return (Criteria) this;
        }

        public Criteria andDognameGreaterThan(String value) {
            addCriterion("dogname >", value, "dogname");
            return (Criteria) this;
        }

        public Criteria andDognameGreaterThanOrEqualTo(String value) {
            addCriterion("dogname >=", value, "dogname");
            return (Criteria) this;
        }

        public Criteria andDognameLessThan(String value) {
            addCriterion("dogname <", value, "dogname");
            return (Criteria) this;
        }

        public Criteria andDognameLessThanOrEqualTo(String value) {
            addCriterion("dogname <=", value, "dogname");
            return (Criteria) this;
        }

        public Criteria andDognameLike(String value) {
            addCriterion("dogname like", value, "dogname");
            return (Criteria) this;
        }

        public Criteria andDognameNotLike(String value) {
            addCriterion("dogname not like", value, "dogname");
            return (Criteria) this;
        }

        public Criteria andDognameIn(List<String> values) {
            addCriterion("dogname in", values, "dogname");
            return (Criteria) this;
        }

        public Criteria andDognameNotIn(List<String> values) {
            addCriterion("dogname not in", values, "dogname");
            return (Criteria) this;
        }

        public Criteria andDognameBetween(String value1, String value2) {
            addCriterion("dogname between", value1, value2, "dogname");
            return (Criteria) this;
        }

        public Criteria andDognameNotBetween(String value1, String value2) {
            addCriterion("dogname not between", value1, value2, "dogname");
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

        public Criteria andDogtypeidIsNull() {
            addCriterion("dogtypeid is null");
            return (Criteria) this;
        }

        public Criteria andDogtypeidIsNotNull() {
            addCriterion("dogtypeid is not null");
            return (Criteria) this;
        }

        public Criteria andDogtypeidEqualTo(Integer value) {
            addCriterion("dogtypeid =", value, "dogtypeid");
            return (Criteria) this;
        }

        public Criteria andDogtypeidNotEqualTo(Integer value) {
            addCriterion("dogtypeid <>", value, "dogtypeid");
            return (Criteria) this;
        }

        public Criteria andDogtypeidGreaterThan(Integer value) {
            addCriterion("dogtypeid >", value, "dogtypeid");
            return (Criteria) this;
        }

        public Criteria andDogtypeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("dogtypeid >=", value, "dogtypeid");
            return (Criteria) this;
        }

        public Criteria andDogtypeidLessThan(Integer value) {
            addCriterion("dogtypeid <", value, "dogtypeid");
            return (Criteria) this;
        }

        public Criteria andDogtypeidLessThanOrEqualTo(Integer value) {
            addCriterion("dogtypeid <=", value, "dogtypeid");
            return (Criteria) this;
        }

        public Criteria andDogtypeidIn(List<Integer> values) {
            addCriterion("dogtypeid in", values, "dogtypeid");
            return (Criteria) this;
        }

        public Criteria andDogtypeidNotIn(List<Integer> values) {
            addCriterion("dogtypeid not in", values, "dogtypeid");
            return (Criteria) this;
        }

        public Criteria andDogtypeidBetween(Integer value1, Integer value2) {
            addCriterion("dogtypeid between", value1, value2, "dogtypeid");
            return (Criteria) this;
        }

        public Criteria andDogtypeidNotBetween(Integer value1, Integer value2) {
            addCriterion("dogtypeid not between", value1, value2, "dogtypeid");
            return (Criteria) this;
        }

        public Criteria andAreaidIsNull() {
            addCriterion("areaid is null");
            return (Criteria) this;
        }

        public Criteria andAreaidIsNotNull() {
            addCriterion("areaid is not null");
            return (Criteria) this;
        }

        public Criteria andAreaidEqualTo(Integer value) {
            addCriterion("areaid =", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidNotEqualTo(Integer value) {
            addCriterion("areaid <>", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidGreaterThan(Integer value) {
            addCriterion("areaid >", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidGreaterThanOrEqualTo(Integer value) {
            addCriterion("areaid >=", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidLessThan(Integer value) {
            addCriterion("areaid <", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidLessThanOrEqualTo(Integer value) {
            addCriterion("areaid <=", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidIn(List<Integer> values) {
            addCriterion("areaid in", values, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidNotIn(List<Integer> values) {
            addCriterion("areaid not in", values, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidBetween(Integer value1, Integer value2) {
            addCriterion("areaid between", value1, value2, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidNotBetween(Integer value1, Integer value2) {
            addCriterion("areaid not between", value1, value2, "areaid");
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