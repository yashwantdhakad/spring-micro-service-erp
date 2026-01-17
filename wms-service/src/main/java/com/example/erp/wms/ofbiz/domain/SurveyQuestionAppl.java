package com.example.erp.wms.ofbiz.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class SurveyQuestionAppl {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String surveyId;
    private String surveyQuestionId;
    private LocalDateTime fromDate;
    private LocalDateTime thruDate;
    private String surveyPageSeqId;
    private String surveyMultiRespId;
    private String surveyMultiRespColId;
    private String requiredField;
    private String sequenceNum;
    private String externalFieldRef;
    private String withSurveyQuestionId;
    private String withSurveyOptionSeqId;

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

    public String getSurveyQuestionId() {
        return surveyQuestionId;
    }

    public void setSurveyQuestionId(String surveyQuestionId) {
        this.surveyQuestionId = surveyQuestionId;
    }

    public LocalDateTime getFromDate() {
        return fromDate;
    }

    public void setFromDate(LocalDateTime fromDate) {
        this.fromDate = fromDate;
    }

    public LocalDateTime getThruDate() {
        return thruDate;
    }

    public void setThruDate(LocalDateTime thruDate) {
        this.thruDate = thruDate;
    }

    public String getSurveyPageSeqId() {
        return surveyPageSeqId;
    }

    public void setSurveyPageSeqId(String surveyPageSeqId) {
        this.surveyPageSeqId = surveyPageSeqId;
    }

    public String getSurveyMultiRespId() {
        return surveyMultiRespId;
    }

    public void setSurveyMultiRespId(String surveyMultiRespId) {
        this.surveyMultiRespId = surveyMultiRespId;
    }

    public String getSurveyMultiRespColId() {
        return surveyMultiRespColId;
    }

    public void setSurveyMultiRespColId(String surveyMultiRespColId) {
        this.surveyMultiRespColId = surveyMultiRespColId;
    }

    public String getRequiredField() {
        return requiredField;
    }

    public void setRequiredField(String requiredField) {
        this.requiredField = requiredField;
    }

    public String getSequenceNum() {
        return sequenceNum;
    }

    public void setSequenceNum(String sequenceNum) {
        this.sequenceNum = sequenceNum;
    }

    public String getExternalFieldRef() {
        return externalFieldRef;
    }

    public void setExternalFieldRef(String externalFieldRef) {
        this.externalFieldRef = externalFieldRef;
    }

    public String getWithSurveyQuestionId() {
        return withSurveyQuestionId;
    }

    public void setWithSurveyQuestionId(String withSurveyQuestionId) {
        this.withSurveyQuestionId = withSurveyQuestionId;
    }

    public String getWithSurveyOptionSeqId() {
        return withSurveyOptionSeqId;
    }

    public void setWithSurveyOptionSeqId(String withSurveyOptionSeqId) {
        this.withSurveyOptionSeqId = withSurveyOptionSeqId;
    }

}