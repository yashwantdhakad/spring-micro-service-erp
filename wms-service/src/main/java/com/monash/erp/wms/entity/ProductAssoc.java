package com.monash.erp.wms.entity;

import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Getter;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Index;
import jakarta.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(
        name = "product_assoc",
        indexes = {
                @Index(name = "idx_product_assoc_product_id", columnList = "PRODUCT_ID"),
                @Index(name = "idx_product_assoc_product_id_to", columnList = "PRODUCT_ID_TO"),
                @Index(name = "idx_product_assoc_type_id", columnList = "PRODUCT_ASSOC_TYPE_ID"),
                @Index(name = "idx_product_assoc_thru_date", columnList = "THRU_DATE")
        }
)
@NoArgsConstructor
@Setter
@Getter
public class ProductAssoc {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "PRODUCT_ID", length = 20)
    private String productId;

    @Column(name = "PRODUCT_ID_TO", length = 20)
    private String productIdTo;

    @Column(name = "PRODUCT_ASSOC_TYPE_ID", length = 20)
    private String productAssocTypeId;

    @Column(name = "FROM_DATE")
    private LocalDateTime fromDate;

    @Column(name = "THRU_DATE")
    private LocalDateTime thruDate;

    @Column(name = "SEQUENCE_NUM", columnDefinition = "decimal(20,0)")
    private String sequenceNum;

    @Column(name = "REASON", length = 255)
    private String reason;

    @Column(name = "QUANTITY", columnDefinition = "decimal(18,6)")
    private String quantity;

    @Column(name = "SCRAP_FACTOR", columnDefinition = "decimal(18,6)")
    private String scrapFactor;

    @Column(name = "INSTRUCTION", length = 255)
    private String instruction;

    @Column(name = "ROUTING_WORK_EFFORT_ID", length = 20)
    private String routingWorkEffortId;

    @Column(name = "ESTIMATE_CALC_METHOD", length = 20)
    private String estimateCalcMethod;

    @Column(name = "RECURRENCE_INFO_ID", length = 20)
    private String recurrenceInfoId;

    @Column(name = "LAST_UPDATED_STAMP")
    private LocalDateTime lastUpdatedStamp;

    @Column(name = "LAST_UPDATED_TX_STAMP")
    private LocalDateTime lastUpdatedTxStamp;

    @Column(name = "CREATED_STAMP")
    private LocalDateTime createdStamp;

    @Column(name = "CREATED_TX_STAMP")
    private LocalDateTime createdTxStamp;

    @Column(name = "DRAWING_ITEM_NUMBER", length = 100)
    private String drawingItemNumber;

    @Column(name = "USAGE_HOURS", columnDefinition = "decimal(20,0)")
    private String usageHours;

    @Column(name = "OEM_PARTY_ID", length = 20)
    private String oemPartyId;
public void setId(Long id) {
        this.id = id;
    }
public void setProductId(String productId) {
        this.productId = productId;
    }
public void setProductIdTo(String productIdTo) {
        this.productIdTo = productIdTo;
    }
public void setProductAssocTypeId(String productAssocTypeId) {
        this.productAssocTypeId = productAssocTypeId;
    }
public void setFromDate(LocalDateTime fromDate) {
        this.fromDate = fromDate;
    }
public void setThruDate(LocalDateTime thruDate) {
        this.thruDate = thruDate;
    }
public void setSequenceNum(String sequenceNum) {
        this.sequenceNum = sequenceNum;
    }
public void setReason(String reason) {
        this.reason = reason;
    }
public void setQuantity(String quantity) {
        this.quantity = quantity;
    }
public void setScrapFactor(String scrapFactor) {
        this.scrapFactor = scrapFactor;
    }
public void setInstruction(String instruction) {
        this.instruction = instruction;
    }
public void setRoutingWorkEffortId(String routingWorkEffortId) {
        this.routingWorkEffortId = routingWorkEffortId;
    }
public void setEstimateCalcMethod(String estimateCalcMethod) {
        this.estimateCalcMethod = estimateCalcMethod;
    }
public void setRecurrenceInfoId(String recurrenceInfoId) {
        this.recurrenceInfoId = recurrenceInfoId;
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
public void setDrawingItemNumber(String drawingItemNumber) {
        this.drawingItemNumber = drawingItemNumber;
    }
public void setUsageHours(String usageHours) {
        this.usageHours = usageHours;
    }
public void setOemPartyId(String oemPartyId) {
        this.oemPartyId = oemPartyId;
    }
}
