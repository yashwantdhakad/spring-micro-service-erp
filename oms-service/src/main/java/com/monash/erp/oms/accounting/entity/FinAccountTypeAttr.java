package com.monash.erp.oms.accounting.entity;

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
public class FinAccountTypeAttr {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String finAccountTypeId;

    private String attrName;

    private String attrValue;

    private String description;
public void setId(Long id) {
        this.id = id;
    }
public void setFinAccountTypeId(String finAccountTypeId) {
        this.finAccountTypeId = finAccountTypeId;
    }
public void setAttrName(String attrName) {
        this.attrName = attrName;
    }
public void setAttrValue(String attrValue) {
        this.attrValue = attrValue;
    }
public void setDescription(String description) {
        this.description = description;
    }
}
