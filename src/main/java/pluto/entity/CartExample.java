package pluto.entity;

import java.util.ArrayList;
import java.util.List;

public class CartExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CartExample() {
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

        public Criteria andCartidIsNull() {
            addCriterion("cartid is null");
            return (Criteria) this;
        }

        public Criteria andCartidIsNotNull() {
            addCriterion("cartid is not null");
            return (Criteria) this;
        }

        public Criteria andCartidEqualTo(Integer value) {
            addCriterion("cartid =", value, "cartid");
            return (Criteria) this;
        }

        public Criteria andCartidNotEqualTo(Integer value) {
            addCriterion("cartid <>", value, "cartid");
            return (Criteria) this;
        }

        public Criteria andCartidGreaterThan(Integer value) {
            addCriterion("cartid >", value, "cartid");
            return (Criteria) this;
        }

        public Criteria andCartidGreaterThanOrEqualTo(Integer value) {
            addCriterion("cartid >=", value, "cartid");
            return (Criteria) this;
        }

        public Criteria andCartidLessThan(Integer value) {
            addCriterion("cartid <", value, "cartid");
            return (Criteria) this;
        }

        public Criteria andCartidLessThanOrEqualTo(Integer value) {
            addCriterion("cartid <=", value, "cartid");
            return (Criteria) this;
        }

        public Criteria andCartidIn(List<Integer> values) {
            addCriterion("cartid in", values, "cartid");
            return (Criteria) this;
        }

        public Criteria andCartidNotIn(List<Integer> values) {
            addCriterion("cartid not in", values, "cartid");
            return (Criteria) this;
        }

        public Criteria andCartidBetween(Integer value1, Integer value2) {
            addCriterion("cartid between", value1, value2, "cartid");
            return (Criteria) this;
        }

        public Criteria andCartidNotBetween(Integer value1, Integer value2) {
            addCriterion("cartid not between", value1, value2, "cartid");
            return (Criteria) this;
        }

        public Criteria andCarttotalpriceIsNull() {
            addCriterion("carttotalprice is null");
            return (Criteria) this;
        }

        public Criteria andCarttotalpriceIsNotNull() {
            addCriterion("carttotalprice is not null");
            return (Criteria) this;
        }

        public Criteria andCarttotalpriceEqualTo(Double value) {
            addCriterion("carttotalprice =", value, "carttotalprice");
            return (Criteria) this;
        }

        public Criteria andCarttotalpriceNotEqualTo(Double value) {
            addCriterion("carttotalprice <>", value, "carttotalprice");
            return (Criteria) this;
        }

        public Criteria andCarttotalpriceGreaterThan(Double value) {
            addCriterion("carttotalprice >", value, "carttotalprice");
            return (Criteria) this;
        }

        public Criteria andCarttotalpriceGreaterThanOrEqualTo(Double value) {
            addCriterion("carttotalprice >=", value, "carttotalprice");
            return (Criteria) this;
        }

        public Criteria andCarttotalpriceLessThan(Double value) {
            addCriterion("carttotalprice <", value, "carttotalprice");
            return (Criteria) this;
        }

        public Criteria andCarttotalpriceLessThanOrEqualTo(Double value) {
            addCriterion("carttotalprice <=", value, "carttotalprice");
            return (Criteria) this;
        }

        public Criteria andCarttotalpriceIn(List<Double> values) {
            addCriterion("carttotalprice in", values, "carttotalprice");
            return (Criteria) this;
        }

        public Criteria andCarttotalpriceNotIn(List<Double> values) {
            addCriterion("carttotalprice not in", values, "carttotalprice");
            return (Criteria) this;
        }

        public Criteria andCarttotalpriceBetween(Double value1, Double value2) {
            addCriterion("carttotalprice between", value1, value2, "carttotalprice");
            return (Criteria) this;
        }

        public Criteria andCarttotalpriceNotBetween(Double value1, Double value2) {
            addCriterion("carttotalprice not between", value1, value2, "carttotalprice");
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

        public Criteria andGoodsdetailidIsNull() {
            addCriterion("goodsdetailid is null");
            return (Criteria) this;
        }

        public Criteria andGoodsdetailidIsNotNull() {
            addCriterion("goodsdetailid is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsdetailidEqualTo(Integer value) {
            addCriterion("goodsdetailid =", value, "goodsdetailid");
            return (Criteria) this;
        }

        public Criteria andGoodsdetailidNotEqualTo(Integer value) {
            addCriterion("goodsdetailid <>", value, "goodsdetailid");
            return (Criteria) this;
        }

        public Criteria andGoodsdetailidGreaterThan(Integer value) {
            addCriterion("goodsdetailid >", value, "goodsdetailid");
            return (Criteria) this;
        }

        public Criteria andGoodsdetailidGreaterThanOrEqualTo(Integer value) {
            addCriterion("goodsdetailid >=", value, "goodsdetailid");
            return (Criteria) this;
        }

        public Criteria andGoodsdetailidLessThan(Integer value) {
            addCriterion("goodsdetailid <", value, "goodsdetailid");
            return (Criteria) this;
        }

        public Criteria andGoodsdetailidLessThanOrEqualTo(Integer value) {
            addCriterion("goodsdetailid <=", value, "goodsdetailid");
            return (Criteria) this;
        }

        public Criteria andGoodsdetailidIn(List<Integer> values) {
            addCriterion("goodsdetailid in", values, "goodsdetailid");
            return (Criteria) this;
        }

        public Criteria andGoodsdetailidNotIn(List<Integer> values) {
            addCriterion("goodsdetailid not in", values, "goodsdetailid");
            return (Criteria) this;
        }

        public Criteria andGoodsdetailidBetween(Integer value1, Integer value2) {
            addCriterion("goodsdetailid between", value1, value2, "goodsdetailid");
            return (Criteria) this;
        }

        public Criteria andGoodsdetailidNotBetween(Integer value1, Integer value2) {
            addCriterion("goodsdetailid not between", value1, value2, "goodsdetailid");
            return (Criteria) this;
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