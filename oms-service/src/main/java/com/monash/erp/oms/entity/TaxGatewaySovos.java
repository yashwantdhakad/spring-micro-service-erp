package com.monash.erp.oms.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
public class TaxGatewaySovos extends AuditableEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String taxGatewayConfigId;
    private String connectUrl;
    private BigDecimal connectTimeout;
    private String username;
    private String password;
    private String orgCode;

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

    public String getConnectUrl() {
        return connectUrl;
    }

    public void setConnectUrl(String connectUrl) {
        this.connectUrl = connectUrl;
    }

    public BigDecimal getConnectTimeout() {
        return connectTimeout;
    }

    public void setConnectTimeout(BigDecimal connectTimeout) {
        this.connectTimeout = connectTimeout;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getOrgCode() {
        return orgCode;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
    }




}