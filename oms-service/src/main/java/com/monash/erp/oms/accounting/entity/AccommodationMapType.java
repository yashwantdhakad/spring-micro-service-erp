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
public class AccommodationMapType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String accommodationMapTypeId;

    private String description;
public void setId(Long id) {
        this.id = id;
    }
public void setAccommodationMapTypeId(String accommodationMapTypeId) {
        this.accommodationMapTypeId = accommodationMapTypeId;
    }
public void setDescription(String description) {
        this.description = description;
    }
}
