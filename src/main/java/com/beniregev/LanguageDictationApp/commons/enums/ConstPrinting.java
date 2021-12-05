package com.beniregev.LanguageDictationApp.commons.enums;

public enum ConstPrinting {
    TAB("\t"),
    NEW_LINE("\r\n"),
    ARROW_LTR("-->"),
    ARROW_RTL("<--"),
    RIGHTWARDS_ARROW("→"),
    LEFTWARDS_ARROW("←"),
    UPWARDS_ARROW("↑"),
    DOWNWARDS_ARROW("↓");

    private final String value;

    ConstPrinting(String value) {
        this.value = value;
    }
    public String getValue() {
        return this.value;
    }
}
