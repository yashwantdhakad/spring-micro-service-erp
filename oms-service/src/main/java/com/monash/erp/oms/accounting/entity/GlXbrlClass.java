package com.monash.erp.oms.accounting.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class GlXbrlClass {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String glXbrlClassId;

    private String parentGlXbrlClassId;

    private String description;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGlXbrlClassId() {
        return glXbrlClassId;
    }

    public void setGlXbrlClassId(String glXbrlClassId) {
        this.glXbrlClassId = glXbrlClassId;
    }

    public String getParentGlXbrlClassId() {
        return parentGlXbrlClassId;
    }

    public void setParentGlXbrlClassId(String parentGlXbrlClassId) {
        this.parentGlXbrlClassId = parentGlXbrlClassId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
