package com.monash.erp.oms.order.dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;
import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class OrderPaymentPreferenceDto {

    private String paymentMethodTypeId;
    private String paymentMethodId;
    private String statusId;
    private BigDecimal maxAmount;
}
