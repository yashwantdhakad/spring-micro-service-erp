package com.monash.erp.oms.accounting.entity;

import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Getter;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@Setter
@Getter
public class GlAccountCategoryMember {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String glAccountId;

    private String glAccountCategoryId;

    private LocalDateTime fromDate;

    private LocalDateTime thruDate;

    private BigDecimal amountPercentage;
public void setId(Long id) {
        this.id = id;
    }
public void setGlAccountId(String glAccountId) {
        this.glAccountId = glAccountId;
    }
public void setGlAccountCategoryId(String glAccountCategoryId) {
        this.glAccountCategoryId = glAccountCategoryId;
    }
public void setFromDate(LocalDateTime fromDate) {
        this.fromDate = fromDate;
    }
public void setThruDate(LocalDateTime thruDate) {
        this.thruDate = thruDate;
    }
public void setAmountPercentage(BigDecimal amountPercentage) {
        this.amountPercentage = amountPercentage;
    }
}
