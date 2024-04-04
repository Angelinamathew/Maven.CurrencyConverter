package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class UniversalCurrency implements ConvertableCurrency {
    CurrencyType currencyType;
    public UniversalCurrency(){
        this.currencyType = CurrencyType.UNIVERSAL_CURRENCY;
    }
    @Override
    public CurrencyType getCurrencyType() {
        return currencyType;
    }
}
