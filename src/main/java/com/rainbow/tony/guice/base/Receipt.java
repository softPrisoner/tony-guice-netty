package com.rainbow.tony.guice.base;

/**
 * Receipt
 *
 * @author tony
 * @copyright rainbow
 * @description Receipt
 * @date 2020-05-08
 */
public class Receipt {
    private int amountOfCharge;
    private boolean success;

    public static Receipt forSuccessfulCharge(Integer amount) {
        return null;
    }

    public static Receipt forDeclinedCharge(String message) {
        return null;
    }

    public static Receipt forSystemFailure(String message) {
        return null;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public boolean hasSuccessfulCharge() {
        return success;
    }


    public void setAmountOfCharge(int amountOfCharge) {
        this.amountOfCharge = amountOfCharge;
    }

    public int getAmountOfCharge() {
        return amountOfCharge;
    }
}
