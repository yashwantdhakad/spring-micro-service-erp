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
public void setId(Long id) {
        this.id = id;
    }
public void setShipmentGatewayConfigId(String shipmentGatewayConfigId) {
        this.shipmentGatewayConfigId = shipmentGatewayConfigId;
    }
public void setConnectUrl(String connectUrl) {
        this.connectUrl = connectUrl;
    }
public void setConnectSoapUrl(String connectSoapUrl) {
        this.connectSoapUrl = connectSoapUrl;
    }
public void setConnectTimeout(String connectTimeout) {
        this.connectTimeout = connectTimeout;
    }
public void setAccessAccountNbr(String accessAccountNbr) {
        this.accessAccountNbr = accessAccountNbr;
    }
public void setAccessMeterNumber(String accessMeterNumber) {
        this.accessMeterNumber = accessMeterNumber;
    }
public void setAccessUserKey(String accessUserKey) {
        this.accessUserKey = accessUserKey;
    }
public void setAccessUserPwd(String accessUserPwd) {
        this.accessUserPwd = accessUserPwd;
    }
public void setLabelImageType(String labelImageType) {
        this.labelImageType = labelImageType;
    }
public void setDefaultDropoffType(String defaultDropoffType) {
        this.defaultDropoffType = defaultDropoffType;
    }
public void setDefaultPackagingType(String defaultPackagingType) {
        this.defaultPackagingType = defaultPackagingType;
    }
public void setTemplateShipment(String templateShipment) {
        this.templateShipment = templateShipment;
    }
public void setTemplateSubscription(String templateSubscription) {
        this.templateSubscription = templateSubscription;
    }
public void setRateEstimateTemplate(String rateEstimateTemplate) {
        this.rateEstimateTemplate = rateEstimateTemplate;
    }

}
