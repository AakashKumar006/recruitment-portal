package com.volkswagen.recruitmentportal.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "tbl_region")
public class RecruitmentPortalRegion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="pk_region", unique = true, nullable = false)
    private Integer regionId;

    @Column(name = "region_name")
    private String regionName;

    @Column(name = "region_active")
    private Integer regionActive; // 0 in-active, 1 active
}
