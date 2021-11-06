package com.mec.libapi.infrastructure.entity.bookingModule;

import com.mec.libapi.infrastructure.entity.bookModule.BookEntity;
import com.mec.libapi.infrastructure.entity.userModule.CanBook;
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
    private BookEntity bookEntity;
}
