package pluto.entity;

import java.util.ArrayList;
import java.util.List;

public class HospitalInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HospitalInfoExample() {
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

        public Criteria andHospitalidIsNull() {
            addCriterion("hospitalid is null");
            return (Criteria) this;
        }

        public Criteria andHospitalidIsNotNull() {
            addCriterion("hospitalid is not null");
            return (Criteria) this;
        }

        public Criteria andHospitalidEqualTo(Integer value) {
            addCriterion("hospitalid =", value, "hospitalid");
            return (Criteria) this;
        }

        public Criteria andHospitalidNotEqualTo(Integer value) {
            addCriterion("hospitalid <>", value, "hospitalid");
            return (Criteria) this;
        }

        public Criteria andHospitalidGreaterThan(Integer value) {
            addCriterion("hospitalid >", value, "hospitalid");
            return (Criteria) this;
        }

        public Criteria andHospitalidGreaterThanOrEqualTo(Integer value) {
            addCriterion("hospitalid >=", value, "hospitalid");
            return (Criteria) this;
        }

        public Criteria andHospitalidLessThan(Integer value) {
            addCriterion("hospitalid <", value, "hospitalid");
            return (Criteria) this;
        }

        public Criteria andHospitalidLessThanOrEqualTo(Integer value) {
            addCriterion("hospitalid <=", value, "hospitalid");
            return (Criteria) this;
        }

        public Criteria andHospitalidIn(List<Integer> values) {
            addCriterion("hospitalid in", values, "hospitalid");
            return (Criteria) this;
        }

        public Criteria andHospitalidNotIn(List<Integer> values) {
            addCriterion("hospitalid not in", values, "hospitalid");
            return (Criteria) this;
        }

        public Criteria andHospitalidBetween(Integer value1, Integer value2) {
            addCriterion("hospitalid between", value1, value2, "hospitalid");
            return (Criteria) this;
        }

        public Criteria andHospitalidNotBetween(Integer value1, Integer value2) {
            addCriterion("hospitalid not between", value1, value2, "hospitalid");
            return (Criteria) this;
        }

        public Criteria andHospitalnameIsNull() {
            addCriterion("hospitalname is null");
            return (Criteria) this;
        }

        public Criteria andHospitalnameIsNotNull() {
            addCriterion("hospitalname is not null");
            return (Criteria) this;
        }

        public Criteria andHospitalnameEqualTo(String value) {
            addCriterion("hospitalname =", value, "hospitalname");
            return (Criteria) this;
        }

        public Criteria andHospitalnameNotEqualTo(String value) {
            addCriterion("hospitalname <>", value, "hospitalname");
            return (Criteria) this;
        }

        public Criteria andHospitalnameGreaterThan(String value) {
            addCriterion("hospitalname >", value, "hospitalname");
            return (Criteria) this;
        }

        public Criteria andHospitalnameGreaterThanOrEqualTo(String value) {
            addCriterion("hospitalname >=", value, "hospitalname");
            return (Criteria) this;
        }

        public Criteria andHospitalnameLessThan(String value) {
            addCriterion("hospitalname <", value, "hospitalname");
            return (Criteria) this;
        }

        public Criteria andHospitalnameLessThanOrEqualTo(String value) {
            addCriterion("hospitalname <=", value, "hospitalname");
            return (Criteria) this;
        }

        public Criteria andHospitalnameLike(String value) {
            addCriterion("hospitalname like", value, "hospitalname");
            return (Criteria) this;
        }

        public Criteria andHospitalnameNotLike(String value) {
            addCriterion("hospitalname not like", value, "hospitalname");
            return (Criteria) this;
        }

        public Criteria andHospitalnameIn(List<String> values) {
            addCriterion("hospitalname in", values, "hospitalname");
            return (Criteria) this;
        }

        public Criteria andHospitalnameNotIn(List<String> values) {
            addCriterion("hospitalname not in", values, "hospitalname");
            return (Criteria) this;
        }

        public Criteria andHospitalnameBetween(String value1, String value2) {
            addCriterion("hospitalname between", value1, value2, "hospitalname");
            return (Criteria) this;
        }

        public Criteria andHospitalnameNotBetween(String value1, String value2) {
            addCriterion("hospitalname not between", value1, value2, "hospitalname");
            return (Criteria) this;
        }

        public Criteria andHospitalcityidIsNull() {
            addCriterion("hospitalcityid is null");
            return (Criteria) this;
        }

        public Criteria andHospitalcityidIsNotNull() {
            addCriterion("hospitalcityid is not null");
            return (Criteria) this;
        }

        public Criteria andHospitalcityidEqualTo(Integer value) {
            addCriterion("hospitalcityid =", value, "hospitalcityid");
            return (Criteria) this;
        }

        public Criteria andHospitalcityidNotEqualTo(Integer value) {
            addCriterion("hospitalcityid <>", value, "hospitalcityid");
            return (Criteria) this;
        }

        public Criteria andHospitalcityidGreaterThan(Integer value) {
            addCriterion("hospitalcityid >", value, "hospitalcityid");
            return (Criteria) this;
        }

        public Criteria andHospitalcityidGreaterThanOrEqualTo(Integer value) {
            addCriterion("hospitalcityid >=", value, "hospitalcityid");
            return (Criteria) this;
        }

        public Criteria andHospitalcityidLessThan(Integer value) {
            addCriterion("hospitalcityid <", value, "hospitalcityid");
            return (Criteria) this;
        }

        public Criteria andHospitalcityidLessThanOrEqualTo(Integer value) {
            addCriterion("hospitalcityid <=", value, "hospitalcityid");
            return (Criteria) this;
        }

        public Criteria andHospitalcityidIn(List<Integer> values) {
            addCriterion("hospitalcityid in", values, "hospitalcityid");
            return (Criteria) this;
        }

        public Criteria andHospitalcityidNotIn(List<Integer> values) {
            addCriterion("hospitalcityid not in", values, "hospitalcityid");
            return (Criteria) this;
        }

        public Criteria andHospitalcityidBetween(Integer value1, Integer value2) {
            addCriterion("hospitalcityid between", value1, value2, "hospitalcityid");
            return (Criteria) this;
        }

        public Criteria andHospitalcityidNotBetween(Integer value1, Integer value2) {
            addCriterion("hospitalcityid not between", value1, value2, "hospitalcityid");
            return (Criteria) this;
        }

        public Criteria andHospitaldistrictidIsNull() {
            addCriterion("hospitaldistrictid is null");
            return (Criteria) this;
        }

        public Criteria andHospitaldistrictidIsNotNull() {
            addCriterion("hospitaldistrictid is not null");
            return (Criteria) this;
        }

        public Criteria andHospitaldistrictidEqualTo(Integer value) {
            addCriterion("hospitaldistrictid =", value, "hospitaldistrictid");
            return (Criteria) this;
        }

        public Criteria andHospitaldistrictidNotEqualTo(Integer value) {
            addCriterion("hospitaldistrictid <>", value, "hospitaldistrictid");
            return (Criteria) this;
        }

        public Criteria andHospitaldistrictidGreaterThan(Integer value) {
            addCriterion("hospitaldistrictid >", value, "hospitaldistrictid");
            return (Criteria) this;
        }

        public Criteria andHospitaldistrictidGreaterThanOrEqualTo(Integer value) {
            addCriterion("hospitaldistrictid >=", value, "hospitaldistrictid");
            return (Criteria) this;
        }

        public Criteria andHospitaldistrictidLessThan(Integer value) {
            addCriterion("hospitaldistrictid <", value, "hospitaldistrictid");
            return (Criteria) this;
        }

        public Criteria andHospitaldistrictidLessThanOrEqualTo(Integer value) {
            addCriterion("hospitaldistrictid <=", value, "hospitaldistrictid");
            return (Criteria) this;
        }

        public Criteria andHospitaldistrictidIn(List<Integer> values) {
            addCriterion("hospitaldistrictid in", values, "hospitaldistrictid");
            return (Criteria) this;
        }

        public Criteria andHospitaldistrictidNotIn(List<Integer> values) {
            addCriterion("hospitaldistrictid not in", values, "hospitaldistrictid");
            return (Criteria) this;
        }

        public Criteria andHospitaldistrictidBetween(Integer value1, Integer value2) {
            addCriterion("hospitaldistrictid between", value1, value2, "hospitaldistrictid");
            return (Criteria) this;
        }

        public Criteria andHospitaldistrictidNotBetween(Integer value1, Integer value2) {
            addCriterion("hospitaldistrictid not between", value1, value2, "hospitaldistrictid");
            return (Criteria) this;
        }

        public Criteria andHospitaldistreetidIsNull() {
            addCriterion("hospitaldistreetid is null");
            return (Criteria) this;
        }

        public Criteria andHospitaldistreetidIsNotNull() {
            addCriterion("hospitaldistreetid is not null");
            return (Criteria) this;
        }

        public Criteria andHospitaldistreetidEqualTo(Integer value) {
            addCriterion("hospitaldistreetid =", value, "hospitaldistreetid");
            return (Criteria) this;
        }

        public Criteria andHospitaldistreetidNotEqualTo(Integer value) {
            addCriterion("hospitaldistreetid <>", value, "hospitaldistreetid");
            return (Criteria) this;
        }

        public Criteria andHospitaldistreetidGreaterThan(Integer value) {
            addCriterion("hospitaldistreetid >", value, "hospitaldistreetid");
            return (Criteria) this;
        }

        public Criteria andHospitaldistreetidGreaterThanOrEqualTo(Integer value) {
            addCriterion("hospitaldistreetid >=", value, "hospitaldistreetid");
            return (Criteria) this;
        }

        public Criteria andHospitaldistreetidLessThan(Integer value) {
            addCriterion("hospitaldistreetid <", value, "hospitaldistreetid");
            return (Criteria) this;
        }

        public Criteria andHospitaldistreetidLessThanOrEqualTo(Integer value) {
            addCriterion("hospitaldistreetid <=", value, "hospitaldistreetid");
            return (Criteria) this;
        }

        public Criteria andHospitaldistreetidIn(List<Integer> values) {
            addCriterion("hospitaldistreetid in", values, "hospitaldistreetid");
            return (Criteria) this;
        }

        public Criteria andHospitaldistreetidNotIn(List<Integer> values) {
            addCriterion("hospitaldistreetid not in", values, "hospitaldistreetid");
            return (Criteria) this;
        }

        public Criteria andHospitaldistreetidBetween(Integer value1, Integer value2) {
            addCriterion("hospitaldistreetid between", value1, value2, "hospitaldistreetid");
            return (Criteria) this;
        }

        public Criteria andHospitaldistreetidNotBetween(Integer value1, Integer value2) {
            addCriterion("hospitaldistreetid not between", value1, value2, "hospitaldistreetid");
            return (Criteria) this;
        }

        public Criteria andHospitalintroduceIsNull() {
            addCriterion("hospitalintroduce is null");
            return (Criteria) this;
        }

        public Criteria andHospitalintroduceIsNotNull() {
            addCriterion("hospitalintroduce is not null");
            return (Criteria) this;
        }

        public Criteria andHospitalintroduceEqualTo(String value) {
            addCriterion("hospitalintroduce =", value, "hospitalintroduce");
            return (Criteria) this;
        }

        public Criteria andHospitalintroduceNotEqualTo(String value) {
            addCriterion("hospitalintroduce <>", value, "hospitalintroduce");
            return (Criteria) this;
        }

        public Criteria andHospitalintroduceGreaterThan(String value) {
            addCriterion("hospitalintroduce >", value, "hospitalintroduce");
            return (Criteria) this;
        }

        public Criteria andHospitalintroduceGreaterThanOrEqualTo(String value) {
            addCriterion("hospitalintroduce >=", value, "hospitalintroduce");
            return (Criteria) this;
        }

        public Criteria andHospitalintroduceLessThan(String value) {
            addCriterion("hospitalintroduce <", value, "hospitalintroduce");
            return (Criteria) this;
        }

        public Criteria andHospitalintroduceLessThanOrEqualTo(String value) {
            addCriterion("hospitalintroduce <=", value, "hospitalintroduce");
            return (Criteria) this;
        }

        public Criteria andHospitalintroduceLike(String value) {
            addCriterion("hospitalintroduce like", value, "hospitalintroduce");
            return (Criteria) this;
        }

        public Criteria andHospitalintroduceNotLike(String value) {
            addCriterion("hospitalintroduce not like", value, "hospitalintroduce");
            return (Criteria) this;
        }

        public Criteria andHospitalintroduceIn(List<String> values) {
            addCriterion("hospitalintroduce in", values, "hospitalintroduce");
            return (Criteria) this;
        }

        public Criteria andHospitalintroduceNotIn(List<String> values) {
            addCriterion("hospitalintroduce not in", values, "hospitalintroduce");
            return (Criteria) this;
        }

        public Criteria andHospitalintroduceBetween(String value1, String value2) {
            addCriterion("hospitalintroduce between", value1, value2, "hospitalintroduce");
            return (Criteria) this;
        }

        public Criteria andHospitalintroduceNotBetween(String value1, String value2) {
            addCriterion("hospitalintroduce not between", value1, value2, "hospitalintroduce");
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