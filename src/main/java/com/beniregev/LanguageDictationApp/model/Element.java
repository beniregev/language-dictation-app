package com.beniregev.LanguageDictationApp.model;

import javax.persistence.*;

@Entity
@Table
public class Element {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(nullable = false)
    private String inEnglish;
    @Column(nullable = false, length = 3)
    private String isoLanguage1;
    @Column(nullable = false)
    private String inLanguage1;
    @Column(nullable = false, length = 3)
    private String isoLanguage2;
    @Column(nullable = false)
    private String inLanguage2;

    public String toJson() {
        return "Element \n{ " +
                "\n\t\"id\": " + id +
                ", \n\t\"inEnglish\": \"" + inEnglish + "\"" +
                ", \n\t\"isoLanguage1\": \"" + isoLanguage1 + "\"" +
                ", \n\t\"inLanguage1\": \"" + inLanguage1 + "\"" +
                ", \n\t\"isoLanguage2\": \"" + isoLanguage2 + "\"" +
                ", \n\t\"inLanguage2\": \"" + inLanguage2 + "\"" +
                "\n}";
    }
}
