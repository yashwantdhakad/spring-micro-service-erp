package com.monash.erp.oms.order.dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class OrderNoteDto {

    private Long id;
    private String noteText;
    private LocalDateTime noteDate;
    private String userId;
}
