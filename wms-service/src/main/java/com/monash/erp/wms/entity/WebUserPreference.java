package com.monash.erp.wms.entity;

import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Getter;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@NoArgsConstructor
@Setter
@Getter
public class WebUserPreference {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String userLoginId;
    private String partyId;
    private String visitId;
    private String webPreferenceTypeId;
    private String webPreferenceValue;
public void setId(Long id) {
        this.id = id;
    }
public void setUserLoginId(String userLoginId) {
        this.userLoginId = userLoginId;
    }
public void setPartyId(String partyId) {
        this.partyId = partyId;
    }
public void setVisitId(String visitId) {
        this.visitId = visitId;
    }
public void setWebPreferenceTypeId(String webPreferenceTypeId) {
        this.webPreferenceTypeId = webPreferenceTypeId;
    }
public void setWebPreferenceValue(String webPreferenceValue) {
        this.webPreferenceValue = webPreferenceValue;
    }

}
