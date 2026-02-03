package com.monash.erp.oms.common.entity;

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
public class UserPreference {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String userLoginId;

    private String userPrefTypeId;

    private String userPrefGroupTypeId;

    private String userPrefValue;

    private String userPrefDataType;
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
}
