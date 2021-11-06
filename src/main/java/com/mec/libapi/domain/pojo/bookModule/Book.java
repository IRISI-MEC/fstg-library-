package com.mec.libapi.domain.pojo.bookModule;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Book {

    private Long id;
    private String isbn;
    private String title;
    private String author;
    private String description;
    private List<Instance> instances;
    private Speciality speciality;

}
