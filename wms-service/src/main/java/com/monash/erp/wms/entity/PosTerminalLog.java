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
public class PosTerminalLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String posTerminalLogId;
    private String posTerminalId;
    private String transactionId;
    private BigDecimal itemCount;
    private String orderId;
    private String returnId;
    private String userLoginId;
    private String statusId;
    private LocalDateTime logStartDateTime;
    private LocalDateTime logEndDateTime;
    private LocalDateTime lastUpdatedStamp;
    private LocalDateTime lastUpdatedTxStamp;
    private LocalDateTime createdStamp;
    private LocalDateTime createdTxStamp;
public void setId(Long id) {
        this.id = id;
    }
public void setPosTerminalLogId(String posTerminalLogId) {
        this.posTerminalLogId = posTerminalLogId;
    }
public void setPosTerminalId(String posTerminalId) {
        this.posTerminalId = posTerminalId;
    }
public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }
public void setItemCount(BigDecimal itemCount) {
        this.itemCount = itemCount;
    }
public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
public void setReturnId(String returnId) {
        this.returnId = returnId;
    }
public void setUserLoginId(String userLoginId) {
        this.userLoginId = userLoginId;
    }
public void setStatusId(String statusId) {
        this.statusId = statusId;
    }
public void setLogStartDateTime(LocalDateTime logStartDateTime) {
        this.logStartDateTime = logStartDateTime;
    }
public void setLogEndDateTime(LocalDateTime logEndDateTime) {
        this.logEndDateTime = logEndDateTime;
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
