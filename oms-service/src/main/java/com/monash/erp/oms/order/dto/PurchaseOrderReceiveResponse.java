package com.monash.erp.oms.order.dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class PurchaseOrderReceiveResponse {

    private String shipmentId;
    private List<PurchaseOrderReceiptDto> receipts;
}
