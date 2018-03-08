package com.ylm.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class DcFoodExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DcFoodExample() {
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

        public Criteria andFoodIdIsNull() {
            addCriterion("food_id is null");
            return (Criteria) this;
        }

        public Criteria andFoodIdIsNotNull() {
            addCriterion("food_id is not null");
            return (Criteria) this;
        }

        public Criteria andFoodIdEqualTo(Integer value) {
            addCriterion("food_id =", value, "foodId");
            return (Criteria) this;
        }

        public Criteria andFoodIdNotEqualTo(Integer value) {
            addCriterion("food_id <>", value, "foodId");
            return (Criteria) this;
        }

        public Criteria andFoodIdGreaterThan(Integer value) {
            addCriterion("food_id >", value, "foodId");
            return (Criteria) this;
        }

        public Criteria andFoodIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("food_id >=", value, "foodId");
            return (Criteria) this;
        }

        public Criteria andFoodIdLessThan(Integer value) {
            addCriterion("food_id <", value, "foodId");
            return (Criteria) this;
        }

        public Criteria andFoodIdLessThanOrEqualTo(Integer value) {
            addCriterion("food_id <=", value, "foodId");
            return (Criteria) this;
        }

        public Criteria andFoodIdIn(List<Integer> values) {
            addCriterion("food_id in", values, "foodId");
            return (Criteria) this;
        }

        public Criteria andFoodIdNotIn(List<Integer> values) {
            addCriterion("food_id not in", values, "foodId");
            return (Criteria) this;
        }

        public Criteria andFoodIdBetween(Integer value1, Integer value2) {
            addCriterion("food_id between", value1, value2, "foodId");
            return (Criteria) this;
        }

        public Criteria andFoodIdNotBetween(Integer value1, Integer value2) {
            addCriterion("food_id not between", value1, value2, "foodId");
            return (Criteria) this;
        }

        public Criteria andFoodNameIsNull() {
            addCriterion("food_name is null");
            return (Criteria) this;
        }

        public Criteria andFoodNameIsNotNull() {
            addCriterion("food_name is not null");
            return (Criteria) this;
        }

        public Criteria andFoodNameEqualTo(String value) {
            addCriterion("food_name =", value, "foodName");
            return (Criteria) this;
        }

        public Criteria andFoodNameNotEqualTo(String value) {
            addCriterion("food_name <>", value, "foodName");
            return (Criteria) this;
        }

        public Criteria andFoodNameGreaterThan(String value) {
            addCriterion("food_name >", value, "foodName");
            return (Criteria) this;
        }

        public Criteria andFoodNameGreaterThanOrEqualTo(String value) {
            addCriterion("food_name >=", value, "foodName");
            return (Criteria) this;
        }

        public Criteria andFoodNameLessThan(String value) {
            addCriterion("food_name <", value, "foodName");
            return (Criteria) this;
        }

        public Criteria andFoodNameLessThanOrEqualTo(String value) {
            addCriterion("food_name <=", value, "foodName");
            return (Criteria) this;
        }

        public Criteria andFoodNameLike(String value) {
            addCriterion("food_name like", value, "foodName");
            return (Criteria) this;
        }

        public Criteria andFoodNameNotLike(String value) {
            addCriterion("food_name not like", value, "foodName");
            return (Criteria) this;
        }

        public Criteria andFoodNameIn(List<String> values) {
            addCriterion("food_name in", values, "foodName");
            return (Criteria) this;
        }

        public Criteria andFoodNameNotIn(List<String> values) {
            addCriterion("food_name not in", values, "foodName");
            return (Criteria) this;
        }

        public Criteria andFoodNameBetween(String value1, String value2) {
            addCriterion("food_name between", value1, value2, "foodName");
            return (Criteria) this;
        }

        public Criteria andFoodNameNotBetween(String value1, String value2) {
            addCriterion("food_name not between", value1, value2, "foodName");
            return (Criteria) this;
        }

        public Criteria andFoodtypeIdIsNull() {
            addCriterion("foodtype_id is null");
            return (Criteria) this;
        }

        public Criteria andFoodtypeIdIsNotNull() {
            addCriterion("foodtype_id is not null");
            return (Criteria) this;
        }

        public Criteria andFoodtypeIdEqualTo(Integer value) {
            addCriterion("foodtype_id =", value, "foodtypeId");
            return (Criteria) this;
        }

        public Criteria andFoodtypeIdNotEqualTo(Integer value) {
            addCriterion("foodtype_id <>", value, "foodtypeId");
            return (Criteria) this;
        }

        public Criteria andFoodtypeIdGreaterThan(Integer value) {
            addCriterion("foodtype_id >", value, "foodtypeId");
            return (Criteria) this;
        }

        public Criteria andFoodtypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("foodtype_id >=", value, "foodtypeId");
            return (Criteria) this;
        }

        public Criteria andFoodtypeIdLessThan(Integer value) {
            addCriterion("foodtype_id <", value, "foodtypeId");
            return (Criteria) this;
        }

        public Criteria andFoodtypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("foodtype_id <=", value, "foodtypeId");
            return (Criteria) this;
        }

        public Criteria andFoodtypeIdIn(List<Integer> values) {
            addCriterion("foodtype_id in", values, "foodtypeId");
            return (Criteria) this;
        }

        public Criteria andFoodtypeIdNotIn(List<Integer> values) {
            addCriterion("foodtype_id not in", values, "foodtypeId");
            return (Criteria) this;
        }

        public Criteria andFoodtypeIdBetween(Integer value1, Integer value2) {
            addCriterion("foodtype_id between", value1, value2, "foodtypeId");
            return (Criteria) this;
        }

        public Criteria andFoodtypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("foodtype_id not between", value1, value2, "foodtypeId");
            return (Criteria) this;
        }

        public Criteria andFoodPriceIsNull() {
            addCriterion("food_price is null");
            return (Criteria) this;
        }

        public Criteria andFoodPriceIsNotNull() {
            addCriterion("food_price is not null");
            return (Criteria) this;
        }

        public Criteria andFoodPriceEqualTo(BigDecimal value) {
            addCriterion("food_price =", value, "foodPrice");
            return (Criteria) this;
        }

        public Criteria andFoodPriceNotEqualTo(BigDecimal value) {
            addCriterion("food_price <>", value, "foodPrice");
            return (Criteria) this;
        }

        public Criteria andFoodPriceGreaterThan(BigDecimal value) {
            addCriterion("food_price >", value, "foodPrice");
            return (Criteria) this;
        }

        public Criteria andFoodPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("food_price >=", value, "foodPrice");
            return (Criteria) this;
        }

        public Criteria andFoodPriceLessThan(BigDecimal value) {
            addCriterion("food_price <", value, "foodPrice");
            return (Criteria) this;
        }

        public Criteria andFoodPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("food_price <=", value, "foodPrice");
            return (Criteria) this;
        }

        public Criteria andFoodPriceIn(List<BigDecimal> values) {
            addCriterion("food_price in", values, "foodPrice");
            return (Criteria) this;
        }

        public Criteria andFoodPriceNotIn(List<BigDecimal> values) {
            addCriterion("food_price not in", values, "foodPrice");
            return (Criteria) this;
        }

        public Criteria andFoodPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("food_price between", value1, value2, "foodPrice");
            return (Criteria) this;
        }

        public Criteria andFoodPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("food_price not between", value1, value2, "foodPrice");
            return (Criteria) this;
        }

        public Criteria andFoodRemarkIsNull() {
            addCriterion("food_remark is null");
            return (Criteria) this;
        }

        public Criteria andFoodRemarkIsNotNull() {
            addCriterion("food_remark is not null");
            return (Criteria) this;
        }

        public Criteria andFoodRemarkEqualTo(String value) {
            addCriterion("food_remark =", value, "foodRemark");
            return (Criteria) this;
        }

        public Criteria andFoodRemarkNotEqualTo(String value) {
            addCriterion("food_remark <>", value, "foodRemark");
            return (Criteria) this;
        }

        public Criteria andFoodRemarkGreaterThan(String value) {
            addCriterion("food_remark >", value, "foodRemark");
            return (Criteria) this;
        }

        public Criteria andFoodRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("food_remark >=", value, "foodRemark");
            return (Criteria) this;
        }

        public Criteria andFoodRemarkLessThan(String value) {
            addCriterion("food_remark <", value, "foodRemark");
            return (Criteria) this;
        }

        public Criteria andFoodRemarkLessThanOrEqualTo(String value) {
            addCriterion("food_remark <=", value, "foodRemark");
            return (Criteria) this;
        }

        public Criteria andFoodRemarkLike(String value) {
            addCriterion("food_remark like", value, "foodRemark");
            return (Criteria) this;
        }

        public Criteria andFoodRemarkNotLike(String value) {
            addCriterion("food_remark not like", value, "foodRemark");
            return (Criteria) this;
        }

        public Criteria andFoodRemarkIn(List<String> values) {
            addCriterion("food_remark in", values, "foodRemark");
            return (Criteria) this;
        }

        public Criteria andFoodRemarkNotIn(List<String> values) {
            addCriterion("food_remark not in", values, "foodRemark");
            return (Criteria) this;
        }

        public Criteria andFoodRemarkBetween(String value1, String value2) {
            addCriterion("food_remark between", value1, value2, "foodRemark");
            return (Criteria) this;
        }

        public Criteria andFoodRemarkNotBetween(String value1, String value2) {
            addCriterion("food_remark not between", value1, value2, "foodRemark");
            return (Criteria) this;
        }

        public Criteria andFoodGroundingIsNull() {
            addCriterion("food_grounding is null");
            return (Criteria) this;
        }

        public Criteria andFoodGroundingIsNotNull() {
            addCriterion("food_grounding is not null");
            return (Criteria) this;
        }

        public Criteria andFoodGroundingEqualTo(Integer value) {
            addCriterion("food_grounding =", value, "foodGrounding");
            return (Criteria) this;
        }

        public Criteria andFoodGroundingNotEqualTo(Integer value) {
            addCriterion("food_grounding <>", value, "foodGrounding");
            return (Criteria) this;
        }

        public Criteria andFoodGroundingGreaterThan(Integer value) {
            addCriterion("food_grounding >", value, "foodGrounding");
            return (Criteria) this;
        }

        public Criteria andFoodGroundingGreaterThanOrEqualTo(Integer value) {
            addCriterion("food_grounding >=", value, "foodGrounding");
            return (Criteria) this;
        }

        public Criteria andFoodGroundingLessThan(Integer value) {
            addCriterion("food_grounding <", value, "foodGrounding");
            return (Criteria) this;
        }

        public Criteria andFoodGroundingLessThanOrEqualTo(Integer value) {
            addCriterion("food_grounding <=", value, "foodGrounding");
            return (Criteria) this;
        }

        public Criteria andFoodGroundingIn(List<Integer> values) {
            addCriterion("food_grounding in", values, "foodGrounding");
            return (Criteria) this;
        }

        public Criteria andFoodGroundingNotIn(List<Integer> values) {
            addCriterion("food_grounding not in", values, "foodGrounding");
            return (Criteria) this;
        }

        public Criteria andFoodGroundingBetween(Integer value1, Integer value2) {
            addCriterion("food_grounding between", value1, value2, "foodGrounding");
            return (Criteria) this;
        }

        public Criteria andFoodGroundingNotBetween(Integer value1, Integer value2) {
            addCriterion("food_grounding not between", value1, value2, "foodGrounding");
            return (Criteria) this;
        }

        public Criteria andFoodMonthlysalesIsNull() {
            addCriterion("food_monthlysales is null");
            return (Criteria) this;
        }

        public Criteria andFoodMonthlysalesIsNotNull() {
            addCriterion("food_monthlysales is not null");
            return (Criteria) this;
        }

        public Criteria andFoodMonthlysalesEqualTo(Integer value) {
            addCriterion("food_monthlysales =", value, "foodMonthlysales");
            return (Criteria) this;
        }

        public Criteria andFoodMonthlysalesNotEqualTo(Integer value) {
            addCriterion("food_monthlysales <>", value, "foodMonthlysales");
            return (Criteria) this;
        }

        public Criteria andFoodMonthlysalesGreaterThan(Integer value) {
            addCriterion("food_monthlysales >", value, "foodMonthlysales");
            return (Criteria) this;
        }

        public Criteria andFoodMonthlysalesGreaterThanOrEqualTo(Integer value) {
            addCriterion("food_monthlysales >=", value, "foodMonthlysales");
            return (Criteria) this;
        }

        public Criteria andFoodMonthlysalesLessThan(Integer value) {
            addCriterion("food_monthlysales <", value, "foodMonthlysales");
            return (Criteria) this;
        }

        public Criteria andFoodMonthlysalesLessThanOrEqualTo(Integer value) {
            addCriterion("food_monthlysales <=", value, "foodMonthlysales");
            return (Criteria) this;
        }

        public Criteria andFoodMonthlysalesIn(List<Integer> values) {
            addCriterion("food_monthlysales in", values, "foodMonthlysales");
            return (Criteria) this;
        }

        public Criteria andFoodMonthlysalesNotIn(List<Integer> values) {
            addCriterion("food_monthlysales not in", values, "foodMonthlysales");
            return (Criteria) this;
        }

        public Criteria andFoodMonthlysalesBetween(Integer value1, Integer value2) {
            addCriterion("food_monthlysales between", value1, value2, "foodMonthlysales");
            return (Criteria) this;
        }

        public Criteria andFoodMonthlysalesNotBetween(Integer value1, Integer value2) {
            addCriterion("food_monthlysales not between", value1, value2, "foodMonthlysales");
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