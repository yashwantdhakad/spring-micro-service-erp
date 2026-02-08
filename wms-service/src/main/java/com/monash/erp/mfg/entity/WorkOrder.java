package com.monash.erp.mfg.entity;

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
        name = "work_order",
        indexes = {
                @Index(name = "idx_work_order_sku", columnList = "sku")
        }
)
@NoArgsConstructor
@Setter
@Getter
public class WorkOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String sku;
    private String status;
    private Integer quantity;
    private LocalDateTime scheduledDate;
public void setId(Long id) {
        this.id = id;
    }
public void setSku(String sku) {
        this.sku = sku;
    }
public void setStatus(String status) {
        this.status = status;
    }
public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
public void setScheduledDate(LocalDateTime scheduledDate) {
        this.scheduledDate = scheduledDate;
    }
}
