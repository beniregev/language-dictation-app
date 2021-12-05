package com.beniregev.LanguageDictationApp.commons.enums;

public enum ConstGeneral {
    COPYRIGHTS("©"),
    RECORDING_RIGHTS("℗"),
    REGISTERED_SIGN("®"),
    TRADEMARK("™"),
    HAMBURGER_SIGN("≡");

    private final String value;

    ConstGeneral(String value) {
        this.value = value;
    }
    public String getValue() {
        return this.value;
    }
}
