package com.monash.erp.oms.accounting.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity
public class PartyTaxAuthInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String partyId;

    private String taxAuthGeoId;

    private String taxAuthPartyId;

    private LocalDateTime fromDate;

    private LocalDateTime thruDate;

    private String partyTaxId;

    private Boolean isExempt;

    private Boolean isNexus;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPartyId() {
        return partyId;
    }

    public void setPartyId(String partyId) {
        this.partyId = partyId;
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

    public String getPartyTaxId() {
        return partyTaxId;
    }

    public void setPartyTaxId(String partyTaxId) {
        this.partyTaxId = partyTaxId;
    }

    public Boolean getIsExempt() {
        return isExempt;
    }

    public void setIsExempt(Boolean isExempt) {
        this.isExempt = isExempt;
    }

    public Boolean getIsNexus() {
        return isNexus;
    }

    public void setIsNexus(Boolean isNexus) {
        this.isNexus = isNexus;
    }
}
