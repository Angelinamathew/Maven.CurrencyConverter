package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class CanadianDollar implements ConvertableCurrency {
    CurrencyType currencyType;
    public CanadianDollar(){
        this.currencyType = CurrencyType.CANADIAN_DOLLAR;
    }
    @Override
    public CurrencyType getCurrencyType() {
        return currencyType;
    }
}
