package com.monash.erp.oms.order.entity;

import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Getter;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@Setter
@Getter
public class OrderContentInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String orderId;
    private String contentId;
    private String description;
    private String contentLocation;
    private LocalDateTime contentDate;
public void setId(Long id) {
        this.id = id;
    }
public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
public void setContentId(String contentId) {
        this.contentId = contentId;
    }
public void setDescription(String description) {
        this.description = description;
    }
public void setContentLocation(String contentLocation) {
        this.contentLocation = contentLocation;
    }
public void setContentDate(LocalDateTime contentDate) {
        this.contentDate = contentDate;
    }
}
