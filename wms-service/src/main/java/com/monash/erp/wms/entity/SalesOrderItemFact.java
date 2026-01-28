package com.monash.erp.wms.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
public class SalesOrderItemFact {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String orderId;
    private String orderItemSeqId;
    private String orderDateDimId;
    private String productDimId;
    private String origCurrencyDimId;
    private String billToCustomerDimId;
    private String productStoreId;
    private String salesChannelEnumId;
    private String saleChannel;
    private String orderStatus;
    private String visitId;
    private String initialReferrer;
    private String productPromoCode;
    private String categoryName;
    private BigDecimal quantity;
    private BigDecimal extGrossAmount;
    private BigDecimal extGrossCost;
    private BigDecimal extDiscountAmount;
    private BigDecimal extNetAmount;
    private BigDecimal extShippingAmount;
    private BigDecimal extTaxAmount;
    private BigDecimal grossSales;
    private BigDecimal grossMerchandizeSales;
    private BigDecimal grossMerchandizeProfit;
    private BigDecimal grossShippingProfit;
    private BigDecimal grossProfit;
    private BigDecimal eBay;
    private BigDecimal rRC;
    private BigDecimal otherFree;
    private BigDecimal nBO;
    private BigDecimal countDate;
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

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderItemSeqId() {
        return orderItemSeqId;
    }

    public void setOrderItemSeqId(String orderItemSeqId) {
        this.orderItemSeqId = orderItemSeqId;
    }

    public String getOrderDateDimId() {
        return orderDateDimId;
    }

    public void setOrderDateDimId(String orderDateDimId) {
        this.orderDateDimId = orderDateDimId;
    }

    public String getProductDimId() {
        return productDimId;
    }

    public void setProductDimId(String productDimId) {
        this.productDimId = productDimId;
    }

    public String getOrigCurrencyDimId() {
        return origCurrencyDimId;
    }

    public void setOrigCurrencyDimId(String origCurrencyDimId) {
        this.origCurrencyDimId = origCurrencyDimId;
    }

    public String getBillToCustomerDimId() {
        return billToCustomerDimId;
    }

    public void setBillToCustomerDimId(String billToCustomerDimId) {
        this.billToCustomerDimId = billToCustomerDimId;
    }

    public String getProductStoreId() {
        return productStoreId;
    }

    public void setProductStoreId(String productStoreId) {
        this.productStoreId = productStoreId;
    }

    public String getSalesChannelEnumId() {
        return salesChannelEnumId;
    }

    public void setSalesChannelEnumId(String salesChannelEnumId) {
        this.salesChannelEnumId = salesChannelEnumId;
    }

    public String getSaleChannel() {
        return saleChannel;
    }

    public void setSaleChannel(String saleChannel) {
        this.saleChannel = saleChannel;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getVisitId() {
        return visitId;
    }

    public void setVisitId(String visitId) {
        this.visitId = visitId;
    }

    public String getInitialReferrer() {
        return initialReferrer;
    }

    public void setInitialReferrer(String initialReferrer) {
        this.initialReferrer = initialReferrer;
    }

    public String getProductPromoCode() {
        return productPromoCode;
    }

    public void setProductPromoCode(String productPromoCode) {
        this.productPromoCode = productPromoCode;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getExtGrossAmount() {
        return extGrossAmount;
    }

    public void setExtGrossAmount(BigDecimal extGrossAmount) {
        this.extGrossAmount = extGrossAmount;
    }

    public BigDecimal getExtGrossCost() {
        return extGrossCost;
    }

    public void setExtGrossCost(BigDecimal extGrossCost) {
        this.extGrossCost = extGrossCost;
    }

    public BigDecimal getExtDiscountAmount() {
        return extDiscountAmount;
    }

    public void setExtDiscountAmount(BigDecimal extDiscountAmount) {
        this.extDiscountAmount = extDiscountAmount;
    }

    public BigDecimal getExtNetAmount() {
        return extNetAmount;
    }

    public void setExtNetAmount(BigDecimal extNetAmount) {
        this.extNetAmount = extNetAmount;
    }

    public BigDecimal getExtShippingAmount() {
        return extShippingAmount;
    }

    public void setExtShippingAmount(BigDecimal extShippingAmount) {
        this.extShippingAmount = extShippingAmount;
    }

    public BigDecimal getExtTaxAmount() {
        return extTaxAmount;
    }

    public void setExtTaxAmount(BigDecimal extTaxAmount) {
        this.extTaxAmount = extTaxAmount;
    }

    public BigDecimal getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(BigDecimal grossSales) {
        this.grossSales = grossSales;
    }

    public BigDecimal getGrossMerchandizeSales() {
        return grossMerchandizeSales;
    }

    public void setGrossMerchandizeSales(BigDecimal grossMerchandizeSales) {
        this.grossMerchandizeSales = grossMerchandizeSales;
    }

    public BigDecimal getGrossMerchandizeProfit() {
        return grossMerchandizeProfit;
    }

    public void setGrossMerchandizeProfit(BigDecimal grossMerchandizeProfit) {
        this.grossMerchandizeProfit = grossMerchandizeProfit;
    }

    public BigDecimal getGrossShippingProfit() {
        return grossShippingProfit;
    }

    public void setGrossShippingProfit(BigDecimal grossShippingProfit) {
        this.grossShippingProfit = grossShippingProfit;
    }

    public BigDecimal getGrossProfit() {
        return grossProfit;
    }

    public void setGrossProfit(BigDecimal grossProfit) {
        this.grossProfit = grossProfit;
    }

    public BigDecimal getEBay() {
        return eBay;
    }

    public void setEBay(BigDecimal eBay) {
        this.eBay = eBay;
    }

    public BigDecimal getRRC() {
        return rRC;
    }

    public void setRRC(BigDecimal rRC) {
        this.rRC = rRC;
    }

    public BigDecimal getOtherFree() {
        return otherFree;
    }

    public void setOtherFree(BigDecimal otherFree) {
        this.otherFree = otherFree;
    }

    public BigDecimal getNBO() {
        return nBO;
    }

    public void setNBO(BigDecimal nBO) {
        this.nBO = nBO;
    }

    public BigDecimal getCountDate() {
        return countDate;
    }

    public void setCountDate(BigDecimal countDate) {
        this.countDate = countDate;
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