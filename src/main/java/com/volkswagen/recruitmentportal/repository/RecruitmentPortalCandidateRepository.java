package com.volkswagen.recruitmentportal.repository;

import com.volkswagen.recruitmentportal.model.RecruitmentPortalCandidate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecruitmentPortalCandidateRepository extends JpaRepository<RecruitmentPortalCandidate,Integer> {

}
