package com.beniregev.LanguageDictationApp.commons;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ISOLanguage {
    private String name;
    private String codeIso2;
    private String codeIso3;
    private String tag;
}
