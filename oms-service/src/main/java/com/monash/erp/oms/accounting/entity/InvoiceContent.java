package com.monash.erp.oms.accounting.entity;

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
public class InvoiceContent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String invoiceId;

    private String invoiceContentTypeId;

    private String contentId;

    private LocalDateTime fromDate;

    private LocalDateTime thruDate;
public void setId(Long id) {
        this.id = id;
    }
public void setInvoiceId(String invoiceId) {
        this.invoiceId = invoiceId;
    }
public void setInvoiceContentTypeId(String invoiceContentTypeId) {
        this.invoiceContentTypeId = invoiceContentTypeId;
    }
public void setContentId(String contentId) {
        this.contentId = contentId;
    }
public void setFromDate(LocalDateTime fromDate) {
        this.fromDate = fromDate;
    }
public void setThruDate(LocalDateTime thruDate) {
        this.thruDate = thruDate;
    }
}
