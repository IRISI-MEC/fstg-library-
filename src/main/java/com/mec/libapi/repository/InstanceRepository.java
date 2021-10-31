package com.mec.libapi.repository;

import com.mec.libapi.entity.Book;
import com.mec.libapi.entity.Instance;
import com.mec.libapi.entity.NCase;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.Optional;
import java.util.stream.Stream;

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
