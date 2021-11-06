package com.mec.libapi.application.converter.BookModule;

import com.mec.libapi.application.dto.bookModule.DetailDto;
import com.mec.libapi.domain.pojo.bookModule.Detail;
import org.springframework.stereotype.Component;

@Component
public class DetailConverter {

    public Detail toPojo(DetailDto detailDto) {
        return Detail.builder()
                .id(Long.parseLong(detailDto.getId()))
                .buyType(detailDto.getBuyType())
                .condition(detailDto.getCondition())
                .deliverySlip(detailDto.getDeliverySlip())
                .provider(detailDto.getProvider())
                .build();
    }

    public DetailDto toDto(Detail detail) {
        return DetailDto.builder()
                .id(detail.getId().toString())
                .buyType(detail.getBuyType())
                .condition(detail.getCondition())
                .deliverySlip(detail.getDeliverySlip())
                .provider(detail.getProvider())
                .build();
    }

}
