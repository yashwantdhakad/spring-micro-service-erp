package com.monash.erp.oms.order.dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;
import java.time.LocalDateTime;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class InvoiceSummaryDto {

    private String invoiceId;
    private String statusId;
    private LocalDateTime invoiceDate;
    private String currencyUomId;
    private List<InvoiceItemSummaryDto> items;
}
