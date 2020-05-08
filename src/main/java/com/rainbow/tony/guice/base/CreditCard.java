package com.rainbow.tony.guice.base;

/**
 * CreditCard
 *
 * @author tony
 * @copyright rainbow
 * @description CreditCard
 * @date 2020-05-08
 */
public class CreditCard {
    private String id;
    private Integer month;
    private Integer year;

    public CreditCard(String id, Integer month, Integer year) {
        this.id = id;
        this.month = month;
        this.year = year;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getMonth() {
        return month;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }
}
