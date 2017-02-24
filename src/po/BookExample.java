package po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BookExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BookExample() {
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

        public Criteria andBookIdIsNull() {
            addCriterion("book_id is null");
            return (Criteria) this;
        }

        public Criteria andBookIdIsNotNull() {
            addCriterion("book_id is not null");
            return (Criteria) this;
        }

        public Criteria andBookIdEqualTo(String value) {
            addCriterion("book_id =", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdNotEqualTo(String value) {
            addCriterion("book_id <>", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdGreaterThan(String value) {
            addCriterion("book_id >", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdGreaterThanOrEqualTo(String value) {
            addCriterion("book_id >=", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdLessThan(String value) {
            addCriterion("book_id <", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdLessThanOrEqualTo(String value) {
            addCriterion("book_id <=", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdLike(String value) {
            addCriterion("book_id like", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdNotLike(String value) {
            addCriterion("book_id not like", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdIn(List<String> values) {
            addCriterion("book_id in", values, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdNotIn(List<String> values) {
            addCriterion("book_id not in", values, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdBetween(String value1, String value2) {
            addCriterion("book_id between", value1, value2, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdNotBetween(String value1, String value2) {
            addCriterion("book_id not between", value1, value2, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookNameIsNull() {
            addCriterion("book_name is null");
            return (Criteria) this;
        }

        public Criteria andBookNameIsNotNull() {
            addCriterion("book_name is not null");
            return (Criteria) this;
        }

        public Criteria andBookNameEqualTo(String value) {
            addCriterion("book_name =", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameNotEqualTo(String value) {
            addCriterion("book_name <>", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameGreaterThan(String value) {
            addCriterion("book_name >", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameGreaterThanOrEqualTo(String value) {
            addCriterion("book_name >=", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameLessThan(String value) {
            addCriterion("book_name <", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameLessThanOrEqualTo(String value) {
            addCriterion("book_name <=", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameLike(String value) {
            addCriterion("book_name like", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameNotLike(String value) {
            addCriterion("book_name not like", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameIn(List<String> values) {
            addCriterion("book_name in", values, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameNotIn(List<String> values) {
            addCriterion("book_name not in", values, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameBetween(String value1, String value2) {
            addCriterion("book_name between", value1, value2, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameNotBetween(String value1, String value2) {
            addCriterion("book_name not between", value1, value2, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookPicIsNull() {
            addCriterion("book_pic is null");
            return (Criteria) this;
        }

        public Criteria andBookPicIsNotNull() {
            addCriterion("book_pic is not null");
            return (Criteria) this;
        }

        public Criteria andBookPicEqualTo(String value) {
            addCriterion("book_pic =", value, "bookPic");
            return (Criteria) this;
        }

        public Criteria andBookPicNotEqualTo(String value) {
            addCriterion("book_pic <>", value, "bookPic");
            return (Criteria) this;
        }

        public Criteria andBookPicGreaterThan(String value) {
            addCriterion("book_pic >", value, "bookPic");
            return (Criteria) this;
        }

        public Criteria andBookPicGreaterThanOrEqualTo(String value) {
            addCriterion("book_pic >=", value, "bookPic");
            return (Criteria) this;
        }

        public Criteria andBookPicLessThan(String value) {
            addCriterion("book_pic <", value, "bookPic");
            return (Criteria) this;
        }

        public Criteria andBookPicLessThanOrEqualTo(String value) {
            addCriterion("book_pic <=", value, "bookPic");
            return (Criteria) this;
        }

        public Criteria andBookPicLike(String value) {
            addCriterion("book_pic like", value, "bookPic");
            return (Criteria) this;
        }

        public Criteria andBookPicNotLike(String value) {
            addCriterion("book_pic not like", value, "bookPic");
            return (Criteria) this;
        }

        public Criteria andBookPicIn(List<String> values) {
            addCriterion("book_pic in", values, "bookPic");
            return (Criteria) this;
        }

        public Criteria andBookPicNotIn(List<String> values) {
            addCriterion("book_pic not in", values, "bookPic");
            return (Criteria) this;
        }

        public Criteria andBookPicBetween(String value1, String value2) {
            addCriterion("book_pic between", value1, value2, "bookPic");
            return (Criteria) this;
        }

        public Criteria andBookPicNotBetween(String value1, String value2) {
            addCriterion("book_pic not between", value1, value2, "bookPic");
            return (Criteria) this;
        }

        public Criteria andBookTimeIsNull() {
            addCriterion("book_time is null");
            return (Criteria) this;
        }

        public Criteria andBookTimeIsNotNull() {
            addCriterion("book_time is not null");
            return (Criteria) this;
        }

        public Criteria andBookTimeEqualTo(Date value) {
            addCriterion("book_time =", value, "bookTime");
            return (Criteria) this;
        }

        public Criteria andBookTimeNotEqualTo(Date value) {
            addCriterion("book_time <>", value, "bookTime");
            return (Criteria) this;
        }

        public Criteria andBookTimeGreaterThan(Date value) {
            addCriterion("book_time >", value, "bookTime");
            return (Criteria) this;
        }

        public Criteria andBookTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("book_time >=", value, "bookTime");
            return (Criteria) this;
        }

        public Criteria andBookTimeLessThan(Date value) {
            addCriterion("book_time <", value, "bookTime");
            return (Criteria) this;
        }

        public Criteria andBookTimeLessThanOrEqualTo(Date value) {
            addCriterion("book_time <=", value, "bookTime");
            return (Criteria) this;
        }

        public Criteria andBookTimeIn(List<Date> values) {
            addCriterion("book_time in", values, "bookTime");
            return (Criteria) this;
        }

        public Criteria andBookTimeNotIn(List<Date> values) {
            addCriterion("book_time not in", values, "bookTime");
            return (Criteria) this;
        }

        public Criteria andBookTimeBetween(Date value1, Date value2) {
            addCriterion("book_time between", value1, value2, "bookTime");
            return (Criteria) this;
        }

        public Criteria andBookTimeNotBetween(Date value1, Date value2) {
            addCriterion("book_time not between", value1, value2, "bookTime");
            return (Criteria) this;
        }

        public Criteria andBookCategoryIdIsNull() {
            addCriterion("book_category_id is null");
            return (Criteria) this;
        }

        public Criteria andBookCategoryIdIsNotNull() {
            addCriterion("book_category_id is not null");
            return (Criteria) this;
        }

        public Criteria andBookCategoryIdEqualTo(String value) {
            addCriterion("book_category_id =", value, "bookCategoryId");
            return (Criteria) this;
        }

        public Criteria andBookCategoryIdNotEqualTo(String value) {
            addCriterion("book_category_id <>", value, "bookCategoryId");
            return (Criteria) this;
        }

        public Criteria andBookCategoryIdGreaterThan(String value) {
            addCriterion("book_category_id >", value, "bookCategoryId");
            return (Criteria) this;
        }

        public Criteria andBookCategoryIdGreaterThanOrEqualTo(String value) {
            addCriterion("book_category_id >=", value, "bookCategoryId");
            return (Criteria) this;
        }

        public Criteria andBookCategoryIdLessThan(String value) {
            addCriterion("book_category_id <", value, "bookCategoryId");
            return (Criteria) this;
        }

        public Criteria andBookCategoryIdLessThanOrEqualTo(String value) {
            addCriterion("book_category_id <=", value, "bookCategoryId");
            return (Criteria) this;
        }

        public Criteria andBookCategoryIdLike(String value) {
            addCriterion("book_category_id like", value, "bookCategoryId");
            return (Criteria) this;
        }

        public Criteria andBookCategoryIdNotLike(String value) {
            addCriterion("book_category_id not like", value, "bookCategoryId");
            return (Criteria) this;
        }

        public Criteria andBookCategoryIdIn(List<String> values) {
            addCriterion("book_category_id in", values, "bookCategoryId");
            return (Criteria) this;
        }

        public Criteria andBookCategoryIdNotIn(List<String> values) {
            addCriterion("book_category_id not in", values, "bookCategoryId");
            return (Criteria) this;
        }

        public Criteria andBookCategoryIdBetween(String value1, String value2) {
            addCriterion("book_category_id between", value1, value2, "bookCategoryId");
            return (Criteria) this;
        }

        public Criteria andBookCategoryIdNotBetween(String value1, String value2) {
            addCriterion("book_category_id not between", value1, value2, "bookCategoryId");
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