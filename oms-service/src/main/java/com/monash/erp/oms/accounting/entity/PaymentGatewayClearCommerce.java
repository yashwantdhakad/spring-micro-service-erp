package com.monash.erp.oms.accounting.entity;

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
public void setId(Long id) {
        this.id = id;
    }
public void setPaymentGatewayConfigId(String paymentGatewayConfigId) {
        this.paymentGatewayConfigId = paymentGatewayConfigId;
    }
public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }
public void setGroupId(String groupId) {
        this.groupId = groupId;
    }
public void setClientId(String clientId) {
        this.clientId = clientId;
    }
public void setUsername(String username) {
        this.username = username;
    }
public void setPwd(String pwd) {
        this.pwd = pwd;
    }
public void setUserAlias(String userAlias) {
        this.userAlias = userAlias;
    }
public void setEffectiveAlias(String effectiveAlias) {
        this.effectiveAlias = effectiveAlias;
    }
public void setProcessMode(Boolean processMode) {
        this.processMode = processMode;
    }
public void setServerURL(String serverURL) {
        this.serverURL = serverURL;
    }
public void setEnableCVM(Boolean enableCVM) {
        this.enableCVM = enableCVM;
    }
}
