package com.example.erp.oms.accounting.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity
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

    public String getToTaxAuthGeoId() {
        return toTaxAuthGeoId;
    }

    public void setToTaxAuthGeoId(String toTaxAuthGeoId) {
        this.toTaxAuthGeoId = toTaxAuthGeoId;
    }

    public String getToTaxAuthPartyId() {
        return toTaxAuthPartyId;
    }

    public void setToTaxAuthPartyId(String toTaxAuthPartyId) {
        this.toTaxAuthPartyId = toTaxAuthPartyId;
    }

    public LocalDateTime getFromDate() {
        return fromDate;
    }

    public void setFromDate(LocalDateTime fromDate) {
        this.fromDate = fromDate;
    }

    public LocalDateTime getThruDate() {
        return thruDate;
    }

    public void setThruDate(LocalDateTime thruDate) {
        this.thruDate = thruDate;
    }

    public String getTaxAuthorityAssocTypeId() {
        return taxAuthorityAssocTypeId;
    }

    public void setTaxAuthorityAssocTypeId(String taxAuthorityAssocTypeId) {
        this.taxAuthorityAssocTypeId = taxAuthorityAssocTypeId;
    }
}
