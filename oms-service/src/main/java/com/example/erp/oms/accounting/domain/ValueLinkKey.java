package com.example.erp.oms.accounting.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
public class ValueLinkKey {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String merchantId;

    private String publicKey;

    private String privateKey;

    private String exchangeKey;

    private String workingKey;

    private BigDecimal workingKeyIndex;

    private String lastWorkingKey;

    private LocalDateTime createdDate;

    private String createdByTerminal;

    private String createdByUserLogin;

    private LocalDateTime lastModifiedDate;

    private String lastModifiedByTerminal;

    private String lastModifiedByUserLogin;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    public String getPublicKey() {
        return publicKey;
    }

    public void setPublicKey(String publicKey) {
        this.publicKey = publicKey;
    }

    public String getPrivateKey() {
        return privateKey;
    }

    public void setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
    }

    public String getExchangeKey() {
        return exchangeKey;
    }

    public void setExchangeKey(String exchangeKey) {
        this.exchangeKey = exchangeKey;
    }

    public String getWorkingKey() {
        return workingKey;
    }

    public void setWorkingKey(String workingKey) {
        this.workingKey = workingKey;
    }

    public BigDecimal getWorkingKeyIndex() {
        return workingKeyIndex;
    }

    public void setWorkingKeyIndex(BigDecimal workingKeyIndex) {
        this.workingKeyIndex = workingKeyIndex;
    }

    public String getLastWorkingKey() {
        return lastWorkingKey;
    }

    public void setLastWorkingKey(String lastWorkingKey) {
        this.lastWorkingKey = lastWorkingKey;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    public String getCreatedByTerminal() {
        return createdByTerminal;
    }

    public void setCreatedByTerminal(String createdByTerminal) {
        this.createdByTerminal = createdByTerminal;
    }

    public String getCreatedByUserLogin() {
        return createdByUserLogin;
    }

    public void setCreatedByUserLogin(String createdByUserLogin) {
        this.createdByUserLogin = createdByUserLogin;
    }

    public LocalDateTime getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(LocalDateTime lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public String getLastModifiedByTerminal() {
        return lastModifiedByTerminal;
    }

    public void setLastModifiedByTerminal(String lastModifiedByTerminal) {
        this.lastModifiedByTerminal = lastModifiedByTerminal;
    }

    public String getLastModifiedByUserLogin() {
        return lastModifiedByUserLogin;
    }

    public void setLastModifiedByUserLogin(String lastModifiedByUserLogin) {
        this.lastModifiedByUserLogin = lastModifiedByUserLogin;
    }
}
