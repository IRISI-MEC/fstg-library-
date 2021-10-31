package com.mec.libapi.repository;

import com.mec.libapi.entity.Detail;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface DetailRepository extends JpaRepository<Detail, Long> {

    Optional<Detail> findByBuyTypeAndConditionAndDeliverySlipAndProvider(String butType, String condition, String dSlip, String provider);

}
