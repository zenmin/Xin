package com.xin.pojo;

import java.util.ArrayList;
import java.util.List;

public class CategoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CategoryExample() {
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

        public Criteria andParentidIsNull() {
            addCriterion("parentid is null");
            return (Criteria) this;
        }

        public Criteria andParentidIsNotNull() {
            addCriterion("parentid is not null");
            return (Criteria) this;
        }

        public Criteria andParentidEqualTo(Integer value) {
            addCriterion("parentid =", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotEqualTo(Integer value) {
            addCriterion("parentid <>", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidGreaterThan(Integer value) {
            addCriterion("parentid >", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidGreaterThanOrEqualTo(Integer value) {
            addCriterion("parentid >=", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidLessThan(Integer value) {
            addCriterion("parentid <", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidLessThanOrEqualTo(Integer value) {
            addCriterion("parentid <=", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidIn(List<Integer> values) {
            addCriterion("parentid in", values, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotIn(List<Integer> values) {
            addCriterion("parentid not in", values, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidBetween(Integer value1, Integer value2) {
            addCriterion("parentid between", value1, value2, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotBetween(Integer value1, Integer value2) {
            addCriterion("parentid not between", value1, value2, "parentid");
            return (Criteria) this;
        }

        public Criteria andHrefIsNull() {
            addCriterion("href is null");
            return (Criteria) this;
        }

        public Criteria andHrefIsNotNull() {
            addCriterion("href is not null");
            return (Criteria) this;
        }

        public Criteria andHrefEqualTo(String value) {
            addCriterion("href =", value, "href");
            return (Criteria) this;
        }

        public Criteria andHrefNotEqualTo(String value) {
            addCriterion("href <>", value, "href");
            return (Criteria) this;
        }

        public Criteria andHrefGreaterThan(String value) {
            addCriterion("href >", value, "href");
            return (Criteria) this;
        }

        public Criteria andHrefGreaterThanOrEqualTo(String value) {
            addCriterion("href >=", value, "href");
            return (Criteria) this;
        }

        public Criteria andHrefLessThan(String value) {
            addCriterion("href <", value, "href");
            return (Criteria) this;
        }

        public Criteria andHrefLessThanOrEqualTo(String value) {
            addCriterion("href <=", value, "href");
            return (Criteria) this;
        }

        public Criteria andHrefLike(String value) {
            addCriterion("href like", value, "href");
            return (Criteria) this;
        }

        public Criteria andHrefNotLike(String value) {
            addCriterion("href not like", value, "href");
            return (Criteria) this;
        }

        public Criteria andHrefIn(List<String> values) {
            addCriterion("href in", values, "href");
            return (Criteria) this;
        }

        public Criteria andHrefNotIn(List<String> values) {
            addCriterion("href not in", values, "href");
            return (Criteria) this;
        }

        public Criteria andHrefBetween(String value1, String value2) {
            addCriterion("href between", value1, value2, "href");
            return (Criteria) this;
        }

        public Criteria andHrefNotBetween(String value1, String value2) {
            addCriterion("href not between", value1, value2, "href");
            return (Criteria) this;
        }

        public Criteria andImgIsNull() {
            addCriterion("img is null");
            return (Criteria) this;
        }

        public Criteria andImgIsNotNull() {
            addCriterion("img is not null");
            return (Criteria) this;
        }

        public Criteria andImgEqualTo(String value) {
            addCriterion("img =", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgNotEqualTo(String value) {
            addCriterion("img <>", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgGreaterThan(String value) {
            addCriterion("img >", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgGreaterThanOrEqualTo(String value) {
            addCriterion("img >=", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgLessThan(String value) {
            addCriterion("img <", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgLessThanOrEqualTo(String value) {
            addCriterion("img <=", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgLike(String value) {
            addCriterion("img like", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgNotLike(String value) {
            addCriterion("img not like", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgIn(List<String> values) {
            addCriterion("img in", values, "img");
            return (Criteria) this;
        }

        public Criteria andImgNotIn(List<String> values) {
            addCriterion("img not in", values, "img");
            return (Criteria) this;
        }

        public Criteria andImgBetween(String value1, String value2) {
            addCriterion("img between", value1, value2, "img");
            return (Criteria) this;
        }

        public Criteria andImgNotBetween(String value1, String value2) {
            addCriterion("img not between", value1, value2, "img");
            return (Criteria) this;
        }

        public Criteria andContentIsNull() {
            addCriterion("content is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("content is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("content =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("content <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("content >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("content >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("content <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("content <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("content like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("content not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("content in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("content not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("content between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("content not between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andHref2IsNull() {
            addCriterion("href2 is null");
            return (Criteria) this;
        }

        public Criteria andHref2IsNotNull() {
            addCriterion("href2 is not null");
            return (Criteria) this;
        }

        public Criteria andHref2EqualTo(String value) {
            addCriterion("href2 =", value, "href2");
            return (Criteria) this;
        }

        public Criteria andHref2NotEqualTo(String value) {
            addCriterion("href2 <>", value, "href2");
            return (Criteria) this;
        }

        public Criteria andHref2GreaterThan(String value) {
            addCriterion("href2 >", value, "href2");
            return (Criteria) this;
        }

        public Criteria andHref2GreaterThanOrEqualTo(String value) {
            addCriterion("href2 >=", value, "href2");
            return (Criteria) this;
        }

        public Criteria andHref2LessThan(String value) {
            addCriterion("href2 <", value, "href2");
            return (Criteria) this;
        }

        public Criteria andHref2LessThanOrEqualTo(String value) {
            addCriterion("href2 <=", value, "href2");
            return (Criteria) this;
        }

        public Criteria andHref2Like(String value) {
            addCriterion("href2 like", value, "href2");
            return (Criteria) this;
        }

        public Criteria andHref2NotLike(String value) {
            addCriterion("href2 not like", value, "href2");
            return (Criteria) this;
        }

        public Criteria andHref2In(List<String> values) {
            addCriterion("href2 in", values, "href2");
            return (Criteria) this;
        }

        public Criteria andHref2NotIn(List<String> values) {
            addCriterion("href2 not in", values, "href2");
            return (Criteria) this;
        }

        public Criteria andHref2Between(String value1, String value2) {
            addCriterion("href2 between", value1, value2, "href2");
            return (Criteria) this;
        }

        public Criteria andHref2NotBetween(String value1, String value2) {
            addCriterion("href2 not between", value1, value2, "href2");
            return (Criteria) this;
        }

        public Criteria andHref3IsNull() {
            addCriterion("href3 is null");
            return (Criteria) this;
        }

        public Criteria andHref3IsNotNull() {
            addCriterion("href3 is not null");
            return (Criteria) this;
        }

        public Criteria andHref3EqualTo(String value) {
            addCriterion("href3 =", value, "href3");
            return (Criteria) this;
        }

        public Criteria andHref3NotEqualTo(String value) {
            addCriterion("href3 <>", value, "href3");
            return (Criteria) this;
        }

        public Criteria andHref3GreaterThan(String value) {
            addCriterion("href3 >", value, "href3");
            return (Criteria) this;
        }

        public Criteria andHref3GreaterThanOrEqualTo(String value) {
            addCriterion("href3 >=", value, "href3");
            return (Criteria) this;
        }

        public Criteria andHref3LessThan(String value) {
            addCriterion("href3 <", value, "href3");
            return (Criteria) this;
        }

        public Criteria andHref3LessThanOrEqualTo(String value) {
            addCriterion("href3 <=", value, "href3");
            return (Criteria) this;
        }

        public Criteria andHref3Like(String value) {
            addCriterion("href3 like", value, "href3");
            return (Criteria) this;
        }

        public Criteria andHref3NotLike(String value) {
            addCriterion("href3 not like", value, "href3");
            return (Criteria) this;
        }

        public Criteria andHref3In(List<String> values) {
            addCriterion("href3 in", values, "href3");
            return (Criteria) this;
        }

        public Criteria andHref3NotIn(List<String> values) {
            addCriterion("href3 not in", values, "href3");
            return (Criteria) this;
        }

        public Criteria andHref3Between(String value1, String value2) {
            addCriterion("href3 between", value1, value2, "href3");
            return (Criteria) this;
        }

        public Criteria andHref3NotBetween(String value1, String value2) {
            addCriterion("href3 not between", value1, value2, "href3");
            return (Criteria) this;
        }

        public Criteria andFooterIsNull() {
            addCriterion("footer is null");
            return (Criteria) this;
        }

        public Criteria andFooterIsNotNull() {
            addCriterion("footer is not null");
            return (Criteria) this;
        }

        public Criteria andFooterEqualTo(String value) {
            addCriterion("footer =", value, "footer");
            return (Criteria) this;
        }

        public Criteria andFooterNotEqualTo(String value) {
            addCriterion("footer <>", value, "footer");
            return (Criteria) this;
        }

        public Criteria andFooterGreaterThan(String value) {
            addCriterion("footer >", value, "footer");
            return (Criteria) this;
        }

        public Criteria andFooterGreaterThanOrEqualTo(String value) {
            addCriterion("footer >=", value, "footer");
            return (Criteria) this;
        }

        public Criteria andFooterLessThan(String value) {
            addCriterion("footer <", value, "footer");
            return (Criteria) this;
        }

        public Criteria andFooterLessThanOrEqualTo(String value) {
            addCriterion("footer <=", value, "footer");
            return (Criteria) this;
        }

        public Criteria andFooterLike(String value) {
            addCriterion("footer like", value, "footer");
            return (Criteria) this;
        }

        public Criteria andFooterNotLike(String value) {
            addCriterion("footer not like", value, "footer");
            return (Criteria) this;
        }

        public Criteria andFooterIn(List<String> values) {
            addCriterion("footer in", values, "footer");
            return (Criteria) this;
        }

        public Criteria andFooterNotIn(List<String> values) {
            addCriterion("footer not in", values, "footer");
            return (Criteria) this;
        }

        public Criteria andFooterBetween(String value1, String value2) {
            addCriterion("footer between", value1, value2, "footer");
            return (Criteria) this;
        }

        public Criteria andFooterNotBetween(String value1, String value2) {
            addCriterion("footer not between", value1, value2, "footer");
            return (Criteria) this;
        }

        public Criteria andRemakeIsNull() {
            addCriterion("remake is null");
            return (Criteria) this;
        }

        public Criteria andRemakeIsNotNull() {
            addCriterion("remake is not null");
            return (Criteria) this;
        }

        public Criteria andRemakeEqualTo(String value) {
            addCriterion("remake =", value, "remake");
            return (Criteria) this;
        }

        public Criteria andRemakeNotEqualTo(String value) {
            addCriterion("remake <>", value, "remake");
            return (Criteria) this;
        }

        public Criteria andRemakeGreaterThan(String value) {
            addCriterion("remake >", value, "remake");
            return (Criteria) this;
        }

        public Criteria andRemakeGreaterThanOrEqualTo(String value) {
            addCriterion("remake >=", value, "remake");
            return (Criteria) this;
        }

        public Criteria andRemakeLessThan(String value) {
            addCriterion("remake <", value, "remake");
            return (Criteria) this;
        }

        public Criteria andRemakeLessThanOrEqualTo(String value) {
            addCriterion("remake <=", value, "remake");
            return (Criteria) this;
        }

        public Criteria andRemakeLike(String value) {
            addCriterion("remake like", value, "remake");
            return (Criteria) this;
        }

        public Criteria andRemakeNotLike(String value) {
            addCriterion("remake not like", value, "remake");
            return (Criteria) this;
        }

        public Criteria andRemakeIn(List<String> values) {
            addCriterion("remake in", values, "remake");
            return (Criteria) this;
        }

        public Criteria andRemakeNotIn(List<String> values) {
            addCriterion("remake not in", values, "remake");
            return (Criteria) this;
        }

        public Criteria andRemakeBetween(String value1, String value2) {
            addCriterion("remake between", value1, value2, "remake");
            return (Criteria) this;
        }

        public Criteria andRemakeNotBetween(String value1, String value2) {
            addCriterion("remake not between", value1, value2, "remake");
            return (Criteria) this;
        }

        public Criteria andHref4IsNull() {
            addCriterion("href4 is null");
            return (Criteria) this;
        }

        public Criteria andHref4IsNotNull() {
            addCriterion("href4 is not null");
            return (Criteria) this;
        }

        public Criteria andHref4EqualTo(String value) {
            addCriterion("href4 =", value, "href4");
            return (Criteria) this;
        }

        public Criteria andHref4NotEqualTo(String value) {
            addCriterion("href4 <>", value, "href4");
            return (Criteria) this;
        }

        public Criteria andHref4GreaterThan(String value) {
            addCriterion("href4 >", value, "href4");
            return (Criteria) this;
        }

        public Criteria andHref4GreaterThanOrEqualTo(String value) {
            addCriterion("href4 >=", value, "href4");
            return (Criteria) this;
        }

        public Criteria andHref4LessThan(String value) {
            addCriterion("href4 <", value, "href4");
            return (Criteria) this;
        }

        public Criteria andHref4LessThanOrEqualTo(String value) {
            addCriterion("href4 <=", value, "href4");
            return (Criteria) this;
        }

        public Criteria andHref4Like(String value) {
            addCriterion("href4 like", value, "href4");
            return (Criteria) this;
        }

        public Criteria andHref4NotLike(String value) {
            addCriterion("href4 not like", value, "href4");
            return (Criteria) this;
        }

        public Criteria andHref4In(List<String> values) {
            addCriterion("href4 in", values, "href4");
            return (Criteria) this;
        }

        public Criteria andHref4NotIn(List<String> values) {
            addCriterion("href4 not in", values, "href4");
            return (Criteria) this;
        }

        public Criteria andHref4Between(String value1, String value2) {
            addCriterion("href4 between", value1, value2, "href4");
            return (Criteria) this;
        }

        public Criteria andHref4NotBetween(String value1, String value2) {
            addCriterion("href4 not between", value1, value2, "href4");
            return (Criteria) this;
        }

        public Criteria andHref5IsNull() {
            addCriterion("href5 is null");
            return (Criteria) this;
        }

        public Criteria andHref5IsNotNull() {
            addCriterion("href5 is not null");
            return (Criteria) this;
        }

        public Criteria andHref5EqualTo(String value) {
            addCriterion("href5 =", value, "href5");
            return (Criteria) this;
        }

        public Criteria andHref5NotEqualTo(String value) {
            addCriterion("href5 <>", value, "href5");
            return (Criteria) this;
        }

        public Criteria andHref5GreaterThan(String value) {
            addCriterion("href5 >", value, "href5");
            return (Criteria) this;
        }

        public Criteria andHref5GreaterThanOrEqualTo(String value) {
            addCriterion("href5 >=", value, "href5");
            return (Criteria) this;
        }

        public Criteria andHref5LessThan(String value) {
            addCriterion("href5 <", value, "href5");
            return (Criteria) this;
        }

        public Criteria andHref5LessThanOrEqualTo(String value) {
            addCriterion("href5 <=", value, "href5");
            return (Criteria) this;
        }

        public Criteria andHref5Like(String value) {
            addCriterion("href5 like", value, "href5");
            return (Criteria) this;
        }

        public Criteria andHref5NotLike(String value) {
            addCriterion("href5 not like", value, "href5");
            return (Criteria) this;
        }

        public Criteria andHref5In(List<String> values) {
            addCriterion("href5 in", values, "href5");
            return (Criteria) this;
        }

        public Criteria andHref5NotIn(List<String> values) {
            addCriterion("href5 not in", values, "href5");
            return (Criteria) this;
        }

        public Criteria andHref5Between(String value1, String value2) {
            addCriterion("href5 between", value1, value2, "href5");
            return (Criteria) this;
        }

        public Criteria andHref5NotBetween(String value1, String value2) {
            addCriterion("href5 not between", value1, value2, "href5");
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