package com.example.erp.wms.ofbiz.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.LocalDateTime;

@Entity
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSurveyId() {
        return surveyId;
    }

    public void setSurveyId(String surveyId) {
        this.surveyId = surveyId;
    }

    public String getSurveyName() {
        return surveyName;
    }

    public void setSurveyName(String surveyName) {
        this.surveyName = surveyName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getSubmitCaption() {
        return submitCaption;
    }

    public void setSubmitCaption(String submitCaption) {
        this.submitCaption = submitCaption;
    }

    public String getResponseService() {
        return responseService;
    }

    public void setResponseService(String responseService) {
        this.responseService = responseService;
    }

    public String getIsAnonymous() {
        return isAnonymous;
    }

    public void setIsAnonymous(String isAnonymous) {
        this.isAnonymous = isAnonymous;
    }

    public String getAllowMultiple() {
        return allowMultiple;
    }

    public void setAllowMultiple(String allowMultiple) {
        this.allowMultiple = allowMultiple;
    }

    public LocalDateTime getAllowUpdate() {
        return allowUpdate;
    }

    public void setAllowUpdate(LocalDateTime allowUpdate) {
        this.allowUpdate = allowUpdate;
    }

    public String getAcroFormContentId() {
        return acroFormContentId;
    }

    public void setAcroFormContentId(String acroFormContentId) {
        this.acroFormContentId = acroFormContentId;
    }

}