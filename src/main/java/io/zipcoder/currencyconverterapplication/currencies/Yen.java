package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class Yen implements ConvertableCurrency {
    CurrencyType currencyType;
    public Yen(){
        this.currencyType = CurrencyType.YEN;
    }
    @Override
    public CurrencyType getCurrencyType() {
        return currencyType;
    }
}
