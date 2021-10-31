package com.mec.libapi.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Table(name = "professors")
@Entity
public class Professor extends CanBook {
    @ManyToOne
    private Department department;
}
