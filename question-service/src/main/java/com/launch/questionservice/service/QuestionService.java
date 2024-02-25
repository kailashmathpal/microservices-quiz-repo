package com.launch.questionservice.service;

import com.launch.questionservice.entity.Questions;

import java.util.List;

public interface QuestionService {

     Questions add(Questions questions);

     List<Questions> getQuestions();

     Questions getQuestion(Long questionId);

     List<Questions> getQuestionsByQuizId(Long quizId);
}
