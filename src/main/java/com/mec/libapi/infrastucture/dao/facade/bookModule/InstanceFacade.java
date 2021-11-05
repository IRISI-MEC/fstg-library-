package com.mec.libapi.infrastucture.dao.facade.bookModule;

import com.mec.libapi.infrastucture.entity.bookModule.Book;
import com.mec.libapi.infrastucture.entity.bookModule.Instance;
import com.mec.libapi.infrastucture.entity.bookModule.NCase;
import com.mec.libapi.infrastucture.dao.facade.AbstractFacade;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public interface InstanceFacade extends AbstractFacade<Instance, Long> {

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
