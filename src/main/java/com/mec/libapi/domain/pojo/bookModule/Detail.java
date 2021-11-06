package com.mec.libapi.domain.pojo.bookModule;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Detail {

    private Long id;
    private String condition;
    private String buyType;
    private String provider;
    private String deliverySlip;

}
