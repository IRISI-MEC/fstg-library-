package com.mec.libapi.domain.pojo.bookModule;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class NCase {

    private Long id;
    private String code;
    private List<Instance> instances;

}
