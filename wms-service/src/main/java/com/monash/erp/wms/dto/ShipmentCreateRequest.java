package com.monash.erp.wms.dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;
import com.monash.erp.wms.entity.Shipment;
import com.monash.erp.wms.entity.ShipmentItem;
import com.monash.erp.wms.entity.ShipmentPackage;
import com.monash.erp.wms.entity.ShipmentPackageContent;
import com.monash.erp.wms.entity.ShipmentPackageRouteSeg;
import com.monash.erp.wms.entity.ShipmentRouteSegment;
import com.monash.erp.wms.entity.ShipmentStatus;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ShipmentCreateRequest {

    private Shipment shipment;
    private List<ShipmentItem> items;
    private List<ShipmentRouteSegment> routeSegments;
    private List<ShipmentStatus> statuses;
    private List<ShipmentPackage> packages;
    private List<ShipmentPackageContent> packageContents;
    private List<ShipmentPackageRouteSeg> packageRouteSegments;
}
