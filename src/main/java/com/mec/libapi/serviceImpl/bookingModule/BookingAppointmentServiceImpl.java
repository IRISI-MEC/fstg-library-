package com.mec.libapi.serviceImpl.bookingModule;

import com.mec.libapi.entity.Book;
import com.mec.libapi.entity.BookingAppointment;
import com.mec.libapi.repository.BookingAppointmentRepository;
import com.mec.libapi.service.bookingModule.BookingAppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
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
    public List<BookingAppointment> saveAll(Iterable<BookingAppointment> bookingAppointments) {
        return bookingAppointmentRepository.saveAllAndFlush(bookingAppointments);
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
    public Optional<Book> findByDate(LocalDate date) {
        return bookingAppointmentRepository.findByDate(date);
    }
}
