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
public class ContentRevision {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String contentId;
    private String contentRevisionSeqId;
    private String committedByPartyId;
    private String comments;
public void setId(Long id) {
        this.id = id;
    }
public void setContentId(String contentId) {
        this.contentId = contentId;
    }
public void setContentRevisionSeqId(String contentRevisionSeqId) {
        this.contentRevisionSeqId = contentRevisionSeqId;
    }
public void setCommittedByPartyId(String committedByPartyId) {
        this.committedByPartyId = committedByPartyId;
    }
public void setComments(String comments) {
        this.comments = comments;
    }

}
