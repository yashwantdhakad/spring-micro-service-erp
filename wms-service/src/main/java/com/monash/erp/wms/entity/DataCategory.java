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
public class DataCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String dataCategoryId;
    private String parentCategoryId;
    private String categoryName;
public void setId(Long id) {
        this.id = id;
    }
public void setDataCategoryId(String dataCategoryId) {
        this.dataCategoryId = dataCategoryId;
    }
public void setParentCategoryId(String parentCategoryId) {
        this.parentCategoryId = parentCategoryId;
    }
public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

}
