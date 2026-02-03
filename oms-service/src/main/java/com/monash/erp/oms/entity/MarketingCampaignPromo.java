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
public class MarketingCampaignPromo extends AuditableEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String marketingCampaignId;
    private String productPromoId;
public void setId(Long id) {
        this.id = id;
    }
public void setMarketingCampaignId(String marketingCampaignId) {
        this.marketingCampaignId = marketingCampaignId;
    }
public void setProductPromoId(String productPromoId) {
        this.productPromoId = productPromoId;
    }

}
