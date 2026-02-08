package com.monash.erp.party.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Builder;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EnumerationDto {
    private String enumId;
    private String enumTypeId;
    private String enumCode;
    private String sequenceId;
    private String description;
}
