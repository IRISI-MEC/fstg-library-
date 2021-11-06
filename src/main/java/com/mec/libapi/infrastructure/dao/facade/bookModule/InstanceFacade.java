package com.mec.libapi.infrastructure.dao.facade.bookModule;

import com.mec.libapi.infrastructure.entity.bookModule.BookEntity;
import com.mec.libapi.infrastructure.entity.bookModule.InstanceEntity;
import com.mec.libapi.infrastructure.entity.bookModule.NCaseEntity;
import com.mec.libapi.infrastructure.dao.facade.AbstractFacade;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public interface InstanceFacade extends AbstractFacade<InstanceEntity, Long> {

     List<InstanceEntity> saveAll(Iterable<InstanceEntity> books);
     Optional<InstanceEntity> findByQrCode(String qrcode);
     Optional<InstanceEntity> findByInventoryNumber(Long inventoryNumber);
     Stream<InstanceEntity> findByEditor(String editor);
     Stream<InstanceEntity> findByEdition(String edition);
     Stream<InstanceEntity> findByPublishingDate(LocalDate date);
     Stream<InstanceEntity> findByLanguage(String language);
     Stream<InstanceEntity> findByBookEntity(BookEntity bookEntity);
     Stream<InstanceEntity> findByNCaseEntity(NCaseEntity nCaseEntity);

}
