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
public void setId(Long id) {
        this.id = id;
    }
public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
public void setOrderItemSeqId(String orderItemSeqId) {
        this.orderItemSeqId = orderItemSeqId;
    }
public void setOrderDateDimId(String orderDateDimId) {
        this.orderDateDimId = orderDateDimId;
    }
public void setProductDimId(String productDimId) {
        this.productDimId = productDimId;
    }
public void setOrigCurrencyDimId(String origCurrencyDimId) {
        this.origCurrencyDimId = origCurrencyDimId;
    }
public void setBillToCustomerDimId(String billToCustomerDimId) {
        this.billToCustomerDimId = billToCustomerDimId;
    }
public void setProductStoreId(String productStoreId) {
        this.productStoreId = productStoreId;
    }
public void setSalesChannelEnumId(String salesChannelEnumId) {
        this.salesChannelEnumId = salesChannelEnumId;
    }
public void setSaleChannel(String saleChannel) {
        this.saleChannel = saleChannel;
    }
public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }
public void setVisitId(String visitId) {
        this.visitId = visitId;
    }
public void setInitialReferrer(String initialReferrer) {
        this.initialReferrer = initialReferrer;
    }
public void setProductPromoCode(String productPromoCode) {
        this.productPromoCode = productPromoCode;
    }
public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }
public void setExtGrossAmount(BigDecimal extGrossAmount) {
        this.extGrossAmount = extGrossAmount;
    }
public void setExtGrossCost(BigDecimal extGrossCost) {
        this.extGrossCost = extGrossCost;
    }
public void setExtDiscountAmount(BigDecimal extDiscountAmount) {
        this.extDiscountAmount = extDiscountAmount;
    }
public void setExtNetAmount(BigDecimal extNetAmount) {
        this.extNetAmount = extNetAmount;
    }
public void setExtShippingAmount(BigDecimal extShippingAmount) {
        this.extShippingAmount = extShippingAmount;
    }
public void setExtTaxAmount(BigDecimal extTaxAmount) {
        this.extTaxAmount = extTaxAmount;
    }
public void setGrossSales(BigDecimal grossSales) {
        this.grossSales = grossSales;
    }
public void setGrossMerchandizeSales(BigDecimal grossMerchandizeSales) {
        this.grossMerchandizeSales = grossMerchandizeSales;
    }
public void setGrossMerchandizeProfit(BigDecimal grossMerchandizeProfit) {
        this.grossMerchandizeProfit = grossMerchandizeProfit;
    }
public void setGrossShippingProfit(BigDecimal grossShippingProfit) {
        this.grossShippingProfit = grossShippingProfit;
    }
public void setGrossProfit(BigDecimal grossProfit) {
        this.grossProfit = grossProfit;
    }
public void setEBay(BigDecimal eBay) {
        this.eBay = eBay;
    }
public void setRRC(BigDecimal rRC) {
        this.rRC = rRC;
    }
public void setOtherFree(BigDecimal otherFree) {
        this.otherFree = otherFree;
    }
public void setNBO(BigDecimal nBO) {
        this.nBO = nBO;
    }
public void setCountDate(BigDecimal countDate) {
        this.countDate = countDate;
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
