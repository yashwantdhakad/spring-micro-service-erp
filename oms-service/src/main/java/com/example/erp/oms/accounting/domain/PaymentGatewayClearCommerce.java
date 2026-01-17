package com.example.erp.oms.accounting.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class PaymentGatewayClearCommerce {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String paymentGatewayConfigId;

    private String sourceId;

    private String groupId;

    private String clientId;

    private String username;

    private String pwd;

    private String userAlias;

    private String effectiveAlias;

    private Boolean processMode;

    private String serverURL;

    private Boolean enableCVM;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPaymentGatewayConfigId() {
        return paymentGatewayConfigId;
    }

    public void setPaymentGatewayConfigId(String paymentGatewayConfigId) {
        this.paymentGatewayConfigId = paymentGatewayConfigId;
    }

    public String getSourceId() {
        return sourceId;
    }

    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getUserAlias() {
        return userAlias;
    }

    public void setUserAlias(String userAlias) {
        this.userAlias = userAlias;
    }

    public String getEffectiveAlias() {
        return effectiveAlias;
    }

    public void setEffectiveAlias(String effectiveAlias) {
        this.effectiveAlias = effectiveAlias;
    }

    public Boolean getProcessMode() {
        return processMode;
    }

    public void setProcessMode(Boolean processMode) {
        this.processMode = processMode;
    }

    public String getServerURL() {
        return serverURL;
    }

    public void setServerURL(String serverURL) {
        this.serverURL = serverURL;
    }

    public Boolean getEnableCVM() {
        return enableCVM;
    }

    public void setEnableCVM(Boolean enableCVM) {
        this.enableCVM = enableCVM;
    }
}
