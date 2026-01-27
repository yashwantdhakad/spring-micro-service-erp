package com.monash.erp.oms.order.dto;

import java.time.LocalDateTime;
import java.util.List;

public class InvoiceSummaryDto {

    private String invoiceId;
    private String statusId;
    private LocalDateTime invoiceDate;
    private String currencyUomId;
    private List<InvoiceItemSummaryDto> items;

    public InvoiceSummaryDto() {
    }

    public InvoiceSummaryDto(
            String invoiceId,
            String statusId,
            LocalDateTime invoiceDate,
            String currencyUomId,
            List<InvoiceItemSummaryDto> items
    ) {
        this.invoiceId = invoiceId;
        this.statusId = statusId;
        this.invoiceDate = invoiceDate;
        this.currencyUomId = currencyUomId;
        this.items = items;
    }

    public String getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(String invoiceId) {
        this.invoiceId = invoiceId;
    }

    public String getStatusId() {
        return statusId;
    }

    public void setStatusId(String statusId) {
        this.statusId = statusId;
    }

    public LocalDateTime getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(LocalDateTime invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public String getCurrencyUomId() {
        return currencyUomId;
    }

    public void setCurrencyUomId(String currencyUomId) {
        this.currencyUomId = currencyUomId;
    }

    public List<InvoiceItemSummaryDto> getItems() {
        return items;
    }

    public void setItems(List<InvoiceItemSummaryDto> items) {
        this.items = items;
    }
}
