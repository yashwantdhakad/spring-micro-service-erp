package com.monash.erp.wms.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ProductStorePaymentSetting {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String productStoreId;
    private String paymentMethodTypeId;
    private String paymentServiceTypeEnumId;
    private String paymentService;
    private String paymentCustomMethodId;
    private String paymentGatewayConfigId;
    private String paymentPropertiesPath;
    private String applyToAllProducts;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductStoreId() {
        return productStoreId;
    }

    public void setProductStoreId(String productStoreId) {
        this.productStoreId = productStoreId;
    }

    public String getPaymentMethodTypeId() {
        return paymentMethodTypeId;
    }

    public void setPaymentMethodTypeId(String paymentMethodTypeId) {
        this.paymentMethodTypeId = paymentMethodTypeId;
    }

    public String getPaymentServiceTypeEnumId() {
        return paymentServiceTypeEnumId;
    }

    public void setPaymentServiceTypeEnumId(String paymentServiceTypeEnumId) {
        this.paymentServiceTypeEnumId = paymentServiceTypeEnumId;
    }

    public String getPaymentService() {
        return paymentService;
    }

    public void setPaymentService(String paymentService) {
        this.paymentService = paymentService;
    }

    public String getPaymentCustomMethodId() {
        return paymentCustomMethodId;
    }

    public void setPaymentCustomMethodId(String paymentCustomMethodId) {
        this.paymentCustomMethodId = paymentCustomMethodId;
    }

    public String getPaymentGatewayConfigId() {
        return paymentGatewayConfigId;
    }

    public void setPaymentGatewayConfigId(String paymentGatewayConfigId) {
        this.paymentGatewayConfigId = paymentGatewayConfigId;
    }

    public String getPaymentPropertiesPath() {
        return paymentPropertiesPath;
    }

    public void setPaymentPropertiesPath(String paymentPropertiesPath) {
        this.paymentPropertiesPath = paymentPropertiesPath;
    }

    public String getApplyToAllProducts() {
        return applyToAllProducts;
    }

    public void setApplyToAllProducts(String applyToAllProducts) {
        this.applyToAllProducts = applyToAllProducts;
    }

}