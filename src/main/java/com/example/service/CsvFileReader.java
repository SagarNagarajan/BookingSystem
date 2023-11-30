package com.example.service;

import com.example.model.BookingInterval;
import org.springframework.web.multipart.MultipartFile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class CsvFileReader {
    public static List<BookingInterval> readBookingRequestsFromCsv(MultipartFile file) throws IOException {
        List<BookingInterval> bookingIntervals = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(file.getInputStream()))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] values = line.split(",");

                if (values.length == 2) {
                    int firstElement = Integer.parseInt(values[0]);
                    int secondElement = Integer.parseInt(values[1]);
                    bookingIntervals.add(new BookingInterval(firstElement, secondElement));
                }
            }
        }

        return bookingIntervals;
    }
}
