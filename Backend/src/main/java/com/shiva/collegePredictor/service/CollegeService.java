package com.shiva.collegePredictor.service;

import com.shiva.collegePredictor.model.CollegeModel;
import com.shiva.collegePredictor.repo.CollegeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CollegeService {
    @Autowired
    private CollegeRepo collegeRepo;

    public CollegeModel getEligibleCollege(int rank, String gender, String category, String exam) {
        CollegeModel college =  collegeRepo.findEligibleCollege(rank,gender,category,exam);
        System.out.println(college);
        return college;
    }
}
