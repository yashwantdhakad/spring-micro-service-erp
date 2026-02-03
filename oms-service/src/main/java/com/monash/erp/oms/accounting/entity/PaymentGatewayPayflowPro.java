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
public class PaymentGatewayPayflowPro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String paymentGatewayConfigId;

    private String certsPath;

    private String hostAddress;

    private BigDecimal hostPort;

    private BigDecimal timeout;

    private String proxyAddress;

    private BigDecimal proxyPort;

    private String proxyLogon;

    private String proxyPassword;

    private String vendor;

    private String userId;

    private String pwd;

    private String partner;

    private Boolean checkAvs;

    private Boolean checkCvv2;

    private Boolean preAuth;

    private String enableTransmit;

    private String logFileName;

    private BigDecimal loggingLevel;

    private BigDecimal maxLogFileSize;

    private Boolean stackTraceOn;

    private String redirectUrl;

    private String returnUrl;

    private String cancelReturnUrl;
public void setId(Long id) {
        this.id = id;
    }
public void setPaymentGatewayConfigId(String paymentGatewayConfigId) {
        this.paymentGatewayConfigId = paymentGatewayConfigId;
    }
public void setCertsPath(String certsPath) {
        this.certsPath = certsPath;
    }
public void setHostAddress(String hostAddress) {
        this.hostAddress = hostAddress;
    }
public void setHostPort(BigDecimal hostPort) {
        this.hostPort = hostPort;
    }
public void setTimeout(BigDecimal timeout) {
        this.timeout = timeout;
    }
public void setProxyAddress(String proxyAddress) {
        this.proxyAddress = proxyAddress;
    }
public void setProxyPort(BigDecimal proxyPort) {
        this.proxyPort = proxyPort;
    }
public void setProxyLogon(String proxyLogon) {
        this.proxyLogon = proxyLogon;
    }
public void setProxyPassword(String proxyPassword) {
        this.proxyPassword = proxyPassword;
    }
public void setVendor(String vendor) {
        this.vendor = vendor;
    }
public void setUserId(String userId) {
        this.userId = userId;
    }
public void setPwd(String pwd) {
        this.pwd = pwd;
    }
public void setPartner(String partner) {
        this.partner = partner;
    }
public void setCheckAvs(Boolean checkAvs) {
        this.checkAvs = checkAvs;
    }
public void setCheckCvv2(Boolean checkCvv2) {
        this.checkCvv2 = checkCvv2;
    }
public void setPreAuth(Boolean preAuth) {
        this.preAuth = preAuth;
    }
public void setEnableTransmit(String enableTransmit) {
        this.enableTransmit = enableTransmit;
    }
public void setLogFileName(String logFileName) {
        this.logFileName = logFileName;
    }
public void setLoggingLevel(BigDecimal loggingLevel) {
        this.loggingLevel = loggingLevel;
    }
public void setMaxLogFileSize(BigDecimal maxLogFileSize) {
        this.maxLogFileSize = maxLogFileSize;
    }
public void setStackTraceOn(Boolean stackTraceOn) {
        this.stackTraceOn = stackTraceOn;
    }
public void setRedirectUrl(String redirectUrl) {
        this.redirectUrl = redirectUrl;
    }
public void setReturnUrl(String returnUrl) {
        this.returnUrl = returnUrl;
    }
public void setCancelReturnUrl(String cancelReturnUrl) {
        this.cancelReturnUrl = cancelReturnUrl;
    }
}
