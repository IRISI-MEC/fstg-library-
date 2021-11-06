package com.mec.libapi.infrastructure.converter.bookModule;

import com.mec.libapi.domain.pojo.bookModule.Instance;
import com.mec.libapi.infrastructure.entity.bookModule.InstanceEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class InstanceConverter {

    @Autowired
    BookConverter bookConverter;
    @Autowired
    NCaseConverter nCaseConverter;
    @Autowired
    DetailConverter detailConverter;

    public InstanceEntity toEntity(Instance instance, Boolean convertBook, Boolean convertNCase) {
        InstanceEntity instanceEntity = InstanceEntity.builder()
                .editor(instance.getEditor())
                .edition(instance.getEdition())
                .inventoryNumber(instance.getInventoryNumber())
                .language(instance.getLanguage())
                .qrCode(instance.getQrCode())
                .publishingDate(instance.getPublishingDate())
                .availability(instance.getAvailability())
                .price(instance.getPrice())
                .detailEntity(detailConverter.toEntity(instance.getDetail()))
                .build();

        if (convertBook)
            instanceEntity.setBookEntity(bookConverter.toEntity(instance.getBook(), false, true));

        if (convertNCase)
            instanceEntity.setNCaseEntity(nCaseConverter.toEntity(instance.getNCase(), false));

        return instanceEntity;
    }

    public Instance toPojo(InstanceEntity instanceEntity, Boolean convertBook, Boolean convertNCase) {

        Instance instance = Instance.builder()
                .id(instanceEntity.getId())
                .editor(instanceEntity.getEditor())
                .edition(instanceEntity.getEdition())
                .inventoryNumber(instanceEntity.getInventoryNumber())
                .language(instanceEntity.getLanguage())
                .qrCode(instanceEntity.getQrCode())
                .publishingDate(instanceEntity.getPublishingDate())
                .price(instanceEntity.getPrice())
                .detail(detailConverter.toPojo(instanceEntity.getDetailEntity()))
                .build();

        if (convertBook)
            instance.setBook(bookConverter.toPojo(instanceEntity.getBookEntity(), false, true));

        if (convertNCase)
            instance.setNCase(nCaseConverter.toPojo(instanceEntity.getNCaseEntity(), false));

        return instance;
    }

}
