package com.mec.libapi.infrastucture.dao.facade.bookingModule;

import com.mec.libapi.infrastucture.entity.bookingModule.BookingAppointment;
import com.mec.libapi.infrastucture.dao.facade.AbstractFacade;

import java.time.LocalDate;
import java.util.Optional;

public interface BookingAppointmentFacade extends AbstractFacade<BookingAppointment, Long> {
    Optional<BookingAppointment> findByDate(LocalDate date);
}
