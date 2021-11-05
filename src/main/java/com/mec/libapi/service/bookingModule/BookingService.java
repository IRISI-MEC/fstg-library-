package com.mec.libapi.service.bookingModule;

import com.mec.libapi.entity.Booking;
import com.mec.libapi.service.AbstractService;

import java.time.LocalTime;
import java.util.Optional;


public interface BookingService extends AbstractService<Booking, Long> {
    Optional<Booking> findByHour(LocalTime hour);

}
