package com.shiva.collegePredictor.controller;

import com.shiva.collegePredictor.model.CollegeModel;
import com.shiva.collegePredictor.service.CollegeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = {
        "http://localhost:3001",
        "https://college-predictor-frontend.vercel.app"
})
@RequestMapping("/api")
public class CollegeController {

    @Autowired
    public CollegeService collegeService;

    @GetMapping("/predictCollege")
    public CollegeModel predictCollege(@RequestParam int rank, @RequestParam String gender, @RequestParam String category, @RequestParam String exam) {
            return collegeService.getEligibleCollege(rank,gender,category,exam);
    }

    @GetMapping("/getCategory")
    public List<String> getCategory(@RequestParam String exam) {
        return collegeService.getCategory(exam);
    }

    @GetMapping("/getGender")
    public List<String> getGender(@RequestParam String exam) {
        return collegeService.getGender(exam);
    }
}
