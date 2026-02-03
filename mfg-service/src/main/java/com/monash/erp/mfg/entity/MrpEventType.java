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
public class MrpEventType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String mrpEventTypeId;
    private String description;
public void setId(Long id) {
        this.id = id;
    }
public void setMrpEventTypeId(String mrpEventTypeId) {
        this.mrpEventTypeId = mrpEventTypeId;
    }
public void setDescription(String description) {
        this.description = description;
    }

}
