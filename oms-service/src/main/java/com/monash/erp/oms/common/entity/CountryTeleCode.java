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
public class CountryTeleCode {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String countryCode;

    private String teleCode;
public void setId(Long id) {
        this.id = id;
    }
public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }
public void setTeleCode(String teleCode) {
        this.teleCode = teleCode;
    }
}
