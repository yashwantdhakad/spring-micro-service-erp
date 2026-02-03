package com.monash.erp.party.dto;

import lombok.NoArgsConstructor;
import lombok.Data;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CustomerUpdateRequest {

    private String firstName;
    private String lastName;
}
