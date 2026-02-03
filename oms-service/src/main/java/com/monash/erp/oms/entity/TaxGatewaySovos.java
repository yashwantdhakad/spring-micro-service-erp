package com.monash.erp.oms.entity;

import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Getter;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@Setter
@Getter
public class TaxGatewaySovos extends AuditableEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String taxGatewayConfigId;
    private String connectUrl;
    private BigDecimal connectTimeout;
    private String username;
    private String password;
    private String orgCode;
public void setId(Long id) {
        this.id = id;
    }
public void setTaxGatewayConfigId(String taxGatewayConfigId) {
        this.taxGatewayConfigId = taxGatewayConfigId;
    }
public void setConnectUrl(String connectUrl) {
        this.connectUrl = connectUrl;
    }
public void setConnectTimeout(BigDecimal connectTimeout) {
        this.connectTimeout = connectTimeout;
    }
public void setUsername(String username) {
        this.username = username;
    }
public void setPassword(String password) {
        this.password = password;
    }
public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
    }

}
