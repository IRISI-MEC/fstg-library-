package com.mec.libapi.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Entity
public class Supervisor extends User {
    @OneToMany(mappedBy = "supervisor")
    private List<Fine> supervisorFines;
}
