package com.shiva.CollegePredictor.Controller;
import com.shiva.CollegePredictor.Model.CollegeModel;
import com.shiva.CollegePredictor.Service.CollegeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("http://localhost:8080")
@RequestMapping("api")
public class CollegeController {

    @Autowired
    public CollegeService collegeService;

    @GetMapping("/predictCollege")
    public CollegeModel predictCollege(@RequestParam int rank, @RequestParam String gender, @RequestParam String category, @RequestParam String exam){
            return collegeService.getEligibleCollege(rank,gender,category,exam);
    }
}
