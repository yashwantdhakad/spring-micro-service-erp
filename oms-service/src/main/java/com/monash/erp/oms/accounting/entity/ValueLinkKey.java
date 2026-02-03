package com.monash.erp.oms.accounting.entity;

import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Getter;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@Setter
@Getter
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
public void setId(Long id) {
        this.id = id;
    }
public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }
public void setPublicKey(String publicKey) {
        this.publicKey = publicKey;
    }
public void setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
    }
public void setExchangeKey(String exchangeKey) {
        this.exchangeKey = exchangeKey;
    }
public void setWorkingKey(String workingKey) {
        this.workingKey = workingKey;
    }
public void setWorkingKeyIndex(BigDecimal workingKeyIndex) {
        this.workingKeyIndex = workingKeyIndex;
    }
public void setLastWorkingKey(String lastWorkingKey) {
        this.lastWorkingKey = lastWorkingKey;
    }
public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }
public void setCreatedByTerminal(String createdByTerminal) {
        this.createdByTerminal = createdByTerminal;
    }
public void setCreatedByUserLogin(String createdByUserLogin) {
        this.createdByUserLogin = createdByUserLogin;
    }
public void setLastModifiedDate(LocalDateTime lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }
public void setLastModifiedByTerminal(String lastModifiedByTerminal) {
        this.lastModifiedByTerminal = lastModifiedByTerminal;
    }
public void setLastModifiedByUserLogin(String lastModifiedByUserLogin) {
        this.lastModifiedByUserLogin = lastModifiedByUserLogin;
    }
}
