package com.mec.libapi.infrastucture.entity.bookingModule;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Booking {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@JsonFormat(pattern = "HH:mm:ss")
	private LocalTime hour;
	private LocalDate returnDate;
	@OneToOne
	private BookingAppointment bookingAppointment;

}
