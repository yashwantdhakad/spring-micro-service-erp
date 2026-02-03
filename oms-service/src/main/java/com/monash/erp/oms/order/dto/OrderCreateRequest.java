package com.monash.erp.oms.order.dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class OrderCreateRequest {

    private String orderTypeEnumId;
    private String productStoreId;
    private String vendorPartyId;
    private String facilityId;
    private String customerPartyId;
    private LocalDateTime shipBeforeDate;
    private LocalDateTime estimatedDeliveryDate;
    private OrderAddressRequest shippingAddress;
    private OrderAddressRequest billingAddress;
}
