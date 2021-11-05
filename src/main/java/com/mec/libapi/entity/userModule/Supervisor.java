package com.mec.libapi.entity.userModule;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@NoArgsConstructor
@Data
@Builder
@Entity
public class Supervisor extends User {
    @OneToMany(mappedBy = "supervisor")
    private List<Fine> supervisorFines;

    public Supervisor(List<Fine> supervisorFines) {
        this.supervisorFines = supervisorFines;
    }

    public Supervisor(String firstName, String secondName, String email, String password, List<Fine> supervisorFines) {
        super(firstName, secondName, email, password);
        this.supervisorFines = supervisorFines;
    }
}
