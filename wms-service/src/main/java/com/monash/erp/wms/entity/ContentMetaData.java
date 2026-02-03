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
public class ContentMetaData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String contentId;
    private String metaDataPredicateId;
    private String metaDataValue;
    private String dataSourceId;
public void setId(Long id) {
        this.id = id;
    }
public void setContentId(String contentId) {
        this.contentId = contentId;
    }
public void setMetaDataPredicateId(String metaDataPredicateId) {
        this.metaDataPredicateId = metaDataPredicateId;
    }
public void setMetaDataValue(String metaDataValue) {
        this.metaDataValue = metaDataValue;
    }
public void setDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
    }

}
