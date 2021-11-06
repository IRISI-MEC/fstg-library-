package com.mec.libapi.domain.pojo.bookModule;

import com.mec.libapi.util.Availability;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Instance {

    private Long id;
    private String qrCode;
    private Long inventoryNumber;
    private String editor;
    private String edition;
    private LocalDate publishingDate;
    private String language;
    private Double price;
    private Availability availability;
    private Book book;
    private NCase nCase;
    private Detail detail;

}
