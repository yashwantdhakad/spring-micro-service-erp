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
public class ProductAttribute {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String productId;
    private String attrName;
    private String attrValue;
    private String attrType;
    private String attrDescription;
public void setId(Long id) {
        this.id = id;
    }
public void setProductId(String productId) {
        this.productId = productId;
    }
public void setAttrName(String attrName) {
        this.attrName = attrName;
    }
public void setAttrValue(String attrValue) {
        this.attrValue = attrValue;
    }
public void setAttrType(String attrType) {
        this.attrType = attrType;
    }
public void setAttrDescription(String attrDescription) {
        this.attrDescription = attrDescription;
    }

}
