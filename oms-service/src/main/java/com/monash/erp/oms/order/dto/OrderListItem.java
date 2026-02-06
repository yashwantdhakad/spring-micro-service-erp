package com.monash.erp.oms.order.dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class OrderListItem {

    private Long id;
    private String orderId;
    private String customerName;
    private String organizationName;
    private String vendorOrganizationName;
    private LocalDateTime entryDate;
    private String statusDescription;
    private String storeName;
    private String facilityName;
    private BigDecimal quantityTotal;
    private BigDecimal grandTotal;
}
