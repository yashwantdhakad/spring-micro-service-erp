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
public class ContentAssoc {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String contentId;
    private String contentIdTo;
    private String contentAssocTypeId;
    private LocalDateTime fromDate;
    private LocalDateTime thruDate;
    private String contentAssocPredicateId;
    private String dataSourceId;
    private String sequenceNum;
    private String mapKey;
    private String upperCoordinate;
    private String leftCoordinate;
    private LocalDateTime createdDate;
    private String createdByUserLogin;
    private LocalDateTime lastModifiedDate;
    private String lastModifiedByUserLogin;
public void setId(Long id) {
        this.id = id;
    }
public void setContentId(String contentId) {
        this.contentId = contentId;
    }
public void setContentIdTo(String contentIdTo) {
        this.contentIdTo = contentIdTo;
    }
public void setContentAssocTypeId(String contentAssocTypeId) {
        this.contentAssocTypeId = contentAssocTypeId;
    }
public void setFromDate(LocalDateTime fromDate) {
        this.fromDate = fromDate;
    }
public void setThruDate(LocalDateTime thruDate) {
        this.thruDate = thruDate;
    }
public void setContentAssocPredicateId(String contentAssocPredicateId) {
        this.contentAssocPredicateId = contentAssocPredicateId;
    }
public void setDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
    }
public void setSequenceNum(String sequenceNum) {
        this.sequenceNum = sequenceNum;
    }
public void setMapKey(String mapKey) {
        this.mapKey = mapKey;
    }
public void setUpperCoordinate(String upperCoordinate) {
        this.upperCoordinate = upperCoordinate;
    }
public void setLeftCoordinate(String leftCoordinate) {
        this.leftCoordinate = leftCoordinate;
    }
public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }
public void setCreatedByUserLogin(String createdByUserLogin) {
        this.createdByUserLogin = createdByUserLogin;
    }
public void setLastModifiedDate(LocalDateTime lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }
public void setLastModifiedByUserLogin(String lastModifiedByUserLogin) {
        this.lastModifiedByUserLogin = lastModifiedByUserLogin;
    }

}
