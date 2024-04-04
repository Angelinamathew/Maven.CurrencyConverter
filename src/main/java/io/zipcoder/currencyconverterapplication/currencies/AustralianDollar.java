package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class AustralianDollar implements ConvertableCurrency {
    CurrencyType currencyType;
    public AustralianDollar(){
        this.currencyType = CurrencyType.AUSTRALIAN_DOLLAR;
    }
    @Override
    public CurrencyType getCurrencyType() {
        return currencyType;
    }
}
