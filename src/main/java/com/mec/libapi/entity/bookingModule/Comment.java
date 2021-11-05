package com.mec.libapi.entity.bookingModule;

import com.mec.libapi.entity.bookModule.Book;
import com.mec.libapi.entity.userModule.CanBook;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String content;
    private Integer starsNumber;
    @ManyToOne
    private CanBook canBook;
    @ManyToOne
    private Book book;
}
