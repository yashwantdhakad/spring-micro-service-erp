package com.monash.erp.oms.accounting.entity;

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
public class TaxAuthorityAssoc {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String taxAuthGeoId;

    private String taxAuthPartyId;

    private String toTaxAuthGeoId;

    private String toTaxAuthPartyId;

    private LocalDateTime fromDate;

    private LocalDateTime thruDate;

    private String taxAuthorityAssocTypeId;
public void setId(Long id) {
        this.id = id;
    }
public void setTaxAuthGeoId(String taxAuthGeoId) {
        this.taxAuthGeoId = taxAuthGeoId;
    }
public void setTaxAuthPartyId(String taxAuthPartyId) {
        this.taxAuthPartyId = taxAuthPartyId;
    }
public void setToTaxAuthGeoId(String toTaxAuthGeoId) {
        this.toTaxAuthGeoId = toTaxAuthGeoId;
    }
public void setToTaxAuthPartyId(String toTaxAuthPartyId) {
        this.toTaxAuthPartyId = toTaxAuthPartyId;
    }
public void setFromDate(LocalDateTime fromDate) {
        this.fromDate = fromDate;
    }
public void setThruDate(LocalDateTime thruDate) {
        this.thruDate = thruDate;
    }
public void setTaxAuthorityAssocTypeId(String taxAuthorityAssocTypeId) {
        this.taxAuthorityAssocTypeId = taxAuthorityAssocTypeId;
    }
}
