package com.monash.erp.oms.party.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "credit_card")
@Getter
@Setter
@NoArgsConstructor
public class CreditCard {

    @Id
    @Column(name = "payment_method_id", length = 20)
    private String paymentMethodId;

    @Column(name = "card_type", length = 60)
    private String cardType;

    @Column(name = "card_number")
    private String cardNumber;

    @Column(name = "valid_from_date", length = 20)
    private String validFromDate;

    @Column(name = "expire_date", length = 20)
    private String expireDate;

    @Column(name = "issue_number", length = 20)
    private String issueNumber;

    @Column(name = "company_name_on_card", length = 100)
    private String companyNameOnCard;

    @Column(name = "title_on_card", length = 100)
    private String titleOnCard;

    @Column(name = "first_name_on_card", length = 100)
    private String firstNameOnCard;

    @Column(name = "middle_name_on_card", length = 100)
    private String middleNameOnCard;

    @Column(name = "last_name_on_card", length = 100)
    private String lastNameOnCard;

    @Column(name = "suffix_on_card", length = 100)
    private String suffixOnCard;

    @Column(name = "contact_mech_id", length = 20)
    private String contactMechId;

    @Column(name = "consecutive_failed_auths")
    private BigDecimal consecutiveFailedAuths;

    @Column(name = "last_failed_auth_date")
    private LocalDateTime lastFailedAuthDate;

    @Column(name = "consecutive_failed_nsf")
    private BigDecimal consecutiveFailedNsf;

    @Column(name = "last_failed_nsf_date")
    private LocalDateTime lastFailedNsfDate;

    @Column(name = "last_updated_stamp")
    private LocalDateTime lastUpdatedStamp;

    @Column(name = "last_updated_tx_stamp")
    private LocalDateTime lastUpdatedTxStamp;

    @Column(name = "created_stamp")
    private LocalDateTime createdStamp;

    @Column(name = "created_tx_stamp")
    private LocalDateTime createdTxStamp;
}
