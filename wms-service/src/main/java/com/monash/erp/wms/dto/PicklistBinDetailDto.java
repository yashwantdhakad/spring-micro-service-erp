package com.monash.erp.wms.dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class PicklistBinDetailDto {

    private String picklistBinId;
    private String binLocationNumber;
    private String primaryOrderId;
    private String primaryShipGroupSeqId;
    private List<PicklistItemDetailDto> items;
}
