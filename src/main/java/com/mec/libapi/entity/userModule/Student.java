package com.mec.libapi.entity.userModule;

import lombok.*;

import javax.persistence.*;

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
