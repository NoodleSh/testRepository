package com.ohgiraffers.section01.xml;

public class SearchCriteria {

    private String Condition; // 검색 조건
    private String value;

    public SearchCriteria() {

    }

    public SearchCriteria(String condition, String value) {
        Condition = condition;
        this.value = value;
    }

    public String getCondition() {
        return Condition;
    }

    public void setCondition(String condition) {
        Condition = condition;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "SearchCriteria{" +
                "Condition='" + Condition + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
