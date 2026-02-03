package com.monash.erp.wms.entity;

import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Getter;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@Setter
@Getter
public class ApiGatewayRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String gatewayRequestId;
    private String gatewayRequest;
    private String gatewayResponse;
    private String statusId;
    private LocalDateTime lastUpdatedStamp;
    private LocalDateTime lastUpdatedTxStamp;
    private LocalDateTime createdStamp;
    private LocalDateTime createdTxStamp;
    private String externalId;
    private String internalId;
    private String flowType;
    private String description;
public void setId(Long id) {
        this.id = id;
    }
public void setGatewayRequestId(String gatewayRequestId) {
        this.gatewayRequestId = gatewayRequestId;
    }
public void setGatewayRequest(String gatewayRequest) {
        this.gatewayRequest = gatewayRequest;
    }
public void setGatewayResponse(String gatewayResponse) {
        this.gatewayResponse = gatewayResponse;
    }
public void setStatusId(String statusId) {
        this.statusId = statusId;
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
public void setExternalId(String externalId) {
        this.externalId = externalId;
    }
public void setInternalId(String internalId) {
        this.internalId = internalId;
    }
public void setFlowType(String flowType) {
        this.flowType = flowType;
    }
public void setDescription(String description) {
        this.description = description;
    }

}
