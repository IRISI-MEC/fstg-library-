package com.mec.libapi.repository;

import com.mec.libapi.entity.Book;
import com.mec.libapi.entity.BookingAppointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.Optional;

@Repository
public interface BookingAppointmentRepository extends JpaRepository<BookingAppointment, Long> {
    Optional<Book> findByDate(LocalDate date);
}
