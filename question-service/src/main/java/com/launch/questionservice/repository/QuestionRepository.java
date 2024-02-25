package com.launch.questionservice.repository;

import com.launch.questionservice.entity.Questions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface QuestionRepository extends JpaRepository<Questions,Long> {



    List<Questions> findByQuizId(Long quizId);
}
