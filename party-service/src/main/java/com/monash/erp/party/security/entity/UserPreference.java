package com.monash.erp.party.security.entity;

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
public class UserPreference {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String userLoginId;
    private String userPrefTypeId;
    private String userPrefGroupTypeId;
    private String userPrefValue;
    private String userPrefDataType;
    private LocalDateTime lastUpdatedStamp;
    private LocalDateTime lastUpdatedTxStamp;
    private LocalDateTime createdStamp;
    private LocalDateTime createdTxStamp;
public void setId(Long id) {
        this.id = id;
    }
public void setUserLoginId(String userLoginId) {
        this.userLoginId = userLoginId;
    }
public void setUserPrefTypeId(String userPrefTypeId) {
        this.userPrefTypeId = userPrefTypeId;
    }
public void setUserPrefGroupTypeId(String userPrefGroupTypeId) {
        this.userPrefGroupTypeId = userPrefGroupTypeId;
    }
public void setUserPrefValue(String userPrefValue) {
        this.userPrefValue = userPrefValue;
    }
public void setUserPrefDataType(String userPrefDataType) {
        this.userPrefDataType = userPrefDataType;
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

}
