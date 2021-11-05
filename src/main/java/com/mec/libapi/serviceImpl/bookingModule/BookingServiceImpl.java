package com.mec.libapi.serviceImpl.bookingModule;

import com.mec.libapi.entity.bookingModule.Booking;
import com.mec.libapi.repository.bookingModule.BookingRepository;
import com.mec.libapi.service.bookingModule.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalTime;
import java.util.Optional;
import java.util.stream.Stream;

@Service
public class BookingServiceImpl implements BookingService {

    @Autowired
    private BookingRepository bookingRepository;

    @Override
    public Booking save(Booking booking) {
        return bookingRepository.save(booking);
    }

    @Override
    public Optional<Booking> findById(Long id) {
        return bookingRepository.findById(id);
    }

    @Override
    public Stream<Booking> findAll() {
        return bookingRepository.findAll().stream();
    }


    @Override
    public void delete(Booking booking) {
        bookingRepository.delete(booking);
    }

    @Override
    public Optional<Booking> findByHour(LocalTime hour) {
        return bookingRepository.findByHour(hour);
    }


}
