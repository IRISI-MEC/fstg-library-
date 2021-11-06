package com.mec.libapi.infrastucture.entity.bookModule;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "specialities")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SpecialityEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String label;

    @OneToMany(mappedBy = "speciality")
    private List<BookEntity> bookEntities;

}
