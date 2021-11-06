package com.mec.libapi.infrastructure.dao.facade.bookingModule;

import com.mec.libapi.infrastructure.entity.bookingModule.BookingAppointment;
import com.mec.libapi.infrastructure.dao.facade.AbstractFacade;

import java.time.LocalDate;
import java.util.Optional;

public interface BookingAppointmentFacade extends AbstractFacade<BookingAppointment, Long> {
    Optional<BookingAppointment> findByDate(LocalDate date);
}
