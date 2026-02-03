package com.monash.erp.oms.order.dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class OrderContentDto {

    private String contentId;
    private String description;
    private LocalDateTime contentDate;
    private String contentLocation;
}
