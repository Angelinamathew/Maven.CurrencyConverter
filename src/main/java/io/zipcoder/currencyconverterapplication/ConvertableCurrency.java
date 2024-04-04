package io.zipcoder.currencyconverterapplication;

public interface ConvertableCurrency {
    default Double convert(CurrencyType currencyType) {
        //Base
        return currencyType.getRate()/this.getCurrencyType().getRate();
    }

    CurrencyType getCurrencyType();
}
