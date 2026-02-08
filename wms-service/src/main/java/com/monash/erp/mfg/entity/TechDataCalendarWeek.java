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
public class TechDataCalendarWeek {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String calendarWeekId;
    private String description;
    private String mondayStartTime;
    private String mondayCapacity;
    private String tuesdayStartTime;
    private String tuesdayCapacity;
    private String wednesdayStartTime;
    private String wednesdayCapacity;
    private String thursdayStartTime;
    private String thursdayCapacity;
    private String fridayStartTime;
    private String fridayCapacity;
    private String saturdayStartTime;
    private String saturdayCapacity;
    private String sundayStartTime;
    private String sundayCapacity;
public void setId(Long id) {
        this.id = id;
    }
public void setCalendarWeekId(String calendarWeekId) {
        this.calendarWeekId = calendarWeekId;
    }
public void setDescription(String description) {
        this.description = description;
    }
public void setMondayStartTime(String mondayStartTime) {
        this.mondayStartTime = mondayStartTime;
    }
public void setMondayCapacity(String mondayCapacity) {
        this.mondayCapacity = mondayCapacity;
    }
public void setTuesdayStartTime(String tuesdayStartTime) {
        this.tuesdayStartTime = tuesdayStartTime;
    }
public void setTuesdayCapacity(String tuesdayCapacity) {
        this.tuesdayCapacity = tuesdayCapacity;
    }
public void setWednesdayStartTime(String wednesdayStartTime) {
        this.wednesdayStartTime = wednesdayStartTime;
    }
public void setWednesdayCapacity(String wednesdayCapacity) {
        this.wednesdayCapacity = wednesdayCapacity;
    }
public void setThursdayStartTime(String thursdayStartTime) {
        this.thursdayStartTime = thursdayStartTime;
    }
public void setThursdayCapacity(String thursdayCapacity) {
        this.thursdayCapacity = thursdayCapacity;
    }
public void setFridayStartTime(String fridayStartTime) {
        this.fridayStartTime = fridayStartTime;
    }
public void setFridayCapacity(String fridayCapacity) {
        this.fridayCapacity = fridayCapacity;
    }
public void setSaturdayStartTime(String saturdayStartTime) {
        this.saturdayStartTime = saturdayStartTime;
    }
public void setSaturdayCapacity(String saturdayCapacity) {
        this.saturdayCapacity = saturdayCapacity;
    }
public void setSundayStartTime(String sundayStartTime) {
        this.sundayStartTime = sundayStartTime;
    }
public void setSundayCapacity(String sundayCapacity) {
        this.sundayCapacity = sundayCapacity;
    }

}
