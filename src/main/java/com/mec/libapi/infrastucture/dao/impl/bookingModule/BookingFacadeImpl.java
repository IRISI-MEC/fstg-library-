package com.mec.libapi.infrastucture.dao.impl.bookingModule;

import com.mec.libapi.infrastucture.entity.bookingModule.Booking;
import com.mec.libapi.infrastucture.dao.repository.bookingModule.BookingRepository;
import com.mec.libapi.infrastucture.dao.facade.bookingModule.BookingFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalTime;
import java.util.Optional;
import java.util.stream.Stream;

@Service
public class BookingFacadeImpl implements BookingFacade {

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
