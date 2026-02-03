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
public class GoogleCoShippingMethod {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String shipmentMethodName;
    private String productStoreId;
    private BigDecimal amount;
    private BigDecimal additionalAmount;
    private BigDecimal additionalPercent;
    private String methodTypeEnumId;
    private String carrierPartyId;
    private String shipmentMethodTypeId;
    private LocalDateTime lastUpdatedStamp;
    private LocalDateTime lastUpdatedTxStamp;
    private LocalDateTime createdStamp;
    private LocalDateTime createdTxStamp;
public void setId(Long id) {
        this.id = id;
    }
public void setShipmentMethodName(String shipmentMethodName) {
        this.shipmentMethodName = shipmentMethodName;
    }
public void setProductStoreId(String productStoreId) {
        this.productStoreId = productStoreId;
    }
public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
public void setAdditionalAmount(BigDecimal additionalAmount) {
        this.additionalAmount = additionalAmount;
    }
public void setAdditionalPercent(BigDecimal additionalPercent) {
        this.additionalPercent = additionalPercent;
    }
public void setMethodTypeEnumId(String methodTypeEnumId) {
        this.methodTypeEnumId = methodTypeEnumId;
    }
public void setCarrierPartyId(String carrierPartyId) {
        this.carrierPartyId = carrierPartyId;
    }
public void setShipmentMethodTypeId(String shipmentMethodTypeId) {
        this.shipmentMethodTypeId = shipmentMethodTypeId;
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
