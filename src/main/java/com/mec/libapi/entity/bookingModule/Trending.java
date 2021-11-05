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
public class Trending {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private boolean trending;
    @ManyToOne
    private CanBook canBook;
    @ManyToOne
    private Book book;
}
