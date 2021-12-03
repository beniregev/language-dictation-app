package com.beniregev.LanguageDictationApp.commons;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class InternationalizationUtil {
    private static final String[] languages = Locale.getISOLanguages();

    private void getLanguages() {
        System.out.println("Get ISO Languages: ");
        System.out.println(Constants.TAB.value + Arrays.toString(Locale.getISOLanguages()));
        System.out.println("-------------------------------------------------");
    }
    private void getLanguages1() {
        Arrays.stream(languages).forEach(language -> {
            Locale locale = new Locale(language);
            System.out.println("language: " + language +
                    "; locale: " + locale.getLanguage() +
                    " --> " + locale.getDisplayLanguage() +
                    " --> " + locale.getISO3Language() +
                    " --> " + locale.toLanguageTag());
        });
        System.out.println("-------------------------------------------------");
    }

    private Map<String, ISOLanguage> getLanguagesMap() {

        Map<String, ISOLanguage> mapIsoLanguages = new HashMap<>();
        Arrays.stream(languages).forEach(language -> {
            Locale locale = new Locale(language);
            mapIsoLanguages.put(language, new ISOLanguage(locale.getDisplayLanguage(),
                    locale.getLanguage(),
                    locale.getISO3Language(),
                    locale.toLanguageTag()));
        });
        mapIsoLanguages.forEach((k,v) -> System.out.println("key=" + k + "; " + v));
        System.out.println("-------------------------------------------------");
        return mapIsoLanguages;
    }

    private void getCategories() {
        System.out.println("Locale.Category.values(): ");
        System.out.println(Constants.TAB.value + "Array of constants: " + Arrays.toString(Locale.Category.values()));
        System.out.println("-------------------------------------------------");
    }

    //  TODO - Benny Regev - Move to tests
    public static void main(String[] args) {
        InternationalizationUtil examples = new InternationalizationUtil();
        examples.getLanguages();
        examples.getLanguages1();
        Map<String, ISOLanguage> mapIsoLanguages = examples.getLanguagesMap();
        examples.getCategories();
    }
}
