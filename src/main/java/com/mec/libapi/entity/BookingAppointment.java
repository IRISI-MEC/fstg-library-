package com.mec.libapi.entity;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

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
