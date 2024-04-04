package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class Rupee implements ConvertableCurrency {
    CurrencyType currencyType;
    public Rupee(){
        this.currencyType = CurrencyType.RUPEE;
    }
    @Override
    public CurrencyType getCurrencyType() {
        return currencyType;
    }
}
