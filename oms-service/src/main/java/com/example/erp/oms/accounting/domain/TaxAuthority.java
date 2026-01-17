package com.example.erp.oms.accounting.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class TaxAuthority {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String taxAuthGeoId;

    private String taxAuthPartyId;

    private Boolean requireTaxIdForExemption;

    private String taxIdFormatPattern;

    private Boolean includeTaxInPrice;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTaxAuthGeoId() {
        return taxAuthGeoId;
    }

    public void setTaxAuthGeoId(String taxAuthGeoId) {
        this.taxAuthGeoId = taxAuthGeoId;
    }

    public String getTaxAuthPartyId() {
        return taxAuthPartyId;
    }

    public void setTaxAuthPartyId(String taxAuthPartyId) {
        this.taxAuthPartyId = taxAuthPartyId;
    }

    public Boolean getRequireTaxIdForExemption() {
        return requireTaxIdForExemption;
    }

    public void setRequireTaxIdForExemption(Boolean requireTaxIdForExemption) {
        this.requireTaxIdForExemption = requireTaxIdForExemption;
    }

    public String getTaxIdFormatPattern() {
        return taxIdFormatPattern;
    }

    public void setTaxIdFormatPattern(String taxIdFormatPattern) {
        this.taxIdFormatPattern = taxIdFormatPattern;
    }

    public Boolean getIncludeTaxInPrice() {
        return includeTaxInPrice;
    }

    public void setIncludeTaxInPrice(Boolean includeTaxInPrice) {
        this.includeTaxInPrice = includeTaxInPrice;
    }
}
