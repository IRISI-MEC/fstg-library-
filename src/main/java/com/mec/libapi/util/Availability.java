package com.mec.libapi.util;

public enum Availability {
    Available, // DTO Presentation : 1
    Unavailable, // DTO Presentation : -2
    Booked, // DTO Presentation : 0
    BookedNonReturned // DTO presentation : -1
}
