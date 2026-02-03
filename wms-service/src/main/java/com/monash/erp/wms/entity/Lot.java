package com.monash.erp.wms.entity;

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
public class Lot {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String lotId;
    private LocalDateTime creationDate;
    private String quantity;
    private LocalDateTime expirationDate;
public void setId(Long id) {
        this.id = id;
    }
public void setLotId(String lotId) {
        this.lotId = lotId;
    }
public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }
public void setQuantity(String quantity) {
        this.quantity = quantity;
    }
public void setExpirationDate(LocalDateTime expirationDate) {
        this.expirationDate = expirationDate;
    }

}
