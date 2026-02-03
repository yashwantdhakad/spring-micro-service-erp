package com.monash.erp.oms.accounting.entity;

import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Getter;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@NoArgsConstructor
@Setter
@Getter
public class PaymentGatewayRespMsg {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String paymentGatewayRespMsgId;

    private String paymentGatewayResponseId;

    private String pgrMessage;
public void setId(Long id) {
        this.id = id;
    }
public void setPaymentGatewayRespMsgId(String paymentGatewayRespMsgId) {
        this.paymentGatewayRespMsgId = paymentGatewayRespMsgId;
    }
public void setPaymentGatewayResponseId(String paymentGatewayResponseId) {
        this.paymentGatewayResponseId = paymentGatewayResponseId;
    }
public void setPgrMessage(String pgrMessage) {
        this.pgrMessage = pgrMessage;
    }
}
