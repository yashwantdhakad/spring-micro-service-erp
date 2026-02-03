package com.monash.erp.oms.order.dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class TelecomNumberDto {

    private String countryCode;
    private String areaCode;
    private String contactNumber;
}
