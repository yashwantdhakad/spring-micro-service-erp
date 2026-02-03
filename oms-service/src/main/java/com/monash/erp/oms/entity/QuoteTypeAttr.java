package com.monash.erp.oms.entity;

import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Getter;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@Setter
@Getter
public class QuoteTypeAttr extends AuditableEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String quoteTypeId;
    private String attrName;
public void setId(Long id) {
        this.id = id;
    }
public void setQuoteTypeId(String quoteTypeId) {
        this.quoteTypeId = quoteTypeId;
    }
public void setAttrName(String attrName) {
        this.attrName = attrName;
    }

}
