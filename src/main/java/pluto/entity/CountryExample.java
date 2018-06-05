package pluto.entity;

import java.util.ArrayList;
import java.util.List;

public class CountryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CountryExample() {
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

        public Criteria andCountryidIsNull() {
            addCriterion("countryid is null");
            return (Criteria) this;
        }

        public Criteria andCountryidIsNotNull() {
            addCriterion("countryid is not null");
            return (Criteria) this;
        }

        public Criteria andCountryidEqualTo(Integer value) {
            addCriterion("countryid =", value, "countryid");
            return (Criteria) this;
        }

        public Criteria andCountryidNotEqualTo(Integer value) {
            addCriterion("countryid <>", value, "countryid");
            return (Criteria) this;
        }

        public Criteria andCountryidGreaterThan(Integer value) {
            addCriterion("countryid >", value, "countryid");
            return (Criteria) this;
        }

        public Criteria andCountryidGreaterThanOrEqualTo(Integer value) {
            addCriterion("countryid >=", value, "countryid");
            return (Criteria) this;
        }

        public Criteria andCountryidLessThan(Integer value) {
            addCriterion("countryid <", value, "countryid");
            return (Criteria) this;
        }

        public Criteria andCountryidLessThanOrEqualTo(Integer value) {
            addCriterion("countryid <=", value, "countryid");
            return (Criteria) this;
        }

        public Criteria andCountryidIn(List<Integer> values) {
            addCriterion("countryid in", values, "countryid");
            return (Criteria) this;
        }

        public Criteria andCountryidNotIn(List<Integer> values) {
            addCriterion("countryid not in", values, "countryid");
            return (Criteria) this;
        }

        public Criteria andCountryidBetween(Integer value1, Integer value2) {
            addCriterion("countryid between", value1, value2, "countryid");
            return (Criteria) this;
        }

        public Criteria andCountryidNotBetween(Integer value1, Integer value2) {
            addCriterion("countryid not between", value1, value2, "countryid");
            return (Criteria) this;
        }

        public Criteria andCounrynameIsNull() {
            addCriterion("counryname is null");
            return (Criteria) this;
        }

        public Criteria andCounrynameIsNotNull() {
            addCriterion("counryname is not null");
            return (Criteria) this;
        }

        public Criteria andCounrynameEqualTo(String value) {
            addCriterion("counryname =", value, "counryname");
            return (Criteria) this;
        }

        public Criteria andCounrynameNotEqualTo(String value) {
            addCriterion("counryname <>", value, "counryname");
            return (Criteria) this;
        }

        public Criteria andCounrynameGreaterThan(String value) {
            addCriterion("counryname >", value, "counryname");
            return (Criteria) this;
        }

        public Criteria andCounrynameGreaterThanOrEqualTo(String value) {
            addCriterion("counryname >=", value, "counryname");
            return (Criteria) this;
        }

        public Criteria andCounrynameLessThan(String value) {
            addCriterion("counryname <", value, "counryname");
            return (Criteria) this;
        }

        public Criteria andCounrynameLessThanOrEqualTo(String value) {
            addCriterion("counryname <=", value, "counryname");
            return (Criteria) this;
        }

        public Criteria andCounrynameLike(String value) {
            addCriterion("counryname like", value, "counryname");
            return (Criteria) this;
        }

        public Criteria andCounrynameNotLike(String value) {
            addCriterion("counryname not like", value, "counryname");
            return (Criteria) this;
        }

        public Criteria andCounrynameIn(List<String> values) {
            addCriterion("counryname in", values, "counryname");
            return (Criteria) this;
        }

        public Criteria andCounrynameNotIn(List<String> values) {
            addCriterion("counryname not in", values, "counryname");
            return (Criteria) this;
        }

        public Criteria andCounrynameBetween(String value1, String value2) {
            addCriterion("counryname between", value1, value2, "counryname");
            return (Criteria) this;
        }

        public Criteria andCounrynameNotBetween(String value1, String value2) {
            addCriterion("counryname not between", value1, value2, "counryname");
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