package com.mec.libapi.entity;

import com.mec.libapi.entity.bookmodule.Book;
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
public class Speciality {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String label;

    @OneToMany(mappedBy = "speciality")
    private List<Book> books;

}
