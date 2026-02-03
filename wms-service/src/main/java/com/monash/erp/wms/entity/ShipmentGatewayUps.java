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
public class ShipmentGatewayUps {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String shipmentGatewayConfigId;
    private String connectUrl;
    private String connectTimeout;
    private String shipperNumber;
    private String billShipperAccountNumber;
    private String accessLicenseNumber;
    private String accessUserId;
    private String accessPassword;
    private String saveCertInfo;
    private String saveCertPath;
    private String shipperPickupType;
    private String customerClassification;
    private String maxEstimateWeight;
    private String minEstimateWeight;
    private String codAllowCod;
    private String codSurchargeAmount;
    private String codSurchargeCurrencyUomId;
    private String codSurchargeApplyToPackage;
    private String codFundsCode;
    private String defaultReturnLabelMemo;
    private String defaultReturnLabelSubject;
public void setId(Long id) {
        this.id = id;
    }
public void setShipmentGatewayConfigId(String shipmentGatewayConfigId) {
        this.shipmentGatewayConfigId = shipmentGatewayConfigId;
    }
public void setConnectUrl(String connectUrl) {
        this.connectUrl = connectUrl;
    }
public void setConnectTimeout(String connectTimeout) {
        this.connectTimeout = connectTimeout;
    }
public void setShipperNumber(String shipperNumber) {
        this.shipperNumber = shipperNumber;
    }
public void setBillShipperAccountNumber(String billShipperAccountNumber) {
        this.billShipperAccountNumber = billShipperAccountNumber;
    }
public void setAccessLicenseNumber(String accessLicenseNumber) {
        this.accessLicenseNumber = accessLicenseNumber;
    }
public void setAccessUserId(String accessUserId) {
        this.accessUserId = accessUserId;
    }
public void setAccessPassword(String accessPassword) {
        this.accessPassword = accessPassword;
    }
public void setSaveCertInfo(String saveCertInfo) {
        this.saveCertInfo = saveCertInfo;
    }
public void setSaveCertPath(String saveCertPath) {
        this.saveCertPath = saveCertPath;
    }
public void setShipperPickupType(String shipperPickupType) {
        this.shipperPickupType = shipperPickupType;
    }
public void setCustomerClassification(String customerClassification) {
        this.customerClassification = customerClassification;
    }
public void setMaxEstimateWeight(String maxEstimateWeight) {
        this.maxEstimateWeight = maxEstimateWeight;
    }
public void setMinEstimateWeight(String minEstimateWeight) {
        this.minEstimateWeight = minEstimateWeight;
    }
public void setCodAllowCod(String codAllowCod) {
        this.codAllowCod = codAllowCod;
    }
public void setCodSurchargeAmount(String codSurchargeAmount) {
        this.codSurchargeAmount = codSurchargeAmount;
    }
public void setCodSurchargeCurrencyUomId(String codSurchargeCurrencyUomId) {
        this.codSurchargeCurrencyUomId = codSurchargeCurrencyUomId;
    }
public void setCodSurchargeApplyToPackage(String codSurchargeApplyToPackage) {
        this.codSurchargeApplyToPackage = codSurchargeApplyToPackage;
    }
public void setCodFundsCode(String codFundsCode) {
        this.codFundsCode = codFundsCode;
    }
public void setDefaultReturnLabelMemo(String defaultReturnLabelMemo) {
        this.defaultReturnLabelMemo = defaultReturnLabelMemo;
    }
public void setDefaultReturnLabelSubject(String defaultReturnLabelSubject) {
        this.defaultReturnLabelSubject = defaultReturnLabelSubject;
    }

}
