package com.mec.libapi.infrastucture.entity.bookModule;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "num_cases")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class NCase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String code;

    @OneToMany(mappedBy = "nCase")
    private List<Instance> instances;

}
