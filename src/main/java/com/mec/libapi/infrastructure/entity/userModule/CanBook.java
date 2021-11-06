package com.mec.libapi.infrastructure.entity.userModule;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.OneToMany;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Inheritance
@Entity
public class CanBook extends User {
    private Long maxBooking;
    private Boolean overDue;
    @OneToMany(mappedBy = "canBook")
    private List<Fine> userFines;

    // STOPSHIP
}
