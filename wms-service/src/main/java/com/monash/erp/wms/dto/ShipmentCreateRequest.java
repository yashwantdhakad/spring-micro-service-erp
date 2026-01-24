package com.monash.erp.wms.dto;

import com.monash.erp.wms.entity.Shipment;
import com.monash.erp.wms.entity.ShipmentItem;
import com.monash.erp.wms.entity.ShipmentPackage;
import com.monash.erp.wms.entity.ShipmentPackageContent;
import com.monash.erp.wms.entity.ShipmentPackageRouteSeg;
import com.monash.erp.wms.entity.ShipmentRouteSegment;
import com.monash.erp.wms.entity.ShipmentStatus;

import java.util.List;

public class ShipmentCreateRequest {

    private Shipment shipment;
    private List<ShipmentItem> items;
    private List<ShipmentRouteSegment> routeSegments;
    private List<ShipmentStatus> statuses;
    private List<ShipmentPackage> packages;
    private List<ShipmentPackageContent> packageContents;
    private List<ShipmentPackageRouteSeg> packageRouteSegments;

    public Shipment getShipment() {
        return shipment;
    }

    public void setShipment(Shipment shipment) {
        this.shipment = shipment;
    }

    public List<ShipmentItem> getItems() {
        return items;
    }

    public void setItems(List<ShipmentItem> items) {
        this.items = items;
    }

    public List<ShipmentRouteSegment> getRouteSegments() {
        return routeSegments;
    }

    public void setRouteSegments(List<ShipmentRouteSegment> routeSegments) {
        this.routeSegments = routeSegments;
    }

    public List<ShipmentStatus> getStatuses() {
        return statuses;
    }

    public void setStatuses(List<ShipmentStatus> statuses) {
        this.statuses = statuses;
    }

    public List<ShipmentPackage> getPackages() {
        return packages;
    }

    public void setPackages(List<ShipmentPackage> packages) {
        this.packages = packages;
    }

    public List<ShipmentPackageContent> getPackageContents() {
        return packageContents;
    }

    public void setPackageContents(List<ShipmentPackageContent> packageContents) {
        this.packageContents = packageContents;
    }

    public List<ShipmentPackageRouteSeg> getPackageRouteSegments() {
        return packageRouteSegments;
    }

    public void setPackageRouteSegments(List<ShipmentPackageRouteSeg> packageRouteSegments) {
        this.packageRouteSegments = packageRouteSegments;
    }
}
