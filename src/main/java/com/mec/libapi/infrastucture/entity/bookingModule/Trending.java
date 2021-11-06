package com.mec.libapi.infrastucture.entity.bookingModule;

import com.mec.libapi.infrastucture.entity.bookModule.BookEntity;
import com.mec.libapi.infrastucture.entity.userModule.CanBook;
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
    private BookEntity bookEntity;
}
