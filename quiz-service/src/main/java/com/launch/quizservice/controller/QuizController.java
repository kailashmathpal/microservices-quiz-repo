package com.launch.quizservice.controller;


import com.launch.quizservice.entity.Quiz;
import com.launch.quizservice.service.QuizService;
import com.launch.quizservice.service.QuizServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/quiz")
public class QuizController {

    @Autowired
    private QuizService quizService;

    @PostMapping("/create")
    public Quiz createQuiz(@RequestBody Quiz quiz){
        return quizService.add(quiz);

    }

    @GetMapping("/getAll")
    public List<Quiz> getAllQuiz(){
        return quizService.get();
    }

    @GetMapping("/{id}")
    public Quiz getOneQuiz(@PathVariable Long id){
        return quizService.get(id);
    }
}
