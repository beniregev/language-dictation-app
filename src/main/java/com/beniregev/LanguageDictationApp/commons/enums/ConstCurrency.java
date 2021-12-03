package com.beniregev.LanguageDictationApp.commons.enums;

public enum ConstCurrency {
    /* Chinese Won          */  CHW("₩"),
    /* Currency Sign        */  CURRENCY_SIGN("¤"),
    /* European Euro        */  EURO("€"),
    /* Great Britain Pound  */  GBP("£"),
    /* India Rupee          */  INR("₨"),
    /* Israeli Shekel       */  ILS("₪"),
    /* Japanese Yen         */  JPY("¥");

    public final String value;

    ConstCurrency(String value) {
        this.value = value;
    }

}
