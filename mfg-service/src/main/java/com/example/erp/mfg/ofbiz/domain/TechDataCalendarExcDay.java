package com.example.erp.mfg.ofbiz.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class TechDataCalendarExcDay {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String calendarId;
    private LocalDateTime exceptionDateStartTime;
    private String exceptionCapacity;
    private String usedCapacity;
    private String description;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCalendarId() {
        return calendarId;
    }

    public void setCalendarId(String calendarId) {
        this.calendarId = calendarId;
    }

    public LocalDateTime getExceptionDateStartTime() {
        return exceptionDateStartTime;
    }

    public void setExceptionDateStartTime(LocalDateTime exceptionDateStartTime) {
        this.exceptionDateStartTime = exceptionDateStartTime;
    }

    public String getExceptionCapacity() {
        return exceptionCapacity;
    }

    public void setExceptionCapacity(String exceptionCapacity) {
        this.exceptionCapacity = exceptionCapacity;
    }

    public String getUsedCapacity() {
        return usedCapacity;
    }

    public void setUsedCapacity(String usedCapacity) {
        this.usedCapacity = usedCapacity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}