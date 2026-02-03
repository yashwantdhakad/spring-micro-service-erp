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
public class CustomScreen {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String customScreenId;

    private String customScreenTypeId;

    private String customScreenName;

    private String customScreenLocation;

    private String description;
public void setId(Long id) {
        this.id = id;
    }
public void setCustomScreenId(String customScreenId) {
        this.customScreenId = customScreenId;
    }
public void setCustomScreenTypeId(String customScreenTypeId) {
        this.customScreenTypeId = customScreenTypeId;
    }
public void setCustomScreenName(String customScreenName) {
        this.customScreenName = customScreenName;
    }
public void setCustomScreenLocation(String customScreenLocation) {
        this.customScreenLocation = customScreenLocation;
    }
public void setDescription(String description) {
        this.description = description;
    }
}
