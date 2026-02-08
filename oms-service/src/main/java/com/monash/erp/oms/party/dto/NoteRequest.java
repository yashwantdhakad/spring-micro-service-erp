package com.monash.erp.oms.party.dto;

import lombok.NoArgsConstructor;
import lombok.Data;
import lombok.AllArgsConstructor;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class NoteRequest {

    private String noteText;
    private LocalDateTime noteDate;
    private String createdBy;
}
