package com.rainbow.tony.guice.order;

/**
 * BaseOrder
 *
 * @author tony
 * @copyright rainbow
 * @description BaseOrder
 * @date 2020-05-08
 */
public abstract class BaseOrder {
    protected Integer amount;

    public BaseOrder(Integer amount) {
        this.amount = amount;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }
}
