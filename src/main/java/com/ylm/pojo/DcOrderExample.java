package com.ylm.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class DcOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DcOrderExample() {
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

        public Criteria andOrderIdIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(String value) {
            addCriterion("order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(String value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(String value) {
            addCriterion("order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(String value) {
            addCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(String value) {
            addCriterion("order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(String value) {
            addCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLike(String value) {
            addCriterion("order_id like", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotLike(String value) {
            addCriterion("order_id not like", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<String> values) {
            addCriterion("order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<String> values) {
            addCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(String value1, String value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(String value1, String value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andBoardIdIsNull() {
            addCriterion("board_id is null");
            return (Criteria) this;
        }

        public Criteria andBoardIdIsNotNull() {
            addCriterion("board_id is not null");
            return (Criteria) this;
        }

        public Criteria andBoardIdEqualTo(Integer value) {
            addCriterion("board_id =", value, "boardId");
            return (Criteria) this;
        }

        public Criteria andBoardIdNotEqualTo(Integer value) {
            addCriterion("board_id <>", value, "boardId");
            return (Criteria) this;
        }

        public Criteria andBoardIdGreaterThan(Integer value) {
            addCriterion("board_id >", value, "boardId");
            return (Criteria) this;
        }

        public Criteria andBoardIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("board_id >=", value, "boardId");
            return (Criteria) this;
        }

        public Criteria andBoardIdLessThan(Integer value) {
            addCriterion("board_id <", value, "boardId");
            return (Criteria) this;
        }

        public Criteria andBoardIdLessThanOrEqualTo(Integer value) {
            addCriterion("board_id <=", value, "boardId");
            return (Criteria) this;
        }

        public Criteria andBoardIdIn(List<Integer> values) {
            addCriterion("board_id in", values, "boardId");
            return (Criteria) this;
        }

        public Criteria andBoardIdNotIn(List<Integer> values) {
            addCriterion("board_id not in", values, "boardId");
            return (Criteria) this;
        }

        public Criteria andBoardIdBetween(Integer value1, Integer value2) {
            addCriterion("board_id between", value1, value2, "boardId");
            return (Criteria) this;
        }

        public Criteria andBoardIdNotBetween(Integer value1, Integer value2) {
            addCriterion("board_id not between", value1, value2, "boardId");
            return (Criteria) this;
        }

        public Criteria andOrderPeopleNumberIsNull() {
            addCriterion("order_people_number is null");
            return (Criteria) this;
        }

        public Criteria andOrderPeopleNumberIsNotNull() {
            addCriterion("order_people_number is not null");
            return (Criteria) this;
        }

        public Criteria andOrderPeopleNumberEqualTo(Integer value) {
            addCriterion("order_people_number =", value, "orderPeopleNumber");
            return (Criteria) this;
        }

        public Criteria andOrderPeopleNumberNotEqualTo(Integer value) {
            addCriterion("order_people_number <>", value, "orderPeopleNumber");
            return (Criteria) this;
        }

        public Criteria andOrderPeopleNumberGreaterThan(Integer value) {
            addCriterion("order_people_number >", value, "orderPeopleNumber");
            return (Criteria) this;
        }

        public Criteria andOrderPeopleNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_people_number >=", value, "orderPeopleNumber");
            return (Criteria) this;
        }

        public Criteria andOrderPeopleNumberLessThan(Integer value) {
            addCriterion("order_people_number <", value, "orderPeopleNumber");
            return (Criteria) this;
        }

        public Criteria andOrderPeopleNumberLessThanOrEqualTo(Integer value) {
            addCriterion("order_people_number <=", value, "orderPeopleNumber");
            return (Criteria) this;
        }

        public Criteria andOrderPeopleNumberIn(List<Integer> values) {
            addCriterion("order_people_number in", values, "orderPeopleNumber");
            return (Criteria) this;
        }

        public Criteria andOrderPeopleNumberNotIn(List<Integer> values) {
            addCriterion("order_people_number not in", values, "orderPeopleNumber");
            return (Criteria) this;
        }

        public Criteria andOrderPeopleNumberBetween(Integer value1, Integer value2) {
            addCriterion("order_people_number between", value1, value2, "orderPeopleNumber");
            return (Criteria) this;
        }

        public Criteria andOrderPeopleNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("order_people_number not between", value1, value2, "orderPeopleNumber");
            return (Criteria) this;
        }

        public Criteria andOrderDateIsNull() {
            addCriterion("order_date is null");
            return (Criteria) this;
        }

        public Criteria andOrderDateIsNotNull() {
            addCriterion("order_date is not null");
            return (Criteria) this;
        }

        public Criteria andOrderDateEqualTo(Date value) {
            addCriterion("order_date =", value, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateNotEqualTo(Date value) {
            addCriterion("order_date <>", value, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateGreaterThan(Date value) {
            addCriterion("order_date >", value, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateGreaterThanOrEqualTo(Date value) {
            addCriterion("order_date >=", value, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateLessThan(Date value) {
            addCriterion("order_date <", value, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateLessThanOrEqualTo(Date value) {
            addCriterion("order_date <=", value, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateIn(List<Date> values) {
            addCriterion("order_date in", values, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateNotIn(List<Date> values) {
            addCriterion("order_date not in", values, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateBetween(Date value1, Date value2) {
            addCriterion("order_date between", value1, value2, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateNotBetween(Date value1, Date value2) {
            addCriterion("order_date not between", value1, value2, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderBoardDateIsNull() {
            addCriterion("order_board_date is null");
            return (Criteria) this;
        }

        public Criteria andOrderBoardDateIsNotNull() {
            addCriterion("order_board_date is not null");
            return (Criteria) this;
        }

        public Criteria andOrderBoardDateEqualTo(Date value) {
            addCriterionForJDBCDate("order_board_date =", value, "orderBoardDate");
            return (Criteria) this;
        }

        public Criteria andOrderBoardDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("order_board_date <>", value, "orderBoardDate");
            return (Criteria) this;
        }

        public Criteria andOrderBoardDateGreaterThan(Date value) {
            addCriterionForJDBCDate("order_board_date >", value, "orderBoardDate");
            return (Criteria) this;
        }

        public Criteria andOrderBoardDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("order_board_date >=", value, "orderBoardDate");
            return (Criteria) this;
        }

        public Criteria andOrderBoardDateLessThan(Date value) {
            addCriterionForJDBCDate("order_board_date <", value, "orderBoardDate");
            return (Criteria) this;
        }

        public Criteria andOrderBoardDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("order_board_date <=", value, "orderBoardDate");
            return (Criteria) this;
        }

        public Criteria andOrderBoardDateIn(List<Date> values) {
            addCriterionForJDBCDate("order_board_date in", values, "orderBoardDate");
            return (Criteria) this;
        }

        public Criteria andOrderBoardDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("order_board_date not in", values, "orderBoardDate");
            return (Criteria) this;
        }

        public Criteria andOrderBoardDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("order_board_date between", value1, value2, "orderBoardDate");
            return (Criteria) this;
        }

        public Criteria andOrderBoardDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("order_board_date not between", value1, value2, "orderBoardDate");
            return (Criteria) this;
        }

        public Criteria andOrderBoardTimeIntervalIsNull() {
            addCriterion("order_board_time_interval is null");
            return (Criteria) this;
        }

        public Criteria andOrderBoardTimeIntervalIsNotNull() {
            addCriterion("order_board_time_interval is not null");
            return (Criteria) this;
        }

        public Criteria andOrderBoardTimeIntervalEqualTo(String value) {
            addCriterion("order_board_time_interval =", value, "orderBoardTimeInterval");
            return (Criteria) this;
        }

        public Criteria andOrderBoardTimeIntervalNotEqualTo(String value) {
            addCriterion("order_board_time_interval <>", value, "orderBoardTimeInterval");
            return (Criteria) this;
        }

        public Criteria andOrderBoardTimeIntervalGreaterThan(String value) {
            addCriterion("order_board_time_interval >", value, "orderBoardTimeInterval");
            return (Criteria) this;
        }

        public Criteria andOrderBoardTimeIntervalGreaterThanOrEqualTo(String value) {
            addCriterion("order_board_time_interval >=", value, "orderBoardTimeInterval");
            return (Criteria) this;
        }

        public Criteria andOrderBoardTimeIntervalLessThan(String value) {
            addCriterion("order_board_time_interval <", value, "orderBoardTimeInterval");
            return (Criteria) this;
        }

        public Criteria andOrderBoardTimeIntervalLessThanOrEqualTo(String value) {
            addCriterion("order_board_time_interval <=", value, "orderBoardTimeInterval");
            return (Criteria) this;
        }

        public Criteria andOrderBoardTimeIntervalLike(String value) {
            addCriterion("order_board_time_interval like", value, "orderBoardTimeInterval");
            return (Criteria) this;
        }

        public Criteria andOrderBoardTimeIntervalNotLike(String value) {
            addCriterion("order_board_time_interval not like", value, "orderBoardTimeInterval");
            return (Criteria) this;
        }

        public Criteria andOrderBoardTimeIntervalIn(List<String> values) {
            addCriterion("order_board_time_interval in", values, "orderBoardTimeInterval");
            return (Criteria) this;
        }

        public Criteria andOrderBoardTimeIntervalNotIn(List<String> values) {
            addCriterion("order_board_time_interval not in", values, "orderBoardTimeInterval");
            return (Criteria) this;
        }

        public Criteria andOrderBoardTimeIntervalBetween(String value1, String value2) {
            addCriterion("order_board_time_interval between", value1, value2, "orderBoardTimeInterval");
            return (Criteria) this;
        }

        public Criteria andOrderBoardTimeIntervalNotBetween(String value1, String value2) {
            addCriterion("order_board_time_interval not between", value1, value2, "orderBoardTimeInterval");
            return (Criteria) this;
        }

        public Criteria andOrderTotalAmountIsNull() {
            addCriterion("order_total_amount is null");
            return (Criteria) this;
        }

        public Criteria andOrderTotalAmountIsNotNull() {
            addCriterion("order_total_amount is not null");
            return (Criteria) this;
        }

        public Criteria andOrderTotalAmountEqualTo(BigDecimal value) {
            addCriterion("order_total_amount =", value, "orderTotalAmount");
            return (Criteria) this;
        }

        public Criteria andOrderTotalAmountNotEqualTo(BigDecimal value) {
            addCriterion("order_total_amount <>", value, "orderTotalAmount");
            return (Criteria) this;
        }

        public Criteria andOrderTotalAmountGreaterThan(BigDecimal value) {
            addCriterion("order_total_amount >", value, "orderTotalAmount");
            return (Criteria) this;
        }

        public Criteria andOrderTotalAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("order_total_amount >=", value, "orderTotalAmount");
            return (Criteria) this;
        }

        public Criteria andOrderTotalAmountLessThan(BigDecimal value) {
            addCriterion("order_total_amount <", value, "orderTotalAmount");
            return (Criteria) this;
        }

        public Criteria andOrderTotalAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("order_total_amount <=", value, "orderTotalAmount");
            return (Criteria) this;
        }

        public Criteria andOrderTotalAmountIn(List<BigDecimal> values) {
            addCriterion("order_total_amount in", values, "orderTotalAmount");
            return (Criteria) this;
        }

        public Criteria andOrderTotalAmountNotIn(List<BigDecimal> values) {
            addCriterion("order_total_amount not in", values, "orderTotalAmount");
            return (Criteria) this;
        }

        public Criteria andOrderTotalAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("order_total_amount between", value1, value2, "orderTotalAmount");
            return (Criteria) this;
        }

        public Criteria andOrderTotalAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("order_total_amount not between", value1, value2, "orderTotalAmount");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIsNull() {
            addCriterion("order_status is null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIsNotNull() {
            addCriterion("order_status is not null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusEqualTo(String value) {
            addCriterion("order_status =", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotEqualTo(String value) {
            addCriterion("order_status <>", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThan(String value) {
            addCriterion("order_status >", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThanOrEqualTo(String value) {
            addCriterion("order_status >=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThan(String value) {
            addCriterion("order_status <", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThanOrEqualTo(String value) {
            addCriterion("order_status <=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLike(String value) {
            addCriterion("order_status like", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotLike(String value) {
            addCriterion("order_status not like", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIn(List<String> values) {
            addCriterion("order_status in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotIn(List<String> values) {
            addCriterion("order_status not in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusBetween(String value1, String value2) {
            addCriterion("order_status between", value1, value2, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotBetween(String value1, String value2) {
            addCriterion("order_status not between", value1, value2, "orderStatus");
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

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("user_id like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("user_id not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andCouponIdIsNull() {
            addCriterion("coupon_id is null");
            return (Criteria) this;
        }

        public Criteria andCouponIdIsNotNull() {
            addCriterion("coupon_id is not null");
            return (Criteria) this;
        }

        public Criteria andCouponIdEqualTo(String value) {
            addCriterion("coupon_id =", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdNotEqualTo(String value) {
            addCriterion("coupon_id <>", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdGreaterThan(String value) {
            addCriterion("coupon_id >", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdGreaterThanOrEqualTo(String value) {
            addCriterion("coupon_id >=", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdLessThan(String value) {
            addCriterion("coupon_id <", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdLessThanOrEqualTo(String value) {
            addCriterion("coupon_id <=", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdLike(String value) {
            addCriterion("coupon_id like", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdNotLike(String value) {
            addCriterion("coupon_id not like", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdIn(List<String> values) {
            addCriterion("coupon_id in", values, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdNotIn(List<String> values) {
            addCriterion("coupon_id not in", values, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdBetween(String value1, String value2) {
            addCriterion("coupon_id between", value1, value2, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdNotBetween(String value1, String value2) {
            addCriterion("coupon_id not between", value1, value2, "couponId");
            return (Criteria) this;
        }

        public Criteria andOrderFoodIsNull() {
            addCriterion("order_food is null");
            return (Criteria) this;
        }

        public Criteria andOrderFoodIsNotNull() {
            addCriterion("order_food is not null");
            return (Criteria) this;
        }

        public Criteria andOrderFoodEqualTo(String value) {
            addCriterion("order_food =", value, "orderFood");
            return (Criteria) this;
        }

        public Criteria andOrderFoodNotEqualTo(String value) {
            addCriterion("order_food <>", value, "orderFood");
            return (Criteria) this;
        }

        public Criteria andOrderFoodGreaterThan(String value) {
            addCriterion("order_food >", value, "orderFood");
            return (Criteria) this;
        }

        public Criteria andOrderFoodGreaterThanOrEqualTo(String value) {
            addCriterion("order_food >=", value, "orderFood");
            return (Criteria) this;
        }

        public Criteria andOrderFoodLessThan(String value) {
            addCriterion("order_food <", value, "orderFood");
            return (Criteria) this;
        }

        public Criteria andOrderFoodLessThanOrEqualTo(String value) {
            addCriterion("order_food <=", value, "orderFood");
            return (Criteria) this;
        }

        public Criteria andOrderFoodLike(String value) {
            addCriterion("order_food like", value, "orderFood");
            return (Criteria) this;
        }

        public Criteria andOrderFoodNotLike(String value) {
            addCriterion("order_food not like", value, "orderFood");
            return (Criteria) this;
        }

        public Criteria andOrderFoodIn(List<String> values) {
            addCriterion("order_food in", values, "orderFood");
            return (Criteria) this;
        }

        public Criteria andOrderFoodNotIn(List<String> values) {
            addCriterion("order_food not in", values, "orderFood");
            return (Criteria) this;
        }

        public Criteria andOrderFoodBetween(String value1, String value2) {
            addCriterion("order_food between", value1, value2, "orderFood");
            return (Criteria) this;
        }

        public Criteria andOrderFoodNotBetween(String value1, String value2) {
            addCriterion("order_food not between", value1, value2, "orderFood");
            return (Criteria) this;
        }

        public Criteria andOrderFoodNumIsNull() {
            addCriterion("order_food_num is null");
            return (Criteria) this;
        }

        public Criteria andOrderFoodNumIsNotNull() {
            addCriterion("order_food_num is not null");
            return (Criteria) this;
        }

        public Criteria andOrderFoodNumEqualTo(String value) {
            addCriterion("order_food_num =", value, "orderFoodNum");
            return (Criteria) this;
        }

        public Criteria andOrderFoodNumNotEqualTo(String value) {
            addCriterion("order_food_num <>", value, "orderFoodNum");
            return (Criteria) this;
        }

        public Criteria andOrderFoodNumGreaterThan(String value) {
            addCriterion("order_food_num >", value, "orderFoodNum");
            return (Criteria) this;
        }

        public Criteria andOrderFoodNumGreaterThanOrEqualTo(String value) {
            addCriterion("order_food_num >=", value, "orderFoodNum");
            return (Criteria) this;
        }

        public Criteria andOrderFoodNumLessThan(String value) {
            addCriterion("order_food_num <", value, "orderFoodNum");
            return (Criteria) this;
        }

        public Criteria andOrderFoodNumLessThanOrEqualTo(String value) {
            addCriterion("order_food_num <=", value, "orderFoodNum");
            return (Criteria) this;
        }

        public Criteria andOrderFoodNumLike(String value) {
            addCriterion("order_food_num like", value, "orderFoodNum");
            return (Criteria) this;
        }

        public Criteria andOrderFoodNumNotLike(String value) {
            addCriterion("order_food_num not like", value, "orderFoodNum");
            return (Criteria) this;
        }

        public Criteria andOrderFoodNumIn(List<String> values) {
            addCriterion("order_food_num in", values, "orderFoodNum");
            return (Criteria) this;
        }

        public Criteria andOrderFoodNumNotIn(List<String> values) {
            addCriterion("order_food_num not in", values, "orderFoodNum");
            return (Criteria) this;
        }

        public Criteria andOrderFoodNumBetween(String value1, String value2) {
            addCriterion("order_food_num between", value1, value2, "orderFoodNum");
            return (Criteria) this;
        }

        public Criteria andOrderFoodNumNotBetween(String value1, String value2) {
            addCriterion("order_food_num not between", value1, value2, "orderFoodNum");
            return (Criteria) this;
        }

        public Criteria andOrderDiscountAmountIsNull() {
            addCriterion("order_discount_amount is null");
            return (Criteria) this;
        }

        public Criteria andOrderDiscountAmountIsNotNull() {
            addCriterion("order_discount_amount is not null");
            return (Criteria) this;
        }

        public Criteria andOrderDiscountAmountEqualTo(BigDecimal value) {
            addCriterion("order_discount_amount =", value, "orderDiscountAmount");
            return (Criteria) this;
        }

        public Criteria andOrderDiscountAmountNotEqualTo(BigDecimal value) {
            addCriterion("order_discount_amount <>", value, "orderDiscountAmount");
            return (Criteria) this;
        }

        public Criteria andOrderDiscountAmountGreaterThan(BigDecimal value) {
            addCriterion("order_discount_amount >", value, "orderDiscountAmount");
            return (Criteria) this;
        }

        public Criteria andOrderDiscountAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("order_discount_amount >=", value, "orderDiscountAmount");
            return (Criteria) this;
        }

        public Criteria andOrderDiscountAmountLessThan(BigDecimal value) {
            addCriterion("order_discount_amount <", value, "orderDiscountAmount");
            return (Criteria) this;
        }

        public Criteria andOrderDiscountAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("order_discount_amount <=", value, "orderDiscountAmount");
            return (Criteria) this;
        }

        public Criteria andOrderDiscountAmountIn(List<BigDecimal> values) {
            addCriterion("order_discount_amount in", values, "orderDiscountAmount");
            return (Criteria) this;
        }

        public Criteria andOrderDiscountAmountNotIn(List<BigDecimal> values) {
            addCriterion("order_discount_amount not in", values, "orderDiscountAmount");
            return (Criteria) this;
        }

        public Criteria andOrderDiscountAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("order_discount_amount between", value1, value2, "orderDiscountAmount");
            return (Criteria) this;
        }

        public Criteria andOrderDiscountAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("order_discount_amount not between", value1, value2, "orderDiscountAmount");
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