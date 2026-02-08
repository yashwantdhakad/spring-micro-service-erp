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
public class TechDataCalendarExcDay {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String calendarId;
    private LocalDateTime exceptionDateStartTime;
    private String exceptionCapacity;
    private String usedCapacity;
    private String description;
public void setId(Long id) {
        this.id = id;
    }
public void setCalendarId(String calendarId) {
        this.calendarId = calendarId;
    }
public void setExceptionDateStartTime(LocalDateTime exceptionDateStartTime) {
        this.exceptionDateStartTime = exceptionDateStartTime;
    }
public void setExceptionCapacity(String exceptionCapacity) {
        this.exceptionCapacity = exceptionCapacity;
    }
public void setUsedCapacity(String usedCapacity) {
        this.usedCapacity = usedCapacity;
    }
public void setDescription(String description) {
        this.description = description;
    }

}
