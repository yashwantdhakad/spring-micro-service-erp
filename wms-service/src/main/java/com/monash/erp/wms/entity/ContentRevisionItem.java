package com.monash.erp.wms.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ContentRevisionItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String contentId;
    private String contentRevisionSeqId;
    private String itemContentId;
    private String oldDataResourceId;
    private String newDataResourceId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContentId() {
        return contentId;
    }

    public void setContentId(String contentId) {
        this.contentId = contentId;
    }

    public String getContentRevisionSeqId() {
        return contentRevisionSeqId;
    }

    public void setContentRevisionSeqId(String contentRevisionSeqId) {
        this.contentRevisionSeqId = contentRevisionSeqId;
    }

    public String getItemContentId() {
        return itemContentId;
    }

    public void setItemContentId(String itemContentId) {
        this.itemContentId = itemContentId;
    }

    public String getOldDataResourceId() {
        return oldDataResourceId;
    }

    public void setOldDataResourceId(String oldDataResourceId) {
        this.oldDataResourceId = oldDataResourceId;
    }

    public String getNewDataResourceId() {
        return newDataResourceId;
    }

    public void setNewDataResourceId(String newDataResourceId) {
        this.newDataResourceId = newDataResourceId;
    }

}