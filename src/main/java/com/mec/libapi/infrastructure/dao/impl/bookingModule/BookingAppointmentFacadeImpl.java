package com.mec.libapi.infrastructure.dao.impl.bookingModule;

import com.mec.libapi.infrastructure.entity.bookingModule.BookingAppointment;
import com.mec.libapi.infrastructure.dao.repository.bookingModule.BookingAppointmentRepository;
import com.mec.libapi.infrastructure.dao.facade.bookingModule.BookingAppointmentFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Optional;
import java.util.stream.Stream;

@Service
public class BookingAppointmentFacadeImpl implements BookingAppointmentFacade {

    @Autowired
    private BookingAppointmentRepository bookingAppointmentRepository;

    @Override
    public BookingAppointment save(BookingAppointment bookingAppointment) {
        return bookingAppointmentRepository.save(bookingAppointment);
    }

    @Override
    public Optional<BookingAppointment> findById(Long id) {
        return bookingAppointmentRepository.findById(id);
    }

    @Override
    public Stream<BookingAppointment> findAll() {
        return bookingAppointmentRepository.findAll().stream();
    }


    @Override
    public void delete(BookingAppointment bookingAppointment) {
        bookingAppointmentRepository.delete(bookingAppointment);
    }

    @Override
    public Optional<BookingAppointment> findByDate(LocalDate date) {
        return bookingAppointmentRepository.findByDate(date);
    }
}
