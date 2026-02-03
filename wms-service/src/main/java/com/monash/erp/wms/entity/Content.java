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
public class Content {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String contentId;
    private String contentTypeId;
    private String ownerContentId;
    private String decoratorContentId;
    private String instanceOfContentId;
    private String dataResourceId;
    private String templateDataResourceId;
    private String dataSourceId;
    private String statusId;
    private String privilegeEnumId;
    private String serviceName;
    private String customMethodId;
    private String contentName;
    private String description;
    private String localeString;
    private String mimeTypeId;
    private String characterSetId;
    private String childLeafCount;
    private String childBranchCount;
    private LocalDateTime createdDate;
    private String createdByUserLogin;
    private LocalDateTime lastModifiedDate;
    private String lastModifiedByUserLogin;
public void setId(Long id) {
        this.id = id;
    }
public void setContentId(String contentId) {
        this.contentId = contentId;
    }
public void setContentTypeId(String contentTypeId) {
        this.contentTypeId = contentTypeId;
    }
public void setOwnerContentId(String ownerContentId) {
        this.ownerContentId = ownerContentId;
    }
public void setDecoratorContentId(String decoratorContentId) {
        this.decoratorContentId = decoratorContentId;
    }
public void setInstanceOfContentId(String instanceOfContentId) {
        this.instanceOfContentId = instanceOfContentId;
    }
public void setDataResourceId(String dataResourceId) {
        this.dataResourceId = dataResourceId;
    }
public void setTemplateDataResourceId(String templateDataResourceId) {
        this.templateDataResourceId = templateDataResourceId;
    }
public void setDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
    }
public void setStatusId(String statusId) {
        this.statusId = statusId;
    }
public void setPrivilegeEnumId(String privilegeEnumId) {
        this.privilegeEnumId = privilegeEnumId;
    }
public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }
public void setCustomMethodId(String customMethodId) {
        this.customMethodId = customMethodId;
    }
public void setContentName(String contentName) {
        this.contentName = contentName;
    }
public void setDescription(String description) {
        this.description = description;
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
public void setChildLeafCount(String childLeafCount) {
        this.childLeafCount = childLeafCount;
    }
public void setChildBranchCount(String childBranchCount) {
        this.childBranchCount = childBranchCount;
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
