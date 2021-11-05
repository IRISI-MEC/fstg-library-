package com.mec.libapi.serviceImpl.bookingModule;

import com.mec.libapi.entity.bookingModule.BookingAppointment;
import com.mec.libapi.repository.bookingModule.BookingAppointmentRepository;
import com.mec.libapi.service.bookingModule.BookingAppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Optional;
import java.util.stream.Stream;

@Service
public class BookingAppointmentServiceImpl implements BookingAppointmentService {

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
