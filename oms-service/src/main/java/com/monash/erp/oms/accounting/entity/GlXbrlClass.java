package com.monash.erp.oms.accounting.entity;

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
public class GlXbrlClass {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String glXbrlClassId;

    private String parentGlXbrlClassId;

    private String description;
public void setId(Long id) {
        this.id = id;
    }
public void setGlXbrlClassId(String glXbrlClassId) {
        this.glXbrlClassId = glXbrlClassId;
    }
public void setParentGlXbrlClassId(String parentGlXbrlClassId) {
        this.parentGlXbrlClassId = parentGlXbrlClassId;
    }
public void setDescription(String description) {
        this.description = description;
    }
}
