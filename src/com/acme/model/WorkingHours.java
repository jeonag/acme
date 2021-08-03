package com.acme.model;

/**
 * Working hours entity
 *
 * @author JOG.
 * @version 1.0
 */
public class WorkingHours {
    private String type;
    private String startTime;
    private String endTime;

    public WorkingHours() {
    }

    public WorkingHours(String type, String startTime, String endTime) {
        this.type = type;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }
}
