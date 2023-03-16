package cn.xj.pojo;

import java.util.ArrayList;
import java.util.List;

public class ProductExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductExample() {
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

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(String value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(String value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(String value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(String value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(String value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(String value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLike(String value) {
            addCriterion("price like", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotLike(String value) {
            addCriterion("price not like", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<String> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<String> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(String value1, String value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(String value1, String value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andCollectednumIsNull() {
            addCriterion("collectedNum is null");
            return (Criteria) this;
        }

        public Criteria andCollectednumIsNotNull() {
            addCriterion("collectedNum is not null");
            return (Criteria) this;
        }

        public Criteria andCollectednumEqualTo(Integer value) {
            addCriterion("collectedNum =", value, "collectednum");
            return (Criteria) this;
        }

        public Criteria andCollectednumNotEqualTo(Integer value) {
            addCriterion("collectedNum <>", value, "collectednum");
            return (Criteria) this;
        }

        public Criteria andCollectednumGreaterThan(Integer value) {
            addCriterion("collectedNum >", value, "collectednum");
            return (Criteria) this;
        }

        public Criteria andCollectednumGreaterThanOrEqualTo(Integer value) {
            addCriterion("collectedNum >=", value, "collectednum");
            return (Criteria) this;
        }

        public Criteria andCollectednumLessThan(Integer value) {
            addCriterion("collectedNum <", value, "collectednum");
            return (Criteria) this;
        }

        public Criteria andCollectednumLessThanOrEqualTo(Integer value) {
            addCriterion("collectedNum <=", value, "collectednum");
            return (Criteria) this;
        }

        public Criteria andCollectednumIn(List<Integer> values) {
            addCriterion("collectedNum in", values, "collectednum");
            return (Criteria) this;
        }

        public Criteria andCollectednumNotIn(List<Integer> values) {
            addCriterion("collectedNum not in", values, "collectednum");
            return (Criteria) this;
        }

        public Criteria andCollectednumBetween(Integer value1, Integer value2) {
            addCriterion("collectedNum between", value1, value2, "collectednum");
            return (Criteria) this;
        }

        public Criteria andCollectednumNotBetween(Integer value1, Integer value2) {
            addCriterion("collectedNum not between", value1, value2, "collectednum");
            return (Criteria) this;
        }

        public Criteria andBuynumIsNull() {
            addCriterion("buyNum is null");
            return (Criteria) this;
        }

        public Criteria andBuynumIsNotNull() {
            addCriterion("buyNum is not null");
            return (Criteria) this;
        }

        public Criteria andBuynumEqualTo(Integer value) {
            addCriterion("buyNum =", value, "buynum");
            return (Criteria) this;
        }

        public Criteria andBuynumNotEqualTo(Integer value) {
            addCriterion("buyNum <>", value, "buynum");
            return (Criteria) this;
        }

        public Criteria andBuynumGreaterThan(Integer value) {
            addCriterion("buyNum >", value, "buynum");
            return (Criteria) this;
        }

        public Criteria andBuynumGreaterThanOrEqualTo(Integer value) {
            addCriterion("buyNum >=", value, "buynum");
            return (Criteria) this;
        }

        public Criteria andBuynumLessThan(Integer value) {
            addCriterion("buyNum <", value, "buynum");
            return (Criteria) this;
        }

        public Criteria andBuynumLessThanOrEqualTo(Integer value) {
            addCriterion("buyNum <=", value, "buynum");
            return (Criteria) this;
        }

        public Criteria andBuynumIn(List<Integer> values) {
            addCriterion("buyNum in", values, "buynum");
            return (Criteria) this;
        }

        public Criteria andBuynumNotIn(List<Integer> values) {
            addCriterion("buyNum not in", values, "buynum");
            return (Criteria) this;
        }

        public Criteria andBuynumBetween(Integer value1, Integer value2) {
            addCriterion("buyNum between", value1, value2, "buynum");
            return (Criteria) this;
        }

        public Criteria andBuynumNotBetween(Integer value1, Integer value2) {
            addCriterion("buyNum not between", value1, value2, "buynum");
            return (Criteria) this;
        }

        public Criteria andUrlIsNull() {
            addCriterion("url is null");
            return (Criteria) this;
        }

        public Criteria andUrlIsNotNull() {
            addCriterion("url is not null");
            return (Criteria) this;
        }

        public Criteria andUrlEqualTo(String value) {
            addCriterion("url =", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotEqualTo(String value) {
            addCriterion("url <>", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThan(String value) {
            addCriterion("url >", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThanOrEqualTo(String value) {
            addCriterion("url >=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThan(String value) {
            addCriterion("url <", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThanOrEqualTo(String value) {
            addCriterion("url <=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLike(String value) {
            addCriterion("url like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotLike(String value) {
            addCriterion("url not like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlIn(List<String> values) {
            addCriterion("url in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotIn(List<String> values) {
            addCriterion("url not in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlBetween(String value1, String value2) {
            addCriterion("url between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotBetween(String value1, String value2) {
            addCriterion("url not between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andStockIsNull() {
            addCriterion("stock is null");
            return (Criteria) this;
        }

        public Criteria andStockIsNotNull() {
            addCriterion("stock is not null");
            return (Criteria) this;
        }

        public Criteria andStockEqualTo(Integer value) {
            addCriterion("stock =", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockNotEqualTo(Integer value) {
            addCriterion("stock <>", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockGreaterThan(Integer value) {
            addCriterion("stock >", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockGreaterThanOrEqualTo(Integer value) {
            addCriterion("stock >=", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockLessThan(Integer value) {
            addCriterion("stock <", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockLessThanOrEqualTo(Integer value) {
            addCriterion("stock <=", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockIn(List<Integer> values) {
            addCriterion("stock in", values, "stock");
            return (Criteria) this;
        }

        public Criteria andStockNotIn(List<Integer> values) {
            addCriterion("stock not in", values, "stock");
            return (Criteria) this;
        }

        public Criteria andStockBetween(Integer value1, Integer value2) {
            addCriterion("stock between", value1, value2, "stock");
            return (Criteria) this;
        }

        public Criteria andStockNotBetween(Integer value1, Integer value2) {
            addCriterion("stock not between", value1, value2, "stock");
            return (Criteria) this;
        }

        public Criteria andPam1IsNull() {
            addCriterion("pam1 is null");
            return (Criteria) this;
        }

        public Criteria andPam1IsNotNull() {
            addCriterion("pam1 is not null");
            return (Criteria) this;
        }

        public Criteria andPam1EqualTo(String value) {
            addCriterion("pam1 =", value, "pam1");
            return (Criteria) this;
        }

        public Criteria andPam1NotEqualTo(String value) {
            addCriterion("pam1 <>", value, "pam1");
            return (Criteria) this;
        }

        public Criteria andPam1GreaterThan(String value) {
            addCriterion("pam1 >", value, "pam1");
            return (Criteria) this;
        }

        public Criteria andPam1GreaterThanOrEqualTo(String value) {
            addCriterion("pam1 >=", value, "pam1");
            return (Criteria) this;
        }

        public Criteria andPam1LessThan(String value) {
            addCriterion("pam1 <", value, "pam1");
            return (Criteria) this;
        }

        public Criteria andPam1LessThanOrEqualTo(String value) {
            addCriterion("pam1 <=", value, "pam1");
            return (Criteria) this;
        }

        public Criteria andPam1Like(String value) {
            addCriterion("pam1 like", value, "pam1");
            return (Criteria) this;
        }

        public Criteria andPam1NotLike(String value) {
            addCriterion("pam1 not like", value, "pam1");
            return (Criteria) this;
        }

        public Criteria andPam1In(List<String> values) {
            addCriterion("pam1 in", values, "pam1");
            return (Criteria) this;
        }

        public Criteria andPam1NotIn(List<String> values) {
            addCriterion("pam1 not in", values, "pam1");
            return (Criteria) this;
        }

        public Criteria andPam1Between(String value1, String value2) {
            addCriterion("pam1 between", value1, value2, "pam1");
            return (Criteria) this;
        }

        public Criteria andPam1NotBetween(String value1, String value2) {
            addCriterion("pam1 not between", value1, value2, "pam1");
            return (Criteria) this;
        }

        public Criteria andPam2IsNull() {
            addCriterion("pam2 is null");
            return (Criteria) this;
        }

        public Criteria andPam2IsNotNull() {
            addCriterion("pam2 is not null");
            return (Criteria) this;
        }

        public Criteria andPam2EqualTo(String value) {
            addCriterion("pam2 =", value, "pam2");
            return (Criteria) this;
        }

        public Criteria andPam2NotEqualTo(String value) {
            addCriterion("pam2 <>", value, "pam2");
            return (Criteria) this;
        }

        public Criteria andPam2GreaterThan(String value) {
            addCriterion("pam2 >", value, "pam2");
            return (Criteria) this;
        }

        public Criteria andPam2GreaterThanOrEqualTo(String value) {
            addCriterion("pam2 >=", value, "pam2");
            return (Criteria) this;
        }

        public Criteria andPam2LessThan(String value) {
            addCriterion("pam2 <", value, "pam2");
            return (Criteria) this;
        }

        public Criteria andPam2LessThanOrEqualTo(String value) {
            addCriterion("pam2 <=", value, "pam2");
            return (Criteria) this;
        }

        public Criteria andPam2Like(String value) {
            addCriterion("pam2 like", value, "pam2");
            return (Criteria) this;
        }

        public Criteria andPam2NotLike(String value) {
            addCriterion("pam2 not like", value, "pam2");
            return (Criteria) this;
        }

        public Criteria andPam2In(List<String> values) {
            addCriterion("pam2 in", values, "pam2");
            return (Criteria) this;
        }

        public Criteria andPam2NotIn(List<String> values) {
            addCriterion("pam2 not in", values, "pam2");
            return (Criteria) this;
        }

        public Criteria andPam2Between(String value1, String value2) {
            addCriterion("pam2 between", value1, value2, "pam2");
            return (Criteria) this;
        }

        public Criteria andPam2NotBetween(String value1, String value2) {
            addCriterion("pam2 not between", value1, value2, "pam2");
            return (Criteria) this;
        }

        public Criteria andPam3IsNull() {
            addCriterion("pam3 is null");
            return (Criteria) this;
        }

        public Criteria andPam3IsNotNull() {
            addCriterion("pam3 is not null");
            return (Criteria) this;
        }

        public Criteria andPam3EqualTo(String value) {
            addCriterion("pam3 =", value, "pam3");
            return (Criteria) this;
        }

        public Criteria andPam3NotEqualTo(String value) {
            addCriterion("pam3 <>", value, "pam3");
            return (Criteria) this;
        }

        public Criteria andPam3GreaterThan(String value) {
            addCriterion("pam3 >", value, "pam3");
            return (Criteria) this;
        }

        public Criteria andPam3GreaterThanOrEqualTo(String value) {
            addCriterion("pam3 >=", value, "pam3");
            return (Criteria) this;
        }

        public Criteria andPam3LessThan(String value) {
            addCriterion("pam3 <", value, "pam3");
            return (Criteria) this;
        }

        public Criteria andPam3LessThanOrEqualTo(String value) {
            addCriterion("pam3 <=", value, "pam3");
            return (Criteria) this;
        }

        public Criteria andPam3Like(String value) {
            addCriterion("pam3 like", value, "pam3");
            return (Criteria) this;
        }

        public Criteria andPam3NotLike(String value) {
            addCriterion("pam3 not like", value, "pam3");
            return (Criteria) this;
        }

        public Criteria andPam3In(List<String> values) {
            addCriterion("pam3 in", values, "pam3");
            return (Criteria) this;
        }

        public Criteria andPam3NotIn(List<String> values) {
            addCriterion("pam3 not in", values, "pam3");
            return (Criteria) this;
        }

        public Criteria andPam3Between(String value1, String value2) {
            addCriterion("pam3 between", value1, value2, "pam3");
            return (Criteria) this;
        }

        public Criteria andPam3NotBetween(String value1, String value2) {
            addCriterion("pam3 not between", value1, value2, "pam3");
            return (Criteria) this;
        }

        public Criteria andVal3IsNull() {
            addCriterion("val3 is null");
            return (Criteria) this;
        }

        public Criteria andVal3IsNotNull() {
            addCriterion("val3 is not null");
            return (Criteria) this;
        }

        public Criteria andVal3EqualTo(String value) {
            addCriterion("val3 =", value, "val3");
            return (Criteria) this;
        }

        public Criteria andVal3NotEqualTo(String value) {
            addCriterion("val3 <>", value, "val3");
            return (Criteria) this;
        }

        public Criteria andVal3GreaterThan(String value) {
            addCriterion("val3 >", value, "val3");
            return (Criteria) this;
        }

        public Criteria andVal3GreaterThanOrEqualTo(String value) {
            addCriterion("val3 >=", value, "val3");
            return (Criteria) this;
        }

        public Criteria andVal3LessThan(String value) {
            addCriterion("val3 <", value, "val3");
            return (Criteria) this;
        }

        public Criteria andVal3LessThanOrEqualTo(String value) {
            addCriterion("val3 <=", value, "val3");
            return (Criteria) this;
        }

        public Criteria andVal3Like(String value) {
            addCriterion("val3 like", value, "val3");
            return (Criteria) this;
        }

        public Criteria andVal3NotLike(String value) {
            addCriterion("val3 not like", value, "val3");
            return (Criteria) this;
        }

        public Criteria andVal3In(List<String> values) {
            addCriterion("val3 in", values, "val3");
            return (Criteria) this;
        }

        public Criteria andVal3NotIn(List<String> values) {
            addCriterion("val3 not in", values, "val3");
            return (Criteria) this;
        }

        public Criteria andVal3Between(String value1, String value2) {
            addCriterion("val3 between", value1, value2, "val3");
            return (Criteria) this;
        }

        public Criteria andVal3NotBetween(String value1, String value2) {
            addCriterion("val3 not between", value1, value2, "val3");
            return (Criteria) this;
        }

        public Criteria andVal2IsNull() {
            addCriterion("val2 is null");
            return (Criteria) this;
        }

        public Criteria andVal2IsNotNull() {
            addCriterion("val2 is not null");
            return (Criteria) this;
        }

        public Criteria andVal2EqualTo(String value) {
            addCriterion("val2 =", value, "val2");
            return (Criteria) this;
        }

        public Criteria andVal2NotEqualTo(String value) {
            addCriterion("val2 <>", value, "val2");
            return (Criteria) this;
        }

        public Criteria andVal2GreaterThan(String value) {
            addCriterion("val2 >", value, "val2");
            return (Criteria) this;
        }

        public Criteria andVal2GreaterThanOrEqualTo(String value) {
            addCriterion("val2 >=", value, "val2");
            return (Criteria) this;
        }

        public Criteria andVal2LessThan(String value) {
            addCriterion("val2 <", value, "val2");
            return (Criteria) this;
        }

        public Criteria andVal2LessThanOrEqualTo(String value) {
            addCriterion("val2 <=", value, "val2");
            return (Criteria) this;
        }

        public Criteria andVal2Like(String value) {
            addCriterion("val2 like", value, "val2");
            return (Criteria) this;
        }

        public Criteria andVal2NotLike(String value) {
            addCriterion("val2 not like", value, "val2");
            return (Criteria) this;
        }

        public Criteria andVal2In(List<String> values) {
            addCriterion("val2 in", values, "val2");
            return (Criteria) this;
        }

        public Criteria andVal2NotIn(List<String> values) {
            addCriterion("val2 not in", values, "val2");
            return (Criteria) this;
        }

        public Criteria andVal2Between(String value1, String value2) {
            addCriterion("val2 between", value1, value2, "val2");
            return (Criteria) this;
        }

        public Criteria andVal2NotBetween(String value1, String value2) {
            addCriterion("val2 not between", value1, value2, "val2");
            return (Criteria) this;
        }

        public Criteria andVal1IsNull() {
            addCriterion("val1 is null");
            return (Criteria) this;
        }

        public Criteria andVal1IsNotNull() {
            addCriterion("val1 is not null");
            return (Criteria) this;
        }

        public Criteria andVal1EqualTo(String value) {
            addCriterion("val1 =", value, "val1");
            return (Criteria) this;
        }

        public Criteria andVal1NotEqualTo(String value) {
            addCriterion("val1 <>", value, "val1");
            return (Criteria) this;
        }

        public Criteria andVal1GreaterThan(String value) {
            addCriterion("val1 >", value, "val1");
            return (Criteria) this;
        }

        public Criteria andVal1GreaterThanOrEqualTo(String value) {
            addCriterion("val1 >=", value, "val1");
            return (Criteria) this;
        }

        public Criteria andVal1LessThan(String value) {
            addCriterion("val1 <", value, "val1");
            return (Criteria) this;
        }

        public Criteria andVal1LessThanOrEqualTo(String value) {
            addCriterion("val1 <=", value, "val1");
            return (Criteria) this;
        }

        public Criteria andVal1Like(String value) {
            addCriterion("val1 like", value, "val1");
            return (Criteria) this;
        }

        public Criteria andVal1NotLike(String value) {
            addCriterion("val1 not like", value, "val1");
            return (Criteria) this;
        }

        public Criteria andVal1In(List<String> values) {
            addCriterion("val1 in", values, "val1");
            return (Criteria) this;
        }

        public Criteria andVal1NotIn(List<String> values) {
            addCriterion("val1 not in", values, "val1");
            return (Criteria) this;
        }

        public Criteria andVal1Between(String value1, String value2) {
            addCriterion("val1 between", value1, value2, "val1");
            return (Criteria) this;
        }

        public Criteria andVal1NotBetween(String value1, String value2) {
            addCriterion("val1 not between", value1, value2, "val1");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andDiscountIsNull() {
            addCriterion("discount is null");
            return (Criteria) this;
        }

        public Criteria andDiscountIsNotNull() {
            addCriterion("discount is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountEqualTo(Integer value) {
            addCriterion("discount =", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotEqualTo(Integer value) {
            addCriterion("discount <>", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountGreaterThan(Integer value) {
            addCriterion("discount >", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountGreaterThanOrEqualTo(Integer value) {
            addCriterion("discount >=", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountLessThan(Integer value) {
            addCriterion("discount <", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountLessThanOrEqualTo(Integer value) {
            addCriterion("discount <=", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountIn(List<Integer> values) {
            addCriterion("discount in", values, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotIn(List<Integer> values) {
            addCriterion("discount not in", values, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountBetween(Integer value1, Integer value2) {
            addCriterion("discount between", value1, value2, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotBetween(Integer value1, Integer value2) {
            addCriterion("discount not between", value1, value2, "discount");
            return (Criteria) this;
        }

        public Criteria andCategoryId1IsNull() {
            addCriterion("category_id1 is null");
            return (Criteria) this;
        }

        public Criteria andCategoryId1IsNotNull() {
            addCriterion("category_id1 is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryId1EqualTo(Integer value) {
            addCriterion("category_id1 =", value, "categoryId1");
            return (Criteria) this;
        }

        public Criteria andCategoryId1NotEqualTo(Integer value) {
            addCriterion("category_id1 <>", value, "categoryId1");
            return (Criteria) this;
        }

        public Criteria andCategoryId1GreaterThan(Integer value) {
            addCriterion("category_id1 >", value, "categoryId1");
            return (Criteria) this;
        }

        public Criteria andCategoryId1GreaterThanOrEqualTo(Integer value) {
            addCriterion("category_id1 >=", value, "categoryId1");
            return (Criteria) this;
        }

        public Criteria andCategoryId1LessThan(Integer value) {
            addCriterion("category_id1 <", value, "categoryId1");
            return (Criteria) this;
        }

        public Criteria andCategoryId1LessThanOrEqualTo(Integer value) {
            addCriterion("category_id1 <=", value, "categoryId1");
            return (Criteria) this;
        }

        public Criteria andCategoryId1In(List<Integer> values) {
            addCriterion("category_id1 in", values, "categoryId1");
            return (Criteria) this;
        }

        public Criteria andCategoryId1NotIn(List<Integer> values) {
            addCriterion("category_id1 not in", values, "categoryId1");
            return (Criteria) this;
        }

        public Criteria andCategoryId1Between(Integer value1, Integer value2) {
            addCriterion("category_id1 between", value1, value2, "categoryId1");
            return (Criteria) this;
        }

        public Criteria andCategoryId1NotBetween(Integer value1, Integer value2) {
            addCriterion("category_id1 not between", value1, value2, "categoryId1");
            return (Criteria) this;
        }

        public Criteria andCategoryId2IsNull() {
            addCriterion("category_id2 is null");
            return (Criteria) this;
        }

        public Criteria andCategoryId2IsNotNull() {
            addCriterion("category_id2 is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryId2EqualTo(Integer value) {
            addCriterion("category_id2 =", value, "categoryId2");
            return (Criteria) this;
        }

        public Criteria andCategoryId2NotEqualTo(Integer value) {
            addCriterion("category_id2 <>", value, "categoryId2");
            return (Criteria) this;
        }

        public Criteria andCategoryId2GreaterThan(Integer value) {
            addCriterion("category_id2 >", value, "categoryId2");
            return (Criteria) this;
        }

        public Criteria andCategoryId2GreaterThanOrEqualTo(Integer value) {
            addCriterion("category_id2 >=", value, "categoryId2");
            return (Criteria) this;
        }

        public Criteria andCategoryId2LessThan(Integer value) {
            addCriterion("category_id2 <", value, "categoryId2");
            return (Criteria) this;
        }

        public Criteria andCategoryId2LessThanOrEqualTo(Integer value) {
            addCriterion("category_id2 <=", value, "categoryId2");
            return (Criteria) this;
        }

        public Criteria andCategoryId2In(List<Integer> values) {
            addCriterion("category_id2 in", values, "categoryId2");
            return (Criteria) this;
        }

        public Criteria andCategoryId2NotIn(List<Integer> values) {
            addCriterion("category_id2 not in", values, "categoryId2");
            return (Criteria) this;
        }

        public Criteria andCategoryId2Between(Integer value1, Integer value2) {
            addCriterion("category_id2 between", value1, value2, "categoryId2");
            return (Criteria) this;
        }

        public Criteria andCategoryId2NotBetween(Integer value1, Integer value2) {
            addCriterion("category_id2 not between", value1, value2, "categoryId2");
            return (Criteria) this;
        }

        public Criteria andIsdeleteIsNull() {
            addCriterion("isDelete is null");
            return (Criteria) this;
        }

        public Criteria andIsdeleteIsNotNull() {
            addCriterion("isDelete is not null");
            return (Criteria) this;
        }

        public Criteria andIsdeleteEqualTo(Integer value) {
            addCriterion("isDelete =", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteNotEqualTo(Integer value) {
            addCriterion("isDelete <>", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteGreaterThan(Integer value) {
            addCriterion("isDelete >", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteGreaterThanOrEqualTo(Integer value) {
            addCriterion("isDelete >=", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteLessThan(Integer value) {
            addCriterion("isDelete <", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteLessThanOrEqualTo(Integer value) {
            addCriterion("isDelete <=", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteIn(List<Integer> values) {
            addCriterion("isDelete in", values, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteNotIn(List<Integer> values) {
            addCriterion("isDelete not in", values, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteBetween(Integer value1, Integer value2) {
            addCriterion("isDelete between", value1, value2, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteNotBetween(Integer value1, Integer value2) {
            addCriterion("isDelete not between", value1, value2, "isdelete");
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