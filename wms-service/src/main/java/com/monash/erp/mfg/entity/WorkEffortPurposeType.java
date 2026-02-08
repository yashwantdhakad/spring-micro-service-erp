package com.monash.erp.mfg.entity;

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
public class WorkEffortPurposeType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String workEffortPurposeTypeId;
    private String parentTypeId;
    private String description;
public void setId(Long id) {
        this.id = id;
    }
public void setWorkEffortPurposeTypeId(String workEffortPurposeTypeId) {
        this.workEffortPurposeTypeId = workEffortPurposeTypeId;
    }
public void setParentTypeId(String parentTypeId) {
        this.parentTypeId = parentTypeId;
    }
public void setDescription(String description) {
        this.description = description;
    }

}
