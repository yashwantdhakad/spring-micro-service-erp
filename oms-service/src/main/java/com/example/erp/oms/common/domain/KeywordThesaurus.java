package com.example.erp.oms.common.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class KeywordThesaurus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String enteredKeyword;

    private String alternateKeyword;

    private String relationshipEnumId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEnteredKeyword() {
        return enteredKeyword;
    }

    public void setEnteredKeyword(String enteredKeyword) {
        this.enteredKeyword = enteredKeyword;
    }

    public String getAlternateKeyword() {
        return alternateKeyword;
    }

    public void setAlternateKeyword(String alternateKeyword) {
        this.alternateKeyword = alternateKeyword;
    }

    public String getRelationshipEnumId() {
        return relationshipEnumId;
    }

    public void setRelationshipEnumId(String relationshipEnumId) {
        this.relationshipEnumId = relationshipEnumId;
    }
}
