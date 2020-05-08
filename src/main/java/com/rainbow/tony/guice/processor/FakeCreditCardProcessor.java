package com.rainbow.tony.guice.processor;

import com.rainbow.tony.guice.base.ChargeResult;
import com.rainbow.tony.guice.base.CreditCard;

/**
 * @author tony
 * @copyright rainbow
 * @description FakeCreditCardProcessor
 * @date 2020-05-08
 */
public class FakeCreditCardProcessor implements CreditCardProcessor {
    private CreditCardProcessor cardOfOnlyCharge;
    private int amountOfOnlyCharge;

    @Override
    public ChargeResult charge(CreditCard creditCard, Integer amount) {
        return null;
    }

    public void setCardOfOnlyCharge(CreditCardProcessor cardOfOnlyCharge) {
        this.cardOfOnlyCharge = cardOfOnlyCharge;
    }

    public CreditCardProcessor getCardOfOnlyCharge() {
        return cardOfOnlyCharge;
    }

    public void setAmountOfOnlyCharge(int amountOfOnlyCharge) {
        this.amountOfOnlyCharge = amountOfOnlyCharge;
    }

    public int getAmountOfOnlyCharge() {
        return amountOfOnlyCharge;
    }
}
