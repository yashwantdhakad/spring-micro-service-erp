package com.example.erp.wms.ofbiz.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ShipmentGatewayDhl {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String shipmentGatewayConfigId;
    private String connectUrl;
    private String connectTimeout;
    private String headVersion;
    private String headAction;
    private String accessUserId;
    private String accessPassword;
    private String accessAccountNbr;
    private String accessShippingKey;
    private String labelImageFormat;
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

    public String getConnectTimeout() {
        return connectTimeout;
    }

    public void setConnectTimeout(String connectTimeout) {
        this.connectTimeout = connectTimeout;
    }

    public String getHeadVersion() {
        return headVersion;
    }

    public void setHeadVersion(String headVersion) {
        this.headVersion = headVersion;
    }

    public String getHeadAction() {
        return headAction;
    }

    public void setHeadAction(String headAction) {
        this.headAction = headAction;
    }

    public String getAccessUserId() {
        return accessUserId;
    }

    public void setAccessUserId(String accessUserId) {
        this.accessUserId = accessUserId;
    }

    public String getAccessPassword() {
        return accessPassword;
    }

    public void setAccessPassword(String accessPassword) {
        this.accessPassword = accessPassword;
    }

    public String getAccessAccountNbr() {
        return accessAccountNbr;
    }

    public void setAccessAccountNbr(String accessAccountNbr) {
        this.accessAccountNbr = accessAccountNbr;
    }

    public String getAccessShippingKey() {
        return accessShippingKey;
    }

    public void setAccessShippingKey(String accessShippingKey) {
        this.accessShippingKey = accessShippingKey;
    }

    public String getLabelImageFormat() {
        return labelImageFormat;
    }

    public void setLabelImageFormat(String labelImageFormat) {
        this.labelImageFormat = labelImageFormat;
    }

    public String getRateEstimateTemplate() {
        return rateEstimateTemplate;
    }

    public void setRateEstimateTemplate(String rateEstimateTemplate) {
        this.rateEstimateTemplate = rateEstimateTemplate;
    }

}