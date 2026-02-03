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
public class CartAbandonedLine {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String visitId;
    private String cartAbandonedLineSeqId;
    private String productId;
    private String prodCatalogId;
    private BigDecimal quantity;
    private LocalDateTime reservStart;
    private BigDecimal reservLength;
    private BigDecimal reservPersons;
    private BigDecimal unitPrice;
    private BigDecimal reserv2ndPPPerc;
    private BigDecimal reservNthPPPerc;
    private String configId;
    private BigDecimal totalWithAdjustments;
    private String wasReserved;
    private LocalDateTime lastUpdatedStamp;
    private LocalDateTime lastUpdatedTxStamp;
    private LocalDateTime createdStamp;
    private LocalDateTime createdTxStamp;
public void setId(Long id) {
        this.id = id;
    }
public void setVisitId(String visitId) {
        this.visitId = visitId;
    }
public void setCartAbandonedLineSeqId(String cartAbandonedLineSeqId) {
        this.cartAbandonedLineSeqId = cartAbandonedLineSeqId;
    }
public void setProductId(String productId) {
        this.productId = productId;
    }
public void setProdCatalogId(String prodCatalogId) {
        this.prodCatalogId = prodCatalogId;
    }
public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }
public void setReservStart(LocalDateTime reservStart) {
        this.reservStart = reservStart;
    }
public void setReservLength(BigDecimal reservLength) {
        this.reservLength = reservLength;
    }
public void setReservPersons(BigDecimal reservPersons) {
        this.reservPersons = reservPersons;
    }
public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }
public void setReserv2ndPPPerc(BigDecimal reserv2ndPPPerc) {
        this.reserv2ndPPPerc = reserv2ndPPPerc;
    }
public void setReservNthPPPerc(BigDecimal reservNthPPPerc) {
        this.reservNthPPPerc = reservNthPPPerc;
    }
public void setConfigId(String configId) {
        this.configId = configId;
    }
public void setTotalWithAdjustments(BigDecimal totalWithAdjustments) {
        this.totalWithAdjustments = totalWithAdjustments;
    }
public void setWasReserved(String wasReserved) {
        this.wasReserved = wasReserved;
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
