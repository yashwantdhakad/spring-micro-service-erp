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
public class TelecomMethodType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String telecomMethodTypeId;

    private String description;
public void setId(Long id) {
        this.id = id;
    }
public void setTelecomMethodTypeId(String telecomMethodTypeId) {
        this.telecomMethodTypeId = telecomMethodTypeId;
    }
public void setDescription(String description) {
        this.description = description;
    }
}
