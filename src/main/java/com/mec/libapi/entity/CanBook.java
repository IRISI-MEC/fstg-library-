package com.mec.libapi.entity;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.OneToMany;
import java.util.List;

@NoArgsConstructor
@Data
@Builder
@Inheritance
@Entity
public class CanBook extends User {
    private Long maxBooking;
    private Boolean overDue;
    @OneToMany(mappedBy = "canBook")
    private List<Fine> userFines;

    public CanBook(String firstName, String secondName, String email, String password, Long maxBooking, Boolean overDue, List<Fine> userFines) {
        super(firstName, secondName, email, password);
        this.maxBooking = maxBooking;
        this.overDue = overDue;
        this.userFines = userFines;
    }

    public CanBook(Long maxBooking, Boolean overDue, List<Fine> userFines) {
        this.maxBooking = maxBooking;
        this.overDue = overDue;
        this.userFines = userFines;
    }

    // STOPSHIP
}
