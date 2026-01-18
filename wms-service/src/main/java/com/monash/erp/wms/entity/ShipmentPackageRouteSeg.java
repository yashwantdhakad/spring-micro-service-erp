package com.monash.erp.wms.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getShipmentId() {
        return shipmentId;
    }

    public void setShipmentId(String shipmentId) {
        this.shipmentId = shipmentId;
    }

    public String getShipmentPackageSeqId() {
        return shipmentPackageSeqId;
    }

    public void setShipmentPackageSeqId(String shipmentPackageSeqId) {
        this.shipmentPackageSeqId = shipmentPackageSeqId;
    }

    public String getShipmentRouteSegmentId() {
        return shipmentRouteSegmentId;
    }

    public void setShipmentRouteSegmentId(String shipmentRouteSegmentId) {
        this.shipmentRouteSegmentId = shipmentRouteSegmentId;
    }

    public String getTrackingCode() {
        return trackingCode;
    }

    public void setTrackingCode(String trackingCode) {
        this.trackingCode = trackingCode;
    }

    public String getBoxNumber() {
        return boxNumber;
    }

    public void setBoxNumber(String boxNumber) {
        this.boxNumber = boxNumber;
    }

    public String getLabelImage() {
        return labelImage;
    }

    public void setLabelImage(String labelImage) {
        this.labelImage = labelImage;
    }

    public String getLabelIntlSignImage() {
        return labelIntlSignImage;
    }

    public void setLabelIntlSignImage(String labelIntlSignImage) {
        this.labelIntlSignImage = labelIntlSignImage;
    }

    public String getLabelHtml() {
        return labelHtml;
    }

    public void setLabelHtml(String labelHtml) {
        this.labelHtml = labelHtml;
    }

    public String getLabelPrinted() {
        return labelPrinted;
    }

    public void setLabelPrinted(String labelPrinted) {
        this.labelPrinted = labelPrinted;
    }

    public String getInternationalInvoice() {
        return internationalInvoice;
    }

    public void setInternationalInvoice(String internationalInvoice) {
        this.internationalInvoice = internationalInvoice;
    }

    public String getPackageTransportCost() {
        return packageTransportCost;
    }

    public void setPackageTransportCost(String packageTransportCost) {
        this.packageTransportCost = packageTransportCost;
    }

    public String getPackageServiceCost() {
        return packageServiceCost;
    }

    public void setPackageServiceCost(String packageServiceCost) {
        this.packageServiceCost = packageServiceCost;
    }

    public String getPackageOtherCost() {
        return packageOtherCost;
    }

    public void setPackageOtherCost(String packageOtherCost) {
        this.packageOtherCost = packageOtherCost;
    }

    public String getCodAmount() {
        return codAmount;
    }

    public void setCodAmount(String codAmount) {
        this.codAmount = codAmount;
    }

    public String getInsuredAmount() {
        return insuredAmount;
    }

    public void setInsuredAmount(String insuredAmount) {
        this.insuredAmount = insuredAmount;
    }

    public String getCurrencyUomId() {
        return currencyUomId;
    }

    public void setCurrencyUomId(String currencyUomId) {
        this.currencyUomId = currencyUomId;
    }

}