package com.monash.erp.wms.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
public class ServerHit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String visitId;
    private String contentId;
    private LocalDateTime hitStartDateTime;
    private String hitTypeId;
    private BigDecimal numOfBytes;
    private BigDecimal runningTimeMillis;
    private String userLoginId;
    private String statusId;
    private String requestUrl;
    private String referrerUrl;
    private String serverIpAddress;
    private String serverHostName;
    private LocalDateTime lastUpdatedStamp;
    private LocalDateTime lastUpdatedTxStamp;
    private LocalDateTime createdStamp;
    private LocalDateTime createdTxStamp;
    private String internalContentId;
    private String partyId;
    private String idByIpContactMechId;
    private String refByWebContactMechId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getVisitId() {
        return visitId;
    }

    public void setVisitId(String visitId) {
        this.visitId = visitId;
    }

    public String getContentId() {
        return contentId;
    }

    public void setContentId(String contentId) {
        this.contentId = contentId;
    }

    public LocalDateTime getHitStartDateTime() {
        return hitStartDateTime;
    }

    public void setHitStartDateTime(LocalDateTime hitStartDateTime) {
        this.hitStartDateTime = hitStartDateTime;
    }

    public String getHitTypeId() {
        return hitTypeId;
    }

    public void setHitTypeId(String hitTypeId) {
        this.hitTypeId = hitTypeId;
    }

    public BigDecimal getNumOfBytes() {
        return numOfBytes;
    }

    public void setNumOfBytes(BigDecimal numOfBytes) {
        this.numOfBytes = numOfBytes;
    }

    public BigDecimal getRunningTimeMillis() {
        return runningTimeMillis;
    }

    public void setRunningTimeMillis(BigDecimal runningTimeMillis) {
        this.runningTimeMillis = runningTimeMillis;
    }

    public String getUserLoginId() {
        return userLoginId;
    }

    public void setUserLoginId(String userLoginId) {
        this.userLoginId = userLoginId;
    }

    public String getStatusId() {
        return statusId;
    }

    public void setStatusId(String statusId) {
        this.statusId = statusId;
    }

    public String getRequestUrl() {
        return requestUrl;
    }

    public void setRequestUrl(String requestUrl) {
        this.requestUrl = requestUrl;
    }

    public String getReferrerUrl() {
        return referrerUrl;
    }

    public void setReferrerUrl(String referrerUrl) {
        this.referrerUrl = referrerUrl;
    }

    public String getServerIpAddress() {
        return serverIpAddress;
    }

    public void setServerIpAddress(String serverIpAddress) {
        this.serverIpAddress = serverIpAddress;
    }

    public String getServerHostName() {
        return serverHostName;
    }

    public void setServerHostName(String serverHostName) {
        this.serverHostName = serverHostName;
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

    public String getInternalContentId() {
        return internalContentId;
    }

    public void setInternalContentId(String internalContentId) {
        this.internalContentId = internalContentId;
    }

    public String getPartyId() {
        return partyId;
    }

    public void setPartyId(String partyId) {
        this.partyId = partyId;
    }

    public String getIdByIpContactMechId() {
        return idByIpContactMechId;
    }

    public void setIdByIpContactMechId(String idByIpContactMechId) {
        this.idByIpContactMechId = idByIpContactMechId;
    }

    public String getRefByWebContactMechId() {
        return refByWebContactMechId;
    }

    public void setRefByWebContactMechId(String refByWebContactMechId) {
        this.refByWebContactMechId = refByWebContactMechId;
    }

}