package com.mec.libapi.entity;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.util.List;

@NoArgsConstructor
@Data
@Builder
@Entity
public class Professor extends CanBook {
    @ManyToOne
    private Department department;

    public Professor(Department department) {
        this.department = department;
    }

    public Professor(String firstName, String secondName, String email, String password, Long maxBooking, Boolean overDue, List<Fine> userFines, Department department) {
        super(firstName, secondName, email, password, maxBooking, overDue, userFines);
        this.department = department;
    }

    public Professor(Long maxBooking, Boolean overDue, List<Fine> userFines, Department department) {
        super(maxBooking, overDue, userFines);
        this.department = department;
    }
}
