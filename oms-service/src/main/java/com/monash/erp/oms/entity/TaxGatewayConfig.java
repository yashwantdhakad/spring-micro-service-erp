package com.monash.erp.oms.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity
public class TaxGatewayConfig extends AuditableEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String taxGatewayConfigId;
    private String taxGatewayConfTypeId;
    private String description;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTaxGatewayConfigId() {
        return taxGatewayConfigId;
    }

    public void setTaxGatewayConfigId(String taxGatewayConfigId) {
        this.taxGatewayConfigId = taxGatewayConfigId;
    }

    public String getTaxGatewayConfTypeId() {
        return taxGatewayConfTypeId;
    }

    public void setTaxGatewayConfTypeId(String taxGatewayConfTypeId) {
        this.taxGatewayConfTypeId = taxGatewayConfTypeId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }




}