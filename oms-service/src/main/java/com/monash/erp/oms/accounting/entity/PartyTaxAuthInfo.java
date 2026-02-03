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
public void setId(Long id) {
        this.id = id;
    }
public void setPartyId(String partyId) {
        this.partyId = partyId;
    }
public void setTaxAuthGeoId(String taxAuthGeoId) {
        this.taxAuthGeoId = taxAuthGeoId;
    }
public void setTaxAuthPartyId(String taxAuthPartyId) {
        this.taxAuthPartyId = taxAuthPartyId;
    }
public void setFromDate(LocalDateTime fromDate) {
        this.fromDate = fromDate;
    }
public void setThruDate(LocalDateTime thruDate) {
        this.thruDate = thruDate;
    }
public void setPartyTaxId(String partyTaxId) {
        this.partyTaxId = partyTaxId;
    }
public void setIsExempt(Boolean isExempt) {
        this.isExempt = isExempt;
    }
public void setIsNexus(Boolean isNexus) {
        this.isNexus = isNexus;
    }
}
