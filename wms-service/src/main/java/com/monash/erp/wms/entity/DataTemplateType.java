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
public class DataTemplateType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String dataTemplateTypeId;
    private String description;
    private String extension;
public void setId(Long id) {
        this.id = id;
    }
public void setDataTemplateTypeId(String dataTemplateTypeId) {
        this.dataTemplateTypeId = dataTemplateTypeId;
    }
public void setDescription(String description) {
        this.description = description;
    }
public void setExtension(String extension) {
        this.extension = extension;
    }

}
