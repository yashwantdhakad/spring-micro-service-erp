package com.monash.erp.wms.dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;
import com.monash.erp.wms.entity.Facility;
import com.monash.erp.wms.entity.FacilityLocation;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class FacilityDetailResponse {

    private Facility facility;
    private List<FacilityLocation> locations;
}
