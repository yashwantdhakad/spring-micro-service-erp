package com.monash.erp.oms.entity;

import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Getter;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@Setter
@Getter
public class TaxGatewayConfig extends AuditableEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String taxGatewayConfigId;
    private String taxGatewayConfTypeId;
    private String description;
public void setId(Long id) {
        this.id = id;
    }
public void setTaxGatewayConfigId(String taxGatewayConfigId) {
        this.taxGatewayConfigId = taxGatewayConfigId;
    }
public void setTaxGatewayConfTypeId(String taxGatewayConfTypeId) {
        this.taxGatewayConfTypeId = taxGatewayConfTypeId;
    }
public void setDescription(String description) {
        this.description = description;
    }

}
