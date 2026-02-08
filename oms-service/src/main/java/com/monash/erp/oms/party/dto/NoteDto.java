package com.monash.erp.oms.party.dto;

import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Data;
import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class NoteDto {

    private String noteId;
    private String noteText;
    private LocalDateTime noteDate;
    private String createdBy;
}
