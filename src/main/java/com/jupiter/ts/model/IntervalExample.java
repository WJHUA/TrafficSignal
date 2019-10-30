package com.jupiter.ts.model;

import java.util.ArrayList;
import java.util.List;

public class IntervalExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ts_sd
     *
     * @mbg.generated Wed Oct 30 15:28:56 GMT+08:00 2019
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ts_sd
     *
     * @mbg.generated Wed Oct 30 15:28:56 GMT+08:00 2019
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ts_sd
     *
     * @mbg.generated Wed Oct 30 15:28:56 GMT+08:00 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ts_sd
     *
     * @mbg.generated Wed Oct 30 15:28:56 GMT+08:00 2019
     */
    public IntervalExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ts_sd
     *
     * @mbg.generated Wed Oct 30 15:28:56 GMT+08:00 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ts_sd
     *
     * @mbg.generated Wed Oct 30 15:28:56 GMT+08:00 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ts_sd
     *
     * @mbg.generated Wed Oct 30 15:28:56 GMT+08:00 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ts_sd
     *
     * @mbg.generated Wed Oct 30 15:28:56 GMT+08:00 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ts_sd
     *
     * @mbg.generated Wed Oct 30 15:28:56 GMT+08:00 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ts_sd
     *
     * @mbg.generated Wed Oct 30 15:28:56 GMT+08:00 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ts_sd
     *
     * @mbg.generated Wed Oct 30 15:28:56 GMT+08:00 2019
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ts_sd
     *
     * @mbg.generated Wed Oct 30 15:28:56 GMT+08:00 2019
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ts_sd
     *
     * @mbg.generated Wed Oct 30 15:28:56 GMT+08:00 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ts_sd
     *
     * @mbg.generated Wed Oct 30 15:28:56 GMT+08:00 2019
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table ts_sd
     *
     * @mbg.generated Wed Oct 30 15:28:56 GMT+08:00 2019
     */
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andSdStartIsNull() {
            addCriterion("sd_start is null");
            return (Criteria) this;
        }

        public Criteria andSdStartIsNotNull() {
            addCriterion("sd_start is not null");
            return (Criteria) this;
        }

        public Criteria andSdStartEqualTo(String value) {
            addCriterion("sd_start =", value, "sdStart");
            return (Criteria) this;
        }

        public Criteria andSdStartNotEqualTo(String value) {
            addCriterion("sd_start <>", value, "sdStart");
            return (Criteria) this;
        }

        public Criteria andSdStartGreaterThan(String value) {
            addCriterion("sd_start >", value, "sdStart");
            return (Criteria) this;
        }

        public Criteria andSdStartGreaterThanOrEqualTo(String value) {
            addCriterion("sd_start >=", value, "sdStart");
            return (Criteria) this;
        }

        public Criteria andSdStartLessThan(String value) {
            addCriterion("sd_start <", value, "sdStart");
            return (Criteria) this;
        }

        public Criteria andSdStartLessThanOrEqualTo(String value) {
            addCriterion("sd_start <=", value, "sdStart");
            return (Criteria) this;
        }

        public Criteria andSdStartLike(String value) {
            addCriterion("sd_start like", value, "sdStart");
            return (Criteria) this;
        }

        public Criteria andSdStartNotLike(String value) {
            addCriterion("sd_start not like", value, "sdStart");
            return (Criteria) this;
        }

        public Criteria andSdStartIn(List<String> values) {
            addCriterion("sd_start in", values, "sdStart");
            return (Criteria) this;
        }

        public Criteria andSdStartNotIn(List<String> values) {
            addCriterion("sd_start not in", values, "sdStart");
            return (Criteria) this;
        }

        public Criteria andSdStartBetween(String value1, String value2) {
            addCriterion("sd_start between", value1, value2, "sdStart");
            return (Criteria) this;
        }

        public Criteria andSdStartNotBetween(String value1, String value2) {
            addCriterion("sd_start not between", value1, value2, "sdStart");
            return (Criteria) this;
        }

        public Criteria andSdEndIsNull() {
            addCriterion("sd_end is null");
            return (Criteria) this;
        }

        public Criteria andSdEndIsNotNull() {
            addCriterion("sd_end is not null");
            return (Criteria) this;
        }

        public Criteria andSdEndEqualTo(String value) {
            addCriterion("sd_end =", value, "sdEnd");
            return (Criteria) this;
        }

        public Criteria andSdEndNotEqualTo(String value) {
            addCriterion("sd_end <>", value, "sdEnd");
            return (Criteria) this;
        }

        public Criteria andSdEndGreaterThan(String value) {
            addCriterion("sd_end >", value, "sdEnd");
            return (Criteria) this;
        }

        public Criteria andSdEndGreaterThanOrEqualTo(String value) {
            addCriterion("sd_end >=", value, "sdEnd");
            return (Criteria) this;
        }

        public Criteria andSdEndLessThan(String value) {
            addCriterion("sd_end <", value, "sdEnd");
            return (Criteria) this;
        }

        public Criteria andSdEndLessThanOrEqualTo(String value) {
            addCriterion("sd_end <=", value, "sdEnd");
            return (Criteria) this;
        }

        public Criteria andSdEndLike(String value) {
            addCriterion("sd_end like", value, "sdEnd");
            return (Criteria) this;
        }

        public Criteria andSdEndNotLike(String value) {
            addCriterion("sd_end not like", value, "sdEnd");
            return (Criteria) this;
        }

        public Criteria andSdEndIn(List<String> values) {
            addCriterion("sd_end in", values, "sdEnd");
            return (Criteria) this;
        }

        public Criteria andSdEndNotIn(List<String> values) {
            addCriterion("sd_end not in", values, "sdEnd");
            return (Criteria) this;
        }

        public Criteria andSdEndBetween(String value1, String value2) {
            addCriterion("sd_end between", value1, value2, "sdEnd");
            return (Criteria) this;
        }

        public Criteria andSdEndNotBetween(String value1, String value2) {
            addCriterion("sd_end not between", value1, value2, "sdEnd");
            return (Criteria) this;
        }

        public Criteria andSdIsIdIsNull() {
            addCriterion("sd_is_id is null");
            return (Criteria) this;
        }

        public Criteria andSdIsIdIsNotNull() {
            addCriterion("sd_is_id is not null");
            return (Criteria) this;
        }

        public Criteria andSdIsIdEqualTo(Integer value) {
            addCriterion("sd_is_id =", value, "sdIsId");
            return (Criteria) this;
        }

        public Criteria andSdIsIdNotEqualTo(Integer value) {
            addCriterion("sd_is_id <>", value, "sdIsId");
            return (Criteria) this;
        }

        public Criteria andSdIsIdGreaterThan(Integer value) {
            addCriterion("sd_is_id >", value, "sdIsId");
            return (Criteria) this;
        }

        public Criteria andSdIsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sd_is_id >=", value, "sdIsId");
            return (Criteria) this;
        }

        public Criteria andSdIsIdLessThan(Integer value) {
            addCriterion("sd_is_id <", value, "sdIsId");
            return (Criteria) this;
        }

        public Criteria andSdIsIdLessThanOrEqualTo(Integer value) {
            addCriterion("sd_is_id <=", value, "sdIsId");
            return (Criteria) this;
        }

        public Criteria andSdIsIdIn(List<Integer> values) {
            addCriterion("sd_is_id in", values, "sdIsId");
            return (Criteria) this;
        }

        public Criteria andSdIsIdNotIn(List<Integer> values) {
            addCriterion("sd_is_id not in", values, "sdIsId");
            return (Criteria) this;
        }

        public Criteria andSdIsIdBetween(Integer value1, Integer value2) {
            addCriterion("sd_is_id between", value1, value2, "sdIsId");
            return (Criteria) this;
        }

        public Criteria andSdIsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sd_is_id not between", value1, value2, "sdIsId");
            return (Criteria) this;
        }

        public Criteria andSdFaIdIsNull() {
            addCriterion("sd_fa_id is null");
            return (Criteria) this;
        }

        public Criteria andSdFaIdIsNotNull() {
            addCriterion("sd_fa_id is not null");
            return (Criteria) this;
        }

        public Criteria andSdFaIdEqualTo(Integer value) {
            addCriterion("sd_fa_id =", value, "sdFaId");
            return (Criteria) this;
        }

        public Criteria andSdFaIdNotEqualTo(Integer value) {
            addCriterion("sd_fa_id <>", value, "sdFaId");
            return (Criteria) this;
        }

        public Criteria andSdFaIdGreaterThan(Integer value) {
            addCriterion("sd_fa_id >", value, "sdFaId");
            return (Criteria) this;
        }

        public Criteria andSdFaIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sd_fa_id >=", value, "sdFaId");
            return (Criteria) this;
        }

        public Criteria andSdFaIdLessThan(Integer value) {
            addCriterion("sd_fa_id <", value, "sdFaId");
            return (Criteria) this;
        }

        public Criteria andSdFaIdLessThanOrEqualTo(Integer value) {
            addCriterion("sd_fa_id <=", value, "sdFaId");
            return (Criteria) this;
        }

        public Criteria andSdFaIdIn(List<Integer> values) {
            addCriterion("sd_fa_id in", values, "sdFaId");
            return (Criteria) this;
        }

        public Criteria andSdFaIdNotIn(List<Integer> values) {
            addCriterion("sd_fa_id not in", values, "sdFaId");
            return (Criteria) this;
        }

        public Criteria andSdFaIdBetween(Integer value1, Integer value2) {
            addCriterion("sd_fa_id between", value1, value2, "sdFaId");
            return (Criteria) this;
        }

        public Criteria andSdFaIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sd_fa_id not between", value1, value2, "sdFaId");
            return (Criteria) this;
        }

        public Criteria andSdNameIsNull() {
            addCriterion("sd_name is null");
            return (Criteria) this;
        }

        public Criteria andSdNameIsNotNull() {
            addCriterion("sd_name is not null");
            return (Criteria) this;
        }

        public Criteria andSdNameEqualTo(String value) {
            addCriterion("sd_name =", value, "sdName");
            return (Criteria) this;
        }

        public Criteria andSdNameNotEqualTo(String value) {
            addCriterion("sd_name <>", value, "sdName");
            return (Criteria) this;
        }

        public Criteria andSdNameGreaterThan(String value) {
            addCriterion("sd_name >", value, "sdName");
            return (Criteria) this;
        }

        public Criteria andSdNameGreaterThanOrEqualTo(String value) {
            addCriterion("sd_name >=", value, "sdName");
            return (Criteria) this;
        }

        public Criteria andSdNameLessThan(String value) {
            addCriterion("sd_name <", value, "sdName");
            return (Criteria) this;
        }

        public Criteria andSdNameLessThanOrEqualTo(String value) {
            addCriterion("sd_name <=", value, "sdName");
            return (Criteria) this;
        }

        public Criteria andSdNameLike(String value) {
            addCriterion("sd_name like", value, "sdName");
            return (Criteria) this;
        }

        public Criteria andSdNameNotLike(String value) {
            addCriterion("sd_name not like", value, "sdName");
            return (Criteria) this;
        }

        public Criteria andSdNameIn(List<String> values) {
            addCriterion("sd_name in", values, "sdName");
            return (Criteria) this;
        }

        public Criteria andSdNameNotIn(List<String> values) {
            addCriterion("sd_name not in", values, "sdName");
            return (Criteria) this;
        }

        public Criteria andSdNameBetween(String value1, String value2) {
            addCriterion("sd_name between", value1, value2, "sdName");
            return (Criteria) this;
        }

        public Criteria andSdNameNotBetween(String value1, String value2) {
            addCriterion("sd_name not between", value1, value2, "sdName");
            return (Criteria) this;
        }

        public Criteria andSdCreateIsNull() {
            addCriterion("sd_create is null");
            return (Criteria) this;
        }

        public Criteria andSdCreateIsNotNull() {
            addCriterion("sd_create is not null");
            return (Criteria) this;
        }

        public Criteria andSdCreateEqualTo(Long value) {
            addCriterion("sd_create =", value, "sdCreate");
            return (Criteria) this;
        }

        public Criteria andSdCreateNotEqualTo(Long value) {
            addCriterion("sd_create <>", value, "sdCreate");
            return (Criteria) this;
        }

        public Criteria andSdCreateGreaterThan(Long value) {
            addCriterion("sd_create >", value, "sdCreate");
            return (Criteria) this;
        }

        public Criteria andSdCreateGreaterThanOrEqualTo(Long value) {
            addCriterion("sd_create >=", value, "sdCreate");
            return (Criteria) this;
        }

        public Criteria andSdCreateLessThan(Long value) {
            addCriterion("sd_create <", value, "sdCreate");
            return (Criteria) this;
        }

        public Criteria andSdCreateLessThanOrEqualTo(Long value) {
            addCriterion("sd_create <=", value, "sdCreate");
            return (Criteria) this;
        }

        public Criteria andSdCreateIn(List<Long> values) {
            addCriterion("sd_create in", values, "sdCreate");
            return (Criteria) this;
        }

        public Criteria andSdCreateNotIn(List<Long> values) {
            addCriterion("sd_create not in", values, "sdCreate");
            return (Criteria) this;
        }

        public Criteria andSdCreateBetween(Long value1, Long value2) {
            addCriterion("sd_create between", value1, value2, "sdCreate");
            return (Criteria) this;
        }

        public Criteria andSdCreateNotBetween(Long value1, Long value2) {
            addCriterion("sd_create not between", value1, value2, "sdCreate");
            return (Criteria) this;
        }

        public Criteria andSdModifiedIsNull() {
            addCriterion("sd_modified is null");
            return (Criteria) this;
        }

        public Criteria andSdModifiedIsNotNull() {
            addCriterion("sd_modified is not null");
            return (Criteria) this;
        }

        public Criteria andSdModifiedEqualTo(Long value) {
            addCriterion("sd_modified =", value, "sdModified");
            return (Criteria) this;
        }

        public Criteria andSdModifiedNotEqualTo(Long value) {
            addCriterion("sd_modified <>", value, "sdModified");
            return (Criteria) this;
        }

        public Criteria andSdModifiedGreaterThan(Long value) {
            addCriterion("sd_modified >", value, "sdModified");
            return (Criteria) this;
        }

        public Criteria andSdModifiedGreaterThanOrEqualTo(Long value) {
            addCriterion("sd_modified >=", value, "sdModified");
            return (Criteria) this;
        }

        public Criteria andSdModifiedLessThan(Long value) {
            addCriterion("sd_modified <", value, "sdModified");
            return (Criteria) this;
        }

        public Criteria andSdModifiedLessThanOrEqualTo(Long value) {
            addCriterion("sd_modified <=", value, "sdModified");
            return (Criteria) this;
        }

        public Criteria andSdModifiedIn(List<Long> values) {
            addCriterion("sd_modified in", values, "sdModified");
            return (Criteria) this;
        }

        public Criteria andSdModifiedNotIn(List<Long> values) {
            addCriterion("sd_modified not in", values, "sdModified");
            return (Criteria) this;
        }

        public Criteria andSdModifiedBetween(Long value1, Long value2) {
            addCriterion("sd_modified between", value1, value2, "sdModified");
            return (Criteria) this;
        }

        public Criteria andSdModifiedNotBetween(Long value1, Long value2) {
            addCriterion("sd_modified not between", value1, value2, "sdModified");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table ts_sd
     *
     * @mbg.generated do_not_delete_during_merge Wed Oct 30 15:28:56 GMT+08:00 2019
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table ts_sd
     *
     * @mbg.generated Wed Oct 30 15:28:56 GMT+08:00 2019
     */
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