package com.monash.erp.wms.entity;

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
public class QuantityBreak {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String quantityBreakId;
    private String quantityBreakTypeId;
    private BigDecimal fromQuantity;
    private BigDecimal thruQuantity;
    private LocalDateTime lastUpdatedStamp;
    private LocalDateTime lastUpdatedTxStamp;
    private LocalDateTime createdStamp;
    private LocalDateTime createdTxStamp;
public void setId(Long id) {
        this.id = id;
    }
public void setQuantityBreakId(String quantityBreakId) {
        this.quantityBreakId = quantityBreakId;
    }
public void setQuantityBreakTypeId(String quantityBreakTypeId) {
        this.quantityBreakTypeId = quantityBreakTypeId;
    }
public void setFromQuantity(BigDecimal fromQuantity) {
        this.fromQuantity = fromQuantity;
    }
public void setThruQuantity(BigDecimal thruQuantity) {
        this.thruQuantity = thruQuantity;
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
