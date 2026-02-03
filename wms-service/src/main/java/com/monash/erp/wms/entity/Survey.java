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
public class Survey {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String surveyId;
    private String surveyName;
    private String description;
    private String comments;
    private String submitCaption;
    private String responseService;
    private String isAnonymous;
    private String allowMultiple;
    private LocalDateTime allowUpdate;
    private String acroFormContentId;
public void setId(Long id) {
        this.id = id;
    }
public void setSurveyId(String surveyId) {
        this.surveyId = surveyId;
    }
public void setSurveyName(String surveyName) {
        this.surveyName = surveyName;
    }
public void setDescription(String description) {
        this.description = description;
    }
public void setComments(String comments) {
        this.comments = comments;
    }
public void setSubmitCaption(String submitCaption) {
        this.submitCaption = submitCaption;
    }
public void setResponseService(String responseService) {
        this.responseService = responseService;
    }
public void setIsAnonymous(String isAnonymous) {
        this.isAnonymous = isAnonymous;
    }
public void setAllowMultiple(String allowMultiple) {
        this.allowMultiple = allowMultiple;
    }
public void setAllowUpdate(LocalDateTime allowUpdate) {
        this.allowUpdate = allowUpdate;
    }
public void setAcroFormContentId(String acroFormContentId) {
        this.acroFormContentId = acroFormContentId;
    }

}
