package com.example.erp.mfg.ofbiz.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCalendarWeekId() {
        return calendarWeekId;
    }

    public void setCalendarWeekId(String calendarWeekId) {
        this.calendarWeekId = calendarWeekId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMondayStartTime() {
        return mondayStartTime;
    }

    public void setMondayStartTime(String mondayStartTime) {
        this.mondayStartTime = mondayStartTime;
    }

    public String getMondayCapacity() {
        return mondayCapacity;
    }

    public void setMondayCapacity(String mondayCapacity) {
        this.mondayCapacity = mondayCapacity;
    }

    public String getTuesdayStartTime() {
        return tuesdayStartTime;
    }

    public void setTuesdayStartTime(String tuesdayStartTime) {
        this.tuesdayStartTime = tuesdayStartTime;
    }

    public String getTuesdayCapacity() {
        return tuesdayCapacity;
    }

    public void setTuesdayCapacity(String tuesdayCapacity) {
        this.tuesdayCapacity = tuesdayCapacity;
    }

    public String getWednesdayStartTime() {
        return wednesdayStartTime;
    }

    public void setWednesdayStartTime(String wednesdayStartTime) {
        this.wednesdayStartTime = wednesdayStartTime;
    }

    public String getWednesdayCapacity() {
        return wednesdayCapacity;
    }

    public void setWednesdayCapacity(String wednesdayCapacity) {
        this.wednesdayCapacity = wednesdayCapacity;
    }

    public String getThursdayStartTime() {
        return thursdayStartTime;
    }

    public void setThursdayStartTime(String thursdayStartTime) {
        this.thursdayStartTime = thursdayStartTime;
    }

    public String getThursdayCapacity() {
        return thursdayCapacity;
    }

    public void setThursdayCapacity(String thursdayCapacity) {
        this.thursdayCapacity = thursdayCapacity;
    }

    public String getFridayStartTime() {
        return fridayStartTime;
    }

    public void setFridayStartTime(String fridayStartTime) {
        this.fridayStartTime = fridayStartTime;
    }

    public String getFridayCapacity() {
        return fridayCapacity;
    }

    public void setFridayCapacity(String fridayCapacity) {
        this.fridayCapacity = fridayCapacity;
    }

    public String getSaturdayStartTime() {
        return saturdayStartTime;
    }

    public void setSaturdayStartTime(String saturdayStartTime) {
        this.saturdayStartTime = saturdayStartTime;
    }

    public String getSaturdayCapacity() {
        return saturdayCapacity;
    }

    public void setSaturdayCapacity(String saturdayCapacity) {
        this.saturdayCapacity = saturdayCapacity;
    }

    public String getSundayStartTime() {
        return sundayStartTime;
    }

    public void setSundayStartTime(String sundayStartTime) {
        this.sundayStartTime = sundayStartTime;
    }

    public String getSundayCapacity() {
        return sundayCapacity;
    }

    public void setSundayCapacity(String sundayCapacity) {
        this.sundayCapacity = sundayCapacity;
    }

}