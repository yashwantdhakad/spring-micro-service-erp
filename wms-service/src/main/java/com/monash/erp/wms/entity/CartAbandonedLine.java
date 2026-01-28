package com.monash.erp.wms.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getVisitId() {
        return visitId;
    }

    public void setVisitId(String visitId) {
        this.visitId = visitId;
    }

    public String getCartAbandonedLineSeqId() {
        return cartAbandonedLineSeqId;
    }

    public void setCartAbandonedLineSeqId(String cartAbandonedLineSeqId) {
        this.cartAbandonedLineSeqId = cartAbandonedLineSeqId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProdCatalogId() {
        return prodCatalogId;
    }

    public void setProdCatalogId(String prodCatalogId) {
        this.prodCatalogId = prodCatalogId;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    public LocalDateTime getReservStart() {
        return reservStart;
    }

    public void setReservStart(LocalDateTime reservStart) {
        this.reservStart = reservStart;
    }

    public BigDecimal getReservLength() {
        return reservLength;
    }

    public void setReservLength(BigDecimal reservLength) {
        this.reservLength = reservLength;
    }

    public BigDecimal getReservPersons() {
        return reservPersons;
    }

    public void setReservPersons(BigDecimal reservPersons) {
        this.reservPersons = reservPersons;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    public BigDecimal getReserv2ndPPPerc() {
        return reserv2ndPPPerc;
    }

    public void setReserv2ndPPPerc(BigDecimal reserv2ndPPPerc) {
        this.reserv2ndPPPerc = reserv2ndPPPerc;
    }

    public BigDecimal getReservNthPPPerc() {
        return reservNthPPPerc;
    }

    public void setReservNthPPPerc(BigDecimal reservNthPPPerc) {
        this.reservNthPPPerc = reservNthPPPerc;
    }

    public String getConfigId() {
        return configId;
    }

    public void setConfigId(String configId) {
        this.configId = configId;
    }

    public BigDecimal getTotalWithAdjustments() {
        return totalWithAdjustments;
    }

    public void setTotalWithAdjustments(BigDecimal totalWithAdjustments) {
        this.totalWithAdjustments = totalWithAdjustments;
    }

    public String getWasReserved() {
        return wasReserved;
    }

    public void setWasReserved(String wasReserved) {
        this.wasReserved = wasReserved;
    }

    public LocalDateTime getLastUpdatedStamp() {
        return lastUpdatedStamp;
    }

    public void setLastUpdatedStamp(LocalDateTime lastUpdatedStamp) {
        this.lastUpdatedStamp = lastUpdatedStamp;
    }

    public LocalDateTime getLastUpdatedTxStamp() {
        return lastUpdatedTxStamp;
    }

    public void setLastUpdatedTxStamp(LocalDateTime lastUpdatedTxStamp) {
        this.lastUpdatedTxStamp = lastUpdatedTxStamp;
    }

    public LocalDateTime getCreatedStamp() {
        return createdStamp;
    }

    public void setCreatedStamp(LocalDateTime createdStamp) {
        this.createdStamp = createdStamp;
    }

    public LocalDateTime getCreatedTxStamp() {
        return createdTxStamp;
    }

    public void setCreatedTxStamp(LocalDateTime createdTxStamp) {
        this.createdTxStamp = createdTxStamp;
    }

}