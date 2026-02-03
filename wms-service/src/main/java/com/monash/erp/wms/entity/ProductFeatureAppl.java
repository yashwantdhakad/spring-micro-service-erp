package com.monash.erp.wms.entity;

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
public class ProductFeatureAppl {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String productId;
    private String productFeatureId;
    private String productFeatureApplTypeId;
    private LocalDateTime fromDate;
    private LocalDateTime thruDate;
    private String sequenceNum;
    private String amount;
    private String recurringAmount;
public void setId(Long id) {
        this.id = id;
    }
public void setProductId(String productId) {
        this.productId = productId;
    }
public void setProductFeatureId(String productFeatureId) {
        this.productFeatureId = productFeatureId;
    }
public void setProductFeatureApplTypeId(String productFeatureApplTypeId) {
        this.productFeatureApplTypeId = productFeatureApplTypeId;
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
public void setAmount(String amount) {
        this.amount = amount;
    }
public void setRecurringAmount(String recurringAmount) {
        this.recurringAmount = recurringAmount;
    }

}
