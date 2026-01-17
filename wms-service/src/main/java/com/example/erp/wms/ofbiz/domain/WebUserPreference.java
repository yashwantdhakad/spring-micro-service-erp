package com.example.erp.wms.ofbiz.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class WebUserPreference {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String userLoginId;
    private String partyId;
    private String visitId;
    private String webPreferenceTypeId;
    private String webPreferenceValue;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserLoginId() {
        return userLoginId;
    }

    public void setUserLoginId(String userLoginId) {
        this.userLoginId = userLoginId;
    }

    public String getPartyId() {
        return partyId;
    }

    public void setPartyId(String partyId) {
        this.partyId = partyId;
    }

    public String getVisitId() {
        return visitId;
    }

    public void setVisitId(String visitId) {
        this.visitId = visitId;
    }

    public String getWebPreferenceTypeId() {
        return webPreferenceTypeId;
    }

    public void setWebPreferenceTypeId(String webPreferenceTypeId) {
        this.webPreferenceTypeId = webPreferenceTypeId;
    }

    public String getWebPreferenceValue() {
        return webPreferenceValue;
    }

    public void setWebPreferenceValue(String webPreferenceValue) {
        this.webPreferenceValue = webPreferenceValue;
    }

}