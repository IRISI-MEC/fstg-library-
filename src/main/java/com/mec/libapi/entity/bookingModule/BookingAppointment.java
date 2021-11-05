package com.mec.libapi.entity.bookingModule;

import com.mec.libapi.entity.bookModule.Instance;
import com.mec.libapi.entity.userModule.CanBook;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BookingAppointment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate date;
    @ManyToOne
    private CanBook canBook;
    @ManyToOne
    private Instance instance;
    @OneToOne
    private Booking booking;

}
