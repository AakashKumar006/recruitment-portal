package com.volkswagen.recruitmentportal.service;

import com.volkswagen.recruitmentportal.model.RecruitmentPortalCandidate;

import java.util.List;

public interface RecruitmentPortalCandidateService {

    RecruitmentPortalCandidate addCandidateRecruitmentDetails(RecruitmentPortalCandidate candidateRecruitmentDetails);

    List<RecruitmentPortalCandidate> getAllCandidateRecruitmentDetails();

    RecruitmentPortalCandidate getCandidateRecruitmentDetailsById(Integer candidateId);
}
