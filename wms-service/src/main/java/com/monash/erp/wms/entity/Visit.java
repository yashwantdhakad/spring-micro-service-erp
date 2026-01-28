package com.monash.erp.wms.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity
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

    public String getVisitorId() {
        return visitorId;
    }

    public void setVisitorId(String visitorId) {
        this.visitorId = visitorId;
    }

    public String getUserLoginId() {
        return userLoginId;
    }

    public void setUserLoginId(String userLoginId) {
        this.userLoginId = userLoginId;
    }

    public String getUserCreated() {
        return userCreated;
    }

    public void setUserCreated(String userCreated) {
        this.userCreated = userCreated;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
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

    public String getWebappName() {
        return webappName;
    }

    public void setWebappName(String webappName) {
        this.webappName = webappName;
    }

    public String getInitialLocale() {
        return initialLocale;
    }

    public void setInitialLocale(String initialLocale) {
        this.initialLocale = initialLocale;
    }

    public String getInitialRequest() {
        return initialRequest;
    }

    public void setInitialRequest(String initialRequest) {
        this.initialRequest = initialRequest;
    }

    public String getInitialReferrer() {
        return initialReferrer;
    }

    public void setInitialReferrer(String initialReferrer) {
        this.initialReferrer = initialReferrer;
    }

    public String getInitialUserAgent() {
        return initialUserAgent;
    }

    public void setInitialUserAgent(String initialUserAgent) {
        this.initialUserAgent = initialUserAgent;
    }

    public String getUserAgentId() {
        return userAgentId;
    }

    public void setUserAgentId(String userAgentId) {
        this.userAgentId = userAgentId;
    }

    public String getClientIpAddress() {
        return clientIpAddress;
    }

    public void setClientIpAddress(String clientIpAddress) {
        this.clientIpAddress = clientIpAddress;
    }

    public String getClientHostName() {
        return clientHostName;
    }

    public void setClientHostName(String clientHostName) {
        this.clientHostName = clientHostName;
    }

    public String getClientUser() {
        return clientUser;
    }

    public void setClientUser(String clientUser) {
        this.clientUser = clientUser;
    }

    public String getClientIpIspName() {
        return clientIpIspName;
    }

    public void setClientIpIspName(String clientIpIspName) {
        this.clientIpIspName = clientIpIspName;
    }

    public String getClientIpPostalCode() {
        return clientIpPostalCode;
    }

    public void setClientIpPostalCode(String clientIpPostalCode) {
        this.clientIpPostalCode = clientIpPostalCode;
    }

    public String getClientIpStateProvGeoId() {
        return clientIpStateProvGeoId;
    }

    public void setClientIpStateProvGeoId(String clientIpStateProvGeoId) {
        this.clientIpStateProvGeoId = clientIpStateProvGeoId;
    }

    public String getClientIpCountryGeoId() {
        return clientIpCountryGeoId;
    }

    public void setClientIpCountryGeoId(String clientIpCountryGeoId) {
        this.clientIpCountryGeoId = clientIpCountryGeoId;
    }

    public String getCookie() {
        return cookie;
    }

    public void setCookie(String cookie) {
        this.cookie = cookie;
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

    public String getContactMechId() {
        return contactMechId;
    }

    public void setContactMechId(String contactMechId) {
        this.contactMechId = contactMechId;
    }

    public String getPartyId() {
        return partyId;
    }

    public void setPartyId(String partyId) {
        this.partyId = partyId;
    }

    public String getRoleTypeId() {
        return roleTypeId;
    }

    public void setRoleTypeId(String roleTypeId) {
        this.roleTypeId = roleTypeId;
    }

}