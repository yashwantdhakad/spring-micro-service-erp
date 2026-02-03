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
public class GlAccount {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String glAccountId;

    private String glAccountTypeId;

    private String glAccountClassId;

    private String glResourceTypeId;

    private String glXbrlClassId;

    private String parentGlAccountId;

    private String accountCode;

    private String accountName;

    private String description;

    private String productId;

    private String externalId;
public void setId(Long id) {
        this.id = id;
    }
public void setGlAccountId(String glAccountId) {
        this.glAccountId = glAccountId;
    }
public void setGlAccountTypeId(String glAccountTypeId) {
        this.glAccountTypeId = glAccountTypeId;
    }
public void setGlAccountClassId(String glAccountClassId) {
        this.glAccountClassId = glAccountClassId;
    }
public void setGlResourceTypeId(String glResourceTypeId) {
        this.glResourceTypeId = glResourceTypeId;
    }
public void setGlXbrlClassId(String glXbrlClassId) {
        this.glXbrlClassId = glXbrlClassId;
    }
public void setParentGlAccountId(String parentGlAccountId) {
        this.parentGlAccountId = parentGlAccountId;
    }
public void setAccountCode(String accountCode) {
        this.accountCode = accountCode;
    }
public void setAccountName(String accountName) {
        this.accountName = accountName;
    }
public void setDescription(String description) {
        this.description = description;
    }
public void setProductId(String productId) {
        this.productId = productId;
    }
public void setExternalId(String externalId) {
        this.externalId = externalId;
    }
}
