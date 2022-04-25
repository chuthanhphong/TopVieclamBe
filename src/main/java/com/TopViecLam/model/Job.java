package com.TopViecLam.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Data
@Table
@NoArgsConstructor
@AllArgsConstructor
public class Job {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String JobName;

    private String jobDetail;

    @ManyToOne
    private DanhSachCv danhSachCv;

    @ManyToMany(fetch = FetchType.EAGER)
    private List<Company> companies;
}
