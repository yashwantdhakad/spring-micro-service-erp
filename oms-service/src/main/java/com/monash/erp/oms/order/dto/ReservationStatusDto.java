package com.monash.erp.oms.order.dto;

public class ReservationStatusDto {

    private boolean fullyReserved;
    private boolean hasBackorder;

    public ReservationStatusDto() {
    }

    public ReservationStatusDto(boolean fullyReserved, boolean hasBackorder) {
        this.fullyReserved = fullyReserved;
        this.hasBackorder = hasBackorder;
    }

    public boolean isFullyReserved() {
        return fullyReserved;
    }

    public void setFullyReserved(boolean fullyReserved) {
        this.fullyReserved = fullyReserved;
    }

    public boolean isHasBackorder() {
        return hasBackorder;
    }

    public void setHasBackorder(boolean hasBackorder) {
        this.hasBackorder = hasBackorder;
    }
}
