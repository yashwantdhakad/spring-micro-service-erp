package com.monash.erp.wms.entity;

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
public class WebSitePublishPoint {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String contentId;
    private String templateTitle;
    private String styleSheetFile;
    private String logo;
    private String medallionLogo;
    private String lineLogo;
    private String leftBarId;
    private String rightBarId;
    private String contentDept;
    private String aboutContentId;
public void setId(Long id) {
        this.id = id;
    }
public void setContentId(String contentId) {
        this.contentId = contentId;
    }
public void setTemplateTitle(String templateTitle) {
        this.templateTitle = templateTitle;
    }
public void setStyleSheetFile(String styleSheetFile) {
        this.styleSheetFile = styleSheetFile;
    }
public void setLogo(String logo) {
        this.logo = logo;
    }
public void setMedallionLogo(String medallionLogo) {
        this.medallionLogo = medallionLogo;
    }
public void setLineLogo(String lineLogo) {
        this.lineLogo = lineLogo;
    }
public void setLeftBarId(String leftBarId) {
        this.leftBarId = leftBarId;
    }
public void setRightBarId(String rightBarId) {
        this.rightBarId = rightBarId;
    }
public void setContentDept(String contentDept) {
        this.contentDept = contentDept;
    }
public void setAboutContentId(String aboutContentId) {
        this.aboutContentId = aboutContentId;
    }

}
