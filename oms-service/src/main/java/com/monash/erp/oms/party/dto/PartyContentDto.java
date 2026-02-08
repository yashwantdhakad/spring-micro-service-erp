package com.monash.erp.oms.party.dto;

import lombok.NoArgsConstructor;
import lombok.Data;
import lombok.AllArgsConstructor;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class PartyContentDto {

    private String contentId;
    private String description;
    private LocalDateTime contentDate;
    private String contentLocation;
}
