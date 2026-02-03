package com.monash.erp.oms.common.entity;

import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Getter;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@NoArgsConstructor
@Setter
@Getter
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
public void setId(Long id) {
        this.id = id;
    }
public void setStandardLanguageId(String standardLanguageId) {
        this.standardLanguageId = standardLanguageId;
    }
public void setLangCode3t(String langCode3t) {
        this.langCode3t = langCode3t;
    }
public void setLangCode3b(String langCode3b) {
        this.langCode3b = langCode3b;
    }
public void setLangCode2(String langCode2) {
        this.langCode2 = langCode2;
    }
public void setLangName(String langName) {
        this.langName = langName;
    }
public void setLangFamily(String langFamily) {
        this.langFamily = langFamily;
    }
public void setLangCharset(String langCharset) {
        this.langCharset = langCharset;
    }
}
