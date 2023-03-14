package com.volkswagen.recruitmentportal.repository;

import com.volkswagen.recruitmentportal.model.RecruitmentPortalRegion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecruitmentPortalRegionRepository extends JpaRepository<RecruitmentPortalRegion, Integer> {
}
