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
public class TelecomGatewayConfig {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String telecomGatewayConfigId;

    private String description;
public void setId(Long id) {
        this.id = id;
    }
public void setTelecomGatewayConfigId(String telecomGatewayConfigId) {
        this.telecomGatewayConfigId = telecomGatewayConfigId;
    }
public void setDescription(String description) {
        this.description = description;
    }
}
