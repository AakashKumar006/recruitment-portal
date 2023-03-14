package com.volkswagen.recruitmentportal.service.impl;

import com.volkswagen.recruitmentportal.model.RecruitmentPortalCandidate;
import com.volkswagen.recruitmentportal.repository.RecruitmentPortalCandidateRepository;
import com.volkswagen.recruitmentportal.service.RecruitmentPortalCandidateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class RecruitmentPortalCandidateServiceImpl implements RecruitmentPortalCandidateService {

    @Autowired
    private RecruitmentPortalCandidateRepository candidateRecruitmentDetailsRepository;

    @Override
    public RecruitmentPortalCandidate addCandidateRecruitmentDetails(RecruitmentPortalCandidate candidateRecruitmentDetails) {
        return candidateRecruitmentDetailsRepository.save(candidateRecruitmentDetails);
    }

    @Override
    public List<RecruitmentPortalCandidate> getAllCandidateRecruitmentDetails() {
        List<RecruitmentPortalCandidate> candidateRecruitmentDetailsList = candidateRecruitmentDetailsRepository.findAll();
        if(candidateRecruitmentDetailsList.isEmpty() || candidateRecruitmentDetailsList.size() == 0){
            throw new NoSuchElementException("candidate List is empty");
        }
        return candidateRecruitmentDetailsList;
    }

    @Override
    public RecruitmentPortalCandidate getCandidateRecruitmentDetailsById(Integer candidateId) {
        Optional<RecruitmentPortalCandidate> candidateRecruitmentDetails = candidateRecruitmentDetailsRepository.findById(candidateId);
        if(candidateRecruitmentDetails.isEmpty()){
            throw new NoSuchElementException("candidate not present with Id : "+candidateId);
        }
        return candidateRecruitmentDetails.get();
    }
}
