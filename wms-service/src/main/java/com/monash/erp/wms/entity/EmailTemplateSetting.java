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
public class EmailTemplateSetting {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String emailTemplateSettingId;
    private String description;
    private String bodyScreenLocation;
    private String xslfoAttachScreenLocation;
    private String fromAddress;
    private String ccAddress;
    private String bccAddress;
    private String subject;
    private String contentType;
    private LocalDateTime lastUpdatedStamp;
    private LocalDateTime lastUpdatedTxStamp;
    private LocalDateTime createdStamp;
    private LocalDateTime createdTxStamp;
public void setId(Long id) {
        this.id = id;
    }
public void setEmailTemplateSettingId(String emailTemplateSettingId) {
        this.emailTemplateSettingId = emailTemplateSettingId;
    }
public void setDescription(String description) {
        this.description = description;
    }
public void setBodyScreenLocation(String bodyScreenLocation) {
        this.bodyScreenLocation = bodyScreenLocation;
    }
public void setXslfoAttachScreenLocation(String xslfoAttachScreenLocation) {
        this.xslfoAttachScreenLocation = xslfoAttachScreenLocation;
    }
public void setFromAddress(String fromAddress) {
        this.fromAddress = fromAddress;
    }
public void setCcAddress(String ccAddress) {
        this.ccAddress = ccAddress;
    }
public void setBccAddress(String bccAddress) {
        this.bccAddress = bccAddress;
    }
public void setSubject(String subject) {
        this.subject = subject;
    }
public void setContentType(String contentType) {
        this.contentType = contentType;
    }
public void setLastUpdatedStamp(LocalDateTime lastUpdatedStamp) {
        this.lastUpdatedStamp = lastUpdatedStamp;
    }
public void setLastUpdatedTxStamp(LocalDateTime lastUpdatedTxStamp) {
        this.lastUpdatedTxStamp = lastUpdatedTxStamp;
    }
public void setCreatedStamp(LocalDateTime createdStamp) {
        this.createdStamp = createdStamp;
    }
public void setCreatedTxStamp(LocalDateTime createdTxStamp) {
        this.createdTxStamp = createdTxStamp;
    }

}
