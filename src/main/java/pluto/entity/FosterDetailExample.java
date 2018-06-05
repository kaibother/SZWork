package pluto.entity;

import java.util.ArrayList;
import java.util.List;

public class FosterDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FosterDetailExample() {
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

        public Criteria andFosterdetailidIsNull() {
            addCriterion("fosterdetailid is null");
            return (Criteria) this;
        }

        public Criteria andFosterdetailidIsNotNull() {
            addCriterion("fosterdetailid is not null");
            return (Criteria) this;
        }

        public Criteria andFosterdetailidEqualTo(Integer value) {
            addCriterion("fosterdetailid =", value, "fosterdetailid");
            return (Criteria) this;
        }

        public Criteria andFosterdetailidNotEqualTo(Integer value) {
            addCriterion("fosterdetailid <>", value, "fosterdetailid");
            return (Criteria) this;
        }

        public Criteria andFosterdetailidGreaterThan(Integer value) {
            addCriterion("fosterdetailid >", value, "fosterdetailid");
            return (Criteria) this;
        }

        public Criteria andFosterdetailidGreaterThanOrEqualTo(Integer value) {
            addCriterion("fosterdetailid >=", value, "fosterdetailid");
            return (Criteria) this;
        }

        public Criteria andFosterdetailidLessThan(Integer value) {
            addCriterion("fosterdetailid <", value, "fosterdetailid");
            return (Criteria) this;
        }

        public Criteria andFosterdetailidLessThanOrEqualTo(Integer value) {
            addCriterion("fosterdetailid <=", value, "fosterdetailid");
            return (Criteria) this;
        }

        public Criteria andFosterdetailidIn(List<Integer> values) {
            addCriterion("fosterdetailid in", values, "fosterdetailid");
            return (Criteria) this;
        }

        public Criteria andFosterdetailidNotIn(List<Integer> values) {
            addCriterion("fosterdetailid not in", values, "fosterdetailid");
            return (Criteria) this;
        }

        public Criteria andFosterdetailidBetween(Integer value1, Integer value2) {
            addCriterion("fosterdetailid between", value1, value2, "fosterdetailid");
            return (Criteria) this;
        }

        public Criteria andFosterdetailidNotBetween(Integer value1, Integer value2) {
            addCriterion("fosterdetailid not between", value1, value2, "fosterdetailid");
            return (Criteria) this;
        }

        public Criteria andFosterdayIsNull() {
            addCriterion("fosterday is null");
            return (Criteria) this;
        }

        public Criteria andFosterdayIsNotNull() {
            addCriterion("fosterday is not null");
            return (Criteria) this;
        }

        public Criteria andFosterdayEqualTo(Integer value) {
            addCriterion("fosterday =", value, "fosterday");
            return (Criteria) this;
        }

        public Criteria andFosterdayNotEqualTo(Integer value) {
            addCriterion("fosterday <>", value, "fosterday");
            return (Criteria) this;
        }

        public Criteria andFosterdayGreaterThan(Integer value) {
            addCriterion("fosterday >", value, "fosterday");
            return (Criteria) this;
        }

        public Criteria andFosterdayGreaterThanOrEqualTo(Integer value) {
            addCriterion("fosterday >=", value, "fosterday");
            return (Criteria) this;
        }

        public Criteria andFosterdayLessThan(Integer value) {
            addCriterion("fosterday <", value, "fosterday");
            return (Criteria) this;
        }

        public Criteria andFosterdayLessThanOrEqualTo(Integer value) {
            addCriterion("fosterday <=", value, "fosterday");
            return (Criteria) this;
        }

        public Criteria andFosterdayIn(List<Integer> values) {
            addCriterion("fosterday in", values, "fosterday");
            return (Criteria) this;
        }

        public Criteria andFosterdayNotIn(List<Integer> values) {
            addCriterion("fosterday not in", values, "fosterday");
            return (Criteria) this;
        }

        public Criteria andFosterdayBetween(Integer value1, Integer value2) {
            addCriterion("fosterday between", value1, value2, "fosterday");
            return (Criteria) this;
        }

        public Criteria andFosterdayNotBetween(Integer value1, Integer value2) {
            addCriterion("fosterday not between", value1, value2, "fosterday");
            return (Criteria) this;
        }

        public Criteria andFostertotalpriceIsNull() {
            addCriterion("fostertotalprice is null");
            return (Criteria) this;
        }

        public Criteria andFostertotalpriceIsNotNull() {
            addCriterion("fostertotalprice is not null");
            return (Criteria) this;
        }

        public Criteria andFostertotalpriceEqualTo(Double value) {
            addCriterion("fostertotalprice =", value, "fostertotalprice");
            return (Criteria) this;
        }

        public Criteria andFostertotalpriceNotEqualTo(Double value) {
            addCriterion("fostertotalprice <>", value, "fostertotalprice");
            return (Criteria) this;
        }

        public Criteria andFostertotalpriceGreaterThan(Double value) {
            addCriterion("fostertotalprice >", value, "fostertotalprice");
            return (Criteria) this;
        }

        public Criteria andFostertotalpriceGreaterThanOrEqualTo(Double value) {
            addCriterion("fostertotalprice >=", value, "fostertotalprice");
            return (Criteria) this;
        }

        public Criteria andFostertotalpriceLessThan(Double value) {
            addCriterion("fostertotalprice <", value, "fostertotalprice");
            return (Criteria) this;
        }

        public Criteria andFostertotalpriceLessThanOrEqualTo(Double value) {
            addCriterion("fostertotalprice <=", value, "fostertotalprice");
            return (Criteria) this;
        }

        public Criteria andFostertotalpriceIn(List<Double> values) {
            addCriterion("fostertotalprice in", values, "fostertotalprice");
            return (Criteria) this;
        }

        public Criteria andFostertotalpriceNotIn(List<Double> values) {
            addCriterion("fostertotalprice not in", values, "fostertotalprice");
            return (Criteria) this;
        }

        public Criteria andFostertotalpriceBetween(Double value1, Double value2) {
            addCriterion("fostertotalprice between", value1, value2, "fostertotalprice");
            return (Criteria) this;
        }

        public Criteria andFostertotalpriceNotBetween(Double value1, Double value2) {
            addCriterion("fostertotalprice not between", value1, value2, "fostertotalprice");
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