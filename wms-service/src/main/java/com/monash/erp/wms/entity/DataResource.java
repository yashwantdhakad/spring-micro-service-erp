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
public class DataResource {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String dataResourceId;
    private String dataResourceTypeId;
    private String dataTemplateTypeId;
    private String dataCategoryId;
    private String dataSourceId;
    private String statusId;
    private String dataResourceName;
    private String localeString;
    private String mimeTypeId;
    private String characterSetId;
    private String objectInfo;
    private String surveyId;
    private String surveyResponseId;
    private String relatedDetailId;
    private String isPublic;
    private LocalDateTime createdDate;
    private String createdByUserLogin;
    private LocalDateTime lastModifiedDate;
    private String lastModifiedByUserLogin;
public void setId(Long id) {
        this.id = id;
    }
public void setDataResourceId(String dataResourceId) {
        this.dataResourceId = dataResourceId;
    }
public void setDataResourceTypeId(String dataResourceTypeId) {
        this.dataResourceTypeId = dataResourceTypeId;
    }
public void setDataTemplateTypeId(String dataTemplateTypeId) {
        this.dataTemplateTypeId = dataTemplateTypeId;
    }
public void setDataCategoryId(String dataCategoryId) {
        this.dataCategoryId = dataCategoryId;
    }
public void setDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
    }
public void setStatusId(String statusId) {
        this.statusId = statusId;
    }
public void setDataResourceName(String dataResourceName) {
        this.dataResourceName = dataResourceName;
    }
public void setLocaleString(String localeString) {
        this.localeString = localeString;
    }
public void setMimeTypeId(String mimeTypeId) {
        this.mimeTypeId = mimeTypeId;
    }
public void setCharacterSetId(String characterSetId) {
        this.characterSetId = characterSetId;
    }
public void setObjectInfo(String objectInfo) {
        this.objectInfo = objectInfo;
    }
public void setSurveyId(String surveyId) {
        this.surveyId = surveyId;
    }
public void setSurveyResponseId(String surveyResponseId) {
        this.surveyResponseId = surveyResponseId;
    }
public void setRelatedDetailId(String relatedDetailId) {
        this.relatedDetailId = relatedDetailId;
    }
public void setIsPublic(String isPublic) {
        this.isPublic = isPublic;
    }
public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }
public void setCreatedByUserLogin(String createdByUserLogin) {
        this.createdByUserLogin = createdByUserLogin;
    }
public void setLastModifiedDate(LocalDateTime lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }
public void setLastModifiedByUserLogin(String lastModifiedByUserLogin) {
        this.lastModifiedByUserLogin = lastModifiedByUserLogin;
    }

}
