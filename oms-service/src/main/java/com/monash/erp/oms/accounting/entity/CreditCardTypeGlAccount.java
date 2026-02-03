package com.monash.erp.oms.accounting.entity;

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
public class CreditCardTypeGlAccount {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String cardType;

    private String organizationPartyId;

    private String glAccountId;
public void setId(Long id) {
        this.id = id;
    }
public void setCardType(String cardType) {
        this.cardType = cardType;
    }
public void setOrganizationPartyId(String organizationPartyId) {
        this.organizationPartyId = organizationPartyId;
    }
public void setGlAccountId(String glAccountId) {
        this.glAccountId = glAccountId;
    }
}
