package com.example.model;

public class BookingInterval {
    private int startTime;
    private int endTime;

    public BookingInterval(final int startTime, final int endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public int getStartTime() {
        return startTime;
    }

    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }

    public int getEndTime() {
        return endTime;
    }
}

