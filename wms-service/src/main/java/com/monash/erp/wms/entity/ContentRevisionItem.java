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
public class ContentRevisionItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String contentId;
    private String contentRevisionSeqId;
    private String itemContentId;
    private String oldDataResourceId;
    private String newDataResourceId;
public void setId(Long id) {
        this.id = id;
    }
public void setContentId(String contentId) {
        this.contentId = contentId;
    }
public void setContentRevisionSeqId(String contentRevisionSeqId) {
        this.contentRevisionSeqId = contentRevisionSeqId;
    }
public void setItemContentId(String itemContentId) {
        this.itemContentId = itemContentId;
    }
public void setOldDataResourceId(String oldDataResourceId) {
        this.oldDataResourceId = oldDataResourceId;
    }
public void setNewDataResourceId(String newDataResourceId) {
        this.newDataResourceId = newDataResourceId;
    }

}
