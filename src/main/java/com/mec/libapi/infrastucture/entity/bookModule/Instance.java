package com.mec.libapi.infrastucture.entity.bookModule;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "instances")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Instance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String qrCode;

    @Column(unique = true)
    private Long inventoryNumber;

    private String editor;
    private String edition;
    private LocalDate publishingDate;
    private String language;
    private Double price;

    @Enumerated(EnumType.STRING)
    private Availability availability;

    @ManyToOne(optional = false)
    @JoinColumn(name = "book_id")
    private Book book;

    @ManyToOne(optional = false)
    @JoinColumn(name = "num_case")
    private NCase nCase;

    //STOPSHIP

}
