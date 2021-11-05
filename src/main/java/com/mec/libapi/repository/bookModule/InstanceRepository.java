package com.mec.libapi.repository.bookModule;

import com.mec.libapi.entity.bookModule.Book;
import com.mec.libapi.entity.bookModule.Instance;
import com.mec.libapi.entity.bookModule.NCase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.Optional;
import java.util.stream.Stream;

@Repository
public interface InstanceRepository extends JpaRepository<Instance, Long> {

    Optional<Instance> findByQrCode(String qrcode);

    Optional<Instance> findByInventoryNumber(Long inventoryNumber);

    Stream<Instance> findByEditor(String editor);

    Stream<Instance> findByEdition(String edition);

    Stream<Instance> findByPublishingDate(LocalDate date);

    Stream<Instance> findByLanguage(String language);

    Stream<Instance> findByBook(Book book);

    Stream<Instance> findByNCase(NCase nCase);

}
