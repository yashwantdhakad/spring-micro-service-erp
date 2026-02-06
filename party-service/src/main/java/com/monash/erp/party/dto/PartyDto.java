package com.monash.erp.party.dto;

import lombok.Data;
import java.time.LocalDateTime;

@Data
public class PartyDto {
    private Long id;
    private String partyId;
    private String partyTypeId;
    private String externalId;
    private String preferredCurrencyUomId;
    private String description;
    private String statusId;
    private LocalDateTime createdDate;
    private String createdByUserLogin;
    private LocalDateTime lastModifiedDate;
    private String lastModifiedByUserLogin;
    private String dataSourceId;
    private String isUnread;
    private String approvedPMa;
    private LocalDateTime createdStamp;
    private LocalDateTime lastUpdatedStamp;
    private LocalDateTime createdTxStamp;
    private LocalDateTime lastUpdatedTxStamp;
}
