package pluto.entity;

import java.util.ArrayList;
import java.util.List;

public class UserConsumptionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserConsumptionExample() {
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

        public Criteria andConsumptionidIsNull() {
            addCriterion("consumptionid is null");
            return (Criteria) this;
        }

        public Criteria andConsumptionidIsNotNull() {
            addCriterion("consumptionid is not null");
            return (Criteria) this;
        }

        public Criteria andConsumptionidEqualTo(Integer value) {
            addCriterion("consumptionid =", value, "consumptionid");
            return (Criteria) this;
        }

        public Criteria andConsumptionidNotEqualTo(Integer value) {
            addCriterion("consumptionid <>", value, "consumptionid");
            return (Criteria) this;
        }

        public Criteria andConsumptionidGreaterThan(Integer value) {
            addCriterion("consumptionid >", value, "consumptionid");
            return (Criteria) this;
        }

        public Criteria andConsumptionidGreaterThanOrEqualTo(Integer value) {
            addCriterion("consumptionid >=", value, "consumptionid");
            return (Criteria) this;
        }

        public Criteria andConsumptionidLessThan(Integer value) {
            addCriterion("consumptionid <", value, "consumptionid");
            return (Criteria) this;
        }

        public Criteria andConsumptionidLessThanOrEqualTo(Integer value) {
            addCriterion("consumptionid <=", value, "consumptionid");
            return (Criteria) this;
        }

        public Criteria andConsumptionidIn(List<Integer> values) {
            addCriterion("consumptionid in", values, "consumptionid");
            return (Criteria) this;
        }

        public Criteria andConsumptionidNotIn(List<Integer> values) {
            addCriterion("consumptionid not in", values, "consumptionid");
            return (Criteria) this;
        }

        public Criteria andConsumptionidBetween(Integer value1, Integer value2) {
            addCriterion("consumptionid between", value1, value2, "consumptionid");
            return (Criteria) this;
        }

        public Criteria andConsumptionidNotBetween(Integer value1, Integer value2) {
            addCriterion("consumptionid not between", value1, value2, "consumptionid");
            return (Criteria) this;
        }

        public Criteria andConsumptionamountIsNull() {
            addCriterion("consumptionamount is null");
            return (Criteria) this;
        }

        public Criteria andConsumptionamountIsNotNull() {
            addCriterion("consumptionamount is not null");
            return (Criteria) this;
        }

        public Criteria andConsumptionamountEqualTo(Double value) {
            addCriterion("consumptionamount =", value, "consumptionamount");
            return (Criteria) this;
        }

        public Criteria andConsumptionamountNotEqualTo(Double value) {
            addCriterion("consumptionamount <>", value, "consumptionamount");
            return (Criteria) this;
        }

        public Criteria andConsumptionamountGreaterThan(Double value) {
            addCriterion("consumptionamount >", value, "consumptionamount");
            return (Criteria) this;
        }

        public Criteria andConsumptionamountGreaterThanOrEqualTo(Double value) {
            addCriterion("consumptionamount >=", value, "consumptionamount");
            return (Criteria) this;
        }

        public Criteria andConsumptionamountLessThan(Double value) {
            addCriterion("consumptionamount <", value, "consumptionamount");
            return (Criteria) this;
        }

        public Criteria andConsumptionamountLessThanOrEqualTo(Double value) {
            addCriterion("consumptionamount <=", value, "consumptionamount");
            return (Criteria) this;
        }

        public Criteria andConsumptionamountIn(List<Double> values) {
            addCriterion("consumptionamount in", values, "consumptionamount");
            return (Criteria) this;
        }

        public Criteria andConsumptionamountNotIn(List<Double> values) {
            addCriterion("consumptionamount not in", values, "consumptionamount");
            return (Criteria) this;
        }

        public Criteria andConsumptionamountBetween(Double value1, Double value2) {
            addCriterion("consumptionamount between", value1, value2, "consumptionamount");
            return (Criteria) this;
        }

        public Criteria andConsumptionamountNotBetween(Double value1, Double value2) {
            addCriterion("consumptionamount not between", value1, value2, "consumptionamount");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("userid is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userid is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Integer value) {
            addCriterion("userid =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Integer value) {
            addCriterion("userid <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Integer value) {
            addCriterion("userid >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("userid >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Integer value) {
            addCriterion("userid <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Integer value) {
            addCriterion("userid <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Integer> values) {
            addCriterion("userid in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Integer> values) {
            addCriterion("userid not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Integer value1, Integer value2) {
            addCriterion("userid between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("userid not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andRechargeamountIsNull() {
            addCriterion("rechargeamount is null");
            return (Criteria) this;
        }

        public Criteria andRechargeamountIsNotNull() {
            addCriterion("rechargeamount is not null");
            return (Criteria) this;
        }

        public Criteria andRechargeamountEqualTo(Double value) {
            addCriterion("rechargeamount =", value, "rechargeamount");
            return (Criteria) this;
        }

        public Criteria andRechargeamountNotEqualTo(Double value) {
            addCriterion("rechargeamount <>", value, "rechargeamount");
            return (Criteria) this;
        }

        public Criteria andRechargeamountGreaterThan(Double value) {
            addCriterion("rechargeamount >", value, "rechargeamount");
            return (Criteria) this;
        }

        public Criteria andRechargeamountGreaterThanOrEqualTo(Double value) {
            addCriterion("rechargeamount >=", value, "rechargeamount");
            return (Criteria) this;
        }

        public Criteria andRechargeamountLessThan(Double value) {
            addCriterion("rechargeamount <", value, "rechargeamount");
            return (Criteria) this;
        }

        public Criteria andRechargeamountLessThanOrEqualTo(Double value) {
            addCriterion("rechargeamount <=", value, "rechargeamount");
            return (Criteria) this;
        }

        public Criteria andRechargeamountIn(List<Double> values) {
            addCriterion("rechargeamount in", values, "rechargeamount");
            return (Criteria) this;
        }

        public Criteria andRechargeamountNotIn(List<Double> values) {
            addCriterion("rechargeamount not in", values, "rechargeamount");
            return (Criteria) this;
        }

        public Criteria andRechargeamountBetween(Double value1, Double value2) {
            addCriterion("rechargeamount between", value1, value2, "rechargeamount");
            return (Criteria) this;
        }

        public Criteria andRechargeamountNotBetween(Double value1, Double value2) {
            addCriterion("rechargeamount not between", value1, value2, "rechargeamount");
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