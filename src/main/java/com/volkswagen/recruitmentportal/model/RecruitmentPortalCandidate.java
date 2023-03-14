package com.volkswagen.recruitmentportal.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tbl_Candidate_Recruitment_Details")
public class RecruitmentPortalCandidate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pk_candidate_id")
    private Integer candidateId;

    @Column(name = "candidate_first_name")
    private String candidateFirstName;

    @Column(name = "candidate_last_name")
    private String candidateLastName;

    @Column(name = "candidate_age")
    private Date candidateAge;

    @Column(name = "candidate_Notice_Period_State_Date")
    private Date candidateNoticePeriodStartDate;

    @Column(name = "candidate_Total_Experience")
    private String candidateTotalExperience;

    @OneToOne
    @JoinColumn(name = "fk_region")
    private RecruitmentPortalRegion candidateRegion;

}
