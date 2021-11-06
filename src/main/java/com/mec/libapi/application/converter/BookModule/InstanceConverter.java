package com.mec.libapi.application.converter.BookModule;

import com.mec.libapi.application.dto.bookModule.InstanceDto;
import com.mec.libapi.domain.pojo.bookModule.Instance;
import com.mec.libapi.util.AvailabilityUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class InstanceConverter {

    @Autowired
    BookConverter bookConverter;
    @Autowired
    NCaseConverter nCaseConverter;
    @Autowired
    DetailConverter detailConverter;

    public Instance toPojo(InstanceDto instanceDto) {
        return Instance.builder()
                .id(Long.parseLong(instanceDto.getId()))
                .editor(instanceDto.getEditor())
                .edition(instanceDto.getEdition())
                .inventoryNumber(Long.parseLong(instanceDto.getInventoryNumber()))
                .language(instanceDto.getLanguage())
                .qrCode(instanceDto.getQrCode())
                // expected DateString 2021-12-01
                .publishingDate(LocalDate.parse(instanceDto.getPublishingDate()))
                .price(Double.parseDouble(instanceDto.getPrice()))
                .availability(AvailabilityUtil.getAvailability(Integer.parseInt(instanceDto.getAvailability())))
                .book(bookConverter.toPojo(instanceDto.getBook()))
                .nCase(nCaseConverter.toPojo(instanceDto.getNCase()))
                .detail(detailConverter.toPojo(instanceDto.getDetailDto()))
                .build();
    }

    public InstanceDto toDto(Instance instance, Boolean convertBook, Boolean convertNCase) {

        InstanceDto instanceDto = InstanceDto.builder()
                .id(instance.getId().toString())
                .editor(instance.getEditor())
                .edition(instance.getEdition())
                .inventoryNumber(instance.getInventoryNumber().toString())
                .language(instance.getLanguage())
                .qrCode(instance.getQrCode())
                .publishingDate(instance.getPublishingDate().toString())
                .price(instance.getPrice().toString())
                .detailDto(detailConverter.toDto(instance.getDetail()))
                .build();

        if (convertBook)
            instanceDto.setBook(bookConverter.toDto(instance.getBook(), false, true));

        if (convertNCase)
            instanceDto.setNCase(nCaseConverter.toDto(instance.getNCase(), false));

        return instanceDto;
    }
}
