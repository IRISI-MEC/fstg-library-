package com.mec.libapi.infrastructure.dao.repository.bookingModule;

import com.mec.libapi.infrastructure.entity.bookingModule.BookingAppointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.Optional;

@Repository
public interface BookingAppointmentRepository extends JpaRepository<BookingAppointment, Long> {
    Optional<BookingAppointment> findByDate(LocalDate date);
}
