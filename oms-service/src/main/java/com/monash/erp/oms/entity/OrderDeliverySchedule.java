package com.monash.erp.oms.entity;

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
public class OrderDeliverySchedule extends AuditableEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String orderId;
    private String orderItemSeqId;
    private LocalDateTime estimatedReadyDate;
    private BigDecimal cartons;
    private BigDecimal skidsPallets;
    private BigDecimal unitsPieces;
    private BigDecimal totalCubicSize;
    private String totalCubicUomId;
    private BigDecimal totalWeight;
    private String totalWeightUomId;
    private String statusId;
public void setId(Long id) {
        this.id = id;
    }
public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
public void setOrderItemSeqId(String orderItemSeqId) {
        this.orderItemSeqId = orderItemSeqId;
    }
public void setEstimatedReadyDate(LocalDateTime estimatedReadyDate) {
        this.estimatedReadyDate = estimatedReadyDate;
    }
public void setCartons(BigDecimal cartons) {
        this.cartons = cartons;
    }
public void setSkidsPallets(BigDecimal skidsPallets) {
        this.skidsPallets = skidsPallets;
    }
public void setUnitsPieces(BigDecimal unitsPieces) {
        this.unitsPieces = unitsPieces;
    }
public void setTotalCubicSize(BigDecimal totalCubicSize) {
        this.totalCubicSize = totalCubicSize;
    }
public void setTotalCubicUomId(String totalCubicUomId) {
        this.totalCubicUomId = totalCubicUomId;
    }
public void setTotalWeight(BigDecimal totalWeight) {
        this.totalWeight = totalWeight;
    }
public void setTotalWeightUomId(String totalWeightUomId) {
        this.totalWeightUomId = totalWeightUomId;
    }
public void setStatusId(String statusId) {
        this.statusId = statusId;
    }

}
