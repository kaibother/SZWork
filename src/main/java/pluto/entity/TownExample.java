package pluto.entity;

import java.util.ArrayList;
import java.util.List;

public class TownExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TownExample() {
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

        public Criteria andTownidIsNull() {
            addCriterion("townid is null");
            return (Criteria) this;
        }

        public Criteria andTownidIsNotNull() {
            addCriterion("townid is not null");
            return (Criteria) this;
        }

        public Criteria andTownidEqualTo(Integer value) {
            addCriterion("townid =", value, "townid");
            return (Criteria) this;
        }

        public Criteria andTownidNotEqualTo(Integer value) {
            addCriterion("townid <>", value, "townid");
            return (Criteria) this;
        }

        public Criteria andTownidGreaterThan(Integer value) {
            addCriterion("townid >", value, "townid");
            return (Criteria) this;
        }

        public Criteria andTownidGreaterThanOrEqualTo(Integer value) {
            addCriterion("townid >=", value, "townid");
            return (Criteria) this;
        }

        public Criteria andTownidLessThan(Integer value) {
            addCriterion("townid <", value, "townid");
            return (Criteria) this;
        }

        public Criteria andTownidLessThanOrEqualTo(Integer value) {
            addCriterion("townid <=", value, "townid");
            return (Criteria) this;
        }

        public Criteria andTownidIn(List<Integer> values) {
            addCriterion("townid in", values, "townid");
            return (Criteria) this;
        }

        public Criteria andTownidNotIn(List<Integer> values) {
            addCriterion("townid not in", values, "townid");
            return (Criteria) this;
        }

        public Criteria andTownidBetween(Integer value1, Integer value2) {
            addCriterion("townid between", value1, value2, "townid");
            return (Criteria) this;
        }

        public Criteria andTownidNotBetween(Integer value1, Integer value2) {
            addCriterion("townid not between", value1, value2, "townid");
            return (Criteria) this;
        }

        public Criteria andTownnameIsNull() {
            addCriterion("townname is null");
            return (Criteria) this;
        }

        public Criteria andTownnameIsNotNull() {
            addCriterion("townname is not null");
            return (Criteria) this;
        }

        public Criteria andTownnameEqualTo(String value) {
            addCriterion("townname =", value, "townname");
            return (Criteria) this;
        }

        public Criteria andTownnameNotEqualTo(String value) {
            addCriterion("townname <>", value, "townname");
            return (Criteria) this;
        }

        public Criteria andTownnameGreaterThan(String value) {
            addCriterion("townname >", value, "townname");
            return (Criteria) this;
        }

        public Criteria andTownnameGreaterThanOrEqualTo(String value) {
            addCriterion("townname >=", value, "townname");
            return (Criteria) this;
        }

        public Criteria andTownnameLessThan(String value) {
            addCriterion("townname <", value, "townname");
            return (Criteria) this;
        }

        public Criteria andTownnameLessThanOrEqualTo(String value) {
            addCriterion("townname <=", value, "townname");
            return (Criteria) this;
        }

        public Criteria andTownnameLike(String value) {
            addCriterion("townname like", value, "townname");
            return (Criteria) this;
        }

        public Criteria andTownnameNotLike(String value) {
            addCriterion("townname not like", value, "townname");
            return (Criteria) this;
        }

        public Criteria andTownnameIn(List<String> values) {
            addCriterion("townname in", values, "townname");
            return (Criteria) this;
        }

        public Criteria andTownnameNotIn(List<String> values) {
            addCriterion("townname not in", values, "townname");
            return (Criteria) this;
        }

        public Criteria andTownnameBetween(String value1, String value2) {
            addCriterion("townname between", value1, value2, "townname");
            return (Criteria) this;
        }

        public Criteria andTownnameNotBetween(String value1, String value2) {
            addCriterion("townname not between", value1, value2, "townname");
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