package com.rainbow.tony.guice.base;

/**
 * ChargeResult
 *
 * @author tony
 * @copyright rainbow
 * @description ChargeResult
 * @date 2020-05-08
 */
public class ChargeResult {
    /**
     * decline message
     */
    private String declineMessage;

    public boolean wasSuccessful() {
        return false;
    }

    public String getDeclineMessage() {
        return declineMessage;
    }

    public void setDeclineMessage(String declineMessage) {
        this.declineMessage = declineMessage;
    }
}
