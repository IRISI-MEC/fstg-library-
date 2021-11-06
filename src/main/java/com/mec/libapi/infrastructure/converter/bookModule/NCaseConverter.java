package com.mec.libapi.infrastucture.converter.bookModule;

import com.mec.libapi.domain.pojo.bookModule.NCase;
import com.mec.libapi.infrastucture.entity.bookModule.NCaseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class NCaseConverter {

    @Autowired
    InstanceConverter instanceConverter;

    public NCaseEntity toEntity(NCase nCase, Boolean convertInstances) {
        NCaseEntity nCaseEntity = NCaseEntity.builder()
                .id(nCase.getId())
                .code(nCase.getCode())
                .build();

        if (convertInstances)
            nCase.getInstances().forEach(instance -> nCaseEntity.getInstanceEntities().add(instanceConverter.toEntity(instance, true, false)));

        return nCaseEntity;
    }

    public NCase toPojo(NCaseEntity nCaseEntity, Boolean convertInstances) {
        NCase nCase = NCase.builder()
                .id(nCaseEntity.getId())
                .code(nCaseEntity.getCode())
                .build();

        if (convertInstances)
            nCaseEntity.getInstanceEntities().forEach(instanceEntity -> nCase.getInstances().add(instanceConverter.toPojo(instanceEntity, true, false)));

        return nCase;
    }

}
