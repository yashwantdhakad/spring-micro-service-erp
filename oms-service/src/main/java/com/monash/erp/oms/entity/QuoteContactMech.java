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
public class QuoteContactMech extends AuditableEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String quoteId;
    private String contactMechPurposeTypeId;
    private String contactMechId;
public void setId(Long id) {
        this.id = id;
    }
public void setQuoteId(String quoteId) {
        this.quoteId = quoteId;
    }
public void setContactMechPurposeTypeId(String contactMechPurposeTypeId) {
        this.contactMechPurposeTypeId = contactMechPurposeTypeId;
    }
public void setContactMechId(String contactMechId) {
        this.contactMechId = contactMechId;
    }

}
