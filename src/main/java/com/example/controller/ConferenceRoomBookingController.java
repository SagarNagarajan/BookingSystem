package com.example.controller;

import com.example.resource.ConferenceRoomBookingSystem;
import com.example.service.CsvFileReader;
import com.example.model.BookingInterval;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@RestController
public class ConferenceRoomBookingController {
    ConferenceRoomBookingSystem bookingSystem = new ConferenceRoomBookingSystem();

    @PostMapping(value = "/api/processCsv")
    public ResponseEntity<List<BookingInterval>> processBookingRequestsFromCSV(@RequestParam("file") MultipartFile file) {
        try {
            List<BookingInterval> bookingIntervals = CsvFileReader.readBookingRequestsFromCsv(file);
            List<BookingInterval> results = bookingSystem.processBookingRequests(bookingIntervals);
            return ResponseEntity.ok(results);
        } catch (IOException e) {
            e.printStackTrace(); // Handle the exception appropriately
            return ResponseEntity.status(500).build(); // Internal Server Error
        }
    }
}
