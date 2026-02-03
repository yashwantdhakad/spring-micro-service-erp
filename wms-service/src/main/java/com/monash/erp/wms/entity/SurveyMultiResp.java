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
public class SurveyMultiResp {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String surveyId;
    private String surveyMultiRespId;
    private String multiRespTitle;
public void setId(Long id) {
        this.id = id;
    }
public void setSurveyId(String surveyId) {
        this.surveyId = surveyId;
    }
public void setSurveyMultiRespId(String surveyMultiRespId) {
        this.surveyMultiRespId = surveyMultiRespId;
    }
public void setMultiRespTitle(String multiRespTitle) {
        this.multiRespTitle = multiRespTitle;
    }

}
