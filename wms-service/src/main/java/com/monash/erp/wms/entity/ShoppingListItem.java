package com.monash.erp.wms.entity;

import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Getter;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@Setter
@Getter
public class ShoppingListItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String shoppingListId;
    private String shoppingListItemSeqId;
    private String productId;
    private BigDecimal quantity;
    private LocalDateTime reservStart;
    private BigDecimal reservLength;
    private BigDecimal reservPersons;
    private BigDecimal quantityPurchased;
    private String configId;
    private LocalDateTime lastUpdatedStamp;
    private LocalDateTime lastUpdatedTxStamp;
    private LocalDateTime createdStamp;
    private LocalDateTime createdTxStamp;
public void setId(Long id) {
        this.id = id;
    }
public void setShoppingListId(String shoppingListId) {
        this.shoppingListId = shoppingListId;
    }
public void setShoppingListItemSeqId(String shoppingListItemSeqId) {
        this.shoppingListItemSeqId = shoppingListItemSeqId;
    }
public void setProductId(String productId) {
        this.productId = productId;
    }
public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }
public void setReservStart(LocalDateTime reservStart) {
        this.reservStart = reservStart;
    }
public void setReservLength(BigDecimal reservLength) {
        this.reservLength = reservLength;
    }
public void setReservPersons(BigDecimal reservPersons) {
        this.reservPersons = reservPersons;
    }
public void setQuantityPurchased(BigDecimal quantityPurchased) {
        this.quantityPurchased = quantityPurchased;
    }
public void setConfigId(String configId) {
        this.configId = configId;
    }
public void setLastUpdatedStamp(LocalDateTime lastUpdatedStamp) {
        this.lastUpdatedStamp = lastUpdatedStamp;
    }
public void setLastUpdatedTxStamp(LocalDateTime lastUpdatedTxStamp) {
        this.lastUpdatedTxStamp = lastUpdatedTxStamp;
    }
public void setCreatedStamp(LocalDateTime createdStamp) {
        this.createdStamp = createdStamp;
    }
public void setCreatedTxStamp(LocalDateTime createdTxStamp) {
        this.createdTxStamp = createdTxStamp;
    }

}
