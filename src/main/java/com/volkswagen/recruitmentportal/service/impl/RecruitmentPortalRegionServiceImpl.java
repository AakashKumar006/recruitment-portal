package com.volkswagen.recruitmentportal.service.impl;

import com.volkswagen.recruitmentportal.model.RecruitmentPortalRegion;
import com.volkswagen.recruitmentportal.repository.RecruitmentPortalRegionRepository;
import com.volkswagen.recruitmentportal.service.RecruitmentPortalRegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class RecruitmentPortalRegionServiceImpl implements RecruitmentPortalRegionService {

    @Autowired
    RecruitmentPortalRegionRepository recruitmentPortalRegionRepository;

    @Override
    public RecruitmentPortalRegion addRegion(RecruitmentPortalRegion recruitmentPortalRegion) {
        System.out.println("region name : "+recruitmentPortalRegion.getRegionName());
        return recruitmentPortalRegionRepository.save(recruitmentPortalRegion);
    }

    @Override
    public List<RecruitmentPortalRegion> getListOfRegion() {
        List<RecruitmentPortalRegion> recruitmentPortalRegionList = recruitmentPortalRegionRepository.findAll();
        if(recruitmentPortalRegionList.isEmpty() || recruitmentPortalRegionList.size() == 0){
            throw new NoSuchElementException("Region List is empty");
        }
        return recruitmentPortalRegionList;
    }

    @Override
    public RecruitmentPortalRegion getRegionById(Integer regionId) {
        Optional<RecruitmentPortalRegion> recruitmentPortalRegion = recruitmentPortalRegionRepository.findById(regionId);
        if(recruitmentPortalRegion.isEmpty()){
            throw new NoSuchElementException("Region with Id : "+regionId+" not present");
        }
        return recruitmentPortalRegion.get();
    }
}
