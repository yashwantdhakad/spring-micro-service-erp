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
public class PortletPortletCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String portalPortletId;

    private String portletCategoryId;
public void setId(Long id) {
        this.id = id;
    }
public void setPortalPortletId(String portalPortletId) {
        this.portalPortletId = portalPortletId;
    }
public void setPortletCategoryId(String portletCategoryId) {
        this.portletCategoryId = portletCategoryId;
    }
}
