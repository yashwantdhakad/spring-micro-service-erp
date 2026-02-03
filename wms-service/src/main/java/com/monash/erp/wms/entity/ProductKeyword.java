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
public class ProductKeyword {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String productId;
    private String keyword;
    private String keywordTypeId;
    private String relevancyWeight;
    private String statusId;
public void setId(Long id) {
        this.id = id;
    }
public void setProductId(String productId) {
        this.productId = productId;
    }
public void setKeyword(String keyword) {
        this.keyword = keyword;
    }
public void setKeywordTypeId(String keywordTypeId) {
        this.keywordTypeId = keywordTypeId;
    }
public void setRelevancyWeight(String relevancyWeight) {
        this.relevancyWeight = relevancyWeight;
    }
public void setStatusId(String statusId) {
        this.statusId = statusId;
    }

}
