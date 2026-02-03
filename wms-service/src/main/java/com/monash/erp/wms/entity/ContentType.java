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
public class ContentType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String contentTypeId;
    private String parentTypeId;
    private String hasTable;
    private String description;
public void setId(Long id) {
        this.id = id;
    }
public void setContentTypeId(String contentTypeId) {
        this.contentTypeId = contentTypeId;
    }
public void setParentTypeId(String parentTypeId) {
        this.parentTypeId = parentTypeId;
    }
public void setHasTable(String hasTable) {
        this.hasTable = hasTable;
    }
public void setDescription(String description) {
        this.description = description;
    }

}
