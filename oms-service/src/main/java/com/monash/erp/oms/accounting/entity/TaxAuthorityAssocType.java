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
public class TaxAuthorityAssocType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String taxAuthorityAssocTypeId;

    private String description;
public void setId(Long id) {
        this.id = id;
    }
public void setTaxAuthorityAssocTypeId(String taxAuthorityAssocTypeId) {
        this.taxAuthorityAssocTypeId = taxAuthorityAssocTypeId;
    }
public void setDescription(String description) {
        this.description = description;
    }
}
