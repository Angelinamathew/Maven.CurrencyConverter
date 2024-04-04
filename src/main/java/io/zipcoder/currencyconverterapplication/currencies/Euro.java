package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class Euro implements ConvertableCurrency {
    CurrencyType currencyType;
    public Euro(){
        this.currencyType = CurrencyType.EURO;
    }
    @Override
    public CurrencyType getCurrencyType() {
        return currencyType;
    }
}
