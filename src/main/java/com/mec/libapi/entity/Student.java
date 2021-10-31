package com.mec.libapi.entity;

import lombok.*;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Table(name = "students")
@Entity
public class Student extends CanBook {
    private String CNE;
    @ManyToOne
    private Branch branch;
}
