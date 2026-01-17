package com.example.erp.party.security.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity
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

    public String getVisitId() {
        return visitId;
    }

    public void setVisitId(String visitId) {
        this.visitId = visitId;
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

    public String getPasswordUsed() {
        return passwordUsed;
    }

    public void setPasswordUsed(String passwordUsed) {
        this.passwordUsed = passwordUsed;
    }

    public Boolean getSuccessfulLogin() {
        return successfulLogin;
    }

    public void setSuccessfulLogin(Boolean successfulLogin) {
        this.successfulLogin = successfulLogin;
    }

    public String getOriginUserLoginId() {
        return originUserLoginId;
    }

    public void setOriginUserLoginId(String originUserLoginId) {
        this.originUserLoginId = originUserLoginId;
    }
}
