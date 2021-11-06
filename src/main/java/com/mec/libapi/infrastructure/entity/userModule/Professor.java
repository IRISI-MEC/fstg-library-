package com.mec.libapi.infrastructure.entity.userModule;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

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
