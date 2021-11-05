package com.mec.libapi.service.bookModule;

import com.mec.libapi.entity.bookModule.Book;
import com.mec.libapi.entity.bookModule.Instance;
import com.mec.libapi.entity.bookModule.NCase;
import com.mec.libapi.service.AbstractService;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public interface InstanceService extends AbstractService<Instance, Long> {

     List<Instance> saveAll(Iterable<Instance> books);
     Optional<Instance> findByQrCode(String qrcode);
     Optional<Instance> findByInventoryNumber(Long inventoryNumber);
     Stream<Instance> findByEditor(String editor);
     Stream<Instance> findByEdition(String edition);
     Stream<Instance> findByPublishingDate(LocalDate date);
     Stream<Instance> findByLanguage(String language);
     Stream<Instance> findByBook(Book book);
     Stream<Instance> findByNCase(NCase nCase);

}
