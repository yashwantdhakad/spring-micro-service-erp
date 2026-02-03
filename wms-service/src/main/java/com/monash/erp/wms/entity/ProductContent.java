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
public class ProductContent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String productId;
    private String contentId;
    private String productContentTypeId;
    private LocalDateTime fromDate;
    private LocalDateTime thruDate;
    private LocalDateTime purchaseFromDate;
    private LocalDateTime purchaseThruDate;
    private String useCountLimit;
    private String useTime;
    private String useTimeUomId;
    private String useRoleTypeId;
    private String sequenceNum;
public void setId(Long id) {
        this.id = id;
    }
public void setProductId(String productId) {
        this.productId = productId;
    }
public void setContentId(String contentId) {
        this.contentId = contentId;
    }
public void setProductContentTypeId(String productContentTypeId) {
        this.productContentTypeId = productContentTypeId;
    }
public void setFromDate(LocalDateTime fromDate) {
        this.fromDate = fromDate;
    }
public void setThruDate(LocalDateTime thruDate) {
        this.thruDate = thruDate;
    }
public void setPurchaseFromDate(LocalDateTime purchaseFromDate) {
        this.purchaseFromDate = purchaseFromDate;
    }
public void setPurchaseThruDate(LocalDateTime purchaseThruDate) {
        this.purchaseThruDate = purchaseThruDate;
    }
public void setUseCountLimit(String useCountLimit) {
        this.useCountLimit = useCountLimit;
    }
public void setUseTime(String useTime) {
        this.useTime = useTime;
    }
public void setUseTimeUomId(String useTimeUomId) {
        this.useTimeUomId = useTimeUomId;
    }
public void setUseRoleTypeId(String useRoleTypeId) {
        this.useRoleTypeId = useRoleTypeId;
    }
public void setSequenceNum(String sequenceNum) {
        this.sequenceNum = sequenceNum;
    }

}
