package com.acme.model;

/**
 * Payments entity
 *
 * @author JOG.
 * @version 1.0
 */
public class Payments {
    private String day;
    private WorkingHours workingHours;
    private Integer paidValue;

    public Payments(String day, WorkingHours workingHours, Integer paidValue) {
        this.day = day;
        this.workingHours = workingHours;
        this.paidValue = paidValue;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public WorkingHours getHorario() {
        return workingHours;
    }

    public void setHorario(WorkingHours workingHours) {
        this.workingHours = workingHours;
    }

    public Integer getPaidValue() {
        return paidValue;
    }

    public void setPaidValue(Integer paidValue) {
        this.paidValue = paidValue;
    }
}
