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
public void setId(Long id) {
        this.id = id;
    }
public void setSurveyId(String surveyId) {
        this.surveyId = surveyId;
    }
public void setSurveyQuestionId(String surveyQuestionId) {
        this.surveyQuestionId = surveyQuestionId;
    }
public void setFromDate(LocalDateTime fromDate) {
        this.fromDate = fromDate;
    }
public void setThruDate(LocalDateTime thruDate) {
        this.thruDate = thruDate;
    }
public void setSurveyPageSeqId(String surveyPageSeqId) {
        this.surveyPageSeqId = surveyPageSeqId;
    }
public void setSurveyMultiRespId(String surveyMultiRespId) {
        this.surveyMultiRespId = surveyMultiRespId;
    }
public void setSurveyMultiRespColId(String surveyMultiRespColId) {
        this.surveyMultiRespColId = surveyMultiRespColId;
    }
public void setRequiredField(String requiredField) {
        this.requiredField = requiredField;
    }
public void setSequenceNum(String sequenceNum) {
        this.sequenceNum = sequenceNum;
    }
public void setExternalFieldRef(String externalFieldRef) {
        this.externalFieldRef = externalFieldRef;
    }
public void setWithSurveyQuestionId(String withSurveyQuestionId) {
        this.withSurveyQuestionId = withSurveyQuestionId;
    }
public void setWithSurveyOptionSeqId(String withSurveyOptionSeqId) {
        this.withSurveyOptionSeqId = withSurveyOptionSeqId;
    }

}
