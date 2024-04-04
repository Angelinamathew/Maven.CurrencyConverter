package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class Franc implements ConvertableCurrency {
    CurrencyType currencyType;
    public Franc(){
        this.currencyType = CurrencyType.FRANC;
    }
    @Override
    public CurrencyType getCurrencyType() {
        return currencyType;
    }
}
