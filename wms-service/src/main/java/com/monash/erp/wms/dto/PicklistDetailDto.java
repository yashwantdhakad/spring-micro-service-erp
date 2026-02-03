package com.monash.erp.wms.dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;
import com.monash.erp.wms.entity.Picklist;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class PicklistDetailDto {

    private Picklist picklist;
    private String pickerId;
    private List<PicklistBinDetailDto> bins;
}
