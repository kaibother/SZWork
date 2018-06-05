package pluto.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class PetExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PetExample() {
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

        public Criteria andDogtypeIsNull() {
            addCriterion("dogtype is null");
            return (Criteria) this;
        }

        public Criteria andDogtypeIsNotNull() {
            addCriterion("dogtype is not null");
            return (Criteria) this;
        }

        public Criteria andDogtypeEqualTo(String value) {
            addCriterion("dogtype =", value, "dogtype");
            return (Criteria) this;
        }

        public Criteria andDogtypeNotEqualTo(String value) {
            addCriterion("dogtype <>", value, "dogtype");
            return (Criteria) this;
        }

        public Criteria andDogtypeGreaterThan(String value) {
            addCriterion("dogtype >", value, "dogtype");
            return (Criteria) this;
        }

        public Criteria andDogtypeGreaterThanOrEqualTo(String value) {
            addCriterion("dogtype >=", value, "dogtype");
            return (Criteria) this;
        }

        public Criteria andDogtypeLessThan(String value) {
            addCriterion("dogtype <", value, "dogtype");
            return (Criteria) this;
        }

        public Criteria andDogtypeLessThanOrEqualTo(String value) {
            addCriterion("dogtype <=", value, "dogtype");
            return (Criteria) this;
        }

        public Criteria andDogtypeLike(String value) {
            addCriterion("dogtype like", value, "dogtype");
            return (Criteria) this;
        }

        public Criteria andDogtypeNotLike(String value) {
            addCriterion("dogtype not like", value, "dogtype");
            return (Criteria) this;
        }

        public Criteria andDogtypeIn(List<String> values) {
            addCriterion("dogtype in", values, "dogtype");
            return (Criteria) this;
        }

        public Criteria andDogtypeNotIn(List<String> values) {
            addCriterion("dogtype not in", values, "dogtype");
            return (Criteria) this;
        }

        public Criteria andDogtypeBetween(String value1, String value2) {
            addCriterion("dogtype between", value1, value2, "dogtype");
            return (Criteria) this;
        }

        public Criteria andDogtypeNotBetween(String value1, String value2) {
            addCriterion("dogtype not between", value1, value2, "dogtype");
            return (Criteria) this;
        }

        public Criteria andDogbirthdayIsNull() {
            addCriterion("dogbirthday is null");
            return (Criteria) this;
        }

        public Criteria andDogbirthdayIsNotNull() {
            addCriterion("dogbirthday is not null");
            return (Criteria) this;
        }

        public Criteria andDogbirthdayEqualTo(Date value) {
            addCriterionForJDBCDate("dogbirthday =", value, "dogbirthday");
            return (Criteria) this;
        }

        public Criteria andDogbirthdayNotEqualTo(Date value) {
            addCriterionForJDBCDate("dogbirthday <>", value, "dogbirthday");
            return (Criteria) this;
        }

        public Criteria andDogbirthdayGreaterThan(Date value) {
            addCriterionForJDBCDate("dogbirthday >", value, "dogbirthday");
            return (Criteria) this;
        }

        public Criteria andDogbirthdayGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("dogbirthday >=", value, "dogbirthday");
            return (Criteria) this;
        }

        public Criteria andDogbirthdayLessThan(Date value) {
            addCriterionForJDBCDate("dogbirthday <", value, "dogbirthday");
            return (Criteria) this;
        }

        public Criteria andDogbirthdayLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("dogbirthday <=", value, "dogbirthday");
            return (Criteria) this;
        }

        public Criteria andDogbirthdayIn(List<Date> values) {
            addCriterionForJDBCDate("dogbirthday in", values, "dogbirthday");
            return (Criteria) this;
        }

        public Criteria andDogbirthdayNotIn(List<Date> values) {
            addCriterionForJDBCDate("dogbirthday not in", values, "dogbirthday");
            return (Criteria) this;
        }

        public Criteria andDogbirthdayBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("dogbirthday between", value1, value2, "dogbirthday");
            return (Criteria) this;
        }

        public Criteria andDogbirthdayNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("dogbirthday not between", value1, value2, "dogbirthday");
            return (Criteria) this;
        }

        public Criteria andDognameIsNull() {
            addCriterion("dogname is null");
            return (Criteria) this;
        }

        public Criteria andDognameIsNotNull() {
            addCriterion("dogname is not null");
            return (Criteria) this;
        }

        public Criteria andDognameEqualTo(String value) {
            addCriterion("dogname =", value, "dogname");
            return (Criteria) this;
        }

        public Criteria andDognameNotEqualTo(String value) {
            addCriterion("dogname <>", value, "dogname");
            return (Criteria) this;
        }

        public Criteria andDognameGreaterThan(String value) {
            addCriterion("dogname >", value, "dogname");
            return (Criteria) this;
        }

        public Criteria andDognameGreaterThanOrEqualTo(String value) {
            addCriterion("dogname >=", value, "dogname");
            return (Criteria) this;
        }

        public Criteria andDognameLessThan(String value) {
            addCriterion("dogname <", value, "dogname");
            return (Criteria) this;
        }

        public Criteria andDognameLessThanOrEqualTo(String value) {
            addCriterion("dogname <=", value, "dogname");
            return (Criteria) this;
        }

        public Criteria andDognameLike(String value) {
            addCriterion("dogname like", value, "dogname");
            return (Criteria) this;
        }

        public Criteria andDognameNotLike(String value) {
            addCriterion("dogname not like", value, "dogname");
            return (Criteria) this;
        }

        public Criteria andDognameIn(List<String> values) {
            addCriterion("dogname in", values, "dogname");
            return (Criteria) this;
        }

        public Criteria andDognameNotIn(List<String> values) {
            addCriterion("dogname not in", values, "dogname");
            return (Criteria) this;
        }

        public Criteria andDognameBetween(String value1, String value2) {
            addCriterion("dogname between", value1, value2, "dogname");
            return (Criteria) this;
        }

        public Criteria andDognameNotBetween(String value1, String value2) {
            addCriterion("dogname not between", value1, value2, "dogname");
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