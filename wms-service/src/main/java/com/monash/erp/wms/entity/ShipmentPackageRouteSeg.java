package com.monash.erp.wms.entity;

import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Getter;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@NoArgsConstructor
@Setter
@Getter
public class ShipmentPackageRouteSeg {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String shipmentId;
    private String shipmentPackageSeqId;
    private String shipmentRouteSegmentId;
    private String trackingCode;
    private String boxNumber;
    private String labelImage;
    private String labelIntlSignImage;
    private String labelHtml;
    private String labelPrinted;
    private String internationalInvoice;
    private String packageTransportCost;
    private String packageServiceCost;
    private String packageOtherCost;
    private String codAmount;
    private String insuredAmount;
    private String currencyUomId;
public void setId(Long id) {
        this.id = id;
    }
public void setShipmentId(String shipmentId) {
        this.shipmentId = shipmentId;
    }
public void setShipmentPackageSeqId(String shipmentPackageSeqId) {
        this.shipmentPackageSeqId = shipmentPackageSeqId;
    }
public void setShipmentRouteSegmentId(String shipmentRouteSegmentId) {
        this.shipmentRouteSegmentId = shipmentRouteSegmentId;
    }
public void setTrackingCode(String trackingCode) {
        this.trackingCode = trackingCode;
    }
public void setBoxNumber(String boxNumber) {
        this.boxNumber = boxNumber;
    }
public void setLabelImage(String labelImage) {
        this.labelImage = labelImage;
    }
public void setLabelIntlSignImage(String labelIntlSignImage) {
        this.labelIntlSignImage = labelIntlSignImage;
    }
public void setLabelHtml(String labelHtml) {
        this.labelHtml = labelHtml;
    }
public void setLabelPrinted(String labelPrinted) {
        this.labelPrinted = labelPrinted;
    }
public void setInternationalInvoice(String internationalInvoice) {
        this.internationalInvoice = internationalInvoice;
    }
public void setPackageTransportCost(String packageTransportCost) {
        this.packageTransportCost = packageTransportCost;
    }
public void setPackageServiceCost(String packageServiceCost) {
        this.packageServiceCost = packageServiceCost;
    }
public void setPackageOtherCost(String packageOtherCost) {
        this.packageOtherCost = packageOtherCost;
    }
public void setCodAmount(String codAmount) {
        this.codAmount = codAmount;
    }
public void setInsuredAmount(String insuredAmount) {
        this.insuredAmount = insuredAmount;
    }
public void setCurrencyUomId(String currencyUomId) {
        this.currencyUomId = currencyUomId;
    }

}
