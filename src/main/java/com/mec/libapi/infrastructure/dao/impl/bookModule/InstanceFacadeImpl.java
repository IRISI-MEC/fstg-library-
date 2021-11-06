package com.mec.libapi.infrastucture.dao.impl.bookModule;

import com.mec.libapi.infrastucture.entity.bookModule.BookEntity;
import com.mec.libapi.infrastucture.entity.bookModule.InstanceEntity;
import com.mec.libapi.infrastucture.entity.bookModule.NCaseEntity;
import com.mec.libapi.infrastucture.dao.repository.bookModule.InstanceRepository;
import com.mec.libapi.infrastucture.dao.facade.bookModule.InstanceFacade;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class InstanceFacadeImpl implements InstanceFacade {

    @Autowired
    private InstanceRepository repository;

    @Override
    public InstanceEntity save(InstanceEntity instanceEntity) {
        return repository.save(instanceEntity);
    }

    @Override
    public List<InstanceEntity> saveAll(Iterable<InstanceEntity> instances) {
        return repository.saveAllAndFlush(instances);
    }

    @Override
    public Optional<InstanceEntity> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public Stream<InstanceEntity> findAll() {
        return repository.findAll().stream();
    }

    @Override
    public void delete(InstanceEntity instanceEntity) {
        repository.delete(instanceEntity);
    }

    @Override
    public Optional<InstanceEntity> findByQrCode(String qrcode) {
        return repository.findByQrCode(qrcode);
    }

    @Override
    public Optional<InstanceEntity> findByInventoryNumber(Long inventoryNumber) {
        return repository.findByInventoryNumber(inventoryNumber);
    }

    @Override
    public Stream<InstanceEntity> findByEditor(String editor) {
        return repository.findByEditor(editor);
    }

    @Override
    public Stream<InstanceEntity> findByEdition(String edition) {
        return repository.findByEdition(edition);
    }

    @Override
    public Stream<InstanceEntity> findByPublishingDate(LocalDate date) {
        return repository.findByPublishingDate(date);
    }

    @Override
    public Stream<InstanceEntity> findByLanguage(String language) {
        return repository.findByLanguage(language);
    }

    @Override
    public Stream<InstanceEntity> findByBookEntity(BookEntity bookEntity) {
        return repository.findByBookEntity(bookEntity);
    }

    @Override
    public Stream<InstanceEntity> findByNCaseEntity(NCaseEntity nCaseEntity) {
        return repository.findByNCaseEntity(nCaseEntity);
    }

}
