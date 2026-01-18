package com.monash.erp.wms.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ShipmentGatewayFedex {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String shipmentGatewayConfigId;
    private String connectUrl;
    private String connectSoapUrl;
    private String connectTimeout;
    private String accessAccountNbr;
    private String accessMeterNumber;
    private String accessUserKey;
    private String accessUserPwd;
    private String labelImageType;
    private String defaultDropoffType;
    private String defaultPackagingType;
    private String templateShipment;
    private String templateSubscription;
    private String rateEstimateTemplate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getShipmentGatewayConfigId() {
        return shipmentGatewayConfigId;
    }

    public void setShipmentGatewayConfigId(String shipmentGatewayConfigId) {
        this.shipmentGatewayConfigId = shipmentGatewayConfigId;
    }

    public String getConnectUrl() {
        return connectUrl;
    }

    public void setConnectUrl(String connectUrl) {
        this.connectUrl = connectUrl;
    }

    public String getConnectSoapUrl() {
        return connectSoapUrl;
    }

    public void setConnectSoapUrl(String connectSoapUrl) {
        this.connectSoapUrl = connectSoapUrl;
    }

    public String getConnectTimeout() {
        return connectTimeout;
    }

    public void setConnectTimeout(String connectTimeout) {
        this.connectTimeout = connectTimeout;
    }

    public String getAccessAccountNbr() {
        return accessAccountNbr;
    }

    public void setAccessAccountNbr(String accessAccountNbr) {
        this.accessAccountNbr = accessAccountNbr;
    }

    public String getAccessMeterNumber() {
        return accessMeterNumber;
    }

    public void setAccessMeterNumber(String accessMeterNumber) {
        this.accessMeterNumber = accessMeterNumber;
    }

    public String getAccessUserKey() {
        return accessUserKey;
    }

    public void setAccessUserKey(String accessUserKey) {
        this.accessUserKey = accessUserKey;
    }

    public String getAccessUserPwd() {
        return accessUserPwd;
    }

    public void setAccessUserPwd(String accessUserPwd) {
        this.accessUserPwd = accessUserPwd;
    }

    public String getLabelImageType() {
        return labelImageType;
    }

    public void setLabelImageType(String labelImageType) {
        this.labelImageType = labelImageType;
    }

    public String getDefaultDropoffType() {
        return defaultDropoffType;
    }

    public void setDefaultDropoffType(String defaultDropoffType) {
        this.defaultDropoffType = defaultDropoffType;
    }

    public String getDefaultPackagingType() {
        return defaultPackagingType;
    }

    public void setDefaultPackagingType(String defaultPackagingType) {
        this.defaultPackagingType = defaultPackagingType;
    }

    public String getTemplateShipment() {
        return templateShipment;
    }

    public void setTemplateShipment(String templateShipment) {
        this.templateShipment = templateShipment;
    }

    public String getTemplateSubscription() {
        return templateSubscription;
    }

    public void setTemplateSubscription(String templateSubscription) {
        this.templateSubscription = templateSubscription;
    }

    public String getRateEstimateTemplate() {
        return rateEstimateTemplate;
    }

    public void setRateEstimateTemplate(String rateEstimateTemplate) {
        this.rateEstimateTemplate = rateEstimateTemplate;
    }

}