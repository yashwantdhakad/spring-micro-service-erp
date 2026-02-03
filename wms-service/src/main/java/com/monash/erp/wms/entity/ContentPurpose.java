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
public class ContentPurpose {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String contentId;
    private String contentPurposeTypeId;
    private String sequenceNum;
public void setId(Long id) {
        this.id = id;
    }
public void setContentId(String contentId) {
        this.contentId = contentId;
    }
public void setContentPurposeTypeId(String contentPurposeTypeId) {
        this.contentPurposeTypeId = contentPurposeTypeId;
    }
public void setSequenceNum(String sequenceNum) {
        this.sequenceNum = sequenceNum;
    }

}
