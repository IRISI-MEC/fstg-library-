package com.mec.libapi.serviceImpl.bookModule;

import com.mec.libapi.entity.bookModule.Book;
import com.mec.libapi.entity.bookModule.Instance;
import com.mec.libapi.entity.bookModule.NCase;
import com.mec.libapi.repository.bookModule.InstanceRepository;
import com.mec.libapi.service.bookModule.InstanceService;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class InstanceServiceImpl implements InstanceService {

    @Autowired
    private InstanceRepository repository;

    @Override
    public Instance save(Instance instance) {
        return repository.save(instance);
    }

    @Override
    public List<Instance> saveAll(Iterable<Instance> instances) {
        return repository.saveAllAndFlush(instances);
    }

    @Override
    public Optional<Instance> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public Stream<Instance> findAll() {
        return repository.findAll().stream();
    }

    @Override
    public void delete(Instance instance) {
        repository.delete(instance);
    }

    @Override
    public Optional<Instance> findByQrCode(String qrcode) {
        return repository.findByQrCode(qrcode);
    }

    @Override
    public Optional<Instance> findByInventoryNumber(Long inventoryNumber) {
        return repository.findByInventoryNumber(inventoryNumber);
    }

    @Override
    public Stream<Instance> findByEditor(String editor) {
        return repository.findByEditor(editor);
    }

    @Override
    public Stream<Instance> findByEdition(String edition) {
        return repository.findByEditor(edition);
    }

    @Override
    public Stream<Instance> findByPublishingDate(LocalDate date) {
        return repository.findByPublishingDate(date);
    }

    @Override
    public Stream<Instance> findByLanguage(String language) {
        return repository.findByLanguage(language);
    }

    @Override
    public Stream<Instance> findByBook(Book book) {
        return repository.findByBook(book);
    }

    @Override
    public Stream<Instance> findByNCase(NCase nCase) {
        return repository.findByNCase(nCase);
    }

}
