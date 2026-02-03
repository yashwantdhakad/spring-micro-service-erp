package com.monash.erp.wms.entity;

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
public class ProductCategoryLink {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String productCategoryId;
    private String linkSeqId;
    private LocalDateTime fromDate;
    private LocalDateTime thruDate;
    private String comments;
    private BigDecimal sequenceNum;
    private String titleText;
    private String detailText;
    private String imageUrl;
    private String imageTwoUrl;
    private String linkTypeEnumId;
    private String linkInfo;
    private String detailSubScreen;
    private LocalDateTime lastUpdatedStamp;
    private LocalDateTime lastUpdatedTxStamp;
    private LocalDateTime createdStamp;
    private LocalDateTime createdTxStamp;
public void setId(Long id) {
        this.id = id;
    }
public void setProductCategoryId(String productCategoryId) {
        this.productCategoryId = productCategoryId;
    }
public void setLinkSeqId(String linkSeqId) {
        this.linkSeqId = linkSeqId;
    }
public void setFromDate(LocalDateTime fromDate) {
        this.fromDate = fromDate;
    }
public void setThruDate(LocalDateTime thruDate) {
        this.thruDate = thruDate;
    }
public void setComments(String comments) {
        this.comments = comments;
    }
public void setSequenceNum(BigDecimal sequenceNum) {
        this.sequenceNum = sequenceNum;
    }
public void setTitleText(String titleText) {
        this.titleText = titleText;
    }
public void setDetailText(String detailText) {
        this.detailText = detailText;
    }
public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
public void setImageTwoUrl(String imageTwoUrl) {
        this.imageTwoUrl = imageTwoUrl;
    }
public void setLinkTypeEnumId(String linkTypeEnumId) {
        this.linkTypeEnumId = linkTypeEnumId;
    }
public void setLinkInfo(String linkInfo) {
        this.linkInfo = linkInfo;
    }
public void setDetailSubScreen(String detailSubScreen) {
        this.detailSubScreen = detailSubScreen;
    }
public void setLastUpdatedStamp(LocalDateTime lastUpdatedStamp) {
        this.lastUpdatedStamp = lastUpdatedStamp;
    }
public void setLastUpdatedTxStamp(LocalDateTime lastUpdatedTxStamp) {
        this.lastUpdatedTxStamp = lastUpdatedTxStamp;
    }
public void setCreatedStamp(LocalDateTime createdStamp) {
        this.createdStamp = createdStamp;
    }
public void setCreatedTxStamp(LocalDateTime createdTxStamp) {
        this.createdTxStamp = createdTxStamp;
    }

}
