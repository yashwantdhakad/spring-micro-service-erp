package com.monash.erp.party.entity;

import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Getter;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Index;
import jakarta.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(
        name = "party_group",
        indexes = {
                @Index(name = "idx_party_group_party_id", columnList = "party_id"),
                @Index(name = "idx_party_group_name", columnList = "group_name")
        }
)
@NoArgsConstructor
@Setter
@Getter
public class PartyGroup {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String partyId;
    private String groupName;
    private String groupNameLocal;
    private String officeSiteName;
    private String annualRevenue;
    private String numEmployees;
    private String tickerSymbol;
    private String comments;
    private String logoImageUrl;
    private LocalDateTime lastUpdatedStamp;
    private LocalDateTime lastUpdatedTxStamp;
    private LocalDateTime createdStamp;
    private LocalDateTime createdTxStamp;
    private String easaCerReq;
    private String isBlackListed;
    private String drugProgReq;
    private String militaryContract;
    private String pmaAllowed;
    private String exchgAllowed;
    private String propRepAllowed;
    private String traceReq;
    private String creditLimit;
    private String creditTerms;
    private String priceShowOnPackSlip;
    private String salesChannel;
    private String salesCatRegion;
    private String division;
public void setId(Long id) {
        this.id = id;
    }
public void setPartyId(String partyId) {
        this.partyId = partyId;
    }
public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
public void setGroupNameLocal(String groupNameLocal) {
        this.groupNameLocal = groupNameLocal;
    }
public void setOfficeSiteName(String officeSiteName) {
        this.officeSiteName = officeSiteName;
    }
public void setAnnualRevenue(String annualRevenue) {
        this.annualRevenue = annualRevenue;
    }
public void setNumEmployees(String numEmployees) {
        this.numEmployees = numEmployees;
    }
public void setTickerSymbol(String tickerSymbol) {
        this.tickerSymbol = tickerSymbol;
    }
public void setComments(String comments) {
        this.comments = comments;
    }
public void setLogoImageUrl(String logoImageUrl) {
        this.logoImageUrl = logoImageUrl;
    }
public void setLastUpdatedStamp(LocalDateTime lastUpdatedStamp) {
        this.lastUpdatedStamp = lastUpdatedStamp;
    }
public void setLastUpdatedTxStamp(LocalDateTime lastUpdatedTxStamp) {
        this.lastUpdatedTxStamp = lastUpdatedTxStamp;
    }
public void setCreatedStamp(LocalDateTime createdStamp) {
        this.createdStamp = createdStamp;
    }
public void setCreatedTxStamp(LocalDateTime createdTxStamp) {
        this.createdTxStamp = createdTxStamp;
    }
public void setEasaCerReq(String easaCerReq) {
        this.easaCerReq = easaCerReq;
    }
public void setIsBlackListed(String isBlackListed) {
        this.isBlackListed = isBlackListed;
    }
public void setDrugProgReq(String drugProgReq) {
        this.drugProgReq = drugProgReq;
    }
public void setMilitaryContract(String militaryContract) {
        this.militaryContract = militaryContract;
    }
public void setPmaAllowed(String pmaAllowed) {
        this.pmaAllowed = pmaAllowed;
    }
public void setExchgAllowed(String exchgAllowed) {
        this.exchgAllowed = exchgAllowed;
    }
public void setPropRepAllowed(String propRepAllowed) {
        this.propRepAllowed = propRepAllowed;
    }
public void setTraceReq(String traceReq) {
        this.traceReq = traceReq;
    }
public void setCreditLimit(String creditLimit) {
        this.creditLimit = creditLimit;
    }
public void setCreditTerms(String creditTerms) {
        this.creditTerms = creditTerms;
    }
public void setPriceShowOnPackSlip(String priceShowOnPackSlip) {
        this.priceShowOnPackSlip = priceShowOnPackSlip;
    }
public void setSalesChannel(String salesChannel) {
        this.salesChannel = salesChannel;
    }
public void setSalesCatRegion(String salesCatRegion) {
        this.salesCatRegion = salesCatRegion;
    }
public void setDivision(String division) {
        this.division = division;
    }

}
