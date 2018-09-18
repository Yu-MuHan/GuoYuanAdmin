package cn.edu.glut.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class CommodityInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CommodityInfoExample() {
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

        public Criteria andCommodityIdIsNull() {
            addCriterion("commodity_id is null");
            return (Criteria) this;
        }

        public Criteria andCommodityIdIsNotNull() {
            addCriterion("commodity_id is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityIdEqualTo(Long value) {
            addCriterion("commodity_id =", value, "commodityId");
            return (Criteria) this;
        }

        public Criteria andCommodityIdNotEqualTo(Long value) {
            addCriterion("commodity_id <>", value, "commodityId");
            return (Criteria) this;
        }

        public Criteria andCommodityIdGreaterThan(Long value) {
            addCriterion("commodity_id >", value, "commodityId");
            return (Criteria) this;
        }

        public Criteria andCommodityIdGreaterThanOrEqualTo(Long value) {
            addCriterion("commodity_id >=", value, "commodityId");
            return (Criteria) this;
        }

        public Criteria andCommodityIdLessThan(Long value) {
            addCriterion("commodity_id <", value, "commodityId");
            return (Criteria) this;
        }

        public Criteria andCommodityIdLessThanOrEqualTo(Long value) {
            addCriterion("commodity_id <=", value, "commodityId");
            return (Criteria) this;
        }

        public Criteria andCommodityIdIn(List<Long> values) {
            addCriterion("commodity_id in", values, "commodityId");
            return (Criteria) this;
        }

        public Criteria andCommodityIdNotIn(List<Long> values) {
            addCriterion("commodity_id not in", values, "commodityId");
            return (Criteria) this;
        }

        public Criteria andCommodityIdBetween(Long value1, Long value2) {
            addCriterion("commodity_id between", value1, value2, "commodityId");
            return (Criteria) this;
        }

        public Criteria andCommodityIdNotBetween(Long value1, Long value2) {
            addCriterion("commodity_id not between", value1, value2, "commodityId");
            return (Criteria) this;
        }

        public Criteria andCidIsNull() {
            addCriterion("cid is null");
            return (Criteria) this;
        }

        public Criteria andCidIsNotNull() {
            addCriterion("cid is not null");
            return (Criteria) this;
        }

        public Criteria andCidEqualTo(Long value) {
            addCriterion("cid =", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotEqualTo(Long value) {
            addCriterion("cid <>", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThan(Long value) {
            addCriterion("cid >", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThanOrEqualTo(Long value) {
            addCriterion("cid >=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThan(Long value) {
            addCriterion("cid <", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThanOrEqualTo(Long value) {
            addCriterion("cid <=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidIn(List<Long> values) {
            addCriterion("cid in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotIn(List<Long> values) {
            addCriterion("cid not in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidBetween(Long value1, Long value2) {
            addCriterion("cid between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotBetween(Long value1, Long value2) {
            addCriterion("cid not between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andCommodityNameIsNull() {
            addCriterion("commodity_name is null");
            return (Criteria) this;
        }

        public Criteria andCommodityNameIsNotNull() {
            addCriterion("commodity_name is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityNameEqualTo(String value) {
            addCriterion("commodity_name =", value, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameNotEqualTo(String value) {
            addCriterion("commodity_name <>", value, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameGreaterThan(String value) {
            addCriterion("commodity_name >", value, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameGreaterThanOrEqualTo(String value) {
            addCriterion("commodity_name >=", value, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameLessThan(String value) {
            addCriterion("commodity_name <", value, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameLessThanOrEqualTo(String value) {
            addCriterion("commodity_name <=", value, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameLike(String value) {
            addCriterion("commodity_name like", value, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameNotLike(String value) {
            addCriterion("commodity_name not like", value, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameIn(List<String> values) {
            addCriterion("commodity_name in", values, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameNotIn(List<String> values) {
            addCriterion("commodity_name not in", values, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameBetween(String value1, String value2) {
            addCriterion("commodity_name between", value1, value2, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameNotBetween(String value1, String value2) {
            addCriterion("commodity_name not between", value1, value2, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityTermIsNull() {
            addCriterion("commodity_term is null");
            return (Criteria) this;
        }

        public Criteria andCommodityTermIsNotNull() {
            addCriterion("commodity_term is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityTermEqualTo(Integer value) {
            addCriterion("commodity_term =", value, "commodityTerm");
            return (Criteria) this;
        }

        public Criteria andCommodityTermNotEqualTo(Integer value) {
            addCriterion("commodity_term <>", value, "commodityTerm");
            return (Criteria) this;
        }

        public Criteria andCommodityTermGreaterThan(Integer value) {
            addCriterion("commodity_term >", value, "commodityTerm");
            return (Criteria) this;
        }

        public Criteria andCommodityTermGreaterThanOrEqualTo(Integer value) {
            addCriterion("commodity_term >=", value, "commodityTerm");
            return (Criteria) this;
        }

        public Criteria andCommodityTermLessThan(Integer value) {
            addCriterion("commodity_term <", value, "commodityTerm");
            return (Criteria) this;
        }

        public Criteria andCommodityTermLessThanOrEqualTo(Integer value) {
            addCriterion("commodity_term <=", value, "commodityTerm");
            return (Criteria) this;
        }

        public Criteria andCommodityTermIn(List<Integer> values) {
            addCriterion("commodity_term in", values, "commodityTerm");
            return (Criteria) this;
        }

        public Criteria andCommodityTermNotIn(List<Integer> values) {
            addCriterion("commodity_term not in", values, "commodityTerm");
            return (Criteria) this;
        }

        public Criteria andCommodityTermBetween(Integer value1, Integer value2) {
            addCriterion("commodity_term between", value1, value2, "commodityTerm");
            return (Criteria) this;
        }

        public Criteria andCommodityTermNotBetween(Integer value1, Integer value2) {
            addCriterion("commodity_term not between", value1, value2, "commodityTerm");
            return (Criteria) this;
        }

        public Criteria andCommodityNumIsNull() {
            addCriterion("commodity_num is null");
            return (Criteria) this;
        }

        public Criteria andCommodityNumIsNotNull() {
            addCriterion("commodity_num is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityNumEqualTo(Integer value) {
            addCriterion("commodity_num =", value, "commodityNum");
            return (Criteria) this;
        }

        public Criteria andCommodityNumNotEqualTo(Integer value) {
            addCriterion("commodity_num <>", value, "commodityNum");
            return (Criteria) this;
        }

        public Criteria andCommodityNumGreaterThan(Integer value) {
            addCriterion("commodity_num >", value, "commodityNum");
            return (Criteria) this;
        }

        public Criteria andCommodityNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("commodity_num >=", value, "commodityNum");
            return (Criteria) this;
        }

        public Criteria andCommodityNumLessThan(Integer value) {
            addCriterion("commodity_num <", value, "commodityNum");
            return (Criteria) this;
        }

        public Criteria andCommodityNumLessThanOrEqualTo(Integer value) {
            addCriterion("commodity_num <=", value, "commodityNum");
            return (Criteria) this;
        }

        public Criteria andCommodityNumIn(List<Integer> values) {
            addCriterion("commodity_num in", values, "commodityNum");
            return (Criteria) this;
        }

        public Criteria andCommodityNumNotIn(List<Integer> values) {
            addCriterion("commodity_num not in", values, "commodityNum");
            return (Criteria) this;
        }

        public Criteria andCommodityNumBetween(Integer value1, Integer value2) {
            addCriterion("commodity_num between", value1, value2, "commodityNum");
            return (Criteria) this;
        }

        public Criteria andCommodityNumNotBetween(Integer value1, Integer value2) {
            addCriterion("commodity_num not between", value1, value2, "commodityNum");
            return (Criteria) this;
        }

        public Criteria andCommodityVideoUrlIsNull() {
            addCriterion("commodity_video_url is null");
            return (Criteria) this;
        }

        public Criteria andCommodityVideoUrlIsNotNull() {
            addCriterion("commodity_video_url is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityVideoUrlEqualTo(String value) {
            addCriterion("commodity_video_url =", value, "commodityVideoUrl");
            return (Criteria) this;
        }

        public Criteria andCommodityVideoUrlNotEqualTo(String value) {
            addCriterion("commodity_video_url <>", value, "commodityVideoUrl");
            return (Criteria) this;
        }

        public Criteria andCommodityVideoUrlGreaterThan(String value) {
            addCriterion("commodity_video_url >", value, "commodityVideoUrl");
            return (Criteria) this;
        }

        public Criteria andCommodityVideoUrlGreaterThanOrEqualTo(String value) {
            addCriterion("commodity_video_url >=", value, "commodityVideoUrl");
            return (Criteria) this;
        }

        public Criteria andCommodityVideoUrlLessThan(String value) {
            addCriterion("commodity_video_url <", value, "commodityVideoUrl");
            return (Criteria) this;
        }

        public Criteria andCommodityVideoUrlLessThanOrEqualTo(String value) {
            addCriterion("commodity_video_url <=", value, "commodityVideoUrl");
            return (Criteria) this;
        }

        public Criteria andCommodityVideoUrlLike(String value) {
            addCriterion("commodity_video_url like", value, "commodityVideoUrl");
            return (Criteria) this;
        }

        public Criteria andCommodityVideoUrlNotLike(String value) {
            addCriterion("commodity_video_url not like", value, "commodityVideoUrl");
            return (Criteria) this;
        }

        public Criteria andCommodityVideoUrlIn(List<String> values) {
            addCriterion("commodity_video_url in", values, "commodityVideoUrl");
            return (Criteria) this;
        }

        public Criteria andCommodityVideoUrlNotIn(List<String> values) {
            addCriterion("commodity_video_url not in", values, "commodityVideoUrl");
            return (Criteria) this;
        }

        public Criteria andCommodityVideoUrlBetween(String value1, String value2) {
            addCriterion("commodity_video_url between", value1, value2, "commodityVideoUrl");
            return (Criteria) this;
        }

        public Criteria andCommodityVideoUrlNotBetween(String value1, String value2) {
            addCriterion("commodity_video_url not between", value1, value2, "commodityVideoUrl");
            return (Criteria) this;
        }

        public Criteria andCommodityPriceIsNull() {
            addCriterion("commodity_price is null");
            return (Criteria) this;
        }

        public Criteria andCommodityPriceIsNotNull() {
            addCriterion("commodity_price is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityPriceEqualTo(BigDecimal value) {
            addCriterion("commodity_price =", value, "commodityPrice");
            return (Criteria) this;
        }

        public Criteria andCommodityPriceNotEqualTo(BigDecimal value) {
            addCriterion("commodity_price <>", value, "commodityPrice");
            return (Criteria) this;
        }

        public Criteria andCommodityPriceGreaterThan(BigDecimal value) {
            addCriterion("commodity_price >", value, "commodityPrice");
            return (Criteria) this;
        }

        public Criteria andCommodityPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("commodity_price >=", value, "commodityPrice");
            return (Criteria) this;
        }

        public Criteria andCommodityPriceLessThan(BigDecimal value) {
            addCriterion("commodity_price <", value, "commodityPrice");
            return (Criteria) this;
        }

        public Criteria andCommodityPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("commodity_price <=", value, "commodityPrice");
            return (Criteria) this;
        }

        public Criteria andCommodityPriceIn(List<BigDecimal> values) {
            addCriterion("commodity_price in", values, "commodityPrice");
            return (Criteria) this;
        }

        public Criteria andCommodityPriceNotIn(List<BigDecimal> values) {
            addCriterion("commodity_price not in", values, "commodityPrice");
            return (Criteria) this;
        }

        public Criteria andCommodityPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("commodity_price between", value1, value2, "commodityPrice");
            return (Criteria) this;
        }

        public Criteria andCommodityPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("commodity_price not between", value1, value2, "commodityPrice");
            return (Criteria) this;
        }

        public Criteria andCommodityProductIsNull() {
            addCriterion("commodity_product is null");
            return (Criteria) this;
        }

        public Criteria andCommodityProductIsNotNull() {
            addCriterion("commodity_product is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityProductEqualTo(String value) {
            addCriterion("commodity_product =", value, "commodityProduct");
            return (Criteria) this;
        }

        public Criteria andCommodityProductNotEqualTo(String value) {
            addCriterion("commodity_product <>", value, "commodityProduct");
            return (Criteria) this;
        }

        public Criteria andCommodityProductGreaterThan(String value) {
            addCriterion("commodity_product >", value, "commodityProduct");
            return (Criteria) this;
        }

        public Criteria andCommodityProductGreaterThanOrEqualTo(String value) {
            addCriterion("commodity_product >=", value, "commodityProduct");
            return (Criteria) this;
        }

        public Criteria andCommodityProductLessThan(String value) {
            addCriterion("commodity_product <", value, "commodityProduct");
            return (Criteria) this;
        }

        public Criteria andCommodityProductLessThanOrEqualTo(String value) {
            addCriterion("commodity_product <=", value, "commodityProduct");
            return (Criteria) this;
        }

        public Criteria andCommodityProductLike(String value) {
            addCriterion("commodity_product like", value, "commodityProduct");
            return (Criteria) this;
        }

        public Criteria andCommodityProductNotLike(String value) {
            addCriterion("commodity_product not like", value, "commodityProduct");
            return (Criteria) this;
        }

        public Criteria andCommodityProductIn(List<String> values) {
            addCriterion("commodity_product in", values, "commodityProduct");
            return (Criteria) this;
        }

        public Criteria andCommodityProductNotIn(List<String> values) {
            addCriterion("commodity_product not in", values, "commodityProduct");
            return (Criteria) this;
        }

        public Criteria andCommodityProductBetween(String value1, String value2) {
            addCriterion("commodity_product between", value1, value2, "commodityProduct");
            return (Criteria) this;
        }

        public Criteria andCommodityProductNotBetween(String value1, String value2) {
            addCriterion("commodity_product not between", value1, value2, "commodityProduct");
            return (Criteria) this;
        }

        public Criteria andCommodityStatusIsNull() {
            addCriterion("commodity_status is null");
            return (Criteria) this;
        }

        public Criteria andCommodityStatusIsNotNull() {
            addCriterion("commodity_status is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityStatusEqualTo(Integer value) {
            addCriterion("commodity_status =", value, "commodityStatus");
            return (Criteria) this;
        }

        public Criteria andCommodityStatusNotEqualTo(Integer value) {
            addCriterion("commodity_status <>", value, "commodityStatus");
            return (Criteria) this;
        }

        public Criteria andCommodityStatusGreaterThan(Integer value) {
            addCriterion("commodity_status >", value, "commodityStatus");
            return (Criteria) this;
        }

        public Criteria andCommodityStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("commodity_status >=", value, "commodityStatus");
            return (Criteria) this;
        }

        public Criteria andCommodityStatusLessThan(Integer value) {
            addCriterion("commodity_status <", value, "commodityStatus");
            return (Criteria) this;
        }

        public Criteria andCommodityStatusLessThanOrEqualTo(Integer value) {
            addCriterion("commodity_status <=", value, "commodityStatus");
            return (Criteria) this;
        }

        public Criteria andCommodityStatusIn(List<Integer> values) {
            addCriterion("commodity_status in", values, "commodityStatus");
            return (Criteria) this;
        }

        public Criteria andCommodityStatusNotIn(List<Integer> values) {
            addCriterion("commodity_status not in", values, "commodityStatus");
            return (Criteria) this;
        }

        public Criteria andCommodityStatusBetween(Integer value1, Integer value2) {
            addCriterion("commodity_status between", value1, value2, "commodityStatus");
            return (Criteria) this;
        }

        public Criteria andCommodityStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("commodity_status not between", value1, value2, "commodityStatus");
            return (Criteria) this;
        }

        public Criteria andCommodityMainPhoIsNull() {
            addCriterion("commodity_main_pho is null");
            return (Criteria) this;
        }

        public Criteria andCommodityMainPhoIsNotNull() {
            addCriterion("commodity_main_pho is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityMainPhoEqualTo(String value) {
            addCriterion("commodity_main_pho =", value, "commodityMainPho");
            return (Criteria) this;
        }

        public Criteria andCommodityMainPhoNotEqualTo(String value) {
            addCriterion("commodity_main_pho <>", value, "commodityMainPho");
            return (Criteria) this;
        }

        public Criteria andCommodityMainPhoGreaterThan(String value) {
            addCriterion("commodity_main_pho >", value, "commodityMainPho");
            return (Criteria) this;
        }

        public Criteria andCommodityMainPhoGreaterThanOrEqualTo(String value) {
            addCriterion("commodity_main_pho >=", value, "commodityMainPho");
            return (Criteria) this;
        }

        public Criteria andCommodityMainPhoLessThan(String value) {
            addCriterion("commodity_main_pho <", value, "commodityMainPho");
            return (Criteria) this;
        }

        public Criteria andCommodityMainPhoLessThanOrEqualTo(String value) {
            addCriterion("commodity_main_pho <=", value, "commodityMainPho");
            return (Criteria) this;
        }

        public Criteria andCommodityMainPhoLike(String value) {
            addCriterion("commodity_main_pho like", value, "commodityMainPho");
            return (Criteria) this;
        }

        public Criteria andCommodityMainPhoNotLike(String value) {
            addCriterion("commodity_main_pho not like", value, "commodityMainPho");
            return (Criteria) this;
        }

        public Criteria andCommodityMainPhoIn(List<String> values) {
            addCriterion("commodity_main_pho in", values, "commodityMainPho");
            return (Criteria) this;
        }

        public Criteria andCommodityMainPhoNotIn(List<String> values) {
            addCriterion("commodity_main_pho not in", values, "commodityMainPho");
            return (Criteria) this;
        }

        public Criteria andCommodityMainPhoBetween(String value1, String value2) {
            addCriterion("commodity_main_pho between", value1, value2, "commodityMainPho");
            return (Criteria) this;
        }

        public Criteria andCommodityMainPhoNotBetween(String value1, String value2) {
            addCriterion("commodity_main_pho not between", value1, value2, "commodityMainPho");
            return (Criteria) this;
        }

        public Criteria andCommoditySubPho1IsNull() {
            addCriterion("commodity_sub_pho1 is null");
            return (Criteria) this;
        }

        public Criteria andCommoditySubPho1IsNotNull() {
            addCriterion("commodity_sub_pho1 is not null");
            return (Criteria) this;
        }

        public Criteria andCommoditySubPho1EqualTo(String value) {
            addCriterion("commodity_sub_pho1 =", value, "commoditySubPho1");
            return (Criteria) this;
        }

        public Criteria andCommoditySubPho1NotEqualTo(String value) {
            addCriterion("commodity_sub_pho1 <>", value, "commoditySubPho1");
            return (Criteria) this;
        }

        public Criteria andCommoditySubPho1GreaterThan(String value) {
            addCriterion("commodity_sub_pho1 >", value, "commoditySubPho1");
            return (Criteria) this;
        }

        public Criteria andCommoditySubPho1GreaterThanOrEqualTo(String value) {
            addCriterion("commodity_sub_pho1 >=", value, "commoditySubPho1");
            return (Criteria) this;
        }

        public Criteria andCommoditySubPho1LessThan(String value) {
            addCriterion("commodity_sub_pho1 <", value, "commoditySubPho1");
            return (Criteria) this;
        }

        public Criteria andCommoditySubPho1LessThanOrEqualTo(String value) {
            addCriterion("commodity_sub_pho1 <=", value, "commoditySubPho1");
            return (Criteria) this;
        }

        public Criteria andCommoditySubPho1Like(String value) {
            addCriterion("commodity_sub_pho1 like", value, "commoditySubPho1");
            return (Criteria) this;
        }

        public Criteria andCommoditySubPho1NotLike(String value) {
            addCriterion("commodity_sub_pho1 not like", value, "commoditySubPho1");
            return (Criteria) this;
        }

        public Criteria andCommoditySubPho1In(List<String> values) {
            addCriterion("commodity_sub_pho1 in", values, "commoditySubPho1");
            return (Criteria) this;
        }

        public Criteria andCommoditySubPho1NotIn(List<String> values) {
            addCriterion("commodity_sub_pho1 not in", values, "commoditySubPho1");
            return (Criteria) this;
        }

        public Criteria andCommoditySubPho1Between(String value1, String value2) {
            addCriterion("commodity_sub_pho1 between", value1, value2, "commoditySubPho1");
            return (Criteria) this;
        }

        public Criteria andCommoditySubPho1NotBetween(String value1, String value2) {
            addCriterion("commodity_sub_pho1 not between", value1, value2, "commoditySubPho1");
            return (Criteria) this;
        }

        public Criteria andCommoditySubPho2IsNull() {
            addCriterion("commodity_sub_pho2 is null");
            return (Criteria) this;
        }

        public Criteria andCommoditySubPho2IsNotNull() {
            addCriterion("commodity_sub_pho2 is not null");
            return (Criteria) this;
        }

        public Criteria andCommoditySubPho2EqualTo(String value) {
            addCriterion("commodity_sub_pho2 =", value, "commoditySubPho2");
            return (Criteria) this;
        }

        public Criteria andCommoditySubPho2NotEqualTo(String value) {
            addCriterion("commodity_sub_pho2 <>", value, "commoditySubPho2");
            return (Criteria) this;
        }

        public Criteria andCommoditySubPho2GreaterThan(String value) {
            addCriterion("commodity_sub_pho2 >", value, "commoditySubPho2");
            return (Criteria) this;
        }

        public Criteria andCommoditySubPho2GreaterThanOrEqualTo(String value) {
            addCriterion("commodity_sub_pho2 >=", value, "commoditySubPho2");
            return (Criteria) this;
        }

        public Criteria andCommoditySubPho2LessThan(String value) {
            addCriterion("commodity_sub_pho2 <", value, "commoditySubPho2");
            return (Criteria) this;
        }

        public Criteria andCommoditySubPho2LessThanOrEqualTo(String value) {
            addCriterion("commodity_sub_pho2 <=", value, "commoditySubPho2");
            return (Criteria) this;
        }

        public Criteria andCommoditySubPho2Like(String value) {
            addCriterion("commodity_sub_pho2 like", value, "commoditySubPho2");
            return (Criteria) this;
        }

        public Criteria andCommoditySubPho2NotLike(String value) {
            addCriterion("commodity_sub_pho2 not like", value, "commoditySubPho2");
            return (Criteria) this;
        }

        public Criteria andCommoditySubPho2In(List<String> values) {
            addCriterion("commodity_sub_pho2 in", values, "commoditySubPho2");
            return (Criteria) this;
        }

        public Criteria andCommoditySubPho2NotIn(List<String> values) {
            addCriterion("commodity_sub_pho2 not in", values, "commoditySubPho2");
            return (Criteria) this;
        }

        public Criteria andCommoditySubPho2Between(String value1, String value2) {
            addCriterion("commodity_sub_pho2 between", value1, value2, "commoditySubPho2");
            return (Criteria) this;
        }

        public Criteria andCommoditySubPho2NotBetween(String value1, String value2) {
            addCriterion("commodity_sub_pho2 not between", value1, value2, "commoditySubPho2");
            return (Criteria) this;
        }

        public Criteria andCommoditySubPho3IsNull() {
            addCriterion("commodity_sub_pho3 is null");
            return (Criteria) this;
        }

        public Criteria andCommoditySubPho3IsNotNull() {
            addCriterion("commodity_sub_pho3 is not null");
            return (Criteria) this;
        }

        public Criteria andCommoditySubPho3EqualTo(String value) {
            addCriterion("commodity_sub_pho3 =", value, "commoditySubPho3");
            return (Criteria) this;
        }

        public Criteria andCommoditySubPho3NotEqualTo(String value) {
            addCriterion("commodity_sub_pho3 <>", value, "commoditySubPho3");
            return (Criteria) this;
        }

        public Criteria andCommoditySubPho3GreaterThan(String value) {
            addCriterion("commodity_sub_pho3 >", value, "commoditySubPho3");
            return (Criteria) this;
        }

        public Criteria andCommoditySubPho3GreaterThanOrEqualTo(String value) {
            addCriterion("commodity_sub_pho3 >=", value, "commoditySubPho3");
            return (Criteria) this;
        }

        public Criteria andCommoditySubPho3LessThan(String value) {
            addCriterion("commodity_sub_pho3 <", value, "commoditySubPho3");
            return (Criteria) this;
        }

        public Criteria andCommoditySubPho3LessThanOrEqualTo(String value) {
            addCriterion("commodity_sub_pho3 <=", value, "commoditySubPho3");
            return (Criteria) this;
        }

        public Criteria andCommoditySubPho3Like(String value) {
            addCriterion("commodity_sub_pho3 like", value, "commoditySubPho3");
            return (Criteria) this;
        }

        public Criteria andCommoditySubPho3NotLike(String value) {
            addCriterion("commodity_sub_pho3 not like", value, "commoditySubPho3");
            return (Criteria) this;
        }

        public Criteria andCommoditySubPho3In(List<String> values) {
            addCriterion("commodity_sub_pho3 in", values, "commoditySubPho3");
            return (Criteria) this;
        }

        public Criteria andCommoditySubPho3NotIn(List<String> values) {
            addCriterion("commodity_sub_pho3 not in", values, "commoditySubPho3");
            return (Criteria) this;
        }

        public Criteria andCommoditySubPho3Between(String value1, String value2) {
            addCriterion("commodity_sub_pho3 between", value1, value2, "commoditySubPho3");
            return (Criteria) this;
        }

        public Criteria andCommoditySubPho3NotBetween(String value1, String value2) {
            addCriterion("commodity_sub_pho3 not between", value1, value2, "commoditySubPho3");
            return (Criteria) this;
        }

        public Criteria andCommoditySubPho4IsNull() {
            addCriterion("commodity_sub_pho4 is null");
            return (Criteria) this;
        }

        public Criteria andCommoditySubPho4IsNotNull() {
            addCriterion("commodity_sub_pho4 is not null");
            return (Criteria) this;
        }

        public Criteria andCommoditySubPho4EqualTo(String value) {
            addCriterion("commodity_sub_pho4 =", value, "commoditySubPho4");
            return (Criteria) this;
        }

        public Criteria andCommoditySubPho4NotEqualTo(String value) {
            addCriterion("commodity_sub_pho4 <>", value, "commoditySubPho4");
            return (Criteria) this;
        }

        public Criteria andCommoditySubPho4GreaterThan(String value) {
            addCriterion("commodity_sub_pho4 >", value, "commoditySubPho4");
            return (Criteria) this;
        }

        public Criteria andCommoditySubPho4GreaterThanOrEqualTo(String value) {
            addCriterion("commodity_sub_pho4 >=", value, "commoditySubPho4");
            return (Criteria) this;
        }

        public Criteria andCommoditySubPho4LessThan(String value) {
            addCriterion("commodity_sub_pho4 <", value, "commoditySubPho4");
            return (Criteria) this;
        }

        public Criteria andCommoditySubPho4LessThanOrEqualTo(String value) {
            addCriterion("commodity_sub_pho4 <=", value, "commoditySubPho4");
            return (Criteria) this;
        }

        public Criteria andCommoditySubPho4Like(String value) {
            addCriterion("commodity_sub_pho4 like", value, "commoditySubPho4");
            return (Criteria) this;
        }

        public Criteria andCommoditySubPho4NotLike(String value) {
            addCriterion("commodity_sub_pho4 not like", value, "commoditySubPho4");
            return (Criteria) this;
        }

        public Criteria andCommoditySubPho4In(List<String> values) {
            addCriterion("commodity_sub_pho4 in", values, "commoditySubPho4");
            return (Criteria) this;
        }

        public Criteria andCommoditySubPho4NotIn(List<String> values) {
            addCriterion("commodity_sub_pho4 not in", values, "commoditySubPho4");
            return (Criteria) this;
        }

        public Criteria andCommoditySubPho4Between(String value1, String value2) {
            addCriterion("commodity_sub_pho4 between", value1, value2, "commoditySubPho4");
            return (Criteria) this;
        }

        public Criteria andCommoditySubPho4NotBetween(String value1, String value2) {
            addCriterion("commodity_sub_pho4 not between", value1, value2, "commoditySubPho4");
            return (Criteria) this;
        }

        public Criteria andCommodityCurrnumIsNull() {
            addCriterion("commodity_currnum is null");
            return (Criteria) this;
        }

        public Criteria andCommodityCurrnumIsNotNull() {
            addCriterion("commodity_currnum is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityCurrnumEqualTo(Integer value) {
            addCriterion("commodity_currnum =", value, "commodityCurrnum");
            return (Criteria) this;
        }

        public Criteria andCommodityCurrnumNotEqualTo(Integer value) {
            addCriterion("commodity_currnum <>", value, "commodityCurrnum");
            return (Criteria) this;
        }

        public Criteria andCommodityCurrnumGreaterThan(Integer value) {
            addCriterion("commodity_currnum >", value, "commodityCurrnum");
            return (Criteria) this;
        }

        public Criteria andCommodityCurrnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("commodity_currnum >=", value, "commodityCurrnum");
            return (Criteria) this;
        }

        public Criteria andCommodityCurrnumLessThan(Integer value) {
            addCriterion("commodity_currnum <", value, "commodityCurrnum");
            return (Criteria) this;
        }

        public Criteria andCommodityCurrnumLessThanOrEqualTo(Integer value) {
            addCriterion("commodity_currnum <=", value, "commodityCurrnum");
            return (Criteria) this;
        }

        public Criteria andCommodityCurrnumIn(List<Integer> values) {
            addCriterion("commodity_currnum in", values, "commodityCurrnum");
            return (Criteria) this;
        }

        public Criteria andCommodityCurrnumNotIn(List<Integer> values) {
            addCriterion("commodity_currnum not in", values, "commodityCurrnum");
            return (Criteria) this;
        }

        public Criteria andCommodityCurrnumBetween(Integer value1, Integer value2) {
            addCriterion("commodity_currnum between", value1, value2, "commodityCurrnum");
            return (Criteria) this;
        }

        public Criteria andCommodityCurrnumNotBetween(Integer value1, Integer value2) {
            addCriterion("commodity_currnum not between", value1, value2, "commodityCurrnum");
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