package com.mec.libapi.util;

public class AvailabilityUtil {

    public static Availability getAvailability(Integer number) {
        switch (number) {
            case 1:
                return Availability.Available;
            case 0:
                return Availability.Booked;
            case -1:
                return Availability.BookedNonReturned;
            case -2:
                return Availability.Unavailable;
            default:
                return null;
        }
    }

}
