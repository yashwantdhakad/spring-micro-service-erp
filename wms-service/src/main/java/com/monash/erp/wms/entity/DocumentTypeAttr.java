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
public class DocumentTypeAttr {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String documentTypeId;
    private String attrName;
    private String description;
public void setId(Long id) {
        this.id = id;
    }
public void setDocumentTypeId(String documentTypeId) {
        this.documentTypeId = documentTypeId;
    }
public void setAttrName(String attrName) {
        this.attrName = attrName;
    }
public void setDescription(String description) {
        this.description = description;
    }

}
