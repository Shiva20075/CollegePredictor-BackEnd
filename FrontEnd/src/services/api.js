import axios from "axios";

const API = axios.create({
  baseURL: "http://localhost:8080"
});

export const predictCollege = (rank, gender, category, exam) => {
  return API.get("/predict", {
    params:{
      rank,
      gender,
      category,
      exam
    }
  });
};