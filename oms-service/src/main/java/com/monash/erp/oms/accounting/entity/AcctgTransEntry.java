package com.monash.erp.oms.accounting.entity;

import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Getter;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@NoArgsConstructor
@Setter
@Getter
public class AcctgTransEntry {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String acctgTransId;

    private String acctgTransEntrySeqId;

    private String acctgTransEntryTypeId;

    private String description;

    private String voucherRef;

    private String partyId;

    private String roleTypeId;

    private String theirPartyId;

    private String productId;

    private String theirProductId;

    private String inventoryItemId;

    private String glAccountTypeId;

    private String glAccountId;

    private String organizationPartyId;

    private BigDecimal amount;

    private String currencyUomId;

    private BigDecimal origAmount;

    private String origCurrencyUomId;

    private Boolean debitCreditFlag;

    private LocalDate dueDate;

    private String groupId;

    private String taxId;

    private String reconcileStatusId;

    private String settlementTermId;

    private Boolean isSummary;
public void setId(Long id) {
        this.id = id;
    }
public void setAcctgTransId(String acctgTransId) {
        this.acctgTransId = acctgTransId;
    }
public void setAcctgTransEntrySeqId(String acctgTransEntrySeqId) {
        this.acctgTransEntrySeqId = acctgTransEntrySeqId;
    }
public void setAcctgTransEntryTypeId(String acctgTransEntryTypeId) {
        this.acctgTransEntryTypeId = acctgTransEntryTypeId;
    }
public void setDescription(String description) {
        this.description = description;
    }
public void setVoucherRef(String voucherRef) {
        this.voucherRef = voucherRef;
    }
public void setPartyId(String partyId) {
        this.partyId = partyId;
    }
public void setRoleTypeId(String roleTypeId) {
        this.roleTypeId = roleTypeId;
    }
public void setTheirPartyId(String theirPartyId) {
        this.theirPartyId = theirPartyId;
    }
public void setProductId(String productId) {
        this.productId = productId;
    }
public void setTheirProductId(String theirProductId) {
        this.theirProductId = theirProductId;
    }
public void setInventoryItemId(String inventoryItemId) {
        this.inventoryItemId = inventoryItemId;
    }
public void setGlAccountTypeId(String glAccountTypeId) {
        this.glAccountTypeId = glAccountTypeId;
    }
public void setGlAccountId(String glAccountId) {
        this.glAccountId = glAccountId;
    }
public void setOrganizationPartyId(String organizationPartyId) {
        this.organizationPartyId = organizationPartyId;
    }
public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
public void setCurrencyUomId(String currencyUomId) {
        this.currencyUomId = currencyUomId;
    }
public void setOrigAmount(BigDecimal origAmount) {
        this.origAmount = origAmount;
    }
public void setOrigCurrencyUomId(String origCurrencyUomId) {
        this.origCurrencyUomId = origCurrencyUomId;
    }
public void setDebitCreditFlag(Boolean debitCreditFlag) {
        this.debitCreditFlag = debitCreditFlag;
    }
public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }
public void setGroupId(String groupId) {
        this.groupId = groupId;
    }
public void setTaxId(String taxId) {
        this.taxId = taxId;
    }
public void setReconcileStatusId(String reconcileStatusId) {
        this.reconcileStatusId = reconcileStatusId;
    }
public void setSettlementTermId(String settlementTermId) {
        this.settlementTermId = settlementTermId;
    }
public void setIsSummary(Boolean isSummary) {
        this.isSummary = isSummary;
    }
}
