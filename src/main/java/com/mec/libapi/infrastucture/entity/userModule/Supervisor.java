package com.mec.libapi.infrastucture.entity.userModule;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

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
