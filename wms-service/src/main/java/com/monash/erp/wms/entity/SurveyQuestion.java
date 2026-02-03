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
public class SurveyQuestion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String surveyQuestionId;
    private String surveyQuestionCategoryId;
    private String surveyQuestionTypeId;
    private String description;
    private String question;
    private String hint;
    private String enumTypeId;
    private String geoId;
    private String formatString;
public void setId(Long id) {
        this.id = id;
    }
public void setSurveyQuestionId(String surveyQuestionId) {
        this.surveyQuestionId = surveyQuestionId;
    }
public void setSurveyQuestionCategoryId(String surveyQuestionCategoryId) {
        this.surveyQuestionCategoryId = surveyQuestionCategoryId;
    }
public void setSurveyQuestionTypeId(String surveyQuestionTypeId) {
        this.surveyQuestionTypeId = surveyQuestionTypeId;
    }
public void setDescription(String description) {
        this.description = description;
    }
public void setQuestion(String question) {
        this.question = question;
    }
public void setHint(String hint) {
        this.hint = hint;
    }
public void setEnumTypeId(String enumTypeId) {
        this.enumTypeId = enumTypeId;
    }
public void setGeoId(String geoId) {
        this.geoId = geoId;
    }
public void setFormatString(String formatString) {
        this.formatString = formatString;
    }

}
