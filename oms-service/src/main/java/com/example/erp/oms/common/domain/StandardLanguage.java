package com.example.erp.oms.common.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class StandardLanguage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String standardLanguageId;

    private String langCode3t;

    private String langCode3b;

    private String langCode2;

    private String langName;

    private String langFamily;

    private String langCharset;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStandardLanguageId() {
        return standardLanguageId;
    }

    public void setStandardLanguageId(String standardLanguageId) {
        this.standardLanguageId = standardLanguageId;
    }

    public String getLangCode3t() {
        return langCode3t;
    }

    public void setLangCode3t(String langCode3t) {
        this.langCode3t = langCode3t;
    }

    public String getLangCode3b() {
        return langCode3b;
    }

    public void setLangCode3b(String langCode3b) {
        this.langCode3b = langCode3b;
    }

    public String getLangCode2() {
        return langCode2;
    }

    public void setLangCode2(String langCode2) {
        this.langCode2 = langCode2;
    }

    public String getLangName() {
        return langName;
    }

    public void setLangName(String langName) {
        this.langName = langName;
    }

    public String getLangFamily() {
        return langFamily;
    }

    public void setLangFamily(String langFamily) {
        this.langFamily = langFamily;
    }

    public String getLangCharset() {
        return langCharset;
    }

    public void setLangCharset(String langCharset) {
        this.langCharset = langCharset;
    }
}
