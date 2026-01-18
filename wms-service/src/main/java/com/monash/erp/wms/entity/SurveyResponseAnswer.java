package com.monash.erp.wms.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class SurveyResponseAnswer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String surveyResponseId;
    private String surveyQuestionId;
    private String surveyMultiRespColId;
    private String surveyMultiRespId;
    private String booleanResponse;
    private String currencyResponse;
    private String floatResponse;
    private String numericResponse;
    private String textResponse;
    private String surveyOptionSeqId;
    private String contentId;
    private LocalDateTime answeredDate;
    private String amountBase;
    private String amountBaseUomId;
    private String weightFactor;
    private String duration;
    private String durationUomId;
    private String sequenceNum;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSurveyResponseId() {
        return surveyResponseId;
    }

    public void setSurveyResponseId(String surveyResponseId) {
        this.surveyResponseId = surveyResponseId;
    }

    public String getSurveyQuestionId() {
        return surveyQuestionId;
    }

    public void setSurveyQuestionId(String surveyQuestionId) {
        this.surveyQuestionId = surveyQuestionId;
    }

    public String getSurveyMultiRespColId() {
        return surveyMultiRespColId;
    }

    public void setSurveyMultiRespColId(String surveyMultiRespColId) {
        this.surveyMultiRespColId = surveyMultiRespColId;
    }

    public String getSurveyMultiRespId() {
        return surveyMultiRespId;
    }

    public void setSurveyMultiRespId(String surveyMultiRespId) {
        this.surveyMultiRespId = surveyMultiRespId;
    }

    public String getBooleanResponse() {
        return booleanResponse;
    }

    public void setBooleanResponse(String booleanResponse) {
        this.booleanResponse = booleanResponse;
    }

    public String getCurrencyResponse() {
        return currencyResponse;
    }

    public void setCurrencyResponse(String currencyResponse) {
        this.currencyResponse = currencyResponse;
    }

    public String getFloatResponse() {
        return floatResponse;
    }

    public void setFloatResponse(String floatResponse) {
        this.floatResponse = floatResponse;
    }

    public String getNumericResponse() {
        return numericResponse;
    }

    public void setNumericResponse(String numericResponse) {
        this.numericResponse = numericResponse;
    }

    public String getTextResponse() {
        return textResponse;
    }

    public void setTextResponse(String textResponse) {
        this.textResponse = textResponse;
    }

    public String getSurveyOptionSeqId() {
        return surveyOptionSeqId;
    }

    public void setSurveyOptionSeqId(String surveyOptionSeqId) {
        this.surveyOptionSeqId = surveyOptionSeqId;
    }

    public String getContentId() {
        return contentId;
    }

    public void setContentId(String contentId) {
        this.contentId = contentId;
    }

    public LocalDateTime getAnsweredDate() {
        return answeredDate;
    }

    public void setAnsweredDate(LocalDateTime answeredDate) {
        this.answeredDate = answeredDate;
    }

    public String getAmountBase() {
        return amountBase;
    }

    public void setAmountBase(String amountBase) {
        this.amountBase = amountBase;
    }

    public String getAmountBaseUomId() {
        return amountBaseUomId;
    }

    public void setAmountBaseUomId(String amountBaseUomId) {
        this.amountBaseUomId = amountBaseUomId;
    }

    public String getWeightFactor() {
        return weightFactor;
    }

    public void setWeightFactor(String weightFactor) {
        this.weightFactor = weightFactor;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getDurationUomId() {
        return durationUomId;
    }

    public void setDurationUomId(String durationUomId) {
        this.durationUomId = durationUomId;
    }

    public String getSequenceNum() {
        return sequenceNum;
    }

    public void setSequenceNum(String sequenceNum) {
        this.sequenceNum = sequenceNum;
    }

}