package com.volkswagen.recruitmentportal.service;

import com.volkswagen.recruitmentportal.model.RecruitmentPortalRegion;

import java.util.List;

public interface RecruitmentPortalRegionService {

    RecruitmentPortalRegion addRegion(RecruitmentPortalRegion recruitmentPortalRegion);

    List<RecruitmentPortalRegion> getListOfRegion();

    RecruitmentPortalRegion getRegionById(Integer regionId);
}
