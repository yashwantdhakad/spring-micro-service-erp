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
public class KeywordThesaurus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String enteredKeyword;

    private String alternateKeyword;

    private String relationshipEnumId;
public void setId(Long id) {
        this.id = id;
    }
public void setEnteredKeyword(String enteredKeyword) {
        this.enteredKeyword = enteredKeyword;
    }
public void setAlternateKeyword(String alternateKeyword) {
        this.alternateKeyword = alternateKeyword;
    }
public void setRelationshipEnumId(String relationshipEnumId) {
        this.relationshipEnumId = relationshipEnumId;
    }
}
