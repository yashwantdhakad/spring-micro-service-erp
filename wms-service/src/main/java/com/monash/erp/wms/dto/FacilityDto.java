package com.monash.erp.wms.dto;

import lombok.Data;
import java.time.LocalDateTime;

@Data
public class FacilityDto {
    private Long id;
    private String facilityId;
    private String facilityTypeId;
    private String parentFacilityId;
    private String ownerPartyId;
    private String defaultInventoryItemTypeId;
    private String facilityName;
    private String primaryFacilityGroupId;
    private String facilitySize;
    private String facilitySizeUomId;
    private String productStoreId;
    private String defaultDaysToShip;
    private LocalDateTime openedDate;
    private LocalDateTime closedDate;
    private String description;
    private String defaultDimensionUomId;
    private String defaultWeightUomId;
    private String geoPointId;
    private String facilityLevel;
}
