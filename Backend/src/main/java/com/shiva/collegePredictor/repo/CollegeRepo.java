package com.shiva.collegePredictor.repo;

import com.shiva.collegePredictor.model.CollegeModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CollegeRepo extends JpaRepository<CollegeModel, Integer> {

    @Query(value =
            "SELECT * FROM exam_cutoffs c " +
                    "WHERE c.closing_rank >= :rank AND c.gender = :gender AND c.category = :category AND c.exam_name = :exam " +
                    "ORDER BY c.closing_rank ASC " +
                    "LIMIT 1",nativeQuery = true)

    CollegeModel findEligibleCollege(int rank, String gender, String category, String exam);
}