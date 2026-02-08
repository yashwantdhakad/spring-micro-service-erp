package com.monash.erp.mfg.entity;

import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Getter;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@NoArgsConstructor
@Setter
@Getter
public class TechDataCalendar {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String calendarId;
    private String description;
    private String calendarWeekId;
public void setId(Long id) {
        this.id = id;
    }
public void setCalendarId(String calendarId) {
        this.calendarId = calendarId;
    }
public void setDescription(String description) {
        this.description = description;
    }
public void setCalendarWeekId(String calendarWeekId) {
        this.calendarWeekId = calendarWeekId;
    }

}
