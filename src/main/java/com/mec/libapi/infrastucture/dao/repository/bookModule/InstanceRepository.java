package com.mec.libapi.infrastucture.dao.repository.bookModule;

import com.mec.libapi.infrastucture.entity.bookModule.BookEntity;
import com.mec.libapi.infrastucture.entity.bookModule.InstanceEntity;
import com.mec.libapi.infrastucture.entity.bookModule.NCaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.Optional;
import java.util.stream.Stream;

@Repository
public interface InstanceRepository extends JpaRepository<InstanceEntity, Long> {

    Optional<InstanceEntity> findByQrCode(String qrcode);

    Optional<InstanceEntity> findByInventoryNumber(Long inventoryNumber);

    Stream<InstanceEntity> findByEditor(String editor);

    Stream<InstanceEntity> findByEdition(String edition);

    Stream<InstanceEntity> findByPublishingDate(LocalDate date);

    Stream<InstanceEntity> findByLanguage(String language);

    Stream<InstanceEntity> findByBookEntity(BookEntity bookEntity);

    Stream<InstanceEntity> findByNCaseEntity(NCaseEntity nCaseEntity);

}
