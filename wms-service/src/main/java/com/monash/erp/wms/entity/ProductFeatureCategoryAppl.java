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
public class ProductFeatureCategoryAppl {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String productCategoryId;
    private String productFeatureCategoryId;
    private LocalDateTime fromDate;
    private LocalDateTime thruDate;
public void setId(Long id) {
        this.id = id;
    }
public void setProductCategoryId(String productCategoryId) {
        this.productCategoryId = productCategoryId;
    }
public void setProductFeatureCategoryId(String productFeatureCategoryId) {
        this.productFeatureCategoryId = productFeatureCategoryId;
    }
public void setFromDate(LocalDateTime fromDate) {
        this.fromDate = fromDate;
    }
public void setThruDate(LocalDateTime thruDate) {
        this.thruDate = thruDate;
    }

}
