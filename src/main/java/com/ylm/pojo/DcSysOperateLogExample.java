package com.ylm.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DcSysOperateLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DcSysOperateLogExample() {
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

        public Criteria andOlIdIsNull() {
            addCriterion("ol_id is null");
            return (Criteria) this;
        }

        public Criteria andOlIdIsNotNull() {
            addCriterion("ol_id is not null");
            return (Criteria) this;
        }

        public Criteria andOlIdEqualTo(Integer value) {
            addCriterion("ol_id =", value, "olId");
            return (Criteria) this;
        }

        public Criteria andOlIdNotEqualTo(Integer value) {
            addCriterion("ol_id <>", value, "olId");
            return (Criteria) this;
        }

        public Criteria andOlIdGreaterThan(Integer value) {
            addCriterion("ol_id >", value, "olId");
            return (Criteria) this;
        }

        public Criteria andOlIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ol_id >=", value, "olId");
            return (Criteria) this;
        }

        public Criteria andOlIdLessThan(Integer value) {
            addCriterion("ol_id <", value, "olId");
            return (Criteria) this;
        }

        public Criteria andOlIdLessThanOrEqualTo(Integer value) {
            addCriterion("ol_id <=", value, "olId");
            return (Criteria) this;
        }

        public Criteria andOlIdIn(List<Integer> values) {
            addCriterion("ol_id in", values, "olId");
            return (Criteria) this;
        }

        public Criteria andOlIdNotIn(List<Integer> values) {
            addCriterion("ol_id not in", values, "olId");
            return (Criteria) this;
        }

        public Criteria andOlIdBetween(Integer value1, Integer value2) {
            addCriterion("ol_id between", value1, value2, "olId");
            return (Criteria) this;
        }

        public Criteria andOlIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ol_id not between", value1, value2, "olId");
            return (Criteria) this;
        }

        public Criteria andOlTypeIsNull() {
            addCriterion("ol_type is null");
            return (Criteria) this;
        }

        public Criteria andOlTypeIsNotNull() {
            addCriterion("ol_type is not null");
            return (Criteria) this;
        }

        public Criteria andOlTypeEqualTo(String value) {
            addCriterion("ol_type =", value, "olType");
            return (Criteria) this;
        }

        public Criteria andOlTypeNotEqualTo(String value) {
            addCriterion("ol_type <>", value, "olType");
            return (Criteria) this;
        }

        public Criteria andOlTypeGreaterThan(String value) {
            addCriterion("ol_type >", value, "olType");
            return (Criteria) this;
        }

        public Criteria andOlTypeGreaterThanOrEqualTo(String value) {
            addCriterion("ol_type >=", value, "olType");
            return (Criteria) this;
        }

        public Criteria andOlTypeLessThan(String value) {
            addCriterion("ol_type <", value, "olType");
            return (Criteria) this;
        }

        public Criteria andOlTypeLessThanOrEqualTo(String value) {
            addCriterion("ol_type <=", value, "olType");
            return (Criteria) this;
        }

        public Criteria andOlTypeLike(String value) {
            addCriterion("ol_type like", value, "olType");
            return (Criteria) this;
        }

        public Criteria andOlTypeNotLike(String value) {
            addCriterion("ol_type not like", value, "olType");
            return (Criteria) this;
        }

        public Criteria andOlTypeIn(List<String> values) {
            addCriterion("ol_type in", values, "olType");
            return (Criteria) this;
        }

        public Criteria andOlTypeNotIn(List<String> values) {
            addCriterion("ol_type not in", values, "olType");
            return (Criteria) this;
        }

        public Criteria andOlTypeBetween(String value1, String value2) {
            addCriterion("ol_type between", value1, value2, "olType");
            return (Criteria) this;
        }

        public Criteria andOlTypeNotBetween(String value1, String value2) {
            addCriterion("ol_type not between", value1, value2, "olType");
            return (Criteria) this;
        }

        public Criteria andOlModuleIsNull() {
            addCriterion("ol_module is null");
            return (Criteria) this;
        }

        public Criteria andOlModuleIsNotNull() {
            addCriterion("ol_module is not null");
            return (Criteria) this;
        }

        public Criteria andOlModuleEqualTo(String value) {
            addCriterion("ol_module =", value, "olModule");
            return (Criteria) this;
        }

        public Criteria andOlModuleNotEqualTo(String value) {
            addCriterion("ol_module <>", value, "olModule");
            return (Criteria) this;
        }

        public Criteria andOlModuleGreaterThan(String value) {
            addCriterion("ol_module >", value, "olModule");
            return (Criteria) this;
        }

        public Criteria andOlModuleGreaterThanOrEqualTo(String value) {
            addCriterion("ol_module >=", value, "olModule");
            return (Criteria) this;
        }

        public Criteria andOlModuleLessThan(String value) {
            addCriterion("ol_module <", value, "olModule");
            return (Criteria) this;
        }

        public Criteria andOlModuleLessThanOrEqualTo(String value) {
            addCriterion("ol_module <=", value, "olModule");
            return (Criteria) this;
        }

        public Criteria andOlModuleLike(String value) {
            addCriterion("ol_module like", value, "olModule");
            return (Criteria) this;
        }

        public Criteria andOlModuleNotLike(String value) {
            addCriterion("ol_module not like", value, "olModule");
            return (Criteria) this;
        }

        public Criteria andOlModuleIn(List<String> values) {
            addCriterion("ol_module in", values, "olModule");
            return (Criteria) this;
        }

        public Criteria andOlModuleNotIn(List<String> values) {
            addCriterion("ol_module not in", values, "olModule");
            return (Criteria) this;
        }

        public Criteria andOlModuleBetween(String value1, String value2) {
            addCriterion("ol_module between", value1, value2, "olModule");
            return (Criteria) this;
        }

        public Criteria andOlModuleNotBetween(String value1, String value2) {
            addCriterion("ol_module not between", value1, value2, "olModule");
            return (Criteria) this;
        }

        public Criteria andOlContentIsNull() {
            addCriterion("ol_content is null");
            return (Criteria) this;
        }

        public Criteria andOlContentIsNotNull() {
            addCriterion("ol_content is not null");
            return (Criteria) this;
        }

        public Criteria andOlContentEqualTo(String value) {
            addCriterion("ol_content =", value, "olContent");
            return (Criteria) this;
        }

        public Criteria andOlContentNotEqualTo(String value) {
            addCriterion("ol_content <>", value, "olContent");
            return (Criteria) this;
        }

        public Criteria andOlContentGreaterThan(String value) {
            addCriterion("ol_content >", value, "olContent");
            return (Criteria) this;
        }

        public Criteria andOlContentGreaterThanOrEqualTo(String value) {
            addCriterion("ol_content >=", value, "olContent");
            return (Criteria) this;
        }

        public Criteria andOlContentLessThan(String value) {
            addCriterion("ol_content <", value, "olContent");
            return (Criteria) this;
        }

        public Criteria andOlContentLessThanOrEqualTo(String value) {
            addCriterion("ol_content <=", value, "olContent");
            return (Criteria) this;
        }

        public Criteria andOlContentLike(String value) {
            addCriterion("ol_content like", value, "olContent");
            return (Criteria) this;
        }

        public Criteria andOlContentNotLike(String value) {
            addCriterion("ol_content not like", value, "olContent");
            return (Criteria) this;
        }

        public Criteria andOlContentIn(List<String> values) {
            addCriterion("ol_content in", values, "olContent");
            return (Criteria) this;
        }

        public Criteria andOlContentNotIn(List<String> values) {
            addCriterion("ol_content not in", values, "olContent");
            return (Criteria) this;
        }

        public Criteria andOlContentBetween(String value1, String value2) {
            addCriterion("ol_content between", value1, value2, "olContent");
            return (Criteria) this;
        }

        public Criteria andOlContentNotBetween(String value1, String value2) {
            addCriterion("ol_content not between", value1, value2, "olContent");
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

        public Criteria andOlAddDateIsNull() {
            addCriterion("ol_add_date is null");
            return (Criteria) this;
        }

        public Criteria andOlAddDateIsNotNull() {
            addCriterion("ol_add_date is not null");
            return (Criteria) this;
        }

        public Criteria andOlAddDateEqualTo(Date value) {
            addCriterion("ol_add_date =", value, "olAddDate");
            return (Criteria) this;
        }

        public Criteria andOlAddDateNotEqualTo(Date value) {
            addCriterion("ol_add_date <>", value, "olAddDate");
            return (Criteria) this;
        }

        public Criteria andOlAddDateGreaterThan(Date value) {
            addCriterion("ol_add_date >", value, "olAddDate");
            return (Criteria) this;
        }

        public Criteria andOlAddDateGreaterThanOrEqualTo(Date value) {
            addCriterion("ol_add_date >=", value, "olAddDate");
            return (Criteria) this;
        }

        public Criteria andOlAddDateLessThan(Date value) {
            addCriterion("ol_add_date <", value, "olAddDate");
            return (Criteria) this;
        }

        public Criteria andOlAddDateLessThanOrEqualTo(Date value) {
            addCriterion("ol_add_date <=", value, "olAddDate");
            return (Criteria) this;
        }

        public Criteria andOlAddDateIn(List<Date> values) {
            addCriterion("ol_add_date in", values, "olAddDate");
            return (Criteria) this;
        }

        public Criteria andOlAddDateNotIn(List<Date> values) {
            addCriterion("ol_add_date not in", values, "olAddDate");
            return (Criteria) this;
        }

        public Criteria andOlAddDateBetween(Date value1, Date value2) {
            addCriterion("ol_add_date between", value1, value2, "olAddDate");
            return (Criteria) this;
        }

        public Criteria andOlAddDateNotBetween(Date value1, Date value2) {
            addCriterion("ol_add_date not between", value1, value2, "olAddDate");
            return (Criteria) this;
        }

        public Criteria andOlIpIsNull() {
            addCriterion("ol_ip is null");
            return (Criteria) this;
        }

        public Criteria andOlIpIsNotNull() {
            addCriterion("ol_ip is not null");
            return (Criteria) this;
        }

        public Criteria andOlIpEqualTo(String value) {
            addCriterion("ol_ip =", value, "olIp");
            return (Criteria) this;
        }

        public Criteria andOlIpNotEqualTo(String value) {
            addCriterion("ol_ip <>", value, "olIp");
            return (Criteria) this;
        }

        public Criteria andOlIpGreaterThan(String value) {
            addCriterion("ol_ip >", value, "olIp");
            return (Criteria) this;
        }

        public Criteria andOlIpGreaterThanOrEqualTo(String value) {
            addCriterion("ol_ip >=", value, "olIp");
            return (Criteria) this;
        }

        public Criteria andOlIpLessThan(String value) {
            addCriterion("ol_ip <", value, "olIp");
            return (Criteria) this;
        }

        public Criteria andOlIpLessThanOrEqualTo(String value) {
            addCriterion("ol_ip <=", value, "olIp");
            return (Criteria) this;
        }

        public Criteria andOlIpLike(String value) {
            addCriterion("ol_ip like", value, "olIp");
            return (Criteria) this;
        }

        public Criteria andOlIpNotLike(String value) {
            addCriterion("ol_ip not like", value, "olIp");
            return (Criteria) this;
        }

        public Criteria andOlIpIn(List<String> values) {
            addCriterion("ol_ip in", values, "olIp");
            return (Criteria) this;
        }

        public Criteria andOlIpNotIn(List<String> values) {
            addCriterion("ol_ip not in", values, "olIp");
            return (Criteria) this;
        }

        public Criteria andOlIpBetween(String value1, String value2) {
            addCriterion("ol_ip between", value1, value2, "olIp");
            return (Criteria) this;
        }

        public Criteria andOlIpNotBetween(String value1, String value2) {
            addCriterion("ol_ip not between", value1, value2, "olIp");
            return (Criteria) this;
        }

        public Criteria andOlRemarksIsNull() {
            addCriterion("ol_remarks is null");
            return (Criteria) this;
        }

        public Criteria andOlRemarksIsNotNull() {
            addCriterion("ol_remarks is not null");
            return (Criteria) this;
        }

        public Criteria andOlRemarksEqualTo(String value) {
            addCriterion("ol_remarks =", value, "olRemarks");
            return (Criteria) this;
        }

        public Criteria andOlRemarksNotEqualTo(String value) {
            addCriterion("ol_remarks <>", value, "olRemarks");
            return (Criteria) this;
        }

        public Criteria andOlRemarksGreaterThan(String value) {
            addCriterion("ol_remarks >", value, "olRemarks");
            return (Criteria) this;
        }

        public Criteria andOlRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("ol_remarks >=", value, "olRemarks");
            return (Criteria) this;
        }

        public Criteria andOlRemarksLessThan(String value) {
            addCriterion("ol_remarks <", value, "olRemarks");
            return (Criteria) this;
        }

        public Criteria andOlRemarksLessThanOrEqualTo(String value) {
            addCriterion("ol_remarks <=", value, "olRemarks");
            return (Criteria) this;
        }

        public Criteria andOlRemarksLike(String value) {
            addCriterion("ol_remarks like", value, "olRemarks");
            return (Criteria) this;
        }

        public Criteria andOlRemarksNotLike(String value) {
            addCriterion("ol_remarks not like", value, "olRemarks");
            return (Criteria) this;
        }

        public Criteria andOlRemarksIn(List<String> values) {
            addCriterion("ol_remarks in", values, "olRemarks");
            return (Criteria) this;
        }

        public Criteria andOlRemarksNotIn(List<String> values) {
            addCriterion("ol_remarks not in", values, "olRemarks");
            return (Criteria) this;
        }

        public Criteria andOlRemarksBetween(String value1, String value2) {
            addCriterion("ol_remarks between", value1, value2, "olRemarks");
            return (Criteria) this;
        }

        public Criteria andOlRemarksNotBetween(String value1, String value2) {
            addCriterion("ol_remarks not between", value1, value2, "olRemarks");
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