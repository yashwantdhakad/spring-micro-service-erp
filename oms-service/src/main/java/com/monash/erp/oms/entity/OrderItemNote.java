package com.monash.erp.oms.entity;

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
        name = "order_item_note",
        indexes = {
                @Index(name = "idx_order_item_note_order_id", columnList = "order_id")
        }
)
@NoArgsConstructor
@Setter
@Getter
public class OrderItemNote extends AuditableEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String orderId;
    private String orderItemSeqId;
    private String noteId;
    private String internalNote;
public void setId(Long id) {
        this.id = id;
    }
public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
public void setOrderItemSeqId(String orderItemSeqId) {
        this.orderItemSeqId = orderItemSeqId;
    }
public void setNoteId(String noteId) {
        this.noteId = noteId;
    }
public void setInternalNote(String internalNote) {
        this.internalNote = internalNote;
    }

}
