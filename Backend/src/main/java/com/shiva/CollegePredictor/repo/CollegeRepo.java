package com.shiva.CollegePredictor.repo;

import com.shiva.CollegePredictor.Model.CollegeModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CollegeRepo extends JpaRepository<CollegeModel, Integer> {

    @Query("SELECT college FROM CollegeModel college WHERE college.closing_rank >= :rank  AND college.gender = :gender  AND college.category = :category  AND college.exam_name = :exam")
    public CollegeModel findEligibleCollege(int rank, String gender, String category, String exam);
}