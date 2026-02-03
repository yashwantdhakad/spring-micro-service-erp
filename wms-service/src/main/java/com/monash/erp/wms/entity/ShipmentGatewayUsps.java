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
public class ShipmentGatewayUsps {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String shipmentGatewayConfigId;
    private String connectUrl;
    private String connectUrlLabels;
    private String connectTimeout;
    private String accessUserId;
    private String accessPassword;
    private String maxEstimateWeight;
    private String test;
public void setId(Long id) {
        this.id = id;
    }
public void setShipmentGatewayConfigId(String shipmentGatewayConfigId) {
        this.shipmentGatewayConfigId = shipmentGatewayConfigId;
    }
public void setConnectUrl(String connectUrl) {
        this.connectUrl = connectUrl;
    }
public void setConnectUrlLabels(String connectUrlLabels) {
        this.connectUrlLabels = connectUrlLabels;
    }
public void setConnectTimeout(String connectTimeout) {
        this.connectTimeout = connectTimeout;
    }
public void setAccessUserId(String accessUserId) {
        this.accessUserId = accessUserId;
    }
public void setAccessPassword(String accessPassword) {
        this.accessPassword = accessPassword;
    }
public void setMaxEstimateWeight(String maxEstimateWeight) {
        this.maxEstimateWeight = maxEstimateWeight;
    }
public void setTest(String test) {
        this.test = test;
    }

}
