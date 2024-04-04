package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class ChineseYR implements ConvertableCurrency {
    CurrencyType currencyType;
    public ChineseYR(){
        this.currencyType = CurrencyType.CHINESE_YR;
    }
    @Override
    public CurrencyType getCurrencyType() {
        return currencyType;
    }
}
