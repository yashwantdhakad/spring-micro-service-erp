package com.monash.erp.party.security.entity;

import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Getter;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.math.BigDecimal;

@Entity
@NoArgsConstructor
@Setter
@Getter
public class TarpittedLoginView {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String viewNameId;

    private String userLoginId;

    private BigDecimal tarpitReleaseDateTime;
public void setId(Long id) {
        this.id = id;
    }
public void setViewNameId(String viewNameId) {
        this.viewNameId = viewNameId;
    }
public void setUserLoginId(String userLoginId) {
        this.userLoginId = userLoginId;
    }
public void setTarpitReleaseDateTime(BigDecimal tarpitReleaseDateTime) {
        this.tarpitReleaseDateTime = tarpitReleaseDateTime;
    }
}
