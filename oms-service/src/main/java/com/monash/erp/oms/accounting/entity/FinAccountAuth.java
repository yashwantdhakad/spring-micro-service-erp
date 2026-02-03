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
public class FinAccountAuth {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String finAccountAuthId;

    private String finAccountId;

    private BigDecimal amount;

    private String currencyUomId;

    private LocalDateTime authorizationDate;

    private LocalDateTime fromDate;

    private LocalDateTime thruDate;
public void setId(Long id) {
        this.id = id;
    }
public void setFinAccountAuthId(String finAccountAuthId) {
        this.finAccountAuthId = finAccountAuthId;
    }
public void setFinAccountId(String finAccountId) {
        this.finAccountId = finAccountId;
    }
public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
public void setCurrencyUomId(String currencyUomId) {
        this.currencyUomId = currencyUomId;
    }
public void setAuthorizationDate(LocalDateTime authorizationDate) {
        this.authorizationDate = authorizationDate;
    }
public void setFromDate(LocalDateTime fromDate) {
        this.fromDate = fromDate;
    }
public void setThruDate(LocalDateTime thruDate) {
        this.thruDate = thruDate;
    }
}
