package org.game.bean;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class GameExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GameExample() {
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

        public Criteria andGameNameIsNull() {
            addCriterion("game_name is null");
            return (Criteria) this;
        }

        public Criteria andGameNameIsNotNull() {
            addCriterion("game_name is not null");
            return (Criteria) this;
        }

        public Criteria andGameNameEqualTo(String value) {
            addCriterion("game_name =", value, "gameName");
            return (Criteria) this;
        }

        public Criteria andGameNameNotEqualTo(String value) {
            addCriterion("game_name <>", value, "gameName");
            return (Criteria) this;
        }

        public Criteria andGameNameGreaterThan(String value) {
            addCriterion("game_name >", value, "gameName");
            return (Criteria) this;
        }

        public Criteria andGameNameGreaterThanOrEqualTo(String value) {
            addCriterion("game_name >=", value, "gameName");
            return (Criteria) this;
        }

        public Criteria andGameNameLessThan(String value) {
            addCriterion("game_name <", value, "gameName");
            return (Criteria) this;
        }

        public Criteria andGameNameLessThanOrEqualTo(String value) {
            addCriterion("game_name <=", value, "gameName");
            return (Criteria) this;
        }

        public Criteria andGameNameLike(String value) {
            addCriterion("game_name like", value, "gameName");
            return (Criteria) this;
        }

        public Criteria andGameNameNotLike(String value) {
            addCriterion("game_name not like", value, "gameName");
            return (Criteria) this;
        }

        public Criteria andGameNameIn(List<String> values) {
            addCriterion("game_name in", values, "gameName");
            return (Criteria) this;
        }

        public Criteria andGameNameNotIn(List<String> values) {
            addCriterion("game_name not in", values, "gameName");
            return (Criteria) this;
        }

        public Criteria andGameNameBetween(String value1, String value2) {
            addCriterion("game_name between", value1, value2, "gameName");
            return (Criteria) this;
        }

        public Criteria andGameNameNotBetween(String value1, String value2) {
            addCriterion("game_name not between", value1, value2, "gameName");
            return (Criteria) this;
        }

        public Criteria andGameDescIsNull() {
            addCriterion("game_desc is null");
            return (Criteria) this;
        }

        public Criteria andGameDescIsNotNull() {
            addCriterion("game_desc is not null");
            return (Criteria) this;
        }

        public Criteria andGameDescEqualTo(String value) {
            addCriterion("game_desc =", value, "gameDesc");
            return (Criteria) this;
        }

        public Criteria andGameDescNotEqualTo(String value) {
            addCriterion("game_desc <>", value, "gameDesc");
            return (Criteria) this;
        }

        public Criteria andGameDescGreaterThan(String value) {
            addCriterion("game_desc >", value, "gameDesc");
            return (Criteria) this;
        }

        public Criteria andGameDescGreaterThanOrEqualTo(String value) {
            addCriterion("game_desc >=", value, "gameDesc");
            return (Criteria) this;
        }

        public Criteria andGameDescLessThan(String value) {
            addCriterion("game_desc <", value, "gameDesc");
            return (Criteria) this;
        }

        public Criteria andGameDescLessThanOrEqualTo(String value) {
            addCriterion("game_desc <=", value, "gameDesc");
            return (Criteria) this;
        }

        public Criteria andGameDescLike(String value) {
            addCriterion("game_desc like", value, "gameDesc");
            return (Criteria) this;
        }

        public Criteria andGameDescNotLike(String value) {
            addCriterion("game_desc not like", value, "gameDesc");
            return (Criteria) this;
        }

        public Criteria andGameDescIn(List<String> values) {
            addCriterion("game_desc in", values, "gameDesc");
            return (Criteria) this;
        }

        public Criteria andGameDescNotIn(List<String> values) {
            addCriterion("game_desc not in", values, "gameDesc");
            return (Criteria) this;
        }

        public Criteria andGameDescBetween(String value1, String value2) {
            addCriterion("game_desc between", value1, value2, "gameDesc");
            return (Criteria) this;
        }

        public Criteria andGameDescNotBetween(String value1, String value2) {
            addCriterion("game_desc not between", value1, value2, "gameDesc");
            return (Criteria) this;
        }

        public Criteria andGameUrlIsNull() {
            addCriterion("game_url is null");
            return (Criteria) this;
        }

        public Criteria andGameUrlIsNotNull() {
            addCriterion("game_url is not null");
            return (Criteria) this;
        }

        public Criteria andGameUrlEqualTo(Integer value) {
            addCriterion("game_url =", value, "gameUrl");
            return (Criteria) this;
        }

        public Criteria andGameUrlNotEqualTo(Integer value) {
            addCriterion("game_url <>", value, "gameUrl");
            return (Criteria) this;
        }

        public Criteria andGameUrlGreaterThan(Integer value) {
            addCriterion("game_url >", value, "gameUrl");
            return (Criteria) this;
        }

        public Criteria andGameUrlGreaterThanOrEqualTo(Integer value) {
            addCriterion("game_url >=", value, "gameUrl");
            return (Criteria) this;
        }

        public Criteria andGameUrlLessThan(Integer value) {
            addCriterion("game_url <", value, "gameUrl");
            return (Criteria) this;
        }

        public Criteria andGameUrlLessThanOrEqualTo(Integer value) {
            addCriterion("game_url <=", value, "gameUrl");
            return (Criteria) this;
        }

        public Criteria andGameUrlIn(List<Integer> values) {
            addCriterion("game_url in", values, "gameUrl");
            return (Criteria) this;
        }

        public Criteria andGameUrlNotIn(List<Integer> values) {
            addCriterion("game_url not in", values, "gameUrl");
            return (Criteria) this;
        }

        public Criteria andGameUrlBetween(Integer value1, Integer value2) {
            addCriterion("game_url between", value1, value2, "gameUrl");
            return (Criteria) this;
        }

        public Criteria andGameUrlNotBetween(Integer value1, Integer value2) {
            addCriterion("game_url not between", value1, value2, "gameUrl");
            return (Criteria) this;
        }

        public Criteria andLastTopicIsNull() {
            addCriterion("last_topic is null");
            return (Criteria) this;
        }

        public Criteria andLastTopicIsNotNull() {
            addCriterion("last_topic is not null");
            return (Criteria) this;
        }

        public Criteria andLastTopicEqualTo(Integer value) {
            addCriterion("last_topic =", value, "lastTopic");
            return (Criteria) this;
        }

        public Criteria andLastTopicNotEqualTo(Integer value) {
            addCriterion("last_topic <>", value, "lastTopic");
            return (Criteria) this;
        }

        public Criteria andLastTopicGreaterThan(Integer value) {
            addCriterion("last_topic >", value, "lastTopic");
            return (Criteria) this;
        }

        public Criteria andLastTopicGreaterThanOrEqualTo(Integer value) {
            addCriterion("last_topic >=", value, "lastTopic");
            return (Criteria) this;
        }

        public Criteria andLastTopicLessThan(Integer value) {
            addCriterion("last_topic <", value, "lastTopic");
            return (Criteria) this;
        }

        public Criteria andLastTopicLessThanOrEqualTo(Integer value) {
            addCriterion("last_topic <=", value, "lastTopic");
            return (Criteria) this;
        }

        public Criteria andLastTopicIn(List<Integer> values) {
            addCriterion("last_topic in", values, "lastTopic");
            return (Criteria) this;
        }

        public Criteria andLastTopicNotIn(List<Integer> values) {
            addCriterion("last_topic not in", values, "lastTopic");
            return (Criteria) this;
        }

        public Criteria andLastTopicBetween(Integer value1, Integer value2) {
            addCriterion("last_topic between", value1, value2, "lastTopic");
            return (Criteria) this;
        }

        public Criteria andLastTopicNotBetween(Integer value1, Integer value2) {
            addCriterion("last_topic not between", value1, value2, "lastTopic");
            return (Criteria) this;
        }

        public Criteria andGamepriceIsNull() {
            addCriterion("gamePrice is null");
            return (Criteria) this;
        }

        public Criteria andGamepriceIsNotNull() {
            addCriterion("gamePrice is not null");
            return (Criteria) this;
        }

        public Criteria andGamepriceEqualTo(BigDecimal value) {
            addCriterion("gamePrice =", value, "gameprice");
            return (Criteria) this;
        }

        public Criteria andGamepriceNotEqualTo(BigDecimal value) {
            addCriterion("gamePrice <>", value, "gameprice");
            return (Criteria) this;
        }

        public Criteria andGamepriceGreaterThan(BigDecimal value) {
            addCriterion("gamePrice >", value, "gameprice");
            return (Criteria) this;
        }

        public Criteria andGamepriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("gamePrice >=", value, "gameprice");
            return (Criteria) this;
        }

        public Criteria andGamepriceLessThan(BigDecimal value) {
            addCriterion("gamePrice <", value, "gameprice");
            return (Criteria) this;
        }

        public Criteria andGamepriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("gamePrice <=", value, "gameprice");
            return (Criteria) this;
        }

        public Criteria andGamepriceIn(List<BigDecimal> values) {
            addCriterion("gamePrice in", values, "gameprice");
            return (Criteria) this;
        }

        public Criteria andGamepriceNotIn(List<BigDecimal> values) {
            addCriterion("gamePrice not in", values, "gameprice");
            return (Criteria) this;
        }

        public Criteria andGamepriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("gamePrice between", value1, value2, "gameprice");
            return (Criteria) this;
        }

        public Criteria andGamepriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("gamePrice not between", value1, value2, "gameprice");
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