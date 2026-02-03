package com.monash.erp.oms.order.dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class OrderStatusDto {

    private String statusId;
    private String orderItemSeqId;
    private LocalDateTime statusDatetime;
}
