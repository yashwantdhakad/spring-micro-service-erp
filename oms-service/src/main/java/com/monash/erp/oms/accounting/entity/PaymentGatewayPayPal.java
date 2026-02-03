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
public class PaymentGatewayPayPal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String paymentGatewayConfigId;

    private String businessEmail;

    private String apiUserName;

    private String apiPassword;

    private String apiSignature;

    private String apiEnvironment;

    private String notifyUrl;

    private String returnUrl;

    private String cancelReturnUrl;

    private String imageUrl;

    private String confirmTemplate;

    private String redirectUrl;

    private String confirmUrl;

    private String shippingCallbackUrl;

    private Boolean requireConfirmedShipping;
public void setId(Long id) {
        this.id = id;
    }
public void setPaymentGatewayConfigId(String paymentGatewayConfigId) {
        this.paymentGatewayConfigId = paymentGatewayConfigId;
    }
public void setBusinessEmail(String businessEmail) {
        this.businessEmail = businessEmail;
    }
public void setApiUserName(String apiUserName) {
        this.apiUserName = apiUserName;
    }
public void setApiPassword(String apiPassword) {
        this.apiPassword = apiPassword;
    }
public void setApiSignature(String apiSignature) {
        this.apiSignature = apiSignature;
    }
public void setApiEnvironment(String apiEnvironment) {
        this.apiEnvironment = apiEnvironment;
    }
public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
    }
public void setReturnUrl(String returnUrl) {
        this.returnUrl = returnUrl;
    }
public void setCancelReturnUrl(String cancelReturnUrl) {
        this.cancelReturnUrl = cancelReturnUrl;
    }
public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
public void setConfirmTemplate(String confirmTemplate) {
        this.confirmTemplate = confirmTemplate;
    }
public void setRedirectUrl(String redirectUrl) {
        this.redirectUrl = redirectUrl;
    }
public void setConfirmUrl(String confirmUrl) {
        this.confirmUrl = confirmUrl;
    }
public void setShippingCallbackUrl(String shippingCallbackUrl) {
        this.shippingCallbackUrl = shippingCallbackUrl;
    }
public void setRequireConfirmedShipping(Boolean requireConfirmedShipping) {
        this.requireConfirmedShipping = requireConfirmedShipping;
    }
}
