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
public class SystemProperty {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String systemResourceId;

    private String systemPropertyId;

    private String systemPropertyValue;

    private String description;
public void setId(Long id) {
        this.id = id;
    }
public void setSystemResourceId(String systemResourceId) {
        this.systemResourceId = systemResourceId;
    }
public void setSystemPropertyId(String systemPropertyId) {
        this.systemPropertyId = systemPropertyId;
    }
public void setSystemPropertyValue(String systemPropertyValue) {
        this.systemPropertyValue = systemPropertyValue;
    }
public void setDescription(String description) {
        this.description = description;
    }
}
