package com.volkswagen.recruitmentportal.controller;

import com.volkswagen.recruitmentportal.model.RecruitmentPortalRegion;
import com.volkswagen.recruitmentportal.service.impl.RecruitmentPortalRegionServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class RecruitmentPortalRegionController {

    @Autowired
    RecruitmentPortalRegionServiceImpl recruitmentPortalRegionServiceImpl;

    @RequestMapping("/region")
    public ResponseEntity<List<RecruitmentPortalRegion>> getListOfRegion() {
        return new ResponseEntity<>(recruitmentPortalRegionServiceImpl.getListOfRegion(), HttpStatus.OK);
    }

    @RequestMapping("/region/{id}")
    public ResponseEntity<RecruitmentPortalRegion> getRegionById(@PathVariable("id") Integer regionId) {
        return new ResponseEntity<>(recruitmentPortalRegionServiceImpl.getRegionById(regionId), HttpStatus.OK);
    }

    @PostMapping("/region/add")
    public ResponseEntity<RecruitmentPortalRegion> addRegion(@RequestBody RecruitmentPortalRegion recruitmentPortalRegion) {
        return new ResponseEntity<>(recruitmentPortalRegionServiceImpl.addRegion(recruitmentPortalRegion), HttpStatus.CREATED);
    }
}
