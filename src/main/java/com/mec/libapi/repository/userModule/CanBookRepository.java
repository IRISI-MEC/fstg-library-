package com.mec.libapi.repository;

import com.mec.libapi.entity.userModule.CanBook;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CanBookRepository extends JpaRepository<CanBook, Long> {
}
