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
public class UserLoginSession {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String userLoginId;

    private LocalDateTime savedDate;

    private String sessionData;
public void setId(Long id) {
        this.id = id;
    }
public void setUserLoginId(String userLoginId) {
        this.userLoginId = userLoginId;
    }
public void setSavedDate(LocalDateTime savedDate) {
        this.savedDate = savedDate;
    }
public void setSessionData(String sessionData) {
        this.sessionData = sessionData;
    }
}
