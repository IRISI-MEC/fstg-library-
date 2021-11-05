package com.mec.libapi.service.bookingModule;

import com.mec.libapi.entity.Book;
import com.mec.libapi.entity.BookingAppointment;
import com.mec.libapi.service.AbstractService;

import java.time.LocalDate;
import java.util.Optional;

public interface BookingAppointmentService extends AbstractService<BookingAppointment, Long> {
    Optional<Book> findByDate(LocalDate date);
}
