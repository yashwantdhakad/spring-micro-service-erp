package com.example.erp.party.security.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.math.BigDecimal;

@Entity
public class TarpittedLoginView {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String viewNameId;

    private String userLoginId;

    private BigDecimal tarpitReleaseDateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getViewNameId() {
        return viewNameId;
    }

    public void setViewNameId(String viewNameId) {
        this.viewNameId = viewNameId;
    }

    public String getUserLoginId() {
        return userLoginId;
    }

    public void setUserLoginId(String userLoginId) {
        this.userLoginId = userLoginId;
    }

    public BigDecimal getTarpitReleaseDateTime() {
        return tarpitReleaseDateTime;
    }

    public void setTarpitReleaseDateTime(BigDecimal tarpitReleaseDateTime) {
        this.tarpitReleaseDateTime = tarpitReleaseDateTime;
    }
}
