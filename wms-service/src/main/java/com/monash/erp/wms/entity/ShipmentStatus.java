package com.monash.erp.wms.entity;

import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Getter;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Index;
import jakarta.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(
        name = "shipment_status",
        indexes = {
                @Index(name = "idx_shipment_status_shipment_id", columnList = "shipment_id"),
                @Index(name = "idx_shipment_status_date", columnList = "shipment_id, status_date")
        }
)
@NoArgsConstructor
@Setter
@Getter
public class ShipmentStatus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String statusId;
    private String shipmentId;
    private LocalDateTime statusDate;
    private String changeByUserLoginId;
public void setId(Long id) {
        this.id = id;
    }
public void setStatusId(String statusId) {
        this.statusId = statusId;
    }
public void setShipmentId(String shipmentId) {
        this.shipmentId = shipmentId;
    }
public void setStatusDate(LocalDateTime statusDate) {
        this.statusDate = statusDate;
    }
public void setChangeByUserLoginId(String changeByUserLoginId) {
        this.changeByUserLoginId = changeByUserLoginId;
    }

}
