package com.example.erp.oms.common.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class TelecomGatewayConfig {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String telecomGatewayConfigId;

    private String description;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTelecomGatewayConfigId() {
        return telecomGatewayConfigId;
    }

    public void setTelecomGatewayConfigId(String telecomGatewayConfigId) {
        this.telecomGatewayConfigId = telecomGatewayConfigId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
