package com.shiva.collegePredictor.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "exam_cutoffs")
public class CollegeModel {

    @Id
    private int id;
    private String exam_name;
    private String instcode;
    private String institute_name;
    private String branch_code;
    private String category;
    private String gender;
    private int closing_rank;


}