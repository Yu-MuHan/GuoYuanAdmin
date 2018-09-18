package cn.edu.glut.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderLogisticsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderLogisticsExample() {
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

        public Criteria andOrderlogisticsIdIsNull() {
            addCriterion("orderlogistics_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderlogisticsIdIsNotNull() {
            addCriterion("orderlogistics_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderlogisticsIdEqualTo(Integer value) {
            addCriterion("orderlogistics_id =", value, "orderlogisticsId");
            return (Criteria) this;
        }

        public Criteria andOrderlogisticsIdNotEqualTo(Integer value) {
            addCriterion("orderlogistics_id <>", value, "orderlogisticsId");
            return (Criteria) this;
        }

        public Criteria andOrderlogisticsIdGreaterThan(Integer value) {
            addCriterion("orderlogistics_id >", value, "orderlogisticsId");
            return (Criteria) this;
        }

        public Criteria andOrderlogisticsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("orderlogistics_id >=", value, "orderlogisticsId");
            return (Criteria) this;
        }

        public Criteria andOrderlogisticsIdLessThan(Integer value) {
            addCriterion("orderlogistics_id <", value, "orderlogisticsId");
            return (Criteria) this;
        }

        public Criteria andOrderlogisticsIdLessThanOrEqualTo(Integer value) {
            addCriterion("orderlogistics_id <=", value, "orderlogisticsId");
            return (Criteria) this;
        }

        public Criteria andOrderlogisticsIdIn(List<Integer> values) {
            addCriterion("orderlogistics_id in", values, "orderlogisticsId");
            return (Criteria) this;
        }

        public Criteria andOrderlogisticsIdNotIn(List<Integer> values) {
            addCriterion("orderlogistics_id not in", values, "orderlogisticsId");
            return (Criteria) this;
        }

        public Criteria andOrderlogisticsIdBetween(Integer value1, Integer value2) {
            addCriterion("orderlogistics_id between", value1, value2, "orderlogisticsId");
            return (Criteria) this;
        }

        public Criteria andOrderlogisticsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("orderlogistics_id not between", value1, value2, "orderlogisticsId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(Long value) {
            addCriterion("order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(Long value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(Long value) {
            addCriterion("order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(Long value) {
            addCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(Long value) {
            addCriterion("order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(Long value) {
            addCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<Long> values) {
            addCriterion("order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<Long> values) {
            addCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(Long value1, Long value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(Long value1, Long value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andExpressNoIsNull() {
            addCriterion("express_no is null");
            return (Criteria) this;
        }

        public Criteria andExpressNoIsNotNull() {
            addCriterion("express_no is not null");
            return (Criteria) this;
        }

        public Criteria andExpressNoEqualTo(Long value) {
            addCriterion("express_no =", value, "expressNo");
            return (Criteria) this;
        }

        public Criteria andExpressNoNotEqualTo(Long value) {
            addCriterion("express_no <>", value, "expressNo");
            return (Criteria) this;
        }

        public Criteria andExpressNoGreaterThan(Long value) {
            addCriterion("express_no >", value, "expressNo");
            return (Criteria) this;
        }

        public Criteria andExpressNoGreaterThanOrEqualTo(Long value) {
            addCriterion("express_no >=", value, "expressNo");
            return (Criteria) this;
        }

        public Criteria andExpressNoLessThan(Long value) {
            addCriterion("express_no <", value, "expressNo");
            return (Criteria) this;
        }

        public Criteria andExpressNoLessThanOrEqualTo(Long value) {
            addCriterion("express_no <=", value, "expressNo");
            return (Criteria) this;
        }

        public Criteria andExpressNoIn(List<Long> values) {
            addCriterion("express_no in", values, "expressNo");
            return (Criteria) this;
        }

        public Criteria andExpressNoNotIn(List<Long> values) {
            addCriterion("express_no not in", values, "expressNo");
            return (Criteria) this;
        }

        public Criteria andExpressNoBetween(Long value1, Long value2) {
            addCriterion("express_no between", value1, value2, "expressNo");
            return (Criteria) this;
        }

        public Criteria andExpressNoNotBetween(Long value1, Long value2) {
            addCriterion("express_no not between", value1, value2, "expressNo");
            return (Criteria) this;
        }

        public Criteria andLogisticsNameIsNull() {
            addCriterion("logistics_name is null");
            return (Criteria) this;
        }

        public Criteria andLogisticsNameIsNotNull() {
            addCriterion("logistics_name is not null");
            return (Criteria) this;
        }

        public Criteria andLogisticsNameEqualTo(String value) {
            addCriterion("logistics_name =", value, "logisticsName");
            return (Criteria) this;
        }

        public Criteria andLogisticsNameNotEqualTo(String value) {
            addCriterion("logistics_name <>", value, "logisticsName");
            return (Criteria) this;
        }

        public Criteria andLogisticsNameGreaterThan(String value) {
            addCriterion("logistics_name >", value, "logisticsName");
            return (Criteria) this;
        }

        public Criteria andLogisticsNameGreaterThanOrEqualTo(String value) {
            addCriterion("logistics_name >=", value, "logisticsName");
            return (Criteria) this;
        }

        public Criteria andLogisticsNameLessThan(String value) {
            addCriterion("logistics_name <", value, "logisticsName");
            return (Criteria) this;
        }

        public Criteria andLogisticsNameLessThanOrEqualTo(String value) {
            addCriterion("logistics_name <=", value, "logisticsName");
            return (Criteria) this;
        }

        public Criteria andLogisticsNameLike(String value) {
            addCriterion("logistics_name like", value, "logisticsName");
            return (Criteria) this;
        }

        public Criteria andLogisticsNameNotLike(String value) {
            addCriterion("logistics_name not like", value, "logisticsName");
            return (Criteria) this;
        }

        public Criteria andLogisticsNameIn(List<String> values) {
            addCriterion("logistics_name in", values, "logisticsName");
            return (Criteria) this;
        }

        public Criteria andLogisticsNameNotIn(List<String> values) {
            addCriterion("logistics_name not in", values, "logisticsName");
            return (Criteria) this;
        }

        public Criteria andLogisticsNameBetween(String value1, String value2) {
            addCriterion("logistics_name between", value1, value2, "logisticsName");
            return (Criteria) this;
        }

        public Criteria andLogisticsNameNotBetween(String value1, String value2) {
            addCriterion("logistics_name not between", value1, value2, "logisticsName");
            return (Criteria) this;
        }

        public Criteria andOrderlogisticsStatusIsNull() {
            addCriterion("orderlogistics_status is null");
            return (Criteria) this;
        }

        public Criteria andOrderlogisticsStatusIsNotNull() {
            addCriterion("orderlogistics_status is not null");
            return (Criteria) this;
        }

        public Criteria andOrderlogisticsStatusEqualTo(String value) {
            addCriterion("orderlogistics_status =", value, "orderlogisticsStatus");
            return (Criteria) this;
        }

        public Criteria andOrderlogisticsStatusNotEqualTo(String value) {
            addCriterion("orderlogistics_status <>", value, "orderlogisticsStatus");
            return (Criteria) this;
        }

        public Criteria andOrderlogisticsStatusGreaterThan(String value) {
            addCriterion("orderlogistics_status >", value, "orderlogisticsStatus");
            return (Criteria) this;
        }

        public Criteria andOrderlogisticsStatusGreaterThanOrEqualTo(String value) {
            addCriterion("orderlogistics_status >=", value, "orderlogisticsStatus");
            return (Criteria) this;
        }

        public Criteria andOrderlogisticsStatusLessThan(String value) {
            addCriterion("orderlogistics_status <", value, "orderlogisticsStatus");
            return (Criteria) this;
        }

        public Criteria andOrderlogisticsStatusLessThanOrEqualTo(String value) {
            addCriterion("orderlogistics_status <=", value, "orderlogisticsStatus");
            return (Criteria) this;
        }

        public Criteria andOrderlogisticsStatusLike(String value) {
            addCriterion("orderlogistics_status like", value, "orderlogisticsStatus");
            return (Criteria) this;
        }

        public Criteria andOrderlogisticsStatusNotLike(String value) {
            addCriterion("orderlogistics_status not like", value, "orderlogisticsStatus");
            return (Criteria) this;
        }

        public Criteria andOrderlogisticsStatusIn(List<String> values) {
            addCriterion("orderlogistics_status in", values, "orderlogisticsStatus");
            return (Criteria) this;
        }

        public Criteria andOrderlogisticsStatusNotIn(List<String> values) {
            addCriterion("orderlogistics_status not in", values, "orderlogisticsStatus");
            return (Criteria) this;
        }

        public Criteria andOrderlogisticsStatusBetween(String value1, String value2) {
            addCriterion("orderlogistics_status between", value1, value2, "orderlogisticsStatus");
            return (Criteria) this;
        }

        public Criteria andOrderlogisticsStatusNotBetween(String value1, String value2) {
            addCriterion("orderlogistics_status not between", value1, value2, "orderlogisticsStatus");
            return (Criteria) this;
        }

        public Criteria andLogisticsCreateTimeIsNull() {
            addCriterion("logistics_create_time is null");
            return (Criteria) this;
        }

        public Criteria andLogisticsCreateTimeIsNotNull() {
            addCriterion("logistics_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andLogisticsCreateTimeEqualTo(Date value) {
            addCriterion("logistics_create_time =", value, "logisticsCreateTime");
            return (Criteria) this;
        }

        public Criteria andLogisticsCreateTimeNotEqualTo(Date value) {
            addCriterion("logistics_create_time <>", value, "logisticsCreateTime");
            return (Criteria) this;
        }

        public Criteria andLogisticsCreateTimeGreaterThan(Date value) {
            addCriterion("logistics_create_time >", value, "logisticsCreateTime");
            return (Criteria) this;
        }

        public Criteria andLogisticsCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("logistics_create_time >=", value, "logisticsCreateTime");
            return (Criteria) this;
        }

        public Criteria andLogisticsCreateTimeLessThan(Date value) {
            addCriterion("logistics_create_time <", value, "logisticsCreateTime");
            return (Criteria) this;
        }

        public Criteria andLogisticsCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("logistics_create_time <=", value, "logisticsCreateTime");
            return (Criteria) this;
        }

        public Criteria andLogisticsCreateTimeIn(List<Date> values) {
            addCriterion("logistics_create_time in", values, "logisticsCreateTime");
            return (Criteria) this;
        }

        public Criteria andLogisticsCreateTimeNotIn(List<Date> values) {
            addCriterion("logistics_create_time not in", values, "logisticsCreateTime");
            return (Criteria) this;
        }

        public Criteria andLogisticsCreateTimeBetween(Date value1, Date value2) {
            addCriterion("logistics_create_time between", value1, value2, "logisticsCreateTime");
            return (Criteria) this;
        }

        public Criteria andLogisticsCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("logistics_create_time not between", value1, value2, "logisticsCreateTime");
            return (Criteria) this;
        }

        public Criteria andLogisticsUpdateTimeIsNull() {
            addCriterion("logistics_update_time is null");
            return (Criteria) this;
        }

        public Criteria andLogisticsUpdateTimeIsNotNull() {
            addCriterion("logistics_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andLogisticsUpdateTimeEqualTo(Date value) {
            addCriterion("logistics_update_time =", value, "logisticsUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLogisticsUpdateTimeNotEqualTo(Date value) {
            addCriterion("logistics_update_time <>", value, "logisticsUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLogisticsUpdateTimeGreaterThan(Date value) {
            addCriterion("logistics_update_time >", value, "logisticsUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLogisticsUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("logistics_update_time >=", value, "logisticsUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLogisticsUpdateTimeLessThan(Date value) {
            addCriterion("logistics_update_time <", value, "logisticsUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLogisticsUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("logistics_update_time <=", value, "logisticsUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLogisticsUpdateTimeIn(List<Date> values) {
            addCriterion("logistics_update_time in", values, "logisticsUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLogisticsUpdateTimeNotIn(List<Date> values) {
            addCriterion("logistics_update_time not in", values, "logisticsUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLogisticsUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("logistics_update_time between", value1, value2, "logisticsUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLogisticsUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("logistics_update_time not between", value1, value2, "logisticsUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLogisticsSettlementTimeIsNull() {
            addCriterion("logistics_settlement_time is null");
            return (Criteria) this;
        }

        public Criteria andLogisticsSettlementTimeIsNotNull() {
            addCriterion("logistics_settlement_time is not null");
            return (Criteria) this;
        }

        public Criteria andLogisticsSettlementTimeEqualTo(Date value) {
            addCriterion("logistics_settlement_time =", value, "logisticsSettlementTime");
            return (Criteria) this;
        }

        public Criteria andLogisticsSettlementTimeNotEqualTo(Date value) {
            addCriterion("logistics_settlement_time <>", value, "logisticsSettlementTime");
            return (Criteria) this;
        }

        public Criteria andLogisticsSettlementTimeGreaterThan(Date value) {
            addCriterion("logistics_settlement_time >", value, "logisticsSettlementTime");
            return (Criteria) this;
        }

        public Criteria andLogisticsSettlementTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("logistics_settlement_time >=", value, "logisticsSettlementTime");
            return (Criteria) this;
        }

        public Criteria andLogisticsSettlementTimeLessThan(Date value) {
            addCriterion("logistics_settlement_time <", value, "logisticsSettlementTime");
            return (Criteria) this;
        }

        public Criteria andLogisticsSettlementTimeLessThanOrEqualTo(Date value) {
            addCriterion("logistics_settlement_time <=", value, "logisticsSettlementTime");
            return (Criteria) this;
        }

        public Criteria andLogisticsSettlementTimeIn(List<Date> values) {
            addCriterion("logistics_settlement_time in", values, "logisticsSettlementTime");
            return (Criteria) this;
        }

        public Criteria andLogisticsSettlementTimeNotIn(List<Date> values) {
            addCriterion("logistics_settlement_time not in", values, "logisticsSettlementTime");
            return (Criteria) this;
        }

        public Criteria andLogisticsSettlementTimeBetween(Date value1, Date value2) {
            addCriterion("logistics_settlement_time between", value1, value2, "logisticsSettlementTime");
            return (Criteria) this;
        }

        public Criteria andLogisticsSettlementTimeNotBetween(Date value1, Date value2) {
            addCriterion("logistics_settlement_time not between", value1, value2, "logisticsSettlementTime");
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