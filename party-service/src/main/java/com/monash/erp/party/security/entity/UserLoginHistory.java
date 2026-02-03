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
public class UserLoginHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String userLoginId;

    private String visitId;

    private LocalDateTime fromDate;

    private LocalDateTime thruDate;

    private String passwordUsed;

    private Boolean successfulLogin;

    private String originUserLoginId;
public void setId(Long id) {
        this.id = id;
    }
public void setUserLoginId(String userLoginId) {
        this.userLoginId = userLoginId;
    }
public void setVisitId(String visitId) {
        this.visitId = visitId;
    }
public void setFromDate(LocalDateTime fromDate) {
        this.fromDate = fromDate;
    }
public void setThruDate(LocalDateTime thruDate) {
        this.thruDate = thruDate;
    }
public void setPasswordUsed(String passwordUsed) {
        this.passwordUsed = passwordUsed;
    }
public void setSuccessfulLogin(Boolean successfulLogin) {
        this.successfulLogin = successfulLogin;
    }
public void setOriginUserLoginId(String originUserLoginId) {
        this.originUserLoginId = originUserLoginId;
    }
}
