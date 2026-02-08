package com.monash.erp.party.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "payment_method")
@Getter
@Setter
@NoArgsConstructor
public class PaymentMethod {

    @Id
    @Column(name = "payment_method_id", length = 20)
    private String paymentMethodId;

    @Column(name = "payment_method_type_id", length = 20)
    private String paymentMethodTypeId;

    @Column(name = "party_id", length = 20)
    private String partyId;

    @Column(name = "gl_account_id", length = 20)
    private String glAccountId;

    @Column(name = "description")
    private String description;

    @Column(name = "from_date")
    private LocalDateTime fromDate;

    @Column(name = "thru_date")
    private LocalDateTime thruDate;

    @Column(name = "fin_account_id", length = 20)
    private String finAccountId;

    @Column(name = "last_updated_stamp")
    private LocalDateTime lastUpdatedStamp;

    @Column(name = "last_updated_tx_stamp")
    private LocalDateTime lastUpdatedTxStamp;

    @Column(name = "created_stamp")
    private LocalDateTime createdStamp;

    @Column(name = "created_tx_stamp")
    private LocalDateTime createdTxStamp;
}
