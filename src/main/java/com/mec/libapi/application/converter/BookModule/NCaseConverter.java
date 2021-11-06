package com.mec.libapi.application.converter.BookModule;

import com.mec.libapi.application.dto.bookModule.NCaseDto;
import com.mec.libapi.domain.pojo.bookModule.NCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class NCaseConverter {

    @Autowired
    InstanceConverter instanceConverter;

    NCase toPojo(NCaseDto nCaseDto) {
        return NCase.builder()
                .id(Long.parseLong(nCaseDto.getId()))
                .code(nCaseDto.getCode())
                .build();
    }

    NCaseDto toDto(NCase nCase, Boolean convertBooks) {

        NCaseDto nCaseDto = NCaseDto.builder()
                .id(nCase.getId().toString())
                .code(nCase.getCode())
                .build();

        if (convertBooks)
            nCase.getInstances().forEach(instance -> nCaseDto.getBooks().add(instanceConverter.toDto(instance, false, true)));

        return nCaseDto;
    }


}
