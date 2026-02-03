package com.monash.erp.wms.entity;

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
public class Visit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String visitId;
    private String visitorId;
    private String userLoginId;
    private String userCreated;
    private String sessionId;
    private String serverIpAddress;
    private String serverHostName;
    private String webappName;
    private String initialLocale;
    private String initialRequest;
    private String initialReferrer;
    private String initialUserAgent;
    private String userAgentId;
    private String clientIpAddress;
    private String clientHostName;
    private String clientUser;
    private String clientIpIspName;
    private String clientIpPostalCode;
    private String clientIpStateProvGeoId;
    private String clientIpCountryGeoId;
    private String cookie;
    private LocalDateTime fromDate;
    private LocalDateTime thruDate;
    private LocalDateTime lastUpdatedStamp;
    private LocalDateTime lastUpdatedTxStamp;
    private LocalDateTime createdStamp;
    private LocalDateTime createdTxStamp;
    private String contactMechId;
    private String partyId;
    private String roleTypeId;
public void setId(Long id) {
        this.id = id;
    }
public void setVisitId(String visitId) {
        this.visitId = visitId;
    }
public void setVisitorId(String visitorId) {
        this.visitorId = visitorId;
    }
public void setUserLoginId(String userLoginId) {
        this.userLoginId = userLoginId;
    }
public void setUserCreated(String userCreated) {
        this.userCreated = userCreated;
    }
public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }
public void setServerIpAddress(String serverIpAddress) {
        this.serverIpAddress = serverIpAddress;
    }
public void setServerHostName(String serverHostName) {
        this.serverHostName = serverHostName;
    }
public void setWebappName(String webappName) {
        this.webappName = webappName;
    }
public void setInitialLocale(String initialLocale) {
        this.initialLocale = initialLocale;
    }
public void setInitialRequest(String initialRequest) {
        this.initialRequest = initialRequest;
    }
public void setInitialReferrer(String initialReferrer) {
        this.initialReferrer = initialReferrer;
    }
public void setInitialUserAgent(String initialUserAgent) {
        this.initialUserAgent = initialUserAgent;
    }
public void setUserAgentId(String userAgentId) {
        this.userAgentId = userAgentId;
    }
public void setClientIpAddress(String clientIpAddress) {
        this.clientIpAddress = clientIpAddress;
    }
public void setClientHostName(String clientHostName) {
        this.clientHostName = clientHostName;
    }
public void setClientUser(String clientUser) {
        this.clientUser = clientUser;
    }
public void setClientIpIspName(String clientIpIspName) {
        this.clientIpIspName = clientIpIspName;
    }
public void setClientIpPostalCode(String clientIpPostalCode) {
        this.clientIpPostalCode = clientIpPostalCode;
    }
public void setClientIpStateProvGeoId(String clientIpStateProvGeoId) {
        this.clientIpStateProvGeoId = clientIpStateProvGeoId;
    }
public void setClientIpCountryGeoId(String clientIpCountryGeoId) {
        this.clientIpCountryGeoId = clientIpCountryGeoId;
    }
public void setCookie(String cookie) {
        this.cookie = cookie;
    }
public void setFromDate(LocalDateTime fromDate) {
        this.fromDate = fromDate;
    }
public void setThruDate(LocalDateTime thruDate) {
        this.thruDate = thruDate;
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
public void setContactMechId(String contactMechId) {
        this.contactMechId = contactMechId;
    }
public void setPartyId(String partyId) {
        this.partyId = partyId;
    }
public void setRoleTypeId(String roleTypeId) {
        this.roleTypeId = roleTypeId;
    }

}
