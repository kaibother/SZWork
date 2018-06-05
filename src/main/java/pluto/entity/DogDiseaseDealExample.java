package pluto.entity;

import java.util.ArrayList;
import java.util.List;

public class DogDiseaseDealExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DogDiseaseDealExample() {
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

        public Criteria andDogdiseasedealidIsNull() {
            addCriterion("dogdiseasedealid is null");
            return (Criteria) this;
        }

        public Criteria andDogdiseasedealidIsNotNull() {
            addCriterion("dogdiseasedealid is not null");
            return (Criteria) this;
        }

        public Criteria andDogdiseasedealidEqualTo(Integer value) {
            addCriterion("dogdiseasedealid =", value, "dogdiseasedealid");
            return (Criteria) this;
        }

        public Criteria andDogdiseasedealidNotEqualTo(Integer value) {
            addCriterion("dogdiseasedealid <>", value, "dogdiseasedealid");
            return (Criteria) this;
        }

        public Criteria andDogdiseasedealidGreaterThan(Integer value) {
            addCriterion("dogdiseasedealid >", value, "dogdiseasedealid");
            return (Criteria) this;
        }

        public Criteria andDogdiseasedealidGreaterThanOrEqualTo(Integer value) {
            addCriterion("dogdiseasedealid >=", value, "dogdiseasedealid");
            return (Criteria) this;
        }

        public Criteria andDogdiseasedealidLessThan(Integer value) {
            addCriterion("dogdiseasedealid <", value, "dogdiseasedealid");
            return (Criteria) this;
        }

        public Criteria andDogdiseasedealidLessThanOrEqualTo(Integer value) {
            addCriterion("dogdiseasedealid <=", value, "dogdiseasedealid");
            return (Criteria) this;
        }

        public Criteria andDogdiseasedealidIn(List<Integer> values) {
            addCriterion("dogdiseasedealid in", values, "dogdiseasedealid");
            return (Criteria) this;
        }

        public Criteria andDogdiseasedealidNotIn(List<Integer> values) {
            addCriterion("dogdiseasedealid not in", values, "dogdiseasedealid");
            return (Criteria) this;
        }

        public Criteria andDogdiseasedealidBetween(Integer value1, Integer value2) {
            addCriterion("dogdiseasedealid between", value1, value2, "dogdiseasedealid");
            return (Criteria) this;
        }

        public Criteria andDogdiseasedealidNotBetween(Integer value1, Integer value2) {
            addCriterion("dogdiseasedealid not between", value1, value2, "dogdiseasedealid");
            return (Criteria) this;
        }

        public Criteria andDealmethodIsNull() {
            addCriterion("dealmethod is null");
            return (Criteria) this;
        }

        public Criteria andDealmethodIsNotNull() {
            addCriterion("dealmethod is not null");
            return (Criteria) this;
        }

        public Criteria andDealmethodEqualTo(String value) {
            addCriterion("dealmethod =", value, "dealmethod");
            return (Criteria) this;
        }

        public Criteria andDealmethodNotEqualTo(String value) {
            addCriterion("dealmethod <>", value, "dealmethod");
            return (Criteria) this;
        }

        public Criteria andDealmethodGreaterThan(String value) {
            addCriterion("dealmethod >", value, "dealmethod");
            return (Criteria) this;
        }

        public Criteria andDealmethodGreaterThanOrEqualTo(String value) {
            addCriterion("dealmethod >=", value, "dealmethod");
            return (Criteria) this;
        }

        public Criteria andDealmethodLessThan(String value) {
            addCriterion("dealmethod <", value, "dealmethod");
            return (Criteria) this;
        }

        public Criteria andDealmethodLessThanOrEqualTo(String value) {
            addCriterion("dealmethod <=", value, "dealmethod");
            return (Criteria) this;
        }

        public Criteria andDealmethodLike(String value) {
            addCriterion("dealmethod like", value, "dealmethod");
            return (Criteria) this;
        }

        public Criteria andDealmethodNotLike(String value) {
            addCriterion("dealmethod not like", value, "dealmethod");
            return (Criteria) this;
        }

        public Criteria andDealmethodIn(List<String> values) {
            addCriterion("dealmethod in", values, "dealmethod");
            return (Criteria) this;
        }

        public Criteria andDealmethodNotIn(List<String> values) {
            addCriterion("dealmethod not in", values, "dealmethod");
            return (Criteria) this;
        }

        public Criteria andDealmethodBetween(String value1, String value2) {
            addCriterion("dealmethod between", value1, value2, "dealmethod");
            return (Criteria) this;
        }

        public Criteria andDealmethodNotBetween(String value1, String value2) {
            addCriterion("dealmethod not between", value1, value2, "dealmethod");
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