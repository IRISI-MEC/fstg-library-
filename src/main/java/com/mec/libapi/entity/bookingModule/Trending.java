package com.mec.libapi.entity.bookingModule;
<<<<<<< HEAD:src/main/java/com/mec/libapi/entity/bookingModule/Trending.java

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
=======
>>>>>>> c70f1c6c666794c84d87a1a4e1cdfbf5f80ca1fd:src/main/java/com/mec/libapi/entity/Trending.java

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

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
//	@ManyToOne
//	private CanBook canBook;
//	@ManyToOne
//	private Book book;
}
