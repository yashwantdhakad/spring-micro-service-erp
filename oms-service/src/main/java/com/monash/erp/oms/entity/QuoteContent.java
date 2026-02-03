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
public class QuoteContent extends AuditableEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String quoteId;
    private String quoteItemSeqId;
    private String contentId;
    private String quoteContentTypeId;
    private LocalDateTime fromDate;
    private LocalDateTime thruDate;
public void setId(Long id) {
        this.id = id;
    }
public void setQuoteId(String quoteId) {
        this.quoteId = quoteId;
    }
public void setQuoteItemSeqId(String quoteItemSeqId) {
        this.quoteItemSeqId = quoteItemSeqId;
    }
public void setContentId(String contentId) {
        this.contentId = contentId;
    }
public void setQuoteContentTypeId(String quoteContentTypeId) {
        this.quoteContentTypeId = quoteContentTypeId;
    }
public void setFromDate(LocalDateTime fromDate) {
        this.fromDate = fromDate;
    }
public void setThruDate(LocalDateTime thruDate) {
        this.thruDate = thruDate;
    }

}
