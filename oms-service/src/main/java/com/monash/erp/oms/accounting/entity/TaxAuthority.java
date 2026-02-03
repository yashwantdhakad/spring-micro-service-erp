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
public class TaxAuthority {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String taxAuthGeoId;

    private String taxAuthPartyId;

    private Boolean requireTaxIdForExemption;

    private String taxIdFormatPattern;

    private Boolean includeTaxInPrice;
public void setId(Long id) {
        this.id = id;
    }
public void setTaxAuthGeoId(String taxAuthGeoId) {
        this.taxAuthGeoId = taxAuthGeoId;
    }
public void setTaxAuthPartyId(String taxAuthPartyId) {
        this.taxAuthPartyId = taxAuthPartyId;
    }
public void setRequireTaxIdForExemption(Boolean requireTaxIdForExemption) {
        this.requireTaxIdForExemption = requireTaxIdForExemption;
    }
public void setTaxIdFormatPattern(String taxIdFormatPattern) {
        this.taxIdFormatPattern = taxIdFormatPattern;
    }
public void setIncludeTaxInPrice(Boolean includeTaxInPrice) {
        this.includeTaxInPrice = includeTaxInPrice;
    }
}
