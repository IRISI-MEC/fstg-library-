package com.mec.libapi.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Table(name = "fines")
@Entity
public class Fine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Double amount;
    private String reason;
    private LocalDate date;
    private Boolean isReturned;
    @ManyToOne
    private Supervisor supervisor;
    @ManyToOne
    private CanBook canBook;


}
