package com.monash.erp.wms.entity;

import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Getter;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@NoArgsConstructor
@Setter
@Getter
public class GoodIdentification {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String goodIdentificationTypeId;
    private String productId;
    private String idValue;
public void setId(Long id) {
        this.id = id;
    }
public void setGoodIdentificationTypeId(String goodIdentificationTypeId) {
        this.goodIdentificationTypeId = goodIdentificationTypeId;
    }
public void setProductId(String productId) {
        this.productId = productId;
    }
public void setIdValue(String idValue) {
        this.idValue = idValue;
    }

}
