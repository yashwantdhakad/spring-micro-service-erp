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
        name = "product_category_member",
        indexes = {
                @Index(name = "idx_product_category_member_product_id", columnList = "PRODUCT_ID"),
                @Index(name = "idx_product_category_member_category_id", columnList = "PRODUCT_CATEGORY_ID"),
                @Index(name = "idx_product_category_member_thru_date", columnList = "THRU_DATE")
        }
)
@NoArgsConstructor
@Setter
@Getter
public class ProductCategoryMember {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "PRODUCT_CATEGORY_ID", length = 20)
    private String productCategoryId;

    @Column(name = "PRODUCT_ID", length = 20)
    private String productId;

    @Column(name = "FROM_DATE")
    private LocalDateTime fromDate;

    @Column(name = "THRU_DATE")
    private LocalDateTime thruDate;

    @Column(name = "COMMENTS", length = 255)
    private String comments;

    @Column(name = "SEQUENCE_NUM", columnDefinition = "decimal(20,0)")
    private String sequenceNum;

    @Column(name = "QUANTITY", columnDefinition = "decimal(18,6)")
    private String quantity;

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
public void setProductCategoryId(String productCategoryId) {
        this.productCategoryId = productCategoryId;
    }
public void setProductId(String productId) {
        this.productId = productId;
    }
public void setFromDate(LocalDateTime fromDate) {
        this.fromDate = fromDate;
    }
public void setThruDate(LocalDateTime thruDate) {
        this.thruDate = thruDate;
    }
public void setComments(String comments) {
        this.comments = comments;
    }
public void setSequenceNum(String sequenceNum) {
        this.sequenceNum = sequenceNum;
    }
public void setQuantity(String quantity) {
        this.quantity = quantity;
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
