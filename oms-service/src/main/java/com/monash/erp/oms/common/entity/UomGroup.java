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
public class UomGroup {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String uomGroupId;

    private String uomId;
public void setId(Long id) {
        this.id = id;
    }
public void setUomGroupId(String uomGroupId) {
        this.uomGroupId = uomGroupId;
    }
public void setUomId(String uomId) {
        this.uomId = uomId;
    }
}
