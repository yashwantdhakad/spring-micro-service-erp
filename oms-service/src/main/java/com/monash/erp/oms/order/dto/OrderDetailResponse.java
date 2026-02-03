package com.monash.erp.oms.order.dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class OrderDetailResponse {

    private List<OrderPartDto> parts;
    private List<OrderContentDto> contents;
    private List<OrderAdjustmentDto> adjustments;
}
