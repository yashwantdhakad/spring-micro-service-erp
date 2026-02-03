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
public class CustomMethod {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String customMethodId;

    private String customMethodTypeId;

    private String customMethodName;

    private String description;
public void setId(Long id) {
        this.id = id;
    }
public void setCustomMethodId(String customMethodId) {
        this.customMethodId = customMethodId;
    }
public void setCustomMethodTypeId(String customMethodTypeId) {
        this.customMethodTypeId = customMethodTypeId;
    }
public void setCustomMethodName(String customMethodName) {
        this.customMethodName = customMethodName;
    }
public void setDescription(String description) {
        this.description = description;
    }
}
