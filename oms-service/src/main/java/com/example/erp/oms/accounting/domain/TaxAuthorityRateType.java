package com.example.erp.oms.accounting.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class TaxAuthorityRateType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String taxAuthorityRateTypeId;

    private String description;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTaxAuthorityRateTypeId() {
        return taxAuthorityRateTypeId;
    }

    public void setTaxAuthorityRateTypeId(String taxAuthorityRateTypeId) {
        this.taxAuthorityRateTypeId = taxAuthorityRateTypeId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
