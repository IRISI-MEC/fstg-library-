package com.mec.libapi.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
public class CanBook extends User {
    private Long maxBooking;
    private Boolean overDue;
    @OneToMany
    private List<Fine> userFines;

    // STOPSHIP
}
