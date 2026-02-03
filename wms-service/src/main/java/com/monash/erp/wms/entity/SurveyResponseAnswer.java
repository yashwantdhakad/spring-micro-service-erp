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
public void setId(Long id) {
        this.id = id;
    }
public void setSurveyResponseId(String surveyResponseId) {
        this.surveyResponseId = surveyResponseId;
    }
public void setSurveyQuestionId(String surveyQuestionId) {
        this.surveyQuestionId = surveyQuestionId;
    }
public void setSurveyMultiRespColId(String surveyMultiRespColId) {
        this.surveyMultiRespColId = surveyMultiRespColId;
    }
public void setSurveyMultiRespId(String surveyMultiRespId) {
        this.surveyMultiRespId = surveyMultiRespId;
    }
public void setBooleanResponse(String booleanResponse) {
        this.booleanResponse = booleanResponse;
    }
public void setCurrencyResponse(String currencyResponse) {
        this.currencyResponse = currencyResponse;
    }
public void setFloatResponse(String floatResponse) {
        this.floatResponse = floatResponse;
    }
public void setNumericResponse(String numericResponse) {
        this.numericResponse = numericResponse;
    }
public void setTextResponse(String textResponse) {
        this.textResponse = textResponse;
    }
public void setSurveyOptionSeqId(String surveyOptionSeqId) {
        this.surveyOptionSeqId = surveyOptionSeqId;
    }
public void setContentId(String contentId) {
        this.contentId = contentId;
    }
public void setAnsweredDate(LocalDateTime answeredDate) {
        this.answeredDate = answeredDate;
    }
public void setAmountBase(String amountBase) {
        this.amountBase = amountBase;
    }
public void setAmountBaseUomId(String amountBaseUomId) {
        this.amountBaseUomId = amountBaseUomId;
    }
public void setWeightFactor(String weightFactor) {
        this.weightFactor = weightFactor;
    }
public void setDuration(String duration) {
        this.duration = duration;
    }
public void setDurationUomId(String durationUomId) {
        this.durationUomId = durationUomId;
    }
public void setSequenceNum(String sequenceNum) {
        this.sequenceNum = sequenceNum;
    }

}
