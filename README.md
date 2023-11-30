# Conference Room Booking System

The Conference Room Booking System is a Spring Boot application designed to manage bookings for conference rooms. It provides a simple and efficient solution for scheduling time intervals for various conference rooms, ensuring that no overlapping bookings occur.

## Table of Contents

- [Features](#features)
- [Getting Started](#getting-started)
    - [Prerequisites](#prerequisites)
    - [Installation](#installation)
- [TODOs](#TODOs)

## Features

- Book conference rooms for specific time intervals.
- Check room availability and prevent overlapping bookings.
- Process booking requests via API or from CSV files.
- Web interface for uploading CSV files (Bonus feature).
- Secure endpoint access with authentication (if implemented).

## Getting Started

### Prerequisites

Make sure you have the following installed on your system:

- [Java Development Kit (JDK)](https://adoptium.net/)
- [Maven](https://maven.apache.org/)

### Installation

1. Clone the repository:

   ```bash
   git clone https://github.com/your-username/conference-room-booking-system.git

   mvn clean install

   mvn spring-boot:run

2. Hit the endpoint:

   To process booking requests from a CSV file, use the /api/processCsv endpoint and provide the CSV file as a file parameter.

#### TODOs:

- Add unit tests.
- Optimize the algorithm to run faster than O(n^2).

Note: The booking room maintains state and when you hit the endpoint again by providing a second CSV, it maintains state.
