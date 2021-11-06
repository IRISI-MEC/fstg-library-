package com.mec.libapi.infrastucture.entity.bookModule;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "books")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BookEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String isbn;

    private String title;
    private String author;
    private String description;

    @OneToMany(mappedBy = "book")
    private List<InstanceEntity> instanceEntities;

    @ManyToOne()
    @JoinColumn(name = "speciality")
    private SpecialityEntity specialityEntity;

    //STOPSHIP

}
