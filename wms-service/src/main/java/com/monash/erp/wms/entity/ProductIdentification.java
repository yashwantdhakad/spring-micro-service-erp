package com.monash.erp.wms.entity;

import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Getter;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "product_identification")
@NoArgsConstructor
@Setter
@Getter
public class ProductIdentification {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "PRODUCT_ID", length = 20)
    private String productId;

    @Column(name = "IDENTIFICATION_TYPE_ID", length = 20)
    private String identificationTypeId;

    @Column(name = "IDENTIFICATION_VALUE", length = 255)
    private String identificationValue;

    @Column(name = "FROM_DATE")
    private LocalDateTime fromDate;

    @Column(name = "THRU_DATE")
    private LocalDateTime thruDate;

    @Column(name = "CREATED_BY", length = 250)
    private String createdBy;

    @Column(name = "LAST_UPDATED_STAMP")
    private LocalDateTime lastUpdatedStamp;

    @Column(name = "LAST_UPDATED_TX_STAMP")
    private LocalDateTime lastUpdatedTxStamp;

    @Column(name = "CREATED_STAMP")
    private LocalDateTime createdStamp;

    @Column(name = "CREATED_TX_STAMP")
    private LocalDateTime createdTxStamp;
public void setId(Long id) {
        this.id = id;
    }
public void setProductId(String productId) {
        this.productId = productId;
    }
public void setIdentificationTypeId(String identificationTypeId) {
        this.identificationTypeId = identificationTypeId;
    }
public void setIdentificationValue(String identificationValue) {
        this.identificationValue = identificationValue;
    }
public void setFromDate(LocalDateTime fromDate) {
        this.fromDate = fromDate;
    }
public void setThruDate(LocalDateTime thruDate) {
        this.thruDate = thruDate;
    }
public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
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
