package com.mec.libapi.infrastucture.entity.userModule;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Entity
public class Student extends CanBook {
    @Column(unique = true)
    private String CNE;
    @ManyToOne
    private Branch branch;
}
