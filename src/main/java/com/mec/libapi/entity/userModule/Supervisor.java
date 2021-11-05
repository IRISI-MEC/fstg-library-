package com.mec.libapi.entity.userModule;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
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
