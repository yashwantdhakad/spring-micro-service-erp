package com.monash.erp.mfg.entity;

import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Getter;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@Setter
@Getter
public class TechDataCalendarExcWeek {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String calendarId;
    private LocalDateTime exceptionDateStart;
    private String calendarWeekId;
    private String description;
public void setId(Long id) {
        this.id = id;
    }
public void setCalendarId(String calendarId) {
        this.calendarId = calendarId;
    }
public void setExceptionDateStart(LocalDateTime exceptionDateStart) {
        this.exceptionDateStart = exceptionDateStart;
    }
public void setCalendarWeekId(String calendarWeekId) {
        this.calendarWeekId = calendarWeekId;
    }
public void setDescription(String description) {
        this.description = description;
    }

}
