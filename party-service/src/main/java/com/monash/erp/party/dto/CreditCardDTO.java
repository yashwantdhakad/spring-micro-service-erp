package com.monash.erp.party.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CreditCardDTO {
    private String cardType;
    private String cardNumber;
    private String validFromDate;
    private String expireDate;
    private String firstNameOnCard;
    private String middleNameOnCard;
    private String lastNameOnCard;
    private String roleTypeId;
    private String postalAddressId; // Existing address ID if selected
    // Fields for creating a new address if needed
    private String address1;
    private String address2;
    private String city;
    private String postalCode;
    private String countryGeoId;
    private String stateProvinceGeoId;
}
