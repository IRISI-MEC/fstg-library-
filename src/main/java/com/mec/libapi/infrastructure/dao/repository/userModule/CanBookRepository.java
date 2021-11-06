package com.mec.libapi.infrastucture.dao.repository.userModule;

import com.mec.libapi.infrastucture.entity.userModule.CanBook;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CanBookRepository extends JpaRepository<CanBook, Long> {
}
