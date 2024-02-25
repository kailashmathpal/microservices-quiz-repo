package com.launch.questionservice.controller;


import com.launch.questionservice.entity.Questions;
import com.launch.questionservice.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/questions")
public class QuestionController {

    @Autowired
    private QuestionService questionService;


    @PostMapping("/create")
    public Questions createQuestion(@RequestBody Questions questions){
        return questionService.add(questions);
    }

    @GetMapping("/getAll")
    public List<Questions> getAllQuestion(){
        return questionService.getQuestions();
    }

    @GetMapping("/{questionId}")
    public Questions getQuestion(@PathVariable Long questionId){
        return questionService.getQuestion(questionId);
    }


    @GetMapping("/quizquestion/{quizId}")
    public List<Questions> getQuestionsByQuizId(@PathVariable Long quizId){
        return questionService.getQuestionsByQuizId(quizId);
    }

}
