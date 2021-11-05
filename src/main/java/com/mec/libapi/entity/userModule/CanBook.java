package com.mec.libapi.entity.userModule;

import com.mec.libapi.entity.Fine;
import com.mec.libapi.entity.User;
import lombok.*;

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
