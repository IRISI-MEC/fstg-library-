package com.mec.libapi.infrastucture.dao.repository.bookingModule;

import com.mec.libapi.infrastucture.entity.bookingModule.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalTime;
import java.util.Optional;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Long> {
    Optional<Booking> findByHour(LocalTime hour);
}
