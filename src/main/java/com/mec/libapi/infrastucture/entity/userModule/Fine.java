package com.mec.libapi.infrastucture.entity.userModule;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
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
    @ManyToOne(optional = false)
    @JoinColumn(name = "supervisor_id")
    private Supervisor supervisor;
    @ManyToOne(optional = false)
    @JoinColumn(name = "user_id")
    private CanBook canBook;


}
