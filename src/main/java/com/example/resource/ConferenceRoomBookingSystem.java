package com.example.resource;

import java.util.ArrayList;
import java.util.List;

import com.example.model.BookingInterval;

public class ConferenceRoomBookingSystem {
    private final List<BookingInterval> bookedIntervals;

    public ConferenceRoomBookingSystem() {
        this.bookedIntervals = new ArrayList<>();
    }

    public BookingInterval book(BookingInterval bookingInterval) {
        for (BookingInterval interval : bookedIntervals) {
            if (bookingInterval.getStartTime() < interval.getEndTime()
                    && bookingInterval.getEndTime() > interval.getStartTime()) {
                continue;
            }
        }
        bookedIntervals.add(bookingInterval);
        return bookingInterval;
    }

    private void removeInterval(int index) {
        if (index <= this.bookedIntervals.size()) {
            bookedIntervals.remove(index);
        }
    }

    public List<BookingInterval> processBookingRequests(List<BookingInterval> bookingIntervals) {
        for (BookingInterval request : bookingIntervals) {
            if (request.getStartTime() == 0) {
                this.removeInterval(request.getEndTime());
            } else {
                this.book(request);
            }
        }
        return this.bookedIntervals;
    }
}

