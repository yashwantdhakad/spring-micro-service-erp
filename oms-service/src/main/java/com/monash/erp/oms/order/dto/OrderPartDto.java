package com.monash.erp.oms.order.dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;
import com.monash.erp.oms.common.entity.StatusItem;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class OrderPartDto {

    private String orderPartSeqId;
    private StatusItem status;
    private TelecomDto telecom;
    private LocalDateTime shipBeforeDate;
    private BigDecimal partTotal;
    private FacilityDto facility;
    private CustomerPartyDto customer;
    private List<OrderItemDto> items;
}
