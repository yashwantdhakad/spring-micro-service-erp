package com.monash.erp.wms.entity;

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
public class ContentApproval {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String contentApprovalId;
    private String contentId;
    private String contentRevisionSeqId;
    private String partyId;
    private String roleTypeId;
    private String approvalStatusId;
    private LocalDateTime approvalDate;
    private String sequenceNum;
    private String comments;
public void setId(Long id) {
        this.id = id;
    }
public void setContentApprovalId(String contentApprovalId) {
        this.contentApprovalId = contentApprovalId;
    }
public void setContentId(String contentId) {
        this.contentId = contentId;
    }
public void setContentRevisionSeqId(String contentRevisionSeqId) {
        this.contentRevisionSeqId = contentRevisionSeqId;
    }
public void setPartyId(String partyId) {
        this.partyId = partyId;
    }
public void setRoleTypeId(String roleTypeId) {
        this.roleTypeId = roleTypeId;
    }
public void setApprovalStatusId(String approvalStatusId) {
        this.approvalStatusId = approvalStatusId;
    }
public void setApprovalDate(LocalDateTime approvalDate) {
        this.approvalDate = approvalDate;
    }
public void setSequenceNum(String sequenceNum) {
        this.sequenceNum = sequenceNum;
    }
public void setComments(String comments) {
        this.comments = comments;
    }

}
