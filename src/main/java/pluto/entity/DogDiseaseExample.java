package pluto.entity;

import java.util.ArrayList;
import java.util.List;

public class DogDiseaseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DogDiseaseExample() {
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

        public Criteria andDogdiseaseidIsNull() {
            addCriterion("dogdiseaseid is null");
            return (Criteria) this;
        }

        public Criteria andDogdiseaseidIsNotNull() {
            addCriterion("dogdiseaseid is not null");
            return (Criteria) this;
        }

        public Criteria andDogdiseaseidEqualTo(Integer value) {
            addCriterion("dogdiseaseid =", value, "dogdiseaseid");
            return (Criteria) this;
        }

        public Criteria andDogdiseaseidNotEqualTo(Integer value) {
            addCriterion("dogdiseaseid <>", value, "dogdiseaseid");
            return (Criteria) this;
        }

        public Criteria andDogdiseaseidGreaterThan(Integer value) {
            addCriterion("dogdiseaseid >", value, "dogdiseaseid");
            return (Criteria) this;
        }

        public Criteria andDogdiseaseidGreaterThanOrEqualTo(Integer value) {
            addCriterion("dogdiseaseid >=", value, "dogdiseaseid");
            return (Criteria) this;
        }

        public Criteria andDogdiseaseidLessThan(Integer value) {
            addCriterion("dogdiseaseid <", value, "dogdiseaseid");
            return (Criteria) this;
        }

        public Criteria andDogdiseaseidLessThanOrEqualTo(Integer value) {
            addCriterion("dogdiseaseid <=", value, "dogdiseaseid");
            return (Criteria) this;
        }

        public Criteria andDogdiseaseidIn(List<Integer> values) {
            addCriterion("dogdiseaseid in", values, "dogdiseaseid");
            return (Criteria) this;
        }

        public Criteria andDogdiseaseidNotIn(List<Integer> values) {
            addCriterion("dogdiseaseid not in", values, "dogdiseaseid");
            return (Criteria) this;
        }

        public Criteria andDogdiseaseidBetween(Integer value1, Integer value2) {
            addCriterion("dogdiseaseid between", value1, value2, "dogdiseaseid");
            return (Criteria) this;
        }

        public Criteria andDogdiseaseidNotBetween(Integer value1, Integer value2) {
            addCriterion("dogdiseaseid not between", value1, value2, "dogdiseaseid");
            return (Criteria) this;
        }

        public Criteria andPetidIsNull() {
            addCriterion("petid is null");
            return (Criteria) this;
        }

        public Criteria andPetidIsNotNull() {
            addCriterion("petid is not null");
            return (Criteria) this;
        }

        public Criteria andPetidEqualTo(Integer value) {
            addCriterion("petid =", value, "petid");
            return (Criteria) this;
        }

        public Criteria andPetidNotEqualTo(Integer value) {
            addCriterion("petid <>", value, "petid");
            return (Criteria) this;
        }

        public Criteria andPetidGreaterThan(Integer value) {
            addCriterion("petid >", value, "petid");
            return (Criteria) this;
        }

        public Criteria andPetidGreaterThanOrEqualTo(Integer value) {
            addCriterion("petid >=", value, "petid");
            return (Criteria) this;
        }

        public Criteria andPetidLessThan(Integer value) {
            addCriterion("petid <", value, "petid");
            return (Criteria) this;
        }

        public Criteria andPetidLessThanOrEqualTo(Integer value) {
            addCriterion("petid <=", value, "petid");
            return (Criteria) this;
        }

        public Criteria andPetidIn(List<Integer> values) {
            addCriterion("petid in", values, "petid");
            return (Criteria) this;
        }

        public Criteria andPetidNotIn(List<Integer> values) {
            addCriterion("petid not in", values, "petid");
            return (Criteria) this;
        }

        public Criteria andPetidBetween(Integer value1, Integer value2) {
            addCriterion("petid between", value1, value2, "petid");
            return (Criteria) this;
        }

        public Criteria andPetidNotBetween(Integer value1, Integer value2) {
            addCriterion("petid not between", value1, value2, "petid");
            return (Criteria) this;
        }

        public Criteria andDogcommondiseaseidIsNull() {
            addCriterion("dogcommondiseaseid is null");
            return (Criteria) this;
        }

        public Criteria andDogcommondiseaseidIsNotNull() {
            addCriterion("dogcommondiseaseid is not null");
            return (Criteria) this;
        }

        public Criteria andDogcommondiseaseidEqualTo(Integer value) {
            addCriterion("dogcommondiseaseid =", value, "dogcommondiseaseid");
            return (Criteria) this;
        }

        public Criteria andDogcommondiseaseidNotEqualTo(Integer value) {
            addCriterion("dogcommondiseaseid <>", value, "dogcommondiseaseid");
            return (Criteria) this;
        }

        public Criteria andDogcommondiseaseidGreaterThan(Integer value) {
            addCriterion("dogcommondiseaseid >", value, "dogcommondiseaseid");
            return (Criteria) this;
        }

        public Criteria andDogcommondiseaseidGreaterThanOrEqualTo(Integer value) {
            addCriterion("dogcommondiseaseid >=", value, "dogcommondiseaseid");
            return (Criteria) this;
        }

        public Criteria andDogcommondiseaseidLessThan(Integer value) {
            addCriterion("dogcommondiseaseid <", value, "dogcommondiseaseid");
            return (Criteria) this;
        }

        public Criteria andDogcommondiseaseidLessThanOrEqualTo(Integer value) {
            addCriterion("dogcommondiseaseid <=", value, "dogcommondiseaseid");
            return (Criteria) this;
        }

        public Criteria andDogcommondiseaseidIn(List<Integer> values) {
            addCriterion("dogcommondiseaseid in", values, "dogcommondiseaseid");
            return (Criteria) this;
        }

        public Criteria andDogcommondiseaseidNotIn(List<Integer> values) {
            addCriterion("dogcommondiseaseid not in", values, "dogcommondiseaseid");
            return (Criteria) this;
        }

        public Criteria andDogcommondiseaseidBetween(Integer value1, Integer value2) {
            addCriterion("dogcommondiseaseid between", value1, value2, "dogcommondiseaseid");
            return (Criteria) this;
        }

        public Criteria andDogcommondiseaseidNotBetween(Integer value1, Integer value2) {
            addCriterion("dogcommondiseaseid not between", value1, value2, "dogcommondiseaseid");
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