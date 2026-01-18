package com.monash.erp.oms.common.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPortalPortletId() {
        return portalPortletId;
    }

    public void setPortalPortletId(String portalPortletId) {
        this.portalPortletId = portalPortletId;
    }

    public String getPortletName() {
        return portletName;
    }

    public void setPortletName(String portletName) {
        this.portletName = portletName;
    }

    public String getScreenName() {
        return screenName;
    }

    public void setScreenName(String screenName) {
        this.screenName = screenName;
    }

    public String getScreenLocation() {
        return screenLocation;
    }

    public void setScreenLocation(String screenLocation) {
        this.screenLocation = screenLocation;
    }

    public String getEditFormName() {
        return editFormName;
    }

    public void setEditFormName(String editFormName) {
        this.editFormName = editFormName;
    }

    public String getEditFormLocation() {
        return editFormLocation;
    }

    public void setEditFormLocation(String editFormLocation) {
        this.editFormLocation = editFormLocation;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getScreenshot() {
        return screenshot;
    }

    public void setScreenshot(String screenshot) {
        this.screenshot = screenshot;
    }

    public String getSecurityServiceName() {
        return securityServiceName;
    }

    public void setSecurityServiceName(String securityServiceName) {
        this.securityServiceName = securityServiceName;
    }

    public String getSecurityMainAction() {
        return securityMainAction;
    }

    public void setSecurityMainAction(String securityMainAction) {
        this.securityMainAction = securityMainAction;
    }
}
