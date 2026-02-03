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
public class SurveyMultiRespColumn {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String surveyId;
    private String surveyMultiRespId;
    private String surveyMultiRespColId;
    private String columnTitle;
    private String sequenceNum;
public void setId(Long id) {
        this.id = id;
    }
public void setSurveyId(String surveyId) {
        this.surveyId = surveyId;
    }
public void setSurveyMultiRespId(String surveyMultiRespId) {
        this.surveyMultiRespId = surveyMultiRespId;
    }
public void setSurveyMultiRespColId(String surveyMultiRespColId) {
        this.surveyMultiRespColId = surveyMultiRespColId;
    }
public void setColumnTitle(String columnTitle) {
        this.columnTitle = columnTitle;
    }
public void setSequenceNum(String sequenceNum) {
        this.sequenceNum = sequenceNum;
    }

}
