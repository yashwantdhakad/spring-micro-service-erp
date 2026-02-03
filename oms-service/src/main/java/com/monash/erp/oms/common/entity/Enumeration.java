package com.monash.erp.oms.common.entity;

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
public class Enumeration {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String enumId;

    private String enumTypeId;

    private String enumCode;

    private String sequenceId;

    private String description;
public void setId(Long id) {
        this.id = id;
    }
public void setEnumId(String enumId) {
        this.enumId = enumId;
    }
public void setEnumTypeId(String enumTypeId) {
        this.enumTypeId = enumTypeId;
    }
public void setEnumCode(String enumCode) {
        this.enumCode = enumCode;
    }
public void setSequenceId(String sequenceId) {
        this.sequenceId = sequenceId;
    }
public void setDescription(String description) {
        this.description = description;
    }
}
