package com.mec.libapi.entity;

import com.mec.libapi.entity.userModule.CanBook;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Entity
public class Professor extends CanBook {
    @ManyToOne
    private Department department;
}
