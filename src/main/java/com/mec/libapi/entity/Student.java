package com.mec.libapi.entity;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.util.List;

@NoArgsConstructor
@Data
@Builder
@Entity
public class Student extends CanBook {
    @Column(unique = true)
    private String CNE;
    @ManyToOne
    private Branch branch;

    public Student(Long id, String firstName, String secondName, String email, String password, Long maxBooking, Boolean overDue, List<Fine> userFines, String CNE, Branch branch) {
        super(firstName, secondName, email, password, maxBooking, overDue, userFines);
        this.CNE = CNE;
        this.branch = branch;
    }

    public Student(String CNE, Branch branch) {
        this.CNE = CNE;
        this.branch = branch;
    }
}
