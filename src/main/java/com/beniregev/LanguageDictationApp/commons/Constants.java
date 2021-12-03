package com.beniregev.LanguageDictationApp.commons;

public enum Constants {
    TAB("\t"),
    NEW_LINE("\r\n"),
    ARROW_LTR("-->"),
    ARROW_RTL("<--"),
    RIGHTWARDS_ARROW("→"),
    LEFTWARDS_ARROW("←"),
    UPWARDS_ARROW("↑"),
    DOWNWARDS_ARROW("↓"),
    COPYRIGHTS("©"),
    RECORDING_RIGHTS("℗"),
    REGISTERED_SIGN("®"),
    TRADEMARK("™"),
    HAMBURGER_SIGN("≡"),
    /* Chinese Won          */  CHW("₩"),
    /* Currency Sign        */  CURRENCY_SIGN("¤"),
    /* European Euro        */  EURO("€"),
    /* Great Britain Pound  */  GBP("£"),
    /* India Rupee          */  INR("₨"),
    /* Israeli Shekel       */  ILS("₪"),
    /* Japanese Yen         */  JPY("¥");

    public final String value;

    Constants(String value) {
        this.value = value;
    }

}
