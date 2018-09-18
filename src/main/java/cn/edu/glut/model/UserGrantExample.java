package cn.edu.glut.model;

import java.util.ArrayList;
import java.util.List;

public class UserGrantExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserGrantExample() {
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

        public Criteria andUserGrantIdIsNull() {
            addCriterion("user_grant_id is null");
            return (Criteria) this;
        }

        public Criteria andUserGrantIdIsNotNull() {
            addCriterion("user_grant_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserGrantIdEqualTo(Integer value) {
            addCriterion("user_grant_id =", value, "userGrantId");
            return (Criteria) this;
        }

        public Criteria andUserGrantIdNotEqualTo(Integer value) {
            addCriterion("user_grant_id <>", value, "userGrantId");
            return (Criteria) this;
        }

        public Criteria andUserGrantIdGreaterThan(Integer value) {
            addCriterion("user_grant_id >", value, "userGrantId");
            return (Criteria) this;
        }

        public Criteria andUserGrantIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_grant_id >=", value, "userGrantId");
            return (Criteria) this;
        }

        public Criteria andUserGrantIdLessThan(Integer value) {
            addCriterion("user_grant_id <", value, "userGrantId");
            return (Criteria) this;
        }

        public Criteria andUserGrantIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_grant_id <=", value, "userGrantId");
            return (Criteria) this;
        }

        public Criteria andUserGrantIdIn(List<Integer> values) {
            addCriterion("user_grant_id in", values, "userGrantId");
            return (Criteria) this;
        }

        public Criteria andUserGrantIdNotIn(List<Integer> values) {
            addCriterion("user_grant_id not in", values, "userGrantId");
            return (Criteria) this;
        }

        public Criteria andUserGrantIdBetween(Integer value1, Integer value2) {
            addCriterion("user_grant_id between", value1, value2, "userGrantId");
            return (Criteria) this;
        }

        public Criteria andUserGrantIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_grant_id not between", value1, value2, "userGrantId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andLoginTypeIsNull() {
            addCriterion("login_type is null");
            return (Criteria) this;
        }

        public Criteria andLoginTypeIsNotNull() {
            addCriterion("login_type is not null");
            return (Criteria) this;
        }

        public Criteria andLoginTypeEqualTo(String value) {
            addCriterion("login_type =", value, "loginType");
            return (Criteria) this;
        }

        public Criteria andLoginTypeNotEqualTo(String value) {
            addCriterion("login_type <>", value, "loginType");
            return (Criteria) this;
        }

        public Criteria andLoginTypeGreaterThan(String value) {
            addCriterion("login_type >", value, "loginType");
            return (Criteria) this;
        }

        public Criteria andLoginTypeGreaterThanOrEqualTo(String value) {
            addCriterion("login_type >=", value, "loginType");
            return (Criteria) this;
        }

        public Criteria andLoginTypeLessThan(String value) {
            addCriterion("login_type <", value, "loginType");
            return (Criteria) this;
        }

        public Criteria andLoginTypeLessThanOrEqualTo(String value) {
            addCriterion("login_type <=", value, "loginType");
            return (Criteria) this;
        }

        public Criteria andLoginTypeLike(String value) {
            addCriterion("login_type like", value, "loginType");
            return (Criteria) this;
        }

        public Criteria andLoginTypeNotLike(String value) {
            addCriterion("login_type not like", value, "loginType");
            return (Criteria) this;
        }

        public Criteria andLoginTypeIn(List<String> values) {
            addCriterion("login_type in", values, "loginType");
            return (Criteria) this;
        }

        public Criteria andLoginTypeNotIn(List<String> values) {
            addCriterion("login_type not in", values, "loginType");
            return (Criteria) this;
        }

        public Criteria andLoginTypeBetween(String value1, String value2) {
            addCriterion("login_type between", value1, value2, "loginType");
            return (Criteria) this;
        }

        public Criteria andLoginTypeNotBetween(String value1, String value2) {
            addCriterion("login_type not between", value1, value2, "loginType");
            return (Criteria) this;
        }

        public Criteria andGrantCodeIsNull() {
            addCriterion("grant_code is null");
            return (Criteria) this;
        }

        public Criteria andGrantCodeIsNotNull() {
            addCriterion("grant_code is not null");
            return (Criteria) this;
        }

        public Criteria andGrantCodeEqualTo(String value) {
            addCriterion("grant_code =", value, "grantCode");
            return (Criteria) this;
        }

        public Criteria andGrantCodeNotEqualTo(String value) {
            addCriterion("grant_code <>", value, "grantCode");
            return (Criteria) this;
        }

        public Criteria andGrantCodeGreaterThan(String value) {
            addCriterion("grant_code >", value, "grantCode");
            return (Criteria) this;
        }

        public Criteria andGrantCodeGreaterThanOrEqualTo(String value) {
            addCriterion("grant_code >=", value, "grantCode");
            return (Criteria) this;
        }

        public Criteria andGrantCodeLessThan(String value) {
            addCriterion("grant_code <", value, "grantCode");
            return (Criteria) this;
        }

        public Criteria andGrantCodeLessThanOrEqualTo(String value) {
            addCriterion("grant_code <=", value, "grantCode");
            return (Criteria) this;
        }

        public Criteria andGrantCodeLike(String value) {
            addCriterion("grant_code like", value, "grantCode");
            return (Criteria) this;
        }

        public Criteria andGrantCodeNotLike(String value) {
            addCriterion("grant_code not like", value, "grantCode");
            return (Criteria) this;
        }

        public Criteria andGrantCodeIn(List<String> values) {
            addCriterion("grant_code in", values, "grantCode");
            return (Criteria) this;
        }

        public Criteria andGrantCodeNotIn(List<String> values) {
            addCriterion("grant_code not in", values, "grantCode");
            return (Criteria) this;
        }

        public Criteria andGrantCodeBetween(String value1, String value2) {
            addCriterion("grant_code between", value1, value2, "grantCode");
            return (Criteria) this;
        }

        public Criteria andGrantCodeNotBetween(String value1, String value2) {
            addCriterion("grant_code not between", value1, value2, "grantCode");
            return (Criteria) this;
        }

        public Criteria andIdentifierIsNull() {
            addCriterion("identifier is null");
            return (Criteria) this;
        }

        public Criteria andIdentifierIsNotNull() {
            addCriterion("identifier is not null");
            return (Criteria) this;
        }

        public Criteria andIdentifierEqualTo(String value) {
            addCriterion("identifier =", value, "identifier");
            return (Criteria) this;
        }

        public Criteria andIdentifierNotEqualTo(String value) {
            addCriterion("identifier <>", value, "identifier");
            return (Criteria) this;
        }

        public Criteria andIdentifierGreaterThan(String value) {
            addCriterion("identifier >", value, "identifier");
            return (Criteria) this;
        }

        public Criteria andIdentifierGreaterThanOrEqualTo(String value) {
            addCriterion("identifier >=", value, "identifier");
            return (Criteria) this;
        }

        public Criteria andIdentifierLessThan(String value) {
            addCriterion("identifier <", value, "identifier");
            return (Criteria) this;
        }

        public Criteria andIdentifierLessThanOrEqualTo(String value) {
            addCriterion("identifier <=", value, "identifier");
            return (Criteria) this;
        }

        public Criteria andIdentifierLike(String value) {
            addCriterion("identifier like", value, "identifier");
            return (Criteria) this;
        }

        public Criteria andIdentifierNotLike(String value) {
            addCriterion("identifier not like", value, "identifier");
            return (Criteria) this;
        }

        public Criteria andIdentifierIn(List<String> values) {
            addCriterion("identifier in", values, "identifier");
            return (Criteria) this;
        }

        public Criteria andIdentifierNotIn(List<String> values) {
            addCriterion("identifier not in", values, "identifier");
            return (Criteria) this;
        }

        public Criteria andIdentifierBetween(String value1, String value2) {
            addCriterion("identifier between", value1, value2, "identifier");
            return (Criteria) this;
        }

        public Criteria andIdentifierNotBetween(String value1, String value2) {
            addCriterion("identifier not between", value1, value2, "identifier");
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