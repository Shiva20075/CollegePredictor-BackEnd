package com.shiva.CollegePredictor.Service;

import com.shiva.CollegePredictor.Model.CollegeModel;
import com.shiva.CollegePredictor.repo.CollegeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CollegeService {
    @Autowired
    private CollegeRepo collegeRepo;

    public CollegeModel getEligibleCollege(int rank, String gender, String category, String exam){
        CollegeModel college =  collegeRepo.findEligibleCollege(rank,gender,category,exam);
        System.out.println("College : " + college);
        return college;
    }
}
