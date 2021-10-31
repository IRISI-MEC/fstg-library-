package com.mec.libapi.entity;

import lombok.*;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "students")
@Entity
public class Student extends CanBook {
    @Column(unique = true)
    private String CNE;
    @ManyToOne
    private Branch branch;
}
