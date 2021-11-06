package com.mec.libapi.infrastucture.entity.bookingModule;

import com.mec.libapi.infrastucture.entity.bookModule.InstanceEntity;
import com.mec.libapi.infrastucture.entity.userModule.CanBook;
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
    private InstanceEntity instanceEntity;
    @OneToOne
    private Booking booking;

}
