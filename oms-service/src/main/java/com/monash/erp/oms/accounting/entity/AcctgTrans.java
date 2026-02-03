package com.monash.erp.oms.accounting.entity;

import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Getter;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@Setter
@Getter
public class AcctgTrans {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String acctgTransId;

    private String acctgTransTypeId;

    private String description;

    private LocalDateTime transactionDate;

    private Boolean isPosted;

    private LocalDateTime postedDate;

    private LocalDateTime scheduledPostingDate;

    private String glJournalId;

    private String glFiscalTypeId;

    private String voucherRef;

    private LocalDateTime voucherDate;

    private String groupStatusId;

    private String fixedAssetId;

    private String inventoryItemId;

    private String physicalInventoryId;

    private String partyId;

    private String roleTypeId;

    private String invoiceId;

    private String paymentId;

    private String finAccountTransId;

    private String shipmentId;

    private String receiptId;

    private String workEffortId;

    private String theirAcctgTransId;

    private LocalDateTime createdDate;

    private String createdByUserLogin;

    private LocalDateTime lastModifiedDate;

    private String lastModifiedByUserLogin;
public void setId(Long id) {
        this.id = id;
    }
public void setAcctgTransId(String acctgTransId) {
        this.acctgTransId = acctgTransId;
    }
public void setAcctgTransTypeId(String acctgTransTypeId) {
        this.acctgTransTypeId = acctgTransTypeId;
    }
public void setDescription(String description) {
        this.description = description;
    }
public void setTransactionDate(LocalDateTime transactionDate) {
        this.transactionDate = transactionDate;
    }
public void setIsPosted(Boolean isPosted) {
        this.isPosted = isPosted;
    }
public void setPostedDate(LocalDateTime postedDate) {
        this.postedDate = postedDate;
    }
public void setScheduledPostingDate(LocalDateTime scheduledPostingDate) {
        this.scheduledPostingDate = scheduledPostingDate;
    }
public void setGlJournalId(String glJournalId) {
        this.glJournalId = glJournalId;
    }
public void setGlFiscalTypeId(String glFiscalTypeId) {
        this.glFiscalTypeId = glFiscalTypeId;
    }
public void setVoucherRef(String voucherRef) {
        this.voucherRef = voucherRef;
    }
public void setVoucherDate(LocalDateTime voucherDate) {
        this.voucherDate = voucherDate;
    }
public void setGroupStatusId(String groupStatusId) {
        this.groupStatusId = groupStatusId;
    }
public void setFixedAssetId(String fixedAssetId) {
        this.fixedAssetId = fixedAssetId;
    }
public void setInventoryItemId(String inventoryItemId) {
        this.inventoryItemId = inventoryItemId;
    }
public void setPhysicalInventoryId(String physicalInventoryId) {
        this.physicalInventoryId = physicalInventoryId;
    }
public void setPartyId(String partyId) {
        this.partyId = partyId;
    }
public void setRoleTypeId(String roleTypeId) {
        this.roleTypeId = roleTypeId;
    }
public void setInvoiceId(String invoiceId) {
        this.invoiceId = invoiceId;
    }
public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }
public void setFinAccountTransId(String finAccountTransId) {
        this.finAccountTransId = finAccountTransId;
    }
public void setShipmentId(String shipmentId) {
        this.shipmentId = shipmentId;
    }
public void setReceiptId(String receiptId) {
        this.receiptId = receiptId;
    }
public void setWorkEffortId(String workEffortId) {
        this.workEffortId = workEffortId;
    }
public void setTheirAcctgTransId(String theirAcctgTransId) {
        this.theirAcctgTransId = theirAcctgTransId;
    }
public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }
public void setCreatedByUserLogin(String createdByUserLogin) {
        this.createdByUserLogin = createdByUserLogin;
    }
public void setLastModifiedDate(LocalDateTime lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }
public void setLastModifiedByUserLogin(String lastModifiedByUserLogin) {
        this.lastModifiedByUserLogin = lastModifiedByUserLogin;
    }
}
