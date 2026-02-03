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
public class GlResourceType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String glResourceTypeId;

    private String description;
public void setId(Long id) {
        this.id = id;
    }
public void setGlResourceTypeId(String glResourceTypeId) {
        this.glResourceTypeId = glResourceTypeId;
    }
public void setDescription(String description) {
        this.description = description;
    }
}
