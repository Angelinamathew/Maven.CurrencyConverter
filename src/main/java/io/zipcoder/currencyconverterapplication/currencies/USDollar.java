package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class USDollar implements ConvertableCurrency {
    CurrencyType currencyType;
    public USDollar(){
        this.currencyType = CurrencyType.US_DOLLAR;
    }
    @Override
    public CurrencyType getCurrencyType() {
        return currencyType;
    }
}
