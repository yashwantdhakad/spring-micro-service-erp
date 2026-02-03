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
public class SurveyQuestionOption {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String surveyQuestionId;
    private String surveyOptionSeqId;
    private String description;
    private String sequenceNum;
    private String amountBase;
    private String amountBaseUomId;
    private String weightFactor;
    private String duration;
    private String durationUomId;
public void setId(Long id) {
        this.id = id;
    }
public void setSurveyQuestionId(String surveyQuestionId) {
        this.surveyQuestionId = surveyQuestionId;
    }
public void setSurveyOptionSeqId(String surveyOptionSeqId) {
        this.surveyOptionSeqId = surveyOptionSeqId;
    }
public void setDescription(String description) {
        this.description = description;
    }
public void setSequenceNum(String sequenceNum) {
        this.sequenceNum = sequenceNum;
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

}
