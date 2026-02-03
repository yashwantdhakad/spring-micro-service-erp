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
public void setHeadVersion(String headVersion) {
        this.headVersion = headVersion;
    }
public void setHeadAction(String headAction) {
        this.headAction = headAction;
    }
public void setAccessUserId(String accessUserId) {
        this.accessUserId = accessUserId;
    }
public void setAccessPassword(String accessPassword) {
        this.accessPassword = accessPassword;
    }
public void setAccessAccountNbr(String accessAccountNbr) {
        this.accessAccountNbr = accessAccountNbr;
    }
public void setAccessShippingKey(String accessShippingKey) {
        this.accessShippingKey = accessShippingKey;
    }
public void setLabelImageFormat(String labelImageFormat) {
        this.labelImageFormat = labelImageFormat;
    }
public void setRateEstimateTemplate(String rateEstimateTemplate) {
        this.rateEstimateTemplate = rateEstimateTemplate;
    }

}
