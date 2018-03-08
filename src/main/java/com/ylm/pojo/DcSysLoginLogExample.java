package com.ylm.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DcSysLoginLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DcSysLoginLogExample() {
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

        public Criteria andLlIdIsNull() {
            addCriterion("ll_id is null");
            return (Criteria) this;
        }

        public Criteria andLlIdIsNotNull() {
            addCriterion("ll_id is not null");
            return (Criteria) this;
        }

        public Criteria andLlIdEqualTo(Integer value) {
            addCriterion("ll_id =", value, "llId");
            return (Criteria) this;
        }

        public Criteria andLlIdNotEqualTo(Integer value) {
            addCriterion("ll_id <>", value, "llId");
            return (Criteria) this;
        }

        public Criteria andLlIdGreaterThan(Integer value) {
            addCriterion("ll_id >", value, "llId");
            return (Criteria) this;
        }

        public Criteria andLlIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ll_id >=", value, "llId");
            return (Criteria) this;
        }

        public Criteria andLlIdLessThan(Integer value) {
            addCriterion("ll_id <", value, "llId");
            return (Criteria) this;
        }

        public Criteria andLlIdLessThanOrEqualTo(Integer value) {
            addCriterion("ll_id <=", value, "llId");
            return (Criteria) this;
        }

        public Criteria andLlIdIn(List<Integer> values) {
            addCriterion("ll_id in", values, "llId");
            return (Criteria) this;
        }

        public Criteria andLlIdNotIn(List<Integer> values) {
            addCriterion("ll_id not in", values, "llId");
            return (Criteria) this;
        }

        public Criteria andLlIdBetween(Integer value1, Integer value2) {
            addCriterion("ll_id between", value1, value2, "llId");
            return (Criteria) this;
        }

        public Criteria andLlIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ll_id not between", value1, value2, "llId");
            return (Criteria) this;
        }

        public Criteria andAdminIdIsNull() {
            addCriterion("admin_id is null");
            return (Criteria) this;
        }

        public Criteria andAdminIdIsNotNull() {
            addCriterion("admin_id is not null");
            return (Criteria) this;
        }

        public Criteria andAdminIdEqualTo(Integer value) {
            addCriterion("admin_id =", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdNotEqualTo(Integer value) {
            addCriterion("admin_id <>", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdGreaterThan(Integer value) {
            addCriterion("admin_id >", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("admin_id >=", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdLessThan(Integer value) {
            addCriterion("admin_id <", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdLessThanOrEqualTo(Integer value) {
            addCriterion("admin_id <=", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdIn(List<Integer> values) {
            addCriterion("admin_id in", values, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdNotIn(List<Integer> values) {
            addCriterion("admin_id not in", values, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdBetween(Integer value1, Integer value2) {
            addCriterion("admin_id between", value1, value2, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdNotBetween(Integer value1, Integer value2) {
            addCriterion("admin_id not between", value1, value2, "adminId");
            return (Criteria) this;
        }

        public Criteria andLlLoginDateIsNull() {
            addCriterion("ll_login_date is null");
            return (Criteria) this;
        }

        public Criteria andLlLoginDateIsNotNull() {
            addCriterion("ll_login_date is not null");
            return (Criteria) this;
        }

        public Criteria andLlLoginDateEqualTo(Date value) {
            addCriterion("ll_login_date =", value, "llLoginDate");
            return (Criteria) this;
        }

        public Criteria andLlLoginDateNotEqualTo(Date value) {
            addCriterion("ll_login_date <>", value, "llLoginDate");
            return (Criteria) this;
        }

        public Criteria andLlLoginDateGreaterThan(Date value) {
            addCriterion("ll_login_date >", value, "llLoginDate");
            return (Criteria) this;
        }

        public Criteria andLlLoginDateGreaterThanOrEqualTo(Date value) {
            addCriterion("ll_login_date >=", value, "llLoginDate");
            return (Criteria) this;
        }

        public Criteria andLlLoginDateLessThan(Date value) {
            addCriterion("ll_login_date <", value, "llLoginDate");
            return (Criteria) this;
        }

        public Criteria andLlLoginDateLessThanOrEqualTo(Date value) {
            addCriterion("ll_login_date <=", value, "llLoginDate");
            return (Criteria) this;
        }

        public Criteria andLlLoginDateIn(List<Date> values) {
            addCriterion("ll_login_date in", values, "llLoginDate");
            return (Criteria) this;
        }

        public Criteria andLlLoginDateNotIn(List<Date> values) {
            addCriterion("ll_login_date not in", values, "llLoginDate");
            return (Criteria) this;
        }

        public Criteria andLlLoginDateBetween(Date value1, Date value2) {
            addCriterion("ll_login_date between", value1, value2, "llLoginDate");
            return (Criteria) this;
        }

        public Criteria andLlLoginDateNotBetween(Date value1, Date value2) {
            addCriterion("ll_login_date not between", value1, value2, "llLoginDate");
            return (Criteria) this;
        }

        public Criteria andLlIpIsNull() {
            addCriterion("ll_ip is null");
            return (Criteria) this;
        }

        public Criteria andLlIpIsNotNull() {
            addCriterion("ll_ip is not null");
            return (Criteria) this;
        }

        public Criteria andLlIpEqualTo(String value) {
            addCriterion("ll_ip =", value, "llIp");
            return (Criteria) this;
        }

        public Criteria andLlIpNotEqualTo(String value) {
            addCriterion("ll_ip <>", value, "llIp");
            return (Criteria) this;
        }

        public Criteria andLlIpGreaterThan(String value) {
            addCriterion("ll_ip >", value, "llIp");
            return (Criteria) this;
        }

        public Criteria andLlIpGreaterThanOrEqualTo(String value) {
            addCriterion("ll_ip >=", value, "llIp");
            return (Criteria) this;
        }

        public Criteria andLlIpLessThan(String value) {
            addCriterion("ll_ip <", value, "llIp");
            return (Criteria) this;
        }

        public Criteria andLlIpLessThanOrEqualTo(String value) {
            addCriterion("ll_ip <=", value, "llIp");
            return (Criteria) this;
        }

        public Criteria andLlIpLike(String value) {
            addCriterion("ll_ip like", value, "llIp");
            return (Criteria) this;
        }

        public Criteria andLlIpNotLike(String value) {
            addCriterion("ll_ip not like", value, "llIp");
            return (Criteria) this;
        }

        public Criteria andLlIpIn(List<String> values) {
            addCriterion("ll_ip in", values, "llIp");
            return (Criteria) this;
        }

        public Criteria andLlIpNotIn(List<String> values) {
            addCriterion("ll_ip not in", values, "llIp");
            return (Criteria) this;
        }

        public Criteria andLlIpBetween(String value1, String value2) {
            addCriterion("ll_ip between", value1, value2, "llIp");
            return (Criteria) this;
        }

        public Criteria andLlIpNotBetween(String value1, String value2) {
            addCriterion("ll_ip not between", value1, value2, "llIp");
            return (Criteria) this;
        }

        public Criteria andLlStatusIsNull() {
            addCriterion("ll_status is null");
            return (Criteria) this;
        }

        public Criteria andLlStatusIsNotNull() {
            addCriterion("ll_status is not null");
            return (Criteria) this;
        }

        public Criteria andLlStatusEqualTo(Integer value) {
            addCriterion("ll_status =", value, "llStatus");
            return (Criteria) this;
        }

        public Criteria andLlStatusNotEqualTo(Integer value) {
            addCriterion("ll_status <>", value, "llStatus");
            return (Criteria) this;
        }

        public Criteria andLlStatusGreaterThan(Integer value) {
            addCriterion("ll_status >", value, "llStatus");
            return (Criteria) this;
        }

        public Criteria andLlStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("ll_status >=", value, "llStatus");
            return (Criteria) this;
        }

        public Criteria andLlStatusLessThan(Integer value) {
            addCriterion("ll_status <", value, "llStatus");
            return (Criteria) this;
        }

        public Criteria andLlStatusLessThanOrEqualTo(Integer value) {
            addCriterion("ll_status <=", value, "llStatus");
            return (Criteria) this;
        }

        public Criteria andLlStatusIn(List<Integer> values) {
            addCriterion("ll_status in", values, "llStatus");
            return (Criteria) this;
        }

        public Criteria andLlStatusNotIn(List<Integer> values) {
            addCriterion("ll_status not in", values, "llStatus");
            return (Criteria) this;
        }

        public Criteria andLlStatusBetween(Integer value1, Integer value2) {
            addCriterion("ll_status between", value1, value2, "llStatus");
            return (Criteria) this;
        }

        public Criteria andLlStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("ll_status not between", value1, value2, "llStatus");
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