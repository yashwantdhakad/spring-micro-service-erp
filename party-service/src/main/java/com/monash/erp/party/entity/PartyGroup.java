package com.monash.erp.party.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.LocalDateTime;

@Entity
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

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getGroupNameLocal() {
        return groupNameLocal;
    }

    public void setGroupNameLocal(String groupNameLocal) {
        this.groupNameLocal = groupNameLocal;
    }

    public String getOfficeSiteName() {
        return officeSiteName;
    }

    public void setOfficeSiteName(String officeSiteName) {
        this.officeSiteName = officeSiteName;
    }

    public String getAnnualRevenue() {
        return annualRevenue;
    }

    public void setAnnualRevenue(String annualRevenue) {
        this.annualRevenue = annualRevenue;
    }

    public String getNumEmployees() {
        return numEmployees;
    }

    public void setNumEmployees(String numEmployees) {
        this.numEmployees = numEmployees;
    }

    public String getTickerSymbol() {
        return tickerSymbol;
    }

    public void setTickerSymbol(String tickerSymbol) {
        this.tickerSymbol = tickerSymbol;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getLogoImageUrl() {
        return logoImageUrl;
    }

    public void setLogoImageUrl(String logoImageUrl) {
        this.logoImageUrl = logoImageUrl;
    }

    public LocalDateTime getLastUpdatedStamp() {
        return lastUpdatedStamp;
    }

    public void setLastUpdatedStamp(LocalDateTime lastUpdatedStamp) {
        this.lastUpdatedStamp = lastUpdatedStamp;
    }

    public LocalDateTime getLastUpdatedTxStamp() {
        return lastUpdatedTxStamp;
    }

    public void setLastUpdatedTxStamp(LocalDateTime lastUpdatedTxStamp) {
        this.lastUpdatedTxStamp = lastUpdatedTxStamp;
    }

    public LocalDateTime getCreatedStamp() {
        return createdStamp;
    }

    public void setCreatedStamp(LocalDateTime createdStamp) {
        this.createdStamp = createdStamp;
    }

    public LocalDateTime getCreatedTxStamp() {
        return createdTxStamp;
    }

    public void setCreatedTxStamp(LocalDateTime createdTxStamp) {
        this.createdTxStamp = createdTxStamp;
    }

    public String getEasaCerReq() {
        return easaCerReq;
    }

    public void setEasaCerReq(String easaCerReq) {
        this.easaCerReq = easaCerReq;
    }

    public String getIsBlackListed() {
        return isBlackListed;
    }

    public void setIsBlackListed(String isBlackListed) {
        this.isBlackListed = isBlackListed;
    }

    public String getDrugProgReq() {
        return drugProgReq;
    }

    public void setDrugProgReq(String drugProgReq) {
        this.drugProgReq = drugProgReq;
    }

    public String getMilitaryContract() {
        return militaryContract;
    }

    public void setMilitaryContract(String militaryContract) {
        this.militaryContract = militaryContract;
    }

    public String getPmaAllowed() {
        return pmaAllowed;
    }

    public void setPmaAllowed(String pmaAllowed) {
        this.pmaAllowed = pmaAllowed;
    }

    public String getExchgAllowed() {
        return exchgAllowed;
    }

    public void setExchgAllowed(String exchgAllowed) {
        this.exchgAllowed = exchgAllowed;
    }

    public String getPropRepAllowed() {
        return propRepAllowed;
    }

    public void setPropRepAllowed(String propRepAllowed) {
        this.propRepAllowed = propRepAllowed;
    }

    public String getTraceReq() {
        return traceReq;
    }

    public void setTraceReq(String traceReq) {
        this.traceReq = traceReq;
    }

    public String getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(String creditLimit) {
        this.creditLimit = creditLimit;
    }

    public String getCreditTerms() {
        return creditTerms;
    }

    public void setCreditTerms(String creditTerms) {
        this.creditTerms = creditTerms;
    }

    public String getPriceShowOnPackSlip() {
        return priceShowOnPackSlip;
    }

    public void setPriceShowOnPackSlip(String priceShowOnPackSlip) {
        this.priceShowOnPackSlip = priceShowOnPackSlip;
    }

    public String getSalesChannel() {
        return salesChannel;
    }

    public void setSalesChannel(String salesChannel) {
        this.salesChannel = salesChannel;
    }

    public String getSalesCatRegion() {
        return salesCatRegion;
    }

    public void setSalesCatRegion(String salesCatRegion) {
        this.salesCatRegion = salesCatRegion;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

}
