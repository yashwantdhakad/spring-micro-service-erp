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
public class CommunicationEvent extends AuditableEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String communicationEventId;
    private String communicationEventTypeId;
    private String origCommEventId;
    private String parentCommEventId;
    private String statusId;
    private String contactMechTypeId;
    private String contactMechIdFrom;
    private String contactMechIdTo;
    private String roleTypeIdFrom;
    private String roleTypeIdTo;
    private String partyIdFrom;
    private String partyIdTo;
    private LocalDateTime entryDate;
    private LocalDateTime datetimeStarted;
    private LocalDateTime datetimeEnded;
    private String subject;
    private String contentMimeTypeId;
    private String content;
    private String note;
    private String reasonEnumId;
    private String contactListId;
    private String headerString;
    private String fromString;
    private String toString;
    private String ccString;
    private String bccString;
    private String messageId;
public void setId(Long id) {
        this.id = id;
    }
public void setCommunicationEventId(String communicationEventId) {
        this.communicationEventId = communicationEventId;
    }
public void setCommunicationEventTypeId(String communicationEventTypeId) {
        this.communicationEventTypeId = communicationEventTypeId;
    }
public void setOrigCommEventId(String origCommEventId) {
        this.origCommEventId = origCommEventId;
    }
public void setParentCommEventId(String parentCommEventId) {
        this.parentCommEventId = parentCommEventId;
    }
public void setStatusId(String statusId) {
        this.statusId = statusId;
    }
public void setContactMechTypeId(String contactMechTypeId) {
        this.contactMechTypeId = contactMechTypeId;
    }
public void setContactMechIdFrom(String contactMechIdFrom) {
        this.contactMechIdFrom = contactMechIdFrom;
    }
public void setContactMechIdTo(String contactMechIdTo) {
        this.contactMechIdTo = contactMechIdTo;
    }
public void setRoleTypeIdFrom(String roleTypeIdFrom) {
        this.roleTypeIdFrom = roleTypeIdFrom;
    }
public void setRoleTypeIdTo(String roleTypeIdTo) {
        this.roleTypeIdTo = roleTypeIdTo;
    }
public void setPartyIdFrom(String partyIdFrom) {
        this.partyIdFrom = partyIdFrom;
    }
public void setPartyIdTo(String partyIdTo) {
        this.partyIdTo = partyIdTo;
    }
public void setEntryDate(LocalDateTime entryDate) {
        this.entryDate = entryDate;
    }
public void setDatetimeStarted(LocalDateTime datetimeStarted) {
        this.datetimeStarted = datetimeStarted;
    }
public void setDatetimeEnded(LocalDateTime datetimeEnded) {
        this.datetimeEnded = datetimeEnded;
    }
public void setSubject(String subject) {
        this.subject = subject;
    }
public void setContentMimeTypeId(String contentMimeTypeId) {
        this.contentMimeTypeId = contentMimeTypeId;
    }
public void setContent(String content) {
        this.content = content;
    }
public void setNote(String note) {
        this.note = note;
    }
public void setReasonEnumId(String reasonEnumId) {
        this.reasonEnumId = reasonEnumId;
    }
public void setContactListId(String contactListId) {
        this.contactListId = contactListId;
    }
public void setHeaderString(String headerString) {
        this.headerString = headerString;
    }
public void setFromString(String fromString) {
        this.fromString = fromString;
    }
public void setToString(String toString) {
        this.toString = toString;
    }
public void setCcString(String ccString) {
        this.ccString = ccString;
    }
public void setBccString(String bccString) {
        this.bccString = bccString;
    }
public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

}
