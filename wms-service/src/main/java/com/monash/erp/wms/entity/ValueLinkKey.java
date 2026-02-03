package com.monash.erp.wms.entity;

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
    private LocalDateTime lastModifiedDate;
    private String lastModifiedByTerminal;
    private String lastModifiedByUserLogin;
    private LocalDateTime lastUpdatedStamp;
    private LocalDateTime lastUpdatedTxStamp;
    private LocalDateTime createdStamp;
    private LocalDateTime createdTxStamp;
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
public void setLastModifiedDate(LocalDateTime lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }
public void setLastModifiedByTerminal(String lastModifiedByTerminal) {
        this.lastModifiedByTerminal = lastModifiedByTerminal;
    }
public void setLastModifiedByUserLogin(String lastModifiedByUserLogin) {
        this.lastModifiedByUserLogin = lastModifiedByUserLogin;
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

}
