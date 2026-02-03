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
public class VisualThemeResource {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String visualThemeId;

    private String resourceTypeEnumId;

    private String sequenceId;

    private String resourceValue;
public void setId(Long id) {
        this.id = id;
    }
public void setVisualThemeId(String visualThemeId) {
        this.visualThemeId = visualThemeId;
    }
public void setResourceTypeEnumId(String resourceTypeEnumId) {
        this.resourceTypeEnumId = resourceTypeEnumId;
    }
public void setSequenceId(String sequenceId) {
        this.sequenceId = sequenceId;
    }
public void setResourceValue(String resourceValue) {
        this.resourceValue = resourceValue;
    }
}
