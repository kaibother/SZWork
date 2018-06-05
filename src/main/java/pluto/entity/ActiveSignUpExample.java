package pluto.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ActiveSignUpExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ActiveSignUpExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andSignupidIsNull() {
            addCriterion("signupid is null");
            return (Criteria) this;
        }

        public Criteria andSignupidIsNotNull() {
            addCriterion("signupid is not null");
            return (Criteria) this;
        }

        public Criteria andSignupidEqualTo(Integer value) {
            addCriterion("signupid =", value, "signupid");
            return (Criteria) this;
        }

        public Criteria andSignupidNotEqualTo(Integer value) {
            addCriterion("signupid <>", value, "signupid");
            return (Criteria) this;
        }

        public Criteria andSignupidGreaterThan(Integer value) {
            addCriterion("signupid >", value, "signupid");
            return (Criteria) this;
        }

        public Criteria andSignupidGreaterThanOrEqualTo(Integer value) {
            addCriterion("signupid >=", value, "signupid");
            return (Criteria) this;
        }

        public Criteria andSignupidLessThan(Integer value) {
            addCriterion("signupid <", value, "signupid");
            return (Criteria) this;
        }

        public Criteria andSignupidLessThanOrEqualTo(Integer value) {
            addCriterion("signupid <=", value, "signupid");
            return (Criteria) this;
        }

        public Criteria andSignupidIn(List<Integer> values) {
            addCriterion("signupid in", values, "signupid");
            return (Criteria) this;
        }

        public Criteria andSignupidNotIn(List<Integer> values) {
            addCriterion("signupid not in", values, "signupid");
            return (Criteria) this;
        }

        public Criteria andSignupidBetween(Integer value1, Integer value2) {
            addCriterion("signupid between", value1, value2, "signupid");
            return (Criteria) this;
        }

        public Criteria andSignupidNotBetween(Integer value1, Integer value2) {
            addCriterion("signupid not between", value1, value2, "signupid");
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

        public Criteria andActivedateIsNull() {
            addCriterion("activedate is null");
            return (Criteria) this;
        }

        public Criteria andActivedateIsNotNull() {
            addCriterion("activedate is not null");
            return (Criteria) this;
        }

        public Criteria andActivedateEqualTo(Date value) {
            addCriterionForJDBCDate("activedate =", value, "activedate");
            return (Criteria) this;
        }

        public Criteria andActivedateNotEqualTo(Date value) {
            addCriterionForJDBCDate("activedate <>", value, "activedate");
            return (Criteria) this;
        }

        public Criteria andActivedateGreaterThan(Date value) {
            addCriterionForJDBCDate("activedate >", value, "activedate");
            return (Criteria) this;
        }

        public Criteria andActivedateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("activedate >=", value, "activedate");
            return (Criteria) this;
        }

        public Criteria andActivedateLessThan(Date value) {
            addCriterionForJDBCDate("activedate <", value, "activedate");
            return (Criteria) this;
        }

        public Criteria andActivedateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("activedate <=", value, "activedate");
            return (Criteria) this;
        }

        public Criteria andActivedateIn(List<Date> values) {
            addCriterionForJDBCDate("activedate in", values, "activedate");
            return (Criteria) this;
        }

        public Criteria andActivedateNotIn(List<Date> values) {
            addCriterionForJDBCDate("activedate not in", values, "activedate");
            return (Criteria) this;
        }

        public Criteria andActivedateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("activedate between", value1, value2, "activedate");
            return (Criteria) this;
        }

        public Criteria andActivedateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("activedate not between", value1, value2, "activedate");
            return (Criteria) this;
        }

        public Criteria andActivetypeidIsNull() {
            addCriterion("activetypeid is null");
            return (Criteria) this;
        }

        public Criteria andActivetypeidIsNotNull() {
            addCriterion("activetypeid is not null");
            return (Criteria) this;
        }

        public Criteria andActivetypeidEqualTo(Integer value) {
            addCriterion("activetypeid =", value, "activetypeid");
            return (Criteria) this;
        }

        public Criteria andActivetypeidNotEqualTo(Integer value) {
            addCriterion("activetypeid <>", value, "activetypeid");
            return (Criteria) this;
        }

        public Criteria andActivetypeidGreaterThan(Integer value) {
            addCriterion("activetypeid >", value, "activetypeid");
            return (Criteria) this;
        }

        public Criteria andActivetypeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("activetypeid >=", value, "activetypeid");
            return (Criteria) this;
        }

        public Criteria andActivetypeidLessThan(Integer value) {
            addCriterion("activetypeid <", value, "activetypeid");
            return (Criteria) this;
        }

        public Criteria andActivetypeidLessThanOrEqualTo(Integer value) {
            addCriterion("activetypeid <=", value, "activetypeid");
            return (Criteria) this;
        }

        public Criteria andActivetypeidIn(List<Integer> values) {
            addCriterion("activetypeid in", values, "activetypeid");
            return (Criteria) this;
        }

        public Criteria andActivetypeidNotIn(List<Integer> values) {
            addCriterion("activetypeid not in", values, "activetypeid");
            return (Criteria) this;
        }

        public Criteria andActivetypeidBetween(Integer value1, Integer value2) {
            addCriterion("activetypeid between", value1, value2, "activetypeid");
            return (Criteria) this;
        }

        public Criteria andActivetypeidNotBetween(Integer value1, Integer value2) {
            addCriterion("activetypeid not between", value1, value2, "activetypeid");
            return (Criteria) this;
        }

        public Criteria andActivegradeidIsNull() {
            addCriterion("activegradeid is null");
            return (Criteria) this;
        }

        public Criteria andActivegradeidIsNotNull() {
            addCriterion("activegradeid is not null");
            return (Criteria) this;
        }

        public Criteria andActivegradeidEqualTo(Integer value) {
            addCriterion("activegradeid =", value, "activegradeid");
            return (Criteria) this;
        }

        public Criteria andActivegradeidNotEqualTo(Integer value) {
            addCriterion("activegradeid <>", value, "activegradeid");
            return (Criteria) this;
        }

        public Criteria andActivegradeidGreaterThan(Integer value) {
            addCriterion("activegradeid >", value, "activegradeid");
            return (Criteria) this;
        }

        public Criteria andActivegradeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("activegradeid >=", value, "activegradeid");
            return (Criteria) this;
        }

        public Criteria andActivegradeidLessThan(Integer value) {
            addCriterion("activegradeid <", value, "activegradeid");
            return (Criteria) this;
        }

        public Criteria andActivegradeidLessThanOrEqualTo(Integer value) {
            addCriterion("activegradeid <=", value, "activegradeid");
            return (Criteria) this;
        }

        public Criteria andActivegradeidIn(List<Integer> values) {
            addCriterion("activegradeid in", values, "activegradeid");
            return (Criteria) this;
        }

        public Criteria andActivegradeidNotIn(List<Integer> values) {
            addCriterion("activegradeid not in", values, "activegradeid");
            return (Criteria) this;
        }

        public Criteria andActivegradeidBetween(Integer value1, Integer value2) {
            addCriterion("activegradeid between", value1, value2, "activegradeid");
            return (Criteria) this;
        }

        public Criteria andActivegradeidNotBetween(Integer value1, Integer value2) {
            addCriterion("activegradeid not between", value1, value2, "activegradeid");
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