package com.example.erp.oms.accounting.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
public class GlAccountCategoryMember {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String glAccountId;

    private String glAccountCategoryId;

    private LocalDateTime fromDate;

    private LocalDateTime thruDate;

    private BigDecimal amountPercentage;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGlAccountId() {
        return glAccountId;
    }

    public void setGlAccountId(String glAccountId) {
        this.glAccountId = glAccountId;
    }

    public String getGlAccountCategoryId() {
        return glAccountCategoryId;
    }

    public void setGlAccountCategoryId(String glAccountCategoryId) {
        this.glAccountCategoryId = glAccountCategoryId;
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

    public BigDecimal getAmountPercentage() {
        return amountPercentage;
    }

    public void setAmountPercentage(BigDecimal amountPercentage) {
        this.amountPercentage = amountPercentage;
    }
}
