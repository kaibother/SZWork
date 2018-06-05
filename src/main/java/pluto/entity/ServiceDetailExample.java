package pluto.entity;

import java.util.ArrayList;
import java.util.List;

public class ServiceDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ServiceDetailExample() {
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

        public Criteria andServicedetailidIsNull() {
            addCriterion("servicedetailid is null");
            return (Criteria) this;
        }

        public Criteria andServicedetailidIsNotNull() {
            addCriterion("servicedetailid is not null");
            return (Criteria) this;
        }

        public Criteria andServicedetailidEqualTo(Integer value) {
            addCriterion("servicedetailid =", value, "servicedetailid");
            return (Criteria) this;
        }

        public Criteria andServicedetailidNotEqualTo(Integer value) {
            addCriterion("servicedetailid <>", value, "servicedetailid");
            return (Criteria) this;
        }

        public Criteria andServicedetailidGreaterThan(Integer value) {
            addCriterion("servicedetailid >", value, "servicedetailid");
            return (Criteria) this;
        }

        public Criteria andServicedetailidGreaterThanOrEqualTo(Integer value) {
            addCriterion("servicedetailid >=", value, "servicedetailid");
            return (Criteria) this;
        }

        public Criteria andServicedetailidLessThan(Integer value) {
            addCriterion("servicedetailid <", value, "servicedetailid");
            return (Criteria) this;
        }

        public Criteria andServicedetailidLessThanOrEqualTo(Integer value) {
            addCriterion("servicedetailid <=", value, "servicedetailid");
            return (Criteria) this;
        }

        public Criteria andServicedetailidIn(List<Integer> values) {
            addCriterion("servicedetailid in", values, "servicedetailid");
            return (Criteria) this;
        }

        public Criteria andServicedetailidNotIn(List<Integer> values) {
            addCriterion("servicedetailid not in", values, "servicedetailid");
            return (Criteria) this;
        }

        public Criteria andServicedetailidBetween(Integer value1, Integer value2) {
            addCriterion("servicedetailid between", value1, value2, "servicedetailid");
            return (Criteria) this;
        }

        public Criteria andServicedetailidNotBetween(Integer value1, Integer value2) {
            addCriterion("servicedetailid not between", value1, value2, "servicedetailid");
            return (Criteria) this;
        }

        public Criteria andServicecountIsNull() {
            addCriterion("servicecount is null");
            return (Criteria) this;
        }

        public Criteria andServicecountIsNotNull() {
            addCriterion("servicecount is not null");
            return (Criteria) this;
        }

        public Criteria andServicecountEqualTo(Integer value) {
            addCriterion("servicecount =", value, "servicecount");
            return (Criteria) this;
        }

        public Criteria andServicecountNotEqualTo(Integer value) {
            addCriterion("servicecount <>", value, "servicecount");
            return (Criteria) this;
        }

        public Criteria andServicecountGreaterThan(Integer value) {
            addCriterion("servicecount >", value, "servicecount");
            return (Criteria) this;
        }

        public Criteria andServicecountGreaterThanOrEqualTo(Integer value) {
            addCriterion("servicecount >=", value, "servicecount");
            return (Criteria) this;
        }

        public Criteria andServicecountLessThan(Integer value) {
            addCriterion("servicecount <", value, "servicecount");
            return (Criteria) this;
        }

        public Criteria andServicecountLessThanOrEqualTo(Integer value) {
            addCriterion("servicecount <=", value, "servicecount");
            return (Criteria) this;
        }

        public Criteria andServicecountIn(List<Integer> values) {
            addCriterion("servicecount in", values, "servicecount");
            return (Criteria) this;
        }

        public Criteria andServicecountNotIn(List<Integer> values) {
            addCriterion("servicecount not in", values, "servicecount");
            return (Criteria) this;
        }

        public Criteria andServicecountBetween(Integer value1, Integer value2) {
            addCriterion("servicecount between", value1, value2, "servicecount");
            return (Criteria) this;
        }

        public Criteria andServicecountNotBetween(Integer value1, Integer value2) {
            addCriterion("servicecount not between", value1, value2, "servicecount");
            return (Criteria) this;
        }

        public Criteria andOneservicecountpriceIsNull() {
            addCriterion("oneservicecountprice is null");
            return (Criteria) this;
        }

        public Criteria andOneservicecountpriceIsNotNull() {
            addCriterion("oneservicecountprice is not null");
            return (Criteria) this;
        }

        public Criteria andOneservicecountpriceEqualTo(Double value) {
            addCriterion("oneservicecountprice =", value, "oneservicecountprice");
            return (Criteria) this;
        }

        public Criteria andOneservicecountpriceNotEqualTo(Double value) {
            addCriterion("oneservicecountprice <>", value, "oneservicecountprice");
            return (Criteria) this;
        }

        public Criteria andOneservicecountpriceGreaterThan(Double value) {
            addCriterion("oneservicecountprice >", value, "oneservicecountprice");
            return (Criteria) this;
        }

        public Criteria andOneservicecountpriceGreaterThanOrEqualTo(Double value) {
            addCriterion("oneservicecountprice >=", value, "oneservicecountprice");
            return (Criteria) this;
        }

        public Criteria andOneservicecountpriceLessThan(Double value) {
            addCriterion("oneservicecountprice <", value, "oneservicecountprice");
            return (Criteria) this;
        }

        public Criteria andOneservicecountpriceLessThanOrEqualTo(Double value) {
            addCriterion("oneservicecountprice <=", value, "oneservicecountprice");
            return (Criteria) this;
        }

        public Criteria andOneservicecountpriceIn(List<Double> values) {
            addCriterion("oneservicecountprice in", values, "oneservicecountprice");
            return (Criteria) this;
        }

        public Criteria andOneservicecountpriceNotIn(List<Double> values) {
            addCriterion("oneservicecountprice not in", values, "oneservicecountprice");
            return (Criteria) this;
        }

        public Criteria andOneservicecountpriceBetween(Double value1, Double value2) {
            addCriterion("oneservicecountprice between", value1, value2, "oneservicecountprice");
            return (Criteria) this;
        }

        public Criteria andOneservicecountpriceNotBetween(Double value1, Double value2) {
            addCriterion("oneservicecountprice not between", value1, value2, "oneservicecountprice");
            return (Criteria) this;
        }

        public Criteria andOrderidIsNull() {
            addCriterion("orderid is null");
            return (Criteria) this;
        }

        public Criteria andOrderidIsNotNull() {
            addCriterion("orderid is not null");
            return (Criteria) this;
        }

        public Criteria andOrderidEqualTo(Integer value) {
            addCriterion("orderid =", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotEqualTo(Integer value) {
            addCriterion("orderid <>", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidGreaterThan(Integer value) {
            addCriterion("orderid >", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidGreaterThanOrEqualTo(Integer value) {
            addCriterion("orderid >=", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLessThan(Integer value) {
            addCriterion("orderid <", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLessThanOrEqualTo(Integer value) {
            addCriterion("orderid <=", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidIn(List<Integer> values) {
            addCriterion("orderid in", values, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotIn(List<Integer> values) {
            addCriterion("orderid not in", values, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidBetween(Integer value1, Integer value2) {
            addCriterion("orderid between", value1, value2, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotBetween(Integer value1, Integer value2) {
            addCriterion("orderid not between", value1, value2, "orderid");
            return (Criteria) this;
        }

        public Criteria andServicetypeidIsNull() {
            addCriterion("servicetypeid is null");
            return (Criteria) this;
        }

        public Criteria andServicetypeidIsNotNull() {
            addCriterion("servicetypeid is not null");
            return (Criteria) this;
        }

        public Criteria andServicetypeidEqualTo(Integer value) {
            addCriterion("servicetypeid =", value, "servicetypeid");
            return (Criteria) this;
        }

        public Criteria andServicetypeidNotEqualTo(Integer value) {
            addCriterion("servicetypeid <>", value, "servicetypeid");
            return (Criteria) this;
        }

        public Criteria andServicetypeidGreaterThan(Integer value) {
            addCriterion("servicetypeid >", value, "servicetypeid");
            return (Criteria) this;
        }

        public Criteria andServicetypeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("servicetypeid >=", value, "servicetypeid");
            return (Criteria) this;
        }

        public Criteria andServicetypeidLessThan(Integer value) {
            addCriterion("servicetypeid <", value, "servicetypeid");
            return (Criteria) this;
        }

        public Criteria andServicetypeidLessThanOrEqualTo(Integer value) {
            addCriterion("servicetypeid <=", value, "servicetypeid");
            return (Criteria) this;
        }

        public Criteria andServicetypeidIn(List<Integer> values) {
            addCriterion("servicetypeid in", values, "servicetypeid");
            return (Criteria) this;
        }

        public Criteria andServicetypeidNotIn(List<Integer> values) {
            addCriterion("servicetypeid not in", values, "servicetypeid");
            return (Criteria) this;
        }

        public Criteria andServicetypeidBetween(Integer value1, Integer value2) {
            addCriterion("servicetypeid between", value1, value2, "servicetypeid");
            return (Criteria) this;
        }

        public Criteria andServicetypeidNotBetween(Integer value1, Integer value2) {
            addCriterion("servicetypeid not between", value1, value2, "servicetypeid");
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