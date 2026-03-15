package com.shiva.collegePredictor.controller;

import com.shiva.collegePredictor.model.CollegeModel;
import com.shiva.collegePredictor.service.CollegeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = {
        "http://localhost:3000",
        "https://college-predictor-frontend.vercel.app"
})@RequestMapping("api")
public class CollegeController {

    @Autowired
    public CollegeService collegeService;

    @GetMapping("/predictCollege")
    public CollegeModel predictCollege(@RequestParam int rank, @RequestParam String gender, @RequestParam String category, @RequestParam String exam) {
            return collegeService.getEligibleCollege(rank,gender,category,exam);
    }
}
