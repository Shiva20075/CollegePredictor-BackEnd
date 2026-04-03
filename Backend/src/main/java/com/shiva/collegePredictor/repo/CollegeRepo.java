package com.shiva.collegePredictor.repo;

import com.shiva.collegePredictor.model.CollegeModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CollegeRepo extends JpaRepository<CollegeModel, Integer> {

    @Query(value =
            "SELECT * FROM exam_cutoffs c " +
                    "WHERE c.closing_rank >= :rank AND c.gender = :gender AND c.category = :category AND c.exam_name = :exam " +
                    "ORDER BY c.closing_rank ASC " +
                    "LIMIT 1",nativeQuery = true)
    CollegeModel findEligibleCollege(int rank, String gender, String category, String exam);

    @Query(value =
            "SELECT distinct category FROM exam_cutoffs c " + "WHERE  c.exam_name = :exam ",nativeQuery = true)
    List<String> findCategories(String exam);

    @Query(value =
            "SELECT distinct gender FROM exam_cutoffs c " + "WHERE  c.exam_name = :exam ",nativeQuery = true)
    List<String> getGender(String exam);
}