package com.monash.erp.wms.entity;

import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Getter;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@NoArgsConstructor
@Setter
@Getter
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
public void setId(Long id) {
        this.id = id;
    }
public void setProductStoreId(String productStoreId) {
        this.productStoreId = productStoreId;
    }
public void setPaymentMethodTypeId(String paymentMethodTypeId) {
        this.paymentMethodTypeId = paymentMethodTypeId;
    }
public void setPaymentServiceTypeEnumId(String paymentServiceTypeEnumId) {
        this.paymentServiceTypeEnumId = paymentServiceTypeEnumId;
    }
public void setPaymentService(String paymentService) {
        this.paymentService = paymentService;
    }
public void setPaymentCustomMethodId(String paymentCustomMethodId) {
        this.paymentCustomMethodId = paymentCustomMethodId;
    }
public void setPaymentGatewayConfigId(String paymentGatewayConfigId) {
        this.paymentGatewayConfigId = paymentGatewayConfigId;
    }
public void setPaymentPropertiesPath(String paymentPropertiesPath) {
        this.paymentPropertiesPath = paymentPropertiesPath;
    }
public void setApplyToAllProducts(String applyToAllProducts) {
        this.applyToAllProducts = applyToAllProducts;
    }

}
