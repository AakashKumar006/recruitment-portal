package com.volkswagen.recruitmentportal.controller;

import com.volkswagen.recruitmentportal.model.RecruitmentPortalCandidate;
import com.volkswagen.recruitmentportal.service.impl.RecruitmentPortalCandidateServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class RecruitmentPortalCandidateController {

    @Autowired
    private RecruitmentPortalCandidateServiceImpl candidateRecruitmentDetailsServiceImpl;

    @RequestMapping("/")
    public String CandidateRecruitmentPortal() {
        return "Candidate Recruitment Portal";
    }

    @RequestMapping("/candidate/{id}")
    public ResponseEntity<RecruitmentPortalCandidate> getCandidateDetailsById(@PathVariable("id") Integer candidateId){
        RecruitmentPortalCandidate candidateRecruitmentDetails = candidateRecruitmentDetailsServiceImpl.getCandidateRecruitmentDetailsById(candidateId);
        return new ResponseEntity<>(candidateRecruitmentDetails, HttpStatus.OK);
    }

    @RequestMapping("/candidate")
    public ResponseEntity<List<RecruitmentPortalCandidate>> getListOfCandidateDetails(){
        List<RecruitmentPortalCandidate> candidateRecruitmentDetails = candidateRecruitmentDetailsServiceImpl.getAllCandidateRecruitmentDetails();
        return new ResponseEntity<>(candidateRecruitmentDetails,HttpStatus.OK);
    }

    @PostMapping("/candidate/add")
    public ResponseEntity<RecruitmentPortalCandidate> createCandidateDetails(@RequestBody RecruitmentPortalCandidate candidateRecruitmentDetails){
        return new ResponseEntity<>(candidateRecruitmentDetailsServiceImpl.addCandidateRecruitmentDetails(candidateRecruitmentDetails), HttpStatus.CREATED);
    }
}
