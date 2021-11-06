package com.mec.libapi.infrastucture.converter.bookModule;

import com.mec.libapi.domain.pojo.bookModule.Detail;
import com.mec.libapi.infrastucture.entity.bookModule.DetailEntity;
import org.springframework.stereotype.Component;

@Component
public class DetailConverter {

    public DetailEntity toEntity(Detail detail) {
        return DetailEntity.builder()
                .id(detail.getId())
                .buyType(detail.getBuyType())
                .condition(detail.getCondition())
                .deliverySlip(detail.getDeliverySlip())
                .provider(detail.getProvider())
                .build();
    }

    public Detail toPojo(DetailEntity detailEntity) {
        return Detail.builder()
                .id(detailEntity.getId())
                .buyType(detailEntity.getBuyType())
                .condition(detailEntity.getCondition())
                .deliverySlip(detailEntity.getDeliverySlip())
                .provider(detailEntity.getProvider())
                .build();
    }

}
