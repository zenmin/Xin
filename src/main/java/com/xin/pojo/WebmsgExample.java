package com.xin.pojo;

import java.util.ArrayList;
import java.util.List;

public class WebmsgExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WebmsgExample() {
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

        public Criteria andWebggIsNull() {
            addCriterion("webgg is null");
            return (Criteria) this;
        }

        public Criteria andWebggIsNotNull() {
            addCriterion("webgg is not null");
            return (Criteria) this;
        }

        public Criteria andWebggEqualTo(String value) {
            addCriterion("webgg =", value, "webgg");
            return (Criteria) this;
        }

        public Criteria andWebggNotEqualTo(String value) {
            addCriterion("webgg <>", value, "webgg");
            return (Criteria) this;
        }

        public Criteria andWebggGreaterThan(String value) {
            addCriterion("webgg >", value, "webgg");
            return (Criteria) this;
        }

        public Criteria andWebggGreaterThanOrEqualTo(String value) {
            addCriterion("webgg >=", value, "webgg");
            return (Criteria) this;
        }

        public Criteria andWebggLessThan(String value) {
            addCriterion("webgg <", value, "webgg");
            return (Criteria) this;
        }

        public Criteria andWebggLessThanOrEqualTo(String value) {
            addCriterion("webgg <=", value, "webgg");
            return (Criteria) this;
        }

        public Criteria andWebggLike(String value) {
            addCriterion("webgg like", value, "webgg");
            return (Criteria) this;
        }

        public Criteria andWebggNotLike(String value) {
            addCriterion("webgg not like", value, "webgg");
            return (Criteria) this;
        }

        public Criteria andWebggIn(List<String> values) {
            addCriterion("webgg in", values, "webgg");
            return (Criteria) this;
        }

        public Criteria andWebggNotIn(List<String> values) {
            addCriterion("webgg not in", values, "webgg");
            return (Criteria) this;
        }

        public Criteria andWebggBetween(String value1, String value2) {
            addCriterion("webgg between", value1, value2, "webgg");
            return (Criteria) this;
        }

        public Criteria andWebggNotBetween(String value1, String value2) {
            addCriterion("webgg not between", value1, value2, "webgg");
            return (Criteria) this;
        }

        public Criteria andWxIsNull() {
            addCriterion("wx is null");
            return (Criteria) this;
        }

        public Criteria andWxIsNotNull() {
            addCriterion("wx is not null");
            return (Criteria) this;
        }

        public Criteria andWxEqualTo(String value) {
            addCriterion("wx =", value, "wx");
            return (Criteria) this;
        }

        public Criteria andWxNotEqualTo(String value) {
            addCriterion("wx <>", value, "wx");
            return (Criteria) this;
        }

        public Criteria andWxGreaterThan(String value) {
            addCriterion("wx >", value, "wx");
            return (Criteria) this;
        }

        public Criteria andWxGreaterThanOrEqualTo(String value) {
            addCriterion("wx >=", value, "wx");
            return (Criteria) this;
        }

        public Criteria andWxLessThan(String value) {
            addCriterion("wx <", value, "wx");
            return (Criteria) this;
        }

        public Criteria andWxLessThanOrEqualTo(String value) {
            addCriterion("wx <=", value, "wx");
            return (Criteria) this;
        }

        public Criteria andWxLike(String value) {
            addCriterion("wx like", value, "wx");
            return (Criteria) this;
        }

        public Criteria andWxNotLike(String value) {
            addCriterion("wx not like", value, "wx");
            return (Criteria) this;
        }

        public Criteria andWxIn(List<String> values) {
            addCriterion("wx in", values, "wx");
            return (Criteria) this;
        }

        public Criteria andWxNotIn(List<String> values) {
            addCriterion("wx not in", values, "wx");
            return (Criteria) this;
        }

        public Criteria andWxBetween(String value1, String value2) {
            addCriterion("wx between", value1, value2, "wx");
            return (Criteria) this;
        }

        public Criteria andWxNotBetween(String value1, String value2) {
            addCriterion("wx not between", value1, value2, "wx");
            return (Criteria) this;
        }

        public Criteria andQqIsNull() {
            addCriterion("qq is null");
            return (Criteria) this;
        }

        public Criteria andQqIsNotNull() {
            addCriterion("qq is not null");
            return (Criteria) this;
        }

        public Criteria andQqEqualTo(String value) {
            addCriterion("qq =", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotEqualTo(String value) {
            addCriterion("qq <>", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqGreaterThan(String value) {
            addCriterion("qq >", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqGreaterThanOrEqualTo(String value) {
            addCriterion("qq >=", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLessThan(String value) {
            addCriterion("qq <", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLessThanOrEqualTo(String value) {
            addCriterion("qq <=", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLike(String value) {
            addCriterion("qq like", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotLike(String value) {
            addCriterion("qq not like", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqIn(List<String> values) {
            addCriterion("qq in", values, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotIn(List<String> values) {
            addCriterion("qq not in", values, "qq");
            return (Criteria) this;
        }

        public Criteria andQqBetween(String value1, String value2) {
            addCriterion("qq between", value1, value2, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotBetween(String value1, String value2) {
            addCriterion("qq not between", value1, value2, "qq");
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

        public Criteria andFooter2IsNull() {
            addCriterion("footer2 is null");
            return (Criteria) this;
        }

        public Criteria andFooter2IsNotNull() {
            addCriterion("footer2 is not null");
            return (Criteria) this;
        }

        public Criteria andFooter2EqualTo(String value) {
            addCriterion("footer2 =", value, "footer2");
            return (Criteria) this;
        }

        public Criteria andFooter2NotEqualTo(String value) {
            addCriterion("footer2 <>", value, "footer2");
            return (Criteria) this;
        }

        public Criteria andFooter2GreaterThan(String value) {
            addCriterion("footer2 >", value, "footer2");
            return (Criteria) this;
        }

        public Criteria andFooter2GreaterThanOrEqualTo(String value) {
            addCriterion("footer2 >=", value, "footer2");
            return (Criteria) this;
        }

        public Criteria andFooter2LessThan(String value) {
            addCriterion("footer2 <", value, "footer2");
            return (Criteria) this;
        }

        public Criteria andFooter2LessThanOrEqualTo(String value) {
            addCriterion("footer2 <=", value, "footer2");
            return (Criteria) this;
        }

        public Criteria andFooter2Like(String value) {
            addCriterion("footer2 like", value, "footer2");
            return (Criteria) this;
        }

        public Criteria andFooter2NotLike(String value) {
            addCriterion("footer2 not like", value, "footer2");
            return (Criteria) this;
        }

        public Criteria andFooter2In(List<String> values) {
            addCriterion("footer2 in", values, "footer2");
            return (Criteria) this;
        }

        public Criteria andFooter2NotIn(List<String> values) {
            addCriterion("footer2 not in", values, "footer2");
            return (Criteria) this;
        }

        public Criteria andFooter2Between(String value1, String value2) {
            addCriterion("footer2 between", value1, value2, "footer2");
            return (Criteria) this;
        }

        public Criteria andFooter2NotBetween(String value1, String value2) {
            addCriterion("footer2 not between", value1, value2, "footer2");
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

        public Criteria andTopIsNull() {
            addCriterion("top is null");
            return (Criteria) this;
        }

        public Criteria andTopIsNotNull() {
            addCriterion("top is not null");
            return (Criteria) this;
        }

        public Criteria andTopEqualTo(String value) {
            addCriterion("top =", value, "top");
            return (Criteria) this;
        }

        public Criteria andTopNotEqualTo(String value) {
            addCriterion("top <>", value, "top");
            return (Criteria) this;
        }

        public Criteria andTopGreaterThan(String value) {
            addCriterion("top >", value, "top");
            return (Criteria) this;
        }

        public Criteria andTopGreaterThanOrEqualTo(String value) {
            addCriterion("top >=", value, "top");
            return (Criteria) this;
        }

        public Criteria andTopLessThan(String value) {
            addCriterion("top <", value, "top");
            return (Criteria) this;
        }

        public Criteria andTopLessThanOrEqualTo(String value) {
            addCriterion("top <=", value, "top");
            return (Criteria) this;
        }

        public Criteria andTopLike(String value) {
            addCriterion("top like", value, "top");
            return (Criteria) this;
        }

        public Criteria andTopNotLike(String value) {
            addCriterion("top not like", value, "top");
            return (Criteria) this;
        }

        public Criteria andTopIn(List<String> values) {
            addCriterion("top in", values, "top");
            return (Criteria) this;
        }

        public Criteria andTopNotIn(List<String> values) {
            addCriterion("top not in", values, "top");
            return (Criteria) this;
        }

        public Criteria andTopBetween(String value1, String value2) {
            addCriterion("top between", value1, value2, "top");
            return (Criteria) this;
        }

        public Criteria andTopNotBetween(String value1, String value2) {
            addCriterion("top not between", value1, value2, "top");
            return (Criteria) this;
        }

        public Criteria andJhmhrefIsNull() {
            addCriterion("jhmhref is null");
            return (Criteria) this;
        }

        public Criteria andJhmhrefIsNotNull() {
            addCriterion("jhmhref is not null");
            return (Criteria) this;
        }

        public Criteria andJhmhrefEqualTo(String value) {
            addCriterion("jhmhref =", value, "jhmhref");
            return (Criteria) this;
        }

        public Criteria andJhmhrefNotEqualTo(String value) {
            addCriterion("jhmhref <>", value, "jhmhref");
            return (Criteria) this;
        }

        public Criteria andJhmhrefGreaterThan(String value) {
            addCriterion("jhmhref >", value, "jhmhref");
            return (Criteria) this;
        }

        public Criteria andJhmhrefGreaterThanOrEqualTo(String value) {
            addCriterion("jhmhref >=", value, "jhmhref");
            return (Criteria) this;
        }

        public Criteria andJhmhrefLessThan(String value) {
            addCriterion("jhmhref <", value, "jhmhref");
            return (Criteria) this;
        }

        public Criteria andJhmhrefLessThanOrEqualTo(String value) {
            addCriterion("jhmhref <=", value, "jhmhref");
            return (Criteria) this;
        }

        public Criteria andJhmhrefLike(String value) {
            addCriterion("jhmhref like", value, "jhmhref");
            return (Criteria) this;
        }

        public Criteria andJhmhrefNotLike(String value) {
            addCriterion("jhmhref not like", value, "jhmhref");
            return (Criteria) this;
        }

        public Criteria andJhmhrefIn(List<String> values) {
            addCriterion("jhmhref in", values, "jhmhref");
            return (Criteria) this;
        }

        public Criteria andJhmhrefNotIn(List<String> values) {
            addCriterion("jhmhref not in", values, "jhmhref");
            return (Criteria) this;
        }

        public Criteria andJhmhrefBetween(String value1, String value2) {
            addCriterion("jhmhref between", value1, value2, "jhmhref");
            return (Criteria) this;
        }

        public Criteria andJhmhrefNotBetween(String value1, String value2) {
            addCriterion("jhmhref not between", value1, value2, "jhmhref");
            return (Criteria) this;
        }

        public Criteria andVipIsNull() {
            addCriterion("vip is null");
            return (Criteria) this;
        }

        public Criteria andVipIsNotNull() {
            addCriterion("vip is not null");
            return (Criteria) this;
        }

        public Criteria andVipEqualTo(String value) {
            addCriterion("vip =", value, "vip");
            return (Criteria) this;
        }

        public Criteria andVipNotEqualTo(String value) {
            addCriterion("vip <>", value, "vip");
            return (Criteria) this;
        }

        public Criteria andVipGreaterThan(String value) {
            addCriterion("vip >", value, "vip");
            return (Criteria) this;
        }

        public Criteria andVipGreaterThanOrEqualTo(String value) {
            addCriterion("vip >=", value, "vip");
            return (Criteria) this;
        }

        public Criteria andVipLessThan(String value) {
            addCriterion("vip <", value, "vip");
            return (Criteria) this;
        }

        public Criteria andVipLessThanOrEqualTo(String value) {
            addCriterion("vip <=", value, "vip");
            return (Criteria) this;
        }

        public Criteria andVipLike(String value) {
            addCriterion("vip like", value, "vip");
            return (Criteria) this;
        }

        public Criteria andVipNotLike(String value) {
            addCriterion("vip not like", value, "vip");
            return (Criteria) this;
        }

        public Criteria andVipIn(List<String> values) {
            addCriterion("vip in", values, "vip");
            return (Criteria) this;
        }

        public Criteria andVipNotIn(List<String> values) {
            addCriterion("vip not in", values, "vip");
            return (Criteria) this;
        }

        public Criteria andVipBetween(String value1, String value2) {
            addCriterion("vip between", value1, value2, "vip");
            return (Criteria) this;
        }

        public Criteria andVipNotBetween(String value1, String value2) {
            addCriterion("vip not between", value1, value2, "vip");
            return (Criteria) this;
        }

        public Criteria andViphrefIsNull() {
            addCriterion("viphref is null");
            return (Criteria) this;
        }

        public Criteria andViphrefIsNotNull() {
            addCriterion("viphref is not null");
            return (Criteria) this;
        }

        public Criteria andViphrefEqualTo(String value) {
            addCriterion("viphref =", value, "viphref");
            return (Criteria) this;
        }

        public Criteria andViphrefNotEqualTo(String value) {
            addCriterion("viphref <>", value, "viphref");
            return (Criteria) this;
        }

        public Criteria andViphrefGreaterThan(String value) {
            addCriterion("viphref >", value, "viphref");
            return (Criteria) this;
        }

        public Criteria andViphrefGreaterThanOrEqualTo(String value) {
            addCriterion("viphref >=", value, "viphref");
            return (Criteria) this;
        }

        public Criteria andViphrefLessThan(String value) {
            addCriterion("viphref <", value, "viphref");
            return (Criteria) this;
        }

        public Criteria andViphrefLessThanOrEqualTo(String value) {
            addCriterion("viphref <=", value, "viphref");
            return (Criteria) this;
        }

        public Criteria andViphrefLike(String value) {
            addCriterion("viphref like", value, "viphref");
            return (Criteria) this;
        }

        public Criteria andViphrefNotLike(String value) {
            addCriterion("viphref not like", value, "viphref");
            return (Criteria) this;
        }

        public Criteria andViphrefIn(List<String> values) {
            addCriterion("viphref in", values, "viphref");
            return (Criteria) this;
        }

        public Criteria andViphrefNotIn(List<String> values) {
            addCriterion("viphref not in", values, "viphref");
            return (Criteria) this;
        }

        public Criteria andViphrefBetween(String value1, String value2) {
            addCriterion("viphref between", value1, value2, "viphref");
            return (Criteria) this;
        }

        public Criteria andViphrefNotBetween(String value1, String value2) {
            addCriterion("viphref not between", value1, value2, "viphref");
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