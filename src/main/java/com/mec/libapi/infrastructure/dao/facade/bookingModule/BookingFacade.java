package com.mec.libapi.infrastucture.dao.facade.bookingModule;

import com.mec.libapi.infrastucture.entity.bookingModule.Booking;
import com.mec.libapi.infrastucture.dao.facade.AbstractFacade;

import java.time.LocalTime;
import java.util.Optional;


public interface BookingFacade extends AbstractFacade<Booking, Long> {
    Optional<Booking> findByHour(LocalTime hour);

}
