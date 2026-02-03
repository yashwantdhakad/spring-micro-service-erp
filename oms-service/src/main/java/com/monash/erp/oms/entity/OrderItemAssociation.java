package com.monash.erp.oms.entity;

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
public class OrderItemAssociation extends AuditableEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String salesOrderId;
    private String soItemSeqId;
    private String purchaseOrderId;
    private String poItemSeqId;
public void setId(Long id) {
        this.id = id;
    }
public void setSalesOrderId(String salesOrderId) {
        this.salesOrderId = salesOrderId;
    }
public void setSoItemSeqId(String soItemSeqId) {
        this.soItemSeqId = soItemSeqId;
    }
public void setPurchaseOrderId(String purchaseOrderId) {
        this.purchaseOrderId = purchaseOrderId;
    }
public void setPoItemSeqId(String poItemSeqId) {
        this.poItemSeqId = poItemSeqId;
    }

}
