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
public class OrderNote {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String orderId;
    private String noteText;
    private LocalDateTime noteDate;
    private String userId;
public void setId(Long id) {
        this.id = id;
    }
public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
public void setNoteText(String noteText) {
        this.noteText = noteText;
    }
public void setNoteDate(LocalDateTime noteDate) {
        this.noteDate = noteDate;
    }
public void setUserId(String userId) {
        this.userId = userId;
    }
}
