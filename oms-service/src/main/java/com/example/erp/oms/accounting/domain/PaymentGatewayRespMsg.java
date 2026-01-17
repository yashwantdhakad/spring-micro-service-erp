package com.example.erp.oms.accounting.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class PaymentGatewayRespMsg {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String paymentGatewayRespMsgId;

    private String paymentGatewayResponseId;

    private String pgrMessage;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPaymentGatewayRespMsgId() {
        return paymentGatewayRespMsgId;
    }

    public void setPaymentGatewayRespMsgId(String paymentGatewayRespMsgId) {
        this.paymentGatewayRespMsgId = paymentGatewayRespMsgId;
    }

    public String getPaymentGatewayResponseId() {
        return paymentGatewayResponseId;
    }

    public void setPaymentGatewayResponseId(String paymentGatewayResponseId) {
        this.paymentGatewayResponseId = paymentGatewayResponseId;
    }

    public String getPgrMessage() {
        return pgrMessage;
    }

    public void setPgrMessage(String pgrMessage) {
        this.pgrMessage = pgrMessage;
    }
}
