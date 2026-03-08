package com.shiva.CollegePredictor.repo;
import com.shiva.CollegePredictor.Model.CollegeModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CollegeRepo extends JpaRepository<CollegeModel,Integer> {

}
