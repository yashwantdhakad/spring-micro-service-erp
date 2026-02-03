package com.monash.erp.wms.entity;

import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Getter;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@Setter
@Getter
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
public void setId(Long id) {
        this.id = id;
    }
public void setVisitId(String visitId) {
        this.visitId = visitId;
    }
public void setContentId(String contentId) {
        this.contentId = contentId;
    }
public void setHitStartDateTime(LocalDateTime hitStartDateTime) {
        this.hitStartDateTime = hitStartDateTime;
    }
public void setHitTypeId(String hitTypeId) {
        this.hitTypeId = hitTypeId;
    }
public void setNumOfBytes(BigDecimal numOfBytes) {
        this.numOfBytes = numOfBytes;
    }
public void setRunningTimeMillis(BigDecimal runningTimeMillis) {
        this.runningTimeMillis = runningTimeMillis;
    }
public void setUserLoginId(String userLoginId) {
        this.userLoginId = userLoginId;
    }
public void setStatusId(String statusId) {
        this.statusId = statusId;
    }
public void setRequestUrl(String requestUrl) {
        this.requestUrl = requestUrl;
    }
public void setReferrerUrl(String referrerUrl) {
        this.referrerUrl = referrerUrl;
    }
public void setServerIpAddress(String serverIpAddress) {
        this.serverIpAddress = serverIpAddress;
    }
public void setServerHostName(String serverHostName) {
        this.serverHostName = serverHostName;
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
public void setInternalContentId(String internalContentId) {
        this.internalContentId = internalContentId;
    }
public void setPartyId(String partyId) {
        this.partyId = partyId;
    }
public void setIdByIpContactMechId(String idByIpContactMechId) {
        this.idByIpContactMechId = idByIpContactMechId;
    }
public void setRefByWebContactMechId(String refByWebContactMechId) {
        this.refByWebContactMechId = refByWebContactMechId;
    }

}
