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
public class PortalPortlet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String portalPortletId;

    private String portletName;

    private String screenName;

    private String screenLocation;

    private String editFormName;

    private String editFormLocation;

    private String description;

    private String screenshot;

    private String securityServiceName;

    private String securityMainAction;
public void setId(Long id) {
        this.id = id;
    }
public void setPortalPortletId(String portalPortletId) {
        this.portalPortletId = portalPortletId;
    }
public void setPortletName(String portletName) {
        this.portletName = portletName;
    }
public void setScreenName(String screenName) {
        this.screenName = screenName;
    }
public void setScreenLocation(String screenLocation) {
        this.screenLocation = screenLocation;
    }
public void setEditFormName(String editFormName) {
        this.editFormName = editFormName;
    }
public void setEditFormLocation(String editFormLocation) {
        this.editFormLocation = editFormLocation;
    }
public void setDescription(String description) {
        this.description = description;
    }
public void setScreenshot(String screenshot) {
        this.screenshot = screenshot;
    }
public void setSecurityServiceName(String securityServiceName) {
        this.securityServiceName = securityServiceName;
    }
public void setSecurityMainAction(String securityMainAction) {
        this.securityMainAction = securityMainAction;
    }
}
