package com.launch.quizservice.service;


import com.launch.quizservice.entity.Questions;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient("QUESTION-SERVICE")
public interface QuestionClient {

    @RequestMapping("/questions/quizquestion/{quizId}")
    List<Questions> getQuestionOfQuiz(@PathVariable Long quizId);
}
