package com.monash.erp.oms.accounting.entity;

import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Getter;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.math.BigDecimal;

@Entity
@NoArgsConstructor
@Setter
@Getter
public class PaymentGatewayOrbital {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String paymentGatewayConfigId;

    private String username;

    private String connectionPassword;

    private String merchantId;

    private String engineClass;

    private String hostName;

    private BigDecimal port;

    private String hostNameFailover;

    private BigDecimal portFailover;

    private BigDecimal connectionTimeoutSeconds;

    private BigDecimal readTimeoutSeconds;

    private String authorizationURI;

    private String sdkVersion;

    private String sslSocketFactory;

    private String responseType;
public void setId(Long id) {
        this.id = id;
    }
public void setPaymentGatewayConfigId(String paymentGatewayConfigId) {
        this.paymentGatewayConfigId = paymentGatewayConfigId;
    }
public void setUsername(String username) {
        this.username = username;
    }
public void setConnectionPassword(String connectionPassword) {
        this.connectionPassword = connectionPassword;
    }
public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }
public void setEngineClass(String engineClass) {
        this.engineClass = engineClass;
    }
public void setHostName(String hostName) {
        this.hostName = hostName;
    }
public void setPort(BigDecimal port) {
        this.port = port;
    }
public void setHostNameFailover(String hostNameFailover) {
        this.hostNameFailover = hostNameFailover;
    }
public void setPortFailover(BigDecimal portFailover) {
        this.portFailover = portFailover;
    }
public void setConnectionTimeoutSeconds(BigDecimal connectionTimeoutSeconds) {
        this.connectionTimeoutSeconds = connectionTimeoutSeconds;
    }
public void setReadTimeoutSeconds(BigDecimal readTimeoutSeconds) {
        this.readTimeoutSeconds = readTimeoutSeconds;
    }
public void setAuthorizationURI(String authorizationURI) {
        this.authorizationURI = authorizationURI;
    }
public void setSdkVersion(String sdkVersion) {
        this.sdkVersion = sdkVersion;
    }
public void setSslSocketFactory(String sslSocketFactory) {
        this.sslSocketFactory = sslSocketFactory;
    }
public void setResponseType(String responseType) {
        this.responseType = responseType;
    }
}
